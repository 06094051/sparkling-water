# Sparkling Water

Sparkling Water integrates H<sub>2</sub>O fast scalable machine learning engine with Spark.

## Requirements

  * Java 7
  * Spark 1.1.0 
    * `SPARK_HOME` shell variable should point to your local Spark installation
  
## Building

Use provided `gradlew` to build project:

```
./gradlew build
```

> To avoid running tests, please, use `-x test` option

## Running examples

Build a package which can be submitted to Spark cluster:
```
./gradlew shadowJar
```

Configure location of your Spark cluster or use default `local-cluster[3,2,104]`
```
export MASTER="spark://localhost:7077"
```

And run example:
```
bin/run-example.sh
```

> Default address of Spark cluster is `local-cluster[3,2,104]` causing creation of an embedded cluster consisting of 3 workers.

## Sparkling shell

It provides regular Spark shell with support to create H<sub>2</sub>O cloud and execute H<sub>2</sub> algorithms.

First, build a package containing Sparkling water
```
./gradlew shadowJar
```

Configure location of your Spark cluster if necessary:
```
export MASTER="spark://localhost:7077"
```

And run Sparkling Shell
```
bin/sparkling-shell
```

### Example

1. Run Sparkling shell with embedded cluster:
```
export MASTER="local-cluster[3,2,1024]"
bin/sparkling-shell
```

2. You can go to [http://localhost:4040/](http://localhost:4040/) to see Sparkling shell (i.e., Spark driver) status.


3. Now you can launch H<sub>2</sub>O inside Spark cluster:
```scala
import org.apache.spark.h2o._
val h2oContext = new H2OContext(sc).start(3)
import h2oContext._
```

> Note: Currently H2OContext#start API call requires number of Spark workers, in this case Spark cluster contains 3 workers.


4. Import provided airlines data, parse them via H<sub>2</sub>O parser:
```scala
import java.io.File
val dataFile = "examples/smalldata/allyears2k_headers.csv.gz"
val airlinesData = new DataFrame(new File(dataFile))
```

5. Use data via RDD API:
```scala
import org.apache.spark.examples.h2o._
val airlinesTable : RDD[Airlines] = toRDD[Airlines](airlinesData)
```
