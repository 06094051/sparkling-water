#!/usr/bin/env bash

# Current dir
TOPDIR=$(cd `dirname $0` &&  pwd)
source $TOPDIR/bin/sparkling-env.sh

cat > demofiles.list <<EOF
sparkling-water/bin/launch-spark-cloud.sh
sparkling-water/bin/run-example.sh
sparkling-water/bin/sparkling-shell
sparkling-water/bin/sparkling-env.sh
sparkling-water/examples/build/libs/sparkling-water-examples-0.1.8-SNAPSHOT-all.jar
sparkling-water/examples/README.md
sparkling-water/examples/scripts/dlDemo.script
sparkling-water/examples/smalldata/allyears2k_headers.csv.gz
sparkling-water/examples/smalldata/Chicago_Ohare_2010_2013.csv
sparkling-water/examples/smalldata/Chicago_Ohare_International_Airport.csv
sparkling-water/examples/smalldata/Chicago_Ohare_International_Airport_2010_2013.csv
sparkling-water/examples/smalldata/prostate.csv
sparkling-water/LICENSE
sparkling-water/README.md
sparkling-water/gradle.properties
EOF

ZIPNAME="sparkling-water-$VERSION.zip" 
[ -f "$ZIPNAME" ] && rm $ZIPNAME

(
  cd ../ 
  cat sparkling-water/demofiles.list | zip -@ "sparkling-water/$ZIPNAME"
)

ZIPNAME_WITH_SPARK=$(echo $ZIPNAME | sed "s/water/water-with-spark/")
cp $ZIPNAME $ZIPNAME_WITH_SPARK

SPARK_DIST="spark-1.1.0-bin-cdh4"
SPARK_EXT="tgz"
(
 cd private
 tar -zxvf "${SPARK_DIST}.${SPARK_EXT}"
 zip -r -u ../$ZIPNAME_WITH_SPARK $SPARK_DIST
)

rm demofiles.list
