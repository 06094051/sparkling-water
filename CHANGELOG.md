ChangeLog
=========

## v2.1.9 (2017-06-15)

- Technical task
	 - [SW-211](https://0xdata.atlassian.net/browse/SW-211) - In PySparkling for spark 2.0 document how to build the package
- Bug
	 - [SW-448](https://0xdata.atlassian.net/browse/SW-448) - Add missing jar into the assembly
	 - [SW-450](https://0xdata.atlassian.net/browse/SW-450) - Fix instructions on the download site
	 - [SW-453](https://0xdata.atlassian.net/browse/SW-453) - Use size method to get attr num
	 - [SW-454](https://0xdata.atlassian.net/browse/SW-454) - Replace sparkSession with spark in backends documentation
	 - [SW-456](https://0xdata.atlassian.net/browse/SW-456) - Make shell scripts safe
	 - [SW-459](https://0xdata.atlassian.net/browse/SW-459) - Update PySparkling run-time dependencies
	 - [SW-461](https://0xdata.atlassian.net/browse/SW-461) - Fix wrong getters and setters in pysparkling
- New Feature
	 - [SW-455](https://0xdata.atlassian.net/browse/SW-455) - Replace the remaining references to egg files
- Improvement
	 - [SW-24](https://0xdata.atlassian.net/browse/SW-24) - Append tab on Sparkling Water download page - how to use Sparkling Water package
	 - [SW-111](https://0xdata.atlassian.net/browse/SW-111) - Update FAQ with information about hive metastore location
	 - [SW-112](https://0xdata.atlassian.net/browse/SW-112) - Sparkling Water Tunning doc: add heartbeat dcoumentation
	 - [SW-311](https://0xdata.atlassian.net/browse/SW-311) - Please report Application Type to Yarn Resource Manager
	 - [SW-340](https://0xdata.atlassian.net/browse/SW-340) - Improve structure of SW README
	 - [SW-426](https://0xdata.atlassian.net/browse/SW-426) - Allow to download sparkling water logs from the spark UI
	 - [SW-444](https://0xdata.atlassian.net/browse/SW-444) - Remove references to Spark 1.5, 1.4 ( as it's old ) in README.rst and other docs
	 - [SW-447](https://0xdata.atlassian.net/browse/SW-447) - Upgrade H2O to 3.10.5.1
	 - [SW-452](https://0xdata.atlassian.net/browse/SW-452) - Add missing spaces after "," in H2OContextImplicits
	 - [SW-460](https://0xdata.atlassian.net/browse/SW-460) - Allow to configure flow dir location in SW
	 - [SW-463](https://0xdata.atlassian.net/browse/SW-463) - Extract sparkling water configuration to extra doc in rst format
	 - [SW-465](https://0xdata.atlassian.net/browse/SW-465) - Mark tensorflow demo as experimental

## v2.1.8 (2017-05-25)

- Bug
	- [SW-263](https://0xdata.atlassian.net/browse/SW-263) - Cannot run build in parallel because of Python module
	- [SW-336](https://0xdata.atlassian.net/browse/SW-336) - Wrong documentation of PyPi h2o_pysparkling_2.0 package
	- [SW-430](https://0xdata.atlassian.net/browse/SW-430) - pysparkling: adding a column to a data frame does not work when parse the original frame in spark
	- [SW-431](https://0xdata.atlassian.net/browse/SW-431) - Allow to pass additional arguments to run-python-script.sh
	- [SW-436](https://0xdata.atlassian.net/browse/SW-436) - Fix getting of sparkling water jar in pysparkling
	- [SW-437](https://0xdata.atlassian.net/browse/SW-437) - Don't call atexit in case of pysparkling in cluster deploy mode
	- [SW-438](https://0xdata.atlassian.net/browse/SW-438) - store h2o logs int unique directories
	- [SW-439](https://0xdata.atlassian.net/browse/SW-439) - handle interrupted exception in H2ORuntimeInfoUIThread
    - [SW-335](https://0xdata.atlassian.net/browse/SW-335) - Cannot install pysparkling from PyPi
- Improvement
    - [SW-445](https://0xdata.atlassian.net/browse/SW-445) - Remove information from README.pst that pip cannot be used
    - [SW-341](https://0xdata.atlassian.net/browse/SW-341) - Support Python 3 distribution
	- [SW-380](https://0xdata.atlassian.net/browse/SW-380) - Define Jenkins pipeline via Jenkinsfile
	- [SW-433](https://0xdata.atlassian.net/browse/SW-433) - Add change logs link to the sw download page
	- [SW-435](https://0xdata.atlassian.net/browse/SW-435) - Upgrade shadow jar plugin to 2.0.0
	- [SW-440](https://0xdata.atlassian.net/browse/SW-440) - Sparkling Water cluster name should contain spark app id instead of random number
	- [SW-441](https://0xdata.atlassian.net/browse/SW-441) - Replace deprecated DefaultHTTPClient in AnnouncementService
	- [SW-442](https://0xdata.atlassian.net/browse/SW-442) - Get array size from metadata in case of ml.lilang.VectorUDT
	- [SW-443](https://0xdata.atlassian.net/browse/SW-443) - Upgrade H2O version to 3.10.4.8

## v2.1.7 (2017-05-10)

- Bug
   - [SW-429](https://0xdata.atlassian.net/browse/SW-429) - Different cluster name between client and h2o nodes in case of external cluster

## v2.1.6 (2017-05-09)

 - Improvement
   - [SW-424](https://0xdata.atlassian.net/browse/SW-424) - Add SW tab in Spark History Server
   - [SW-427](https://0xdata.atlassian.net/browse/SW-427) - Upgrade H2O dependency to 3.10.4.7

## v2.1.5 (2017-04-27)

 - Bug
	- [SW-421](https://0xdata.atlassian.net/browse/SW-421) - External cluster: Job is reporting exit status as FAILED even all mappers return 0
 - Improvement
	- [SW-422](https://0xdata.atlassian.net/browse/SW-422) - Upgrade H2O dependency to 3.10.4.6

## v2.1.4 (2017-04-20)

  - Bug
	- [SW-65](https://0xdata.atlassian.net/browse/SW-65) - Add pysparkling instruction to download page
	- [SW-365](https://0xdata.atlassian.net/browse/SW-365) - Proper exit status handling of external cluster
	- [SW-398](https://0xdata.atlassian.net/browse/SW-398) - Use timeout for read/write confirmation in external cluster mode
	- [SW-400](https://0xdata.atlassian.net/browse/SW-400) - Fix stopping of H2OContext in case of running standalone application
	- [SW-401](https://0xdata.atlassian.net/browse/SW-401) - Add configuration property to external backend allowing to specify the maximal timeout the cloud will wait for watchdog client to connect
	- [SW-405](https://0xdata.atlassian.net/browse/SW-405) - Use correct quote in backend documentation
	- [SW-408](https://0xdata.atlassian.net/browse/SW-408) - Use kwargs for h2o.connect in pysparkling
	- [SW-409](https://0xdata.atlassian.net/browse/SW-409) - Fix stopping of python tests
	- [SW-410](https://0xdata.atlassian.net/browse/SW-410) - Honor --core Spark settings in H2O executors
  - Improvement
	- [SW-231](https://0xdata.atlassian.net/browse/SW-231) - Sparkling Water download page is missing PySParkling/RSparkling info
	- [SW-404](https://0xdata.atlassian.net/browse/SW-404) - Upgrade H2O dependency to 3.10.4.4
	- [SW-406](https://0xdata.atlassian.net/browse/SW-406) - Download page should list available jars for external cluster.
	- [SW-411](https://0xdata.atlassian.net/browse/SW-411) - Migrate Pysparkling tests and examples to SparkSession
	- [SW-412](https://0xdata.atlassian.net/browse/SW-412) - Upgrade H2O dependency to 3.10.4.5

## v2.1.3 (2017-04-7)

  - Bug
    - [SW-334](https://0xdata.atlassian.net/browse/SW-334) - as_factor() 'corrupts' dataframe if it fails
    - [SW-353](https://0xdata.atlassian.net/browse/SW-353) - Kerberos for SW not loading JAAS module
    - [SW-364](https://0xdata.atlassian.net/browse/SW-364) - Repl session not set on scala 2.11
    - [SW-368](https://0xdata.atlassian.net/browse/SW-368) - bin/pysparkling.cmd is missing
    - [SW-371](https://0xdata.atlassian.net/browse/SW-371) - Fix MarkDown syntax
    - [SW-372](https://0xdata.atlassian.net/browse/SW-372) - Run negative test for PUBDEV-3808 multiple times to observe failure
    - [SW-375](https://0xdata.atlassian.net/browse/SW-375) - Documentation fix in external cluster manual
    - [SW-376](https://0xdata.atlassian.net/browse/SW-376) - Tests for DecimalType and DataType fail on external backend
    - [SW-377](https://0xdata.atlassian.net/browse/SW-377) - Implement stopping of external H2O cluster in external backend mode
    - [SW-383](https://0xdata.atlassian.net/browse/SW-383) - Update PySparkling README with info about SW-335 and using SW from Pypi
    - [SW-385](https://0xdata.atlassian.net/browse/SW-385) - Fix residual plot R code generator
    - [SW-386](https://0xdata.atlassian.net/browse/SW-386) - SW REPL cannot be used in combination with Spark Dataset
    - [SW-387](https://0xdata.atlassian.net/browse/SW-387) - Fix typo in setClientIp method
    - [SW-388](https://0xdata.atlassian.net/browse/SW-388) - Stop h2o when running inside standalone pysparkling job
    - [SW-389](https://0xdata.atlassian.net/browse/SW-389) - Extending h2o jar from SW doesn't work when the jar is already downloaded
    - [SW-392](https://0xdata.atlassian.net/browse/SW-392) - Python in gradle is using wrong python - it doesn't respect the PATH variable
    - [SW-393](https://0xdata.atlassian.net/browse/SW-393) - Allow to specify timeout for h2o cloud up in external backend mode
    - [SW-394](https://0xdata.atlassian.net/browse/SW-394) - Allow to specify log level to external h2o cluster
    - [SW-396](https://0xdata.atlassian.net/browse/SW-396) - Create setter in pysparkling conf for h2o client log level
    - [SW-397](https://0xdata.atlassian.net/browse/SW-397) - Better error message covering the most often case when cluster info file doesn't exist
  - Improvement
    - [SW-296](https://0xdata.atlassian.net/browse/SW-296) - H2OConf remove nulls and make it more Scala-like
    - [SW-367](https://0xdata.atlassian.net/browse/SW-367) - Add task to Gradle build which prints all available Hadoop distributions for the corresponding h2o 
    - [SW-382](https://0xdata.atlassian.net/browse/SW-382) - Upgrade of H2O dependency to 3.10.4.3

## v2.1.2 (2017-03-20)

  - Bug
    - [SW-361](https://0xdata.atlassian.net/browse/SW-361) - Flow is not available in Sparkling Water
    - [SW-362](https://0xdata.atlassian.net/browse/SW-362) - PySparkling does not work
  - Improvement
    - [SW-344](https://0xdata.atlassian.net/browse/SW-344) - Use Spark public DNS if available to report Flow UI 

## v2.1.1 (2017-03-18)

  - Bug
    - [SW-308](https://0xdata.atlassian.net/browse/SW-308) - Intermittent failure in creating H2O cloud
    - [SW-321](https://0xdata.atlassian.net/browse/SW-321) - composite function fail when inner cbind()
    - [SW-342](https://0xdata.atlassian.net/browse/SW-342) - Environment detection does not work with Spark2.1
    - [SW-347](https://0xdata.atlassian.net/browse/SW-347) - Cannot start Sparkling Water at HDP Yarn cluster
    - [SW-349](https://0xdata.atlassian.net/browse/SW-349) - Sparkling Shell scripts for Windows do not work
    - [SW-350](https://0xdata.atlassian.net/browse/SW-350) - Fix command line environment for Windows
    - [SW-357](https://0xdata.atlassian.net/browse/SW-357) - PySparkling in Zeppelin environment using wrong class loader
  - Improvement
    - [SW-333](https://0xdata.atlassian.net/browse/SW-333) - ApplicationMaster info in Yarn for external cluster
    - [SW-337](https://0xdata.atlassian.net/browse/SW-337) - Use `h2o.connect` in PySpark to connect to H2O cluster
    - [SW-345](https://0xdata.atlassian.net/browse/SW-345) - Create configuration manual for External cluster
    - [SW-356](https://0xdata.atlassian.net/browse/SW-356) - Improve documentation for spark.ext.h2o.fail.on.unsupported.spark.param
    - [SW-360](https://0xdata.atlassian.net/browse/SW-360) - Upgrade H2O dependency to 3.10.4.2

## v2.1.0 (2017-03-02)
  - Bug
    - [SW-331](https://0xdata.atlassian.net/browse/SW-331) - Security.enableSSL does not work
  - Improvement
    - [SW-302](https://0xdata.atlassian.net/browse/SW-302) - Support Spark 2.1.0
    - [SW-325](https://0xdata.atlassian.net/browse/SW-325) - Implement a generic announcement mechanism 
    - [SW-326](https://0xdata.atlassian.net/browse/SW-326) - Add support to Spark 2.1 in Sparkling Water
    - [SW-327](https://0xdata.atlassian.net/browse/SW-327) - Enrich Spark UI with Sparkling Water specific tab

## v2.0.0 (2016-09-26)
  Sparkling Water 2.0 brings support of Spark 2.0. For detailed changelog, please, read [rel2.0/CHANGELOG.md](https://github.com/h2oai/sparkling-water/blob/rel-2.0/CHANGELOG.md#200-2016-09-26)

## v1.6.1 (2016-03-15)
  - Bug fixes
    - Fix idea setup script
    - Fix cloud name - make it unique
    - Fix bug in launching scripts which were overriding default Spark settings provide by use in `cond/spark-defaults.conf`
    - [PUBDEV-282](https://0xdata.atlassian.net/browse/PUBDEV-282) Create windows batch scripts for starting sparkling-shell and running examples
    - [SW-4](https://0xdata.atlassian.net/browse/SW-4) - InvokeOnNodesRDD locality fix
    - [SW-5, SW-17, SW-25](https://0xdata.atlassian.net/browse/SW-25) Remove categorical handling during asH2OFrame() transformation
    - [SW-10](https://0xdata.atlassian.net/browse/SW-10) - Use new Spark 1.5 RpcEnv to obtain executor IPs
    - [SW-16](https://0xdata.atlassian.net/browse/SW-16) - Update docker file based on current version
    - [SW-20](https://0xdata.atlassian.net/browse/SW-20) H2OFrame provides nicer API accepting parser setup
    - [SW-32](https://0xdata.atlassian.net/browse/SW-32) Update documentation and remove top-level images folder
    - [SW-33](https://0xdata.atlassian.net/browse/SW-33) Remove usage of deprecated VecUtils class
    - [SW-38](https://0xdata.atlassian.net/browse/SW-38)  Introduces Sparkling Water parameter to setup location of H2O logs
    - [SW-39](https://0xdata.atlassian.net/browse/SW-39)  PySparkling: Support of Sparkling Water from PySpark
    - [SW-40](https://0xdata.atlassian.net/browse/SW-40)  PySparkling: as\_h2o\_frame method accepts name of target H2O Frame
    - [SW-41](https://0xdata.atlassian.net/browse/SW-41) H2OContext#asH2OFrame now
    - [SW-43](https://0xdata.atlassian.net/browse/SW-43) - Fix script tests
    - [SW-45](https://0xdata.atlassian.net/browse/SW-45) - Fix interpreter initialization
    - [SW-47](https://0xdata.atlassian.net/browse/SW-47) - Server test.h2o.ai: Enable python tests for post-push tests and relese 1.5 branch
    - [SW-48](https://0xdata.atlassian.net/browse/SW-48) - Fix H2O jetty webport to listen on 0.0.0.0 not on given ip
    - [SW-61](https://0xdata.atlassian.net/browse/SW-61) - Remove `--driver-classpath` parameter from sparkling-shell
    - [SW-65](https://0xdata.atlassian.net/browse/SW-65) - Add pysparkling instruction to download page
    - [SW-68](https://0xdata.atlassian.net/browse/SW-68) - AskCraig list demo always returns accounting category
    - [SW-69](https://0xdata.atlassian.net/browse/SW-69) - Flow: getRDDs does not show id
    - [SW-70](https://0xdata.atlassian.net/browse/SW-70) - Support for Spark `LabeledPoint` in `RDD[T]`
    - [SW-94](https://0xdata.atlassian.net/browse/SW-94) - Fix Maven dependency between projects
    - [SW-97](https://0xdata.atlassian.net/browse/SW-97) - Spark 1.6 support
  - Improvements
    - Attach metadata derived from H2OFrame to Spark DataFrame
    - Improved logging subsystem
    - Model serialization support
    - Expose new REST end-points
      - to interpret Scala code
      - to perform transformation between Spark DataFrame and H2O Frame
    - Fix all scripts and create automatic tests for them
    - [SW-39](https://0xdata.atlassian.net/browse/SW-39) - pySparkling: use Sparkling Water from Python
    - [SW-27](https://0xdata.atlassian.net/browse/SW-27) - Support Spark SQL data sources
    - [SW-63](https://0xdata.atlassian.net/browse/SW-63) - Repl separation into a dedicated sparkling-water-repl module
    - [SW-66](https://0xdata.atlassian.net/browse/SW-66) - Warn if neither one of `H2O_HOME` or `H2O_PYTHON_WHEEL` properties is not set
    - [SW-73](https://0xdata.atlassian.net/browse/SW-73) - List all available branches in README.md
    - [SW-75](https://0xdata.atlassian.net/browse/SW-75) - RDDHandler should expose REST api for transformation from RDD to H2OFrame
    - [SW-76](https://0xdata.atlassian.net/browse/SW-76) - Upgrade H2O version to Tukey release (3.8.0.3)
    - [SW-78](https://0xdata.atlassian.net/browse/SW-78) - Sparking-shell: Change default spark master to `local[*]`
    - [SW-91](https://0xdata.atlassian.net/browse/SW-91) - Update Sparkling Water tuning documentation
    - [SW-92](https://0xdata.atlassian.net/browse/SW-92) - Update development doc with information how to submit app on yarn
    - [SW-93](https://0xdata.atlassian.net/browse/SW-78) - Upgrade H2O dependency to Turan release (3.8.1.1)


## v1.4.0 (2015-07-06)
  - Support of primitives type in transformation from RDD to H2OFrame
  - Support of Spark 1.4
  - New applications
    - Craigslist job predictions
    - Streaming craigslist demo
  - use H2O version 3.0.0.26 (algorithms weights, offsets, fixes)
  - API improvements
  - follow Spark way to provide implicit conversions

## v1.3.0 (2015-05-25)
  - Major release of Sparkling Water
  - Depends on:
    - Spark 1.3.1
    - H2O 3.0 Shannon release
  - It contains major renaming of API: 
    - H2O's DataFrame was renamed to H2OFrame
    - Spark's SchemaRDD was renamed to DataFrame

## v1.2.0 (2015-05-18)
  - Major release of Sparkling Water
  - Depends on:
    - Spark 1.2.0
    - H2O 3.0 Shannon release

## v0.2.14 (2015-05-14)
  - Upgrade h2o dependency to build 1205 including fixes in algos, infrastructure,
    and improvements in UI
  - Examples changed to support modified h2o API
  - Updated documentation
    - list of demos and applications
    - list of scripts for Sparkling Shell
    - list of meetups with links to code and instructions
  - Fix a limit on number of columns in SchemaRDD (thanks @nfergu)

## v0.2.13 (2015-05-01)
  - Upgrade h2o dependency to build 1165
  - Introduce type alias DataFrame pointing to `water.fvec.H2OFrame`
  - Change naming of implicit operations `toDataFrame` to `toH2OFrame`
  - Chicago crime shell script 

## v0.2.12 (2015-04-21)
  - Upgraded H2O dev to 1109 build.
  - Applications 
    - Chicago crime application 
    - Ham or Spam application
    - MLConf 2015 demo
  - More unit testing for transformation between RDD and DataFrame
  - Fix in handling string columns.
  - Removed used of ExistingRdd which was deprecated in Spark 1.2.0
  - Added joda-convert library into resulting assembly
  - Parquet import test.
  - Prototype of Sparkling Water ML pipelines
  - Added quiet mode for h2o client.
  - Devel Documentation
  - Fixes
    - [PUBDEV-771] Fix handling of UUIDs.
    - [PUBDEV-767] Missing LongType handling.
    - [PUBDEV-766] Fix wrong test.
    - [PUBDEV-625] MLConf demo is now integration test.
    - [PUBDEV-457] Array of strings is represented as set of String columns in H2O.
    - [PUBDEV-457] Test scenario mentioned in the test.
    - [PUBDEV-457] Support for hierarchical schemas including vectors and arrays
    - [PUBDEV-483] Introduce option to setup client web port.
    - [PUBDEV-357] Change of clouding strategy - now cloud members report themselves to a driver

