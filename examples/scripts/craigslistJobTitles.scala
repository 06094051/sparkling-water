import org.apache.spark.rdd.RDD
import org.apache.spark.mllib.feature.Word2Vec
import org.apache.spark.mllib.feature.Word2VecModel
import org.apache.spark.mllib.linalg._

val rawJobTitles = sc.textFile("examples/smalldata/craigslistJobTitles.csv")

def isHeader(line: String) = line.contains("category")
val data = rawJobTitles.filter(x => !isHeader(x)).map(d => d.split(','))

val label = data.map(l => l(0))
val jobTitles = data.map(l => l(1))
// Count of different activites done
val labelCounts = label.map(n => (n, 1)).reduceByKey(_+_).collect.mkString("\n")

/*
(education,2438)
(administrative,2500)
(labor,2500)
(accounting,1593)
(customerservice,2319)
(foodbeverage,2495)
*/

val stopwords = Set("ax","i","you","edu","s","t","m","subject","can","lines","re","what"
    ,"there","all","we","one","the","a","an","of","or","in","for","by","on"
    ,"but", "is", "in","a","not","with", "as", "was", "if","they", "are", "this", "and", "it", "have"
    , "from", "at", "my","be","by","not", "that", "to","from","com","org","like","likes","so")

val nonWordSplit = jobTitles.flatMap(t => t.split("""\W+""").map(_.toLowerCase))
val filterNumbers = nonWordSplit.filter(word => """[^0-9]*""".r.pattern.matcher(word).matches)
val wordCounts = filterNumbers.map(w => (w, 1)).reduceByKey(_+_)
val rareWords = wordCounts.filter{ case (k, v) => v < 2 }.map {case (k, v) => k }.collect.toSet

def token(line: String): Seq[String] = {
    line.split("""\W+""") //get rid of nonWords such as puncutation as opposed to splitting by just " "
    .map(_.toLowerCase)
    .filter(word => """[^0-9]*""".r.pattern.matcher(word).matches) //remove mix of words+numbers
    .filterNot(word => stopwords.contains(word)) // remove stopwords defined above (you can add to this list if you want)
    .filter(word => word.size >= 2) // leave only words greater than 1 characters. This deletes A LOT of words but useful to reduce our feature-set
    .filterNot(word => rareWords.contains(word)) // remove rare occurences of words
}

val XXXwords = data.map(d => (d(0), token(d(1)).toSeq)).filter(s => s._2.length > 0)
val words = XXXwords.map(v => v._2)
val XXXlabels = XXXwords.map(v => v._1)

println(jobTitles.flatMap(lines => token(lines)).distinct.count) 


// Make some helper functions
def sumArray (m: Array[Double], n: Array[Double]): Array[Double] = {
  for (i <- 0 until m.length) {m(i) += n(i)}
  return m
}

def divArray (m: Array[Double], divisor: Double) : Array[Double] = {
  for (i <- 0 until m.length) {m(i) /= divisor}
  return m
}

def wordToVector (w:String, m: Word2VecModel): Vector = {
  try {
    return m.transform(w)
  } catch {
    case e: Exception => return Vectors.zeros(100)
  }  
}

//
// Word2Vec Model
// 

val word2vec = new Word2Vec()
val model = word2vec.fit(words)
model.findSynonyms("teacher", 5).foreach(println)

val title_vectors = words.map(x => new DenseVector(divArray(x.map(m => wordToVector(m, model).toArray).reduceLeft(sumArray),x.length)).asInstanceOf[Vector])
val title_pairs = words.map(x => (x,new DenseVector(divArray(x.map(m => wordToVector(m, model).toArray).reduceLeft(sumArray),x.length)).asInstanceOf[Vector]))

// Create H2OFrame
import org.apache.spark.mllib
case class CRAIGSLIST(target: String, a: mllib.linalg.Vector)

import org.apache.spark.h2o._
import org.apache.spark.examples.h2o._
val h2oContext = new H2OContext(sc).start()
import h2oContext._

import org.apache.spark.sql._
implicit val sqlContext = new SQLContext(sc)
import sqlContext._
val resultRDD: SchemaRDD = XXXlabels.zip(title_vectors).map(v => CRAIGSLIST(v._1, v._2)).toDF

val table:H2OFrame = resultRDD

// OPEN FLOW UI
openFlow
