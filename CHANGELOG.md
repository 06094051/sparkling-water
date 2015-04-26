ChangeLog
=========

##v0.2.13 (2015-04-26)
  - Upgrade h2o dependency to build 1160
  - Introduce type alias DataFrame pointing to `water.fvec.H2OFrame`

##v0.2.12 (2015-04-21)
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

