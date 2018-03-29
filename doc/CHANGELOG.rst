Change Log
==========

v2.0.26 (2018-03-29)
--------------------
Download at: `http://h2o-release.s3.amazonaws.com/sparkling-water/rel-2.0/26/index.html <http://h2o-release.s3.amazonaws.com/sparkling-water/rel-2.0/26/index.html>`__

-  Bug
        
   -  `SW-696 <https://0xdata.atlassian.net/browse/SW-696>`__ - Intermittent script test issue on external backend
   -  `SW-726 <https://0xdata.atlassian.net/browse/SW-726>`__ - Mark Spark dependencies as provided on artefacts published to maven
   -  `SW-740 <https://0xdata.atlassian.net/browse/SW-740>`__ - Increase timeout for conversion in pyunit test for external cluster
   -  `SW-760 <https://0xdata.atlassian.net/browse/SW-760>`__ - Fix doc artefact publication
   -  `SW-763 <https://0xdata.atlassian.net/browse/SW-763>`__ - Remove support for downloading H2O logs from Spark UI
   -  `SW-766 <https://0xdata.atlassian.net/browse/SW-766>`__ - Fix coding style issue 
   -  `SW-769 <https://0xdata.atlassian.net/browse/SW-769>`__ - Fix import
   -  `SW-776 <https://0xdata.atlassian.net/browse/SW-776>`__ - sparkling water from maven does not know the stacktrace_collector_interval option
   -  `SW-778 <https://0xdata.atlassian.net/browse/SW-778>`__ - Handle nulls properly in H2OMojoModel
                
-  New Feature
        
   -  `SW-722 <https://0xdata.atlassian.net/browse/SW-722>`__ - [PySparkling] Check for correct data type as part of as_h2o_frame
                
-  Improvement
        
   -  `SW-733 <https://0xdata.atlassian.net/browse/SW-733>`__ - Parametrize pipeline scripts to be able to specify different algorithms
   -  `SW-746 <https://0xdata.atlassian.net/browse/SW-746>`__ - Log chunk layout after the conversion of data to external H2O cluster
   -  `SW-755 <https://0xdata.atlassian.net/browse/SW-755>`__ - Document GBM Grid Search Pipeline Step
   -  `SW-765 <https://0xdata.atlassian.net/browse/SW-765>`__ - Remove test artefacts from the sparkling-water assembly
   -  `SW-768 <https://0xdata.atlassian.net/browse/SW-768>`__ - Add missing import
   -  `SW-773 <https://0xdata.atlassian.net/browse/SW-773>`__ - Don&#39;t use default value for output dir in external backend, it&#39;s not required
   -  `SW-780 <https://0xdata.atlassian.net/browse/SW-780>`__ - Upgrade H2O to 3.18.0.5
                
-  Docs
        
   -  `SW-775 <https://0xdata.atlassian.net/browse/SW-775>`__ - Fix link for documentation on DEVEL.md
                
                            
v2.0.25 (2018-03-08)
--------------------
Download at: `http://h2o-release.s3.amazonaws.com/sparkling-water/rel-2.0/25/index.html <http://h2o-release.s3.amazonaws.com/sparkling-water/rel-2.0/25/index.html>`__

-  Bug
        
   -  `SW-739 <https://0xdata.atlassian.net/browse/SW-739>`__ - Sparkling Water Doc artefact is still missing Scala version
   -  `SW-742 <https://0xdata.atlassian.net/browse/SW-742>`__ - Fix setting up node network mask on external cluster
   -  `SW-743 <https://0xdata.atlassian.net/browse/SW-743>`__ - Allow to set LDAP and different security options in external backend as well
   -  `SW-747 <https://0xdata.atlassian.net/browse/SW-747>`__ - Fix bug in documentation for manual mode of external backend
   -  `SW-757 <https://0xdata.atlassian.net/browse/SW-757>`__ - Fix tests after enabling the stack-trace collection
                
-  Improvement
        
   -  `SW-744 <https://0xdata.atlassian.net/browse/SW-744>`__ - Document how to use Sparkling Water with LDAP in Sparkling Water docs
   -  `SW-745 <https://0xdata.atlassian.net/browse/SW-745>`__ - Expose Grid search as Spark pipeline step in the Scala API
   -  `SW-748 <https://0xdata.atlassian.net/browse/SW-748>`__ - Upgrade to Gradle 4.6
   -  `SW-752 <https://0xdata.atlassian.net/browse/SW-752>`__ - Collect stack traces on each h2o node as part of log collecting extension
   -  `SW-754 <https://0xdata.atlassian.net/browse/SW-754>`__ - Upgrade H2O to 3.18.0.3
   -  `SW-756 <https://0xdata.atlassian.net/browse/SW-756>`__ - Upgrade H2O to 3.18.0.4
                
-  Docs
        
   -  `SW-753 <https://0xdata.atlassian.net/browse/SW-753>`__ - Add &quot;How to&quot; for changing the default H2O port 
                
                            
v2.0.24 (2018-02-26)
--------------------
Download at: `http://h2o-release.s3.amazonaws.com/sparkling-water/rel-2.0/24/index.html <http://h2o-release.s3.amazonaws.com/sparkling-water/rel-2.0/24/index.html>`__

-  Bug
        
   -  `SW-723 <https://0xdata.atlassian.net/browse/SW-723>`__ - Sparkling water doc artefact is missing scala version
   -  `SW-727 <https://0xdata.atlassian.net/browse/SW-727>`__ - Improve method for downloading H2O logs 
   -  `SW-728 <https://0xdata.atlassian.net/browse/SW-728>`__ - Use new light endpoint introduced in 3.18.0.1
   -  `SW-734 <https://0xdata.atlassian.net/browse/SW-734>`__ - Make sure we use the unique key names in split method
   -  `SW-736 <https://0xdata.atlassian.net/browse/SW-736>`__ - Document how to download logs on Databricks cluster
   -  `SW-737 <https://0xdata.atlassian.net/browse/SW-737>`__ - Expose downloadH2OLogs on H2OContext in PySparkling
   -  `SW-738 <https://0xdata.atlassian.net/browse/SW-738>`__ - Move spark.ext.h2o.node.network.mask setter to SharedArguments
                
-  Improvement
        
   -  `SW-702 <https://0xdata.atlassian.net/browse/SW-702>`__ - Create Spark Transformer for AutoML
   -  `SW-725 <https://0xdata.atlassian.net/browse/SW-725>`__ - create an an equvivalent of h2o.download_all_logs in scala
   -  `SW-730 <https://0xdata.atlassian.net/browse/SW-730>`__ - Upgrade H2O to 3.18.0.2
                
                                
v2.0.23 (2018-02-14)
--------------------
Download at: `http://h2o-release.s3.amazonaws.com/sparkling-water/rel-2.0/23/index.html <http://h2o-release.s3.amazonaws.com/sparkling-water/rel-2.0/23/index.html>`__

-  Technical task
        
   -  `SW-652 <https://0xdata.atlassian.net/browse/SW-652>`__ - Deliver SW documentation in HTML output
                
-  Bug
        
   -  `SW-685 <https://0xdata.atlassian.net/browse/SW-685>`__ - Fix Typo in documentation
   -  `SW-695 <https://0xdata.atlassian.net/browse/SW-695>`__ - Make printHadoopDistributions gradle task available again for testing
   -  `SW-701 <https://0xdata.atlassian.net/browse/SW-701>`__ - Kill the client when one of the h2o nodes went OOM in external mode
   -  `SW-706 <https://0xdata.atlassian.net/browse/SW-706>`__ - Fix pysparkling.ml import for non-interactive sessions
   -  `SW-707 <https://0xdata.atlassian.net/browse/SW-707>`__ - parquet import fails on HDP with Spark 2.0 (azure hdi cluster)
   -  `SW-708 <https://0xdata.atlassian.net/browse/SW-708>`__ - Make sure H2OMojoModel does not required H2OContext to be initialized
   -  `SW-709 <https://0xdata.atlassian.net/browse/SW-709>`__ - Fix mojo predictions tests
   -  `SW-710 <https://0xdata.atlassian.net/browse/SW-710>`__ - In PySparkling pipelines, ensure that if users pass integer to double type we handle that correctly for all possible double values
   -  `SW-713 <https://0xdata.atlassian.net/browse/SW-713>`__ - Write a simple test for parquet import in Sparkling Water
   -  `SW-714 <https://0xdata.atlassian.net/browse/SW-714>`__ - Add option to H2OModel pipeline step allowing us to convert unknown categoricals to NAs
   -  `SW-715 <https://0xdata.atlassian.net/browse/SW-715>`__ - Fix driverif configuration on the external backend
                
-  Improvement
        
   -  `SW-606 <https://0xdata.atlassian.net/browse/SW-606>`__ - Verify &amp; Document run of RSparkling on top of Databricks Azure cluster
   -  `SW-678 <https://0xdata.atlassian.net/browse/SW-678>`__ - Document how to change log location 
   -  `SW-683 <https://0xdata.atlassian.net/browse/SW-683>`__ - H2OContext can&#39;t be initalized on Databricks cloud
   -  `SW-686 <https://0xdata.atlassian.net/browse/SW-686>`__ - Fix typo in documentation
   -  `SW-687 <https://0xdata.atlassian.net/browse/SW-687>`__ - Upgrade Gradle to 4.5
   -  `SW-688 <https://0xdata.atlassian.net/browse/SW-688>`__ - Update docs - SparklyR supports Spark 2.2.1 in the latest release
   -  `SW-690 <https://0xdata.atlassian.net/browse/SW-690>`__ - Log Sparkling Water version during startup of Sparkling Water
   -  `SW-693 <https://0xdata.atlassian.net/browse/SW-693>`__ - Allow to set driverIf on external H2O backend
   -  `SW-694 <https://0xdata.atlassian.net/browse/SW-694>`__ - Fix creation of Extended JAR in gradle task
   -  `SW-700 <https://0xdata.atlassian.net/browse/SW-700>`__ - Report Yarn App ID of spark application in H2OContext
   -  `SW-703 <https://0xdata.atlassian.net/browse/SW-703>`__ - Upload generated sphinx documentation to S3
   -  `SW-704 <https://0xdata.atlassian.net/browse/SW-704>`__ - Update links on the download page to point to the new docs
   -  `SW-705 <https://0xdata.atlassian.net/browse/SW-705>`__ - Increase memory for JUNIT tests
   -  `SW-718 <https://0xdata.atlassian.net/browse/SW-718>`__ - Upgrade to Gradle 4.5.1
   -  `SW-719 <https://0xdata.atlassian.net/browse/SW-719>`__ - Upgrade to H2O 3.18.0.1
   -  `SW-720 <https://0xdata.atlassian.net/browse/SW-720>`__ - Fix parquet import test on external backend
                
-  Docs
        
   -  `SW-697 <https://0xdata.atlassian.net/browse/SW-697>`__ - Final updates for Sparkling Water html output
   -  `SW-698 <https://0xdata.atlassian.net/browse/SW-698>`__ - Update &quot;Contributing&quot; section in Sparkling Water
                
                            
v2.0.22 (2018-01-18)
--------------------
Download at: `http://h2o-release.s3.amazonaws.com/sparkling-water/rel-2.0/22/index.html <http://h2o-release.s3.amazonaws.com/sparkling-water/rel-2.0/22/index.html>`__

-  Bug
        
   -  `SW-551 <https://0xdata.atlassian.net/browse/SW-551>`__ - Remove hotfix introduced by [SW-541] and implement proper fix
   -  `SW-661 <https://0xdata.atlassian.net/browse/SW-661>`__ - Use always correct Spark version on the R download page
   -  `SW-662 <https://0xdata.atlassian.net/browse/SW-662>`__ - Remove extra files that got into the repo
   -  `SW-666 <https://0xdata.atlassian.net/browse/SW-666>`__ - Kill the cluster when a new executors joins in the internal backend
   -  `SW-668 <https://0xdata.atlassian.net/browse/SW-668>`__ - Generate download link as part of the release notes
   -  `SW-669 <https://0xdata.atlassian.net/browse/SW-669>`__ - Remove mentions of local-cluster in public docs
   -  `SW-670 <https://0xdata.atlassian.net/browse/SW-670>`__ - Deprecated call in H2OContextInitDemo
   -  `SW-671 <https://0xdata.atlassian.net/browse/SW-671>`__ - Fix jenkinsfile for builds again specific h2o branches
                
-  Improvement
        
   -  `SW-674 <https://0xdata.atlassian.net/browse/SW-674>`__ - Update H2O to 3.16.0.4
   -  `SW-675 <https://0xdata.atlassian.net/browse/SW-675>`__ - Tiny clean up of the release code
   -  `SW-679 <https://0xdata.atlassian.net/browse/SW-679>`__ - Cleaner release script
   -  `SW-680 <https://0xdata.atlassian.net/browse/SW-680>`__ - Ensure S3 in release pipeline does depend only on credentials provided from Jenkins
   -  `SW-681 <https://0xdata.atlassian.net/browse/SW-681>`__ - Separate releasing on Github and Publishing artifacts
                
                                
v2.0.21 (2018-01-03)
--------------------

-  Bug
        
   -  `SW-627 <https://0xdata.atlassian.net/browse/SW-627>`__ - [PySparkling] calling as_spark_frame for the second time results in exception
   -  `SW-630 <https://0xdata.atlassian.net/browse/SW-630>`__ - Fix ham or spam flow to reflect latest changes in pipelines
   -  `SW-631 <https://0xdata.atlassian.net/browse/SW-631>`__ - Ensure that we do not access RDDs in pipelines ( to unblock the deployment)
   -  `SW-646 <https://0xdata.atlassian.net/browse/SW-646>`__ - Fix incosistencies in ham or spam examples between scala and python
   -  `SW-648 <https://0xdata.atlassian.net/browse/SW-648>`__ - Fix ham or spam pipeline tests
   -  `SW-649 <https://0xdata.atlassian.net/browse/SW-649>`__ - Fix ham or spam tests for deeplearning pipeline
                
-  Improvement
        
   -  `SW-608 <https://0xdata.atlassian.net/browse/SW-608>`__ - Measure time of conversions to H2OFrame in debug mode
   -  `SW-612 <https://0xdata.atlassian.net/browse/SW-612>`__ - Port all arguments available to Scala ML to PySparkling ML
   -  `SW-617 <https://0xdata.atlassian.net/browse/SW-617>`__ - Support for exporting mojo to hdfs
   -  `SW-632 <https://0xdata.atlassian.net/browse/SW-632>`__ - Dump full spark configuration during H2OContext.getOrCreate into DEBUG
   -  `SW-635 <https://0xdata.atlassian.net/browse/SW-635>`__ - Fix wrong instruction at PySparkling download page
   -  `SW-637 <https://0xdata.atlassian.net/browse/SW-637>`__ - Create new DataFrame with new schema when it actually contain any dot in names
   -  `SW-638 <https://0xdata.atlassian.net/browse/SW-638>`__ - Port release script into the sw repo
   -  `SW-639 <https://0xdata.atlassian.net/browse/SW-639>`__ - Use persist layer for exportPOJOModel
   -  `SW-640 <https://0xdata.atlassian.net/browse/SW-640>`__ - export H2OMOJOMOdel.createFromMOJO to pysparkling
   -  `SW-642 <https://0xdata.atlassian.net/browse/SW-642>`__ - Create test for mojo predictions in PySparkling
   -  `SW-643 <https://0xdata.atlassian.net/browse/SW-643>`__ - Add tests for H2ODeeplearning in Scala and Python and Fix potential problems
   -  `SW-644 <https://0xdata.atlassian.net/browse/SW-644>`__ - Log spark configuration to INFO level
   -  `SW-650 <https://0xdata.atlassian.net/browse/SW-650>`__ - Upgrade Gradle to 4.4.1
   -  `SW-656 <https://0xdata.atlassian.net/browse/SW-656>`__ - Upgrade ShadowJar to 2.0.2
                
                                
v2.0.20 (2017-12-11)
--------------------

-  Bug

   -  `SW-615 <https://0xdata.atlassian.net/browse/SW-615>`__ - pysparkling.__version__ returns incorrectly 'SUBST_PROJECT_VERSION'
   -  `SW-616 <https://0xdata.atlassian.net/browse/SW-616>`__ - PySparkling fails on python 3.6 because long time does not exist in python 3.6
   -  `SW-621 <https://0xdata.atlassian.net/browse/SW-621>`__ - PySParkling failing on Python3.6
   -  `SW-624 <https://0xdata.atlassian.net/browse/SW-624>`__ - Python build does not support H2O_PYTHON_WHEEL when building against h2o older then 3.16.0.1
   -  `SW-628 <https://0xdata.atlassian.net/browse/SW-628>`__ - PySparkling fails when installed from pypi

-  Improvement

   -  `SW-626 <https://0xdata.atlassian.net/browse/SW-626>`__ - Upgrade Gradle to 4.4


v2.0.19 (2017-12-01)
--------------------

-  Bug

   -  `SW-602 <https://0xdata.atlassian.net/browse/SW-602>`__ - conversion of sparse data DataFrame to H2OFrame is slow
   -  `SW-620 <https://0xdata.atlassian.net/browse/SW-620>`__ - Fix obtaining version from bundled h2o inside pysparkling

-  Improvement

   -  `SW-613 <https://0xdata.atlassian.net/browse/SW-613>`__ - Append dynamic allocation option into SW tuning documentation.
   -  `SW-618 <https://0xdata.atlassian.net/browse/SW-618>`__ - Integration with H2O 3.16.0.2

v2.0.18 (2017-11-25)
--------------------

-  Bug

   -  `SW-320 <https://0xdata.atlassian.net/browse/SW-320>`__ - H2OConfTest Python test blocks test run
   -  `SW-499 <https://0xdata.atlassian.net/browse/SW-499>`__ - BinaryType handling is not implemented in SparkDataFrameConverter
   -  `SW-535 <https://0xdata.atlassian.net/browse/SW-535>`__ - asH2OFrame gives error if column names have DOT in it
   -  `SW-547 <https://0xdata.atlassian.net/browse/SW-547>`__ - Don't use md5skip in external mode
   -  `SW-569 <https://0xdata.atlassian.net/browse/SW-569>`__ - pysparkling: h2o on exit does not shut down cleanly
   -  `SW-572 <https://0xdata.atlassian.net/browse/SW-572>`__ - Additional fix for [SW-571]
   -  `SW-573 <https://0xdata.atlassian.net/browse/SW-573>`__ - Minor Gradle build improvements and fixes
   -  `SW-575 <https://0xdata.atlassian.net/browse/SW-575>`__ - Incorrect comment in hamOrSpamMojo pipeline
   -  `SW-576 <https://0xdata.atlassian.net/browse/SW-576>`__ - Cleanup pysparkling test infrastructure
   -  `SW-577 <https://0xdata.atlassian.net/browse/SW-577>`__ - Fix conditions in jenkins file
   -  `SW-580 <https://0xdata.atlassian.net/browse/SW-580>`__ - Fix composite build in Jenkins
   -  `SW-581 <https://0xdata.atlassian.net/browse/SW-581>`__ - Fix H2OConf test on external cluster
   -  `SW-582 <https://0xdata.atlassian.net/browse/SW-582>`__ - Opening Chicago Crime Demo Notebook errors on the first opening
   -  `SW-584 <https://0xdata.atlassian.net/browse/SW-584>`__ - Create extended directory automatically
   -  `SW-588 <https://0xdata.atlassian.net/browse/SW-588>`__ - Fix links in README
   -  `SW-589 <https://0xdata.atlassian.net/browse/SW-589>`__ - Wrap stages in try finally in jenkins file
   -  `SW-592 <https://0xdata.atlassian.net/browse/SW-592>`__ - Properly pass all parameters to algorithm
   -  `SW-593 <https://0xdata.atlassian.net/browse/SW-593>`__ - H2Conf cannot be initialized on windows
   -  `SW-594 <https://0xdata.atlassian.net/browse/SW-594>`__ - Gradle ml submodule reports success even though tests fail
   -  `SW-595 <https://0xdata.atlassian.net/browse/SW-595>`__ - Fix ML tests

-  New Feature

   -  `SW-519 <https://0xdata.atlassian.net/browse/SW-519>`__ - Introduce SW Models into Spark python pipelines

-  Task

   -  `SW-609 <https://0xdata.atlassian.net/browse/SW-609>`__ - Upgrade H2O dependency to 3.16.0.1


-  Improvement

   -  `SW-318 <https://0xdata.atlassian.net/browse/SW-318>`__ - Keep H2O version inside sparklin-water-core.jar and provide utility to query it
   -  `SW-420 <https://0xdata.atlassian.net/browse/SW-420>`__ - Shell scripts miss-leading error message
   -  `SW-504 <https://0xdata.atlassian.net/browse/SW-504>`__ - Provides Sparkling Water Spark Uber package which can be used in `--packages`
   -  `SW-570 <https://0xdata.atlassian.net/browse/SW-570>`__ - Stop previous jobs in jenkins in case of PR
   -  `SW-571 <https://0xdata.atlassian.net/browse/SW-571>`__ - In PySparkling, getOrCreate(spark) still incorrectly complains that we should use spark session
   -  `SW-583 <https://0xdata.atlassian.net/browse/SW-583>`__ - Upgrade to Gradle 4.3
   -  `SW-585 <https://0xdata.atlassian.net/browse/SW-585>`__ - Add the custom commit status for internal and external pipelines
   -  `SW-586 <https://0xdata.atlassian.net/browse/SW-586>`__ - [ML] Remove some duplicities, enable mojo for deep learning
   -  `SW-590 <https://0xdata.atlassian.net/browse/SW-590>`__ - Replace deprecated method call in ChicagoCrime python example
   -  `SW-591 <https://0xdata.atlassian.net/browse/SW-591>`__ - Repl doesn't require H2O dependencies to compile
   -  `SW-596 <https://0xdata.atlassian.net/browse/SW-596>`__ - Minor build improvements
   -  `SW-603 <https://0xdata.atlassian.net/browse/SW-603>`__ - Upgrade Gradle to 4.3.1
   -  `SW-605 <https://0xdata.atlassian.net/browse/SW-605>`__ - addFiles doesn't accept sparkSession
   -  `SW-610 <https://0xdata.atlassian.net/browse/SW-610>`__ - Change default client mode to INFO, let user to change it at runtime


v2.0.17 (2017-10-23)
--------------------

-  Bug

   -  `SW-555 <https://0xdata.atlassian.net/browse/SW-555>`__ - Fix documentation issue in PySparkling
   -  `SW-558 <https://0xdata.atlassian.net/browse/SW-558>`__ - Increase default value for client connection retry timeout in
   -  `SW-560 <https://0xdata.atlassian.net/browse/SW-560>`__ - SW documentation for nthreads is inconsistent with code
   -  `SW-561 <https://0xdata.atlassian.net/browse/SW-561>`__ - Fix reporting artefacts in Jenkins and remove use of h2o-3-shared-lib
   -  `SW-564 <https://0xdata.atlassian.net/browse/SW-564>`__ - Clean test workspace in jenkins
   -  `SW-565 <https://0xdata.atlassian.net/browse/SW-565>`__ - Fix creation of extended jar in jenkins
   -  `SW-567 <https://0xdata.atlassian.net/browse/SW-567>`__ - Fix failing tests on external backend
   -  `SW-568 <https://0xdata.atlassian.net/browse/SW-568>`__ - Remove obsolete and failing idea configuration
   -  `SW-559 <https://0xdata.atlassian.net/browse/SW-559>`__ - GLM fails to build model when weights are specified

-  Improvement

   -  `SW-557 <https://0xdata.atlassian.net/browse/SW-557>`__ - Create 2 jenkins files ( for internal and external backend ) backed by configurable pipeline
   -  `SW-562 <https://0xdata.atlassian.net/browse/SW-562>`__ - Disable web on external H2O nodes in external cluster mode
   -  `SW-563 <https://0xdata.atlassian.net/browse/SW-563>`__ - In external cluster mode, print also YARN job ID of the external cluster once context is available
   -  `SW-566 <https://0xdata.atlassian.net/browse/SW-566>`__ - Upgrade H2O to 3.14.0.7
   -  `SW-553 <https://0xdata.atlassian.net/browse/SW-553>`__ - Improve handling of sparse vectors in internal cluster


v2.0.16 (2017-10-10)
--------------------

-  Bug

   -  `SW-423 <https://0xdata.atlassian.net/browse/SW-423>`__ - Tests of External Cluster mode fails
   -  `SW-516 <https://0xdata.atlassian.net/browse/SW-516>`__ - External cluster improperly convert RDD[ml.linalg.Vector]
   -  `SW-525 <https://0xdata.atlassian.net/browse/SW-525>`__ - Don't use GPU nodes for sparkling water testing in Jenkins
   -  `SW-526 <https://0xdata.atlassian.net/browse/SW-526>`__ - Add missing when clause to scripts test stage in Jenkinsfile
   -  `SW-527 <https://0xdata.atlassian.net/browse/SW-527>`__ - Use dX cluster for Jenkins testing
   -  `SW-529 <https://0xdata.atlassian.net/browse/SW-529>`__ - Code defect in Scala example
   -  `SW-531 <https://0xdata.atlassian.net/browse/SW-531>`__ - Use code which is compatible between Scala 2.10 and 2.11
   -  `SW-532 <https://0xdata.atlassian.net/browse/SW-532>`__ - Make auto mode in external cluster default for tests in jenkins
   -  `SW-534 <https://0xdata.atlassian.net/browse/SW-534>`__ - Ensure that all tests run on both, internal and external backends
   -  `SW-536 <https://0xdata.atlassian.net/browse/SW-536>`__ - Allow to test sparkling water against specific h2o branch
   -  `SW-537 <https://0xdata.atlassian.net/browse/SW-537>`__ - Update Gradle to 4.2RC2
   -  `SW-538 <https://0xdata.atlassian.net/browse/SW-538>`__ - Fix problem in Jenkinsfile where H2O_HOME has higher priority then H2O_PYTHON_WHEEL
   -  `SW-539 <https://0xdata.atlassian.net/browse/SW-539>`__ - Fix PySparkling issue when running multiple times on the same node
   -  `SW-541 <https://0xdata.atlassian.net/browse/SW-541>`__ - Model training hangs in SW
   -  `SW-542 <https://0xdata.atlassian.net/browse/SW-542>`__ - sw does not support parquet import
   -  `SW-552 <https://0xdata.atlassian.net/browse/SW-552>`__ - Fix documentation bug

-  New Feature

   -  `SW-521 <https://0xdata.atlassian.net/browse/SW-521>`__ - Fix typo in documentation
   -  `SW-523 <https://0xdata.atlassian.net/browse/SW-523>`__ - Use linux label to determine which nodes are used for Jenkins testing
   -  `SW-533 <https://0xdata.atlassian.net/browse/SW-533>`__ - In external cluster, remove notification file at the end. This affects nothing, it is just cleanup.

-  Improvement

   -  `SW-543 <https://0xdata.atlassian.net/browse/SW-543>`__ - Upgrade Gradle to 4.2
   -  `SW-544 <https://0xdata.atlassian.net/browse/SW-544>`__ - Improve exception in ExternalH2OBackend
   -  `SW-545 <https://0xdata.atlassian.net/browse/SW-545>`__ - Stop H2O in afterAll in tests
   -  `SW-546 <https://0xdata.atlassian.net/browse/SW-546>`__ - Add sw version to name of h2odriver obtained using get-extended-h2o script
   -  `SW-549 <https://0xdata.atlassian.net/browse/SW-549>`__ - Upgrade gradle to 4.2.1
   -  `SW-550 <https://0xdata.atlassian.net/browse/SW-550>`__ - Upgrade H2O to 3.14.0.6

v2.0.15 (2017-08-23)
--------------------

-  Bug

   -  `SW-449 <https://0xdata.atlassian.net/browse/SW-449>`__ - Support Sparse Data during spark-h2o conversions
   -  `SW-510 <https://0xdata.atlassian.net/browse/SW-510>`__ - the link `Demo Example from Git` is broken on the download page

-  New Feature

   -  `SW-481 <https://0xdata.atlassian.net/browse/SW-481>`__ - MOJO for Spark SVM

-  Improvement

   -  `SW-395 <https://0xdata.atlassian.net/browse/SW-395>`__ - bin/sparkling-shell should fail if assembly `jar` file does not exist
   -  `SW-471 <https://0xdata.atlassian.net/browse/SW-471>`__ - Use mojo in pipelines if possible, remove H2OPipeline and OneTimeTransformers
   -  `SW-512 <https://0xdata.atlassian.net/browse/SW-512>`__ - Make JenkinsFile up-to-date with sparkling_yarn_branch
   -  `SW-513 <https://0xdata.atlassian.net/browse/SW-513>`__ - Upgrade to Gradle 4.1
   -  `SW-514 <https://0xdata.atlassian.net/browse/SW-514>`__ - Upgrade H2O to 3.14.0.2

v2.0.14 (2017-08-02)
--------------------

-  Bug
  
   -  `SW-501 <https://0xdata.atlassian.net/browse/SW-501>`__ - Security Bug when using Security.enableSSL(spark)
   -  `SW-505 <https://0xdata.atlassian.net/browse/SW-505>`__ - Travis build is failing on missing OracleJdk7

-  Improvement
  
   -  `SW-355 <https://0xdata.atlassian.net/browse/SW-355>`__ - Include H2O R client distribution in Sparkling Water binary
   -  `SW-506 <https://0xdata.atlassian.net/browse/SW-506>`__ - Documentation for the backends should mention get-extended-h2o.sh instead of manual jar extending
   -  `SW-507 <https://0xdata.atlassian.net/browse/SW-507>`__ - Upgrade to Gradle 4.0.2
   -  `SW-508 <https://0xdata.atlassian.net/browse/SW-508>`__ - More robust get-extended-h2o.sh
   -  `SW-509 <https://0xdata.atlassian.net/browse/SW-509>`__ - Add back DEVEL.md and CHANGELOG.md and redirect to new versions

v2.0.13 (2017-07-17)
--------------------

-  Improvement

   -  `SW-490 <https://0xdata.atlassian.net/browse/SW-490>`__ - Upgrade Gradle to 4.0.1
   -  `SW-491 <https://0xdata.atlassian.net/browse/SW-491>`__ - Increase default value for Write and Read confirmation timeout
   -  `SW-492 <https://0xdata.atlassian.net/browse/SW-492>`__ - Remove dead code and deprecation warning in tests
   -  `SW-493 <https://0xdata.atlassian.net/browse/SW-493>`__ - Enforce Scala Style rules
   -  `SW-494 <https://0xdata.atlassian.net/browse/SW-494>`__ - Remove hard dependency on RequestServer by using RestApiContext
   -  `SW-496 <https://0xdata.atlassian.net/browse/SW-496>`__ - Remove ignored empty "H2OFrame[Time] to DataFrame[TimeStamp]" test
   -  `SW-498 <https://0xdata.atlassian.net/browse/SW-498>`__ - Upgrade H2O to 3.10.5.4


v2.0.12 (2017-07-12)
--------------------

-  Bug

   -  `SW-407 <https://0xdata.atlassian.net/browse/SW-407>`__ - Make scala H2OConf consistent and allow to set and get all propertties

-  Improvement

   -  `SW-485 <https://0xdata.atlassian.net/browse/SW-485>`__ - Update instructions for a new PYPI.org
   -  `SW-489 <https://0xdata.atlassian.net/browse/SW-489>`__ - Upgrade H2O to 3.10.5.3

v2.0.11 (2017-06-29)
--------------------

-  Bug
   
   -  `SW-469 <https://0xdata.atlassian.net/browse/SW-469>`__ - Remove accidentally added kerb.conf file
   -  `SW-470 <https://0xdata.atlassian.net/browse/SW-470>`__ - Allow to pask sparkSession to Security.enableSSL and deprecate sparkContext
   -  `SW-474 <https://0xdata.atlassian.net/browse/SW-474>`__ - Use deprecated HTTPClient as some CDH versions does not have the new method
   -  `SW-475 <https://0xdata.atlassian.net/browse/SW-475>`__ - Handle duke library in case it's loaded using --packages
   -  `SW-479 <https://0xdata.atlassian.net/browse/SW-479>`__ - Fix CHANGELOG location in make-dist.sh

-  Improvement
   
   -  `SW-457 <https://0xdata.atlassian.net/browse/SW-457>`__ - Clean up windows scripts
   -  `SW-466 <https://0xdata.atlassian.net/browse/SW-466>`__ - Separate Devel.md into multiple rst files
   -  `SW-472 <https://0xdata.atlassian.net/browse/SW-472>`__ - Convert to rst README in gradle dir
   -  `SW-473 <https://0xdata.atlassian.net/browse/SW-473>`__ - Upgrade to gradle 4.0
   -  `SW-477 <https://0xdata.atlassian.net/browse/SW-477>`__ - Upgrade H2O to 3.10.5.2
   -  `SW-480 <https://0xdata.atlassian.net/browse/SW-480>`__ - Bring back publishToMavenLocal task
   -  `SW-482 <https://0xdata.atlassian.net/browse/SW-482>`__ - Updates to change log location
   -  `SW-484 <https://0xdata.atlassian.net/browse/SW-484>`__ - Make rel-2.0 changelog consistent and also rst

v2.0.10 (2017-06-15)
--------------------

-  Technical task

   -  `SW-211 <https://0xdata.atlassian.net/browse/SW-211>`__ - In PySparkling for spark 2.0 document how to build the package

-  Bug

   -  `SW-448 <https://0xdata.atlassian.net/browse/SW-448>`__ - Add missing jar into the assembly
   -  `SW-450 <https://0xdata.atlassian.net/browse/SW-450>`__ - Fix instructions on the download site
   -  `SW-453 <https://0xdata.atlassian.net/browse/SW-453>`__ - Use size method to get attr num
   -  `SW-454 <https://0xdata.atlassian.net/browse/SW-454>`__ - Replace sparkSession with spark in backends documentation
   -  `SW-456 <https://0xdata.atlassian.net/browse/SW-456>`__ - Make shell scripts safe
   -  `SW-459 <https://0xdata.atlassian.net/browse/SW-459>`__ - Update PySparkling run-time dependencies
   -  `SW-461 <https://0xdata.atlassian.net/browse/SW-461>`__ - Fix wrong getters and setters in pysparkling
   -  `SW-467 <https://0xdata.atlassian.net/browse/SW-467>`__ - Fix typo in the FAQ documentation
   -  `SW-468 <https://0xdata.atlassian.net/browse/SW-468>`__ - Fix make-dist

-  New Feature

   -  `SW-455 <https://0xdata.atlassian.net/browse/SW-455>`__ - Replace the remaining references to egg files

-  Improvement

   -  `SW-24 <https://0xdata.atlassian.net/browse/SW-24>`__ - Append tab on Sparkling Water download page - how to use Sparkling Water package
   -  `SW-111 <https://0xdata.atlassian.net/browse/SW-111>`__ - Update FAQ with information about hive metastore location
   -  `SW-112 <https://0xdata.atlassian.net/browse/SW-112>`__ - Sparkling Water Tunning doc: add heartbeat dcoumentation
   -  `SW-311 <https://0xdata.atlassian.net/browse/SW-311>`__ - Please report Application Type to Yarn Resource Manager
   -  `SW-340 <https://0xdata.atlassian.net/browse/SW-340>`__ - Improve structure of SW README
   -  `SW-426 <https://0xdata.atlassian.net/browse/SW-426>`__ - Allow to download sparkling water logs from the spark UI
   -  `SW-444 <https://0xdata.atlassian.net/browse/SW-444>`__ - Remove references to Spark 1.5, 1.4 ( as it's old ) in README.rst and other docs
   -  `SW-447 <https://0xdata.atlassian.net/browse/SW-447>`__ - Upgrade H2O to 3.10.5.1
   -  `SW-452 <https://0xdata.atlassian.net/browse/SW-452>`__ - Add missing spaces after "," in H2OContextImplicits
   -  `SW-460 <https://0xdata.atlassian.net/browse/SW-460>`__ - Allow to configure flow dir location in SW
   -  `SW-463 <https://0xdata.atlassian.net/browse/SW-463>`__ - Extract sparkling water configuration to extra doc in rst format
   -  `SW-465 <https://0xdata.atlassian.net/browse/SW-465>`__ - Mark tensorflow demo as experimental

v2.0.9 (2017-05-25)
-------------------

-  Bug

   -  `SW-263 <https://0xdata.atlassian.net/browse/SW-263>`__ - Cannot run build in parallel because of Python module
   -  `SW-336 <https://0xdata.atlassian.net/browse/SW-336>`__ - Wrong documentation of PyPi h2o_pysparkling_2.0 package
   -  `SW-421 <https://0xdata.atlassian.net/browse/SW-421>`__ - External cluster: Job is reporting exit status as FAILED even all mappers return 0
   -  `SW-429 <https://0xdata.atlassian.net/browse/SW-429>`__ - Different cluster name between client and h2o nodes in case of external cluster
   -  `SW-430 <https://0xdata.atlassian.net/browse/SW-430>`__ - pysparkling: adding a column to a data frame does not work when  parse the original frame in spark
   -  `SW-431 <https://0xdata.atlassian.net/browse/SW-431>`__ - Allow to pass additional arguments to run-python-script.sh
   -  `SW-436 <https://0xdata.atlassian.net/browse/SW-436>`__ - Fix getting of sparkling water jar in pysparkling
   -  `SW-437 <https://0xdata.atlassian.net/browse/SW-437>`__ - Don't call atexit in case of pysparkling in cluster deploy mode
   -  `SW-438 <https://0xdata.atlassian.net/browse/SW-438>`__ - store h2o logs int unique directories
   -  `SW-439 <https://0xdata.atlassian.net/browse/SW-439>`__ - handle interrupted exception in H2ORuntimeInfoUIThread
   -  `SW-335 <https://0xdata.atlassian.net/browse/SW-335>`__ - Cannot install pysparkling from PyPi

-  Improvement

   -  `SW-445 <https://0xdata.atlassian.net/browse/SW-445>`__ - Remove information from README.pst that pip cannot be used
   -  `SW-341 <https://0xdata.atlassian.net/browse/SW-341>`__ - Support Python 3 distribution
   -  `SW-380 <https://0xdata.atlassian.net/browse/SW-380>`__ - Define Jenkins pipeline via Jenkinsfile
   -  `SW-422 <https://0xdata.atlassian.net/browse/SW-422>`__ - Upgrade H2O dependency to 3.10.4.6
   -  `SW-424 <https://0xdata.atlassian.net/browse/SW-424>`__ - Add SW tab in Spark History Server
   -  `SW-427 <https://0xdata.atlassian.net/browse/SW-427>`__ - Upgrade H2O dependency to 3.10.4.7
   -  `SW-433 <https://0xdata.atlassian.net/browse/SW-433>`__ - Add change logs link to the sw download page
   -  `SW-435 <https://0xdata.atlassian.net/browse/SW-435>`__ - Upgrade shadow jar plugin to 2.0.0
   -  `SW-440 <https://0xdata.atlassian.net/browse/SW-440>`__ - Sparkling Water cluster name should contain spark app id instead of random number
   -  `SW-441 <https://0xdata.atlassian.net/browse/SW-441>`__ - Replace deprecated DefaultHTTPClient in AnnouncementService
   -  `SW-442 <https://0xdata.atlassian.net/browse/SW-442>`__ - Get array size from metadata in case of ml.lilang.VectorUDT
   -  `SW-443 <https://0xdata.atlassian.net/browse/SW-443>`__ - Upgrade H2O version to 3.10.4.8

v2.0.8 (2017-04-07)
-------------------

-  Bug

   -  `SW-365 <https://0xdata.atlassian.net/browse/SW-365>`__ - Proper exit status handling of external cluster
   -  `SW-398 <https://0xdata.atlassian.net/browse/SW-398>`__ - Use timeout for read/write confirmation in external cluster mode
   -  `SW-400 <https://0xdata.atlassian.net/browse/SW-400>`__ - Fix stopping of H2OContext in case of running standalone application
   -  `SW-401 <https://0xdata.atlassian.net/browse/SW-401>`__ - Add configuration property to external backend allowing to specify the maximal timeout the cloud will wait for watchdog client to connect
   -  `SW-405 <https://0xdata.atlassian.net/browse/SW-405>`__ - Use correct quote in backend documentation
   -  `SW-408 <https://0xdata.atlassian.net/browse/SW-408>`__ - Use kwargs for h2o.connect in pysparkling
   -  `SW-409 <https://0xdata.atlassian.net/browse/SW-409>`__ - Fix stopping of python tests
   -  `SW-410 <https://0xdata.atlassian.net/browse/SW-410>`__ - Honor --core Spark settings in H2O executors
   -  `SW-419 <https://0xdata.atlassian.net/browse/SW-419>`__ - Fixlf4JLoggerFactory creating on Spark 2.0

-  Improvement

   -  `SW-231 <https://0xdata.atlassian.net/browse/SW-231>`__ - Sparkling Water download page is missing PySParkling/RSparkling info
   -  `SW-404 <https://0xdata.atlassian.net/browse/SW-404>`__ - Upgrade H2O dependency to 3.10.4.4
   -  `SW-406 <https://0xdata.atlassian.net/browse/SW-406>`__ - Download page should list available jars for external cluster.
   -  `SW-411 <https://0xdata.atlassian.net/browse/SW-411>`__ - Migrate Pysparkling tests and examples to SparkSession
   -  `SW-412 <https://0xdata.atlassian.net/browse/SW-412>`__ - Upgrade H2O dependency to 3.10.4.5

2.0.7 (2017-04-07)
------------------

-  Bug

   -  `SW-334 <https://0xdata.atlassian.net/browse/SW-334>`__ - as_factor() 'corrupts' dataframe if it fails
   -  `SW-353 <https://0xdata.atlassian.net/browse/SW-353>`__ - Kerberos for SW not loading JAAS module
   -  `SW-364 <https://0xdata.atlassian.net/browse/SW-364>`__ - Repl session not set on scala 2.11
   -  `SW-368 <https://0xdata.atlassian.net/browse/SW-368>`__ - bin/pysparkling.cmd is missing
   -  `SW-371 <https://0xdata.atlassian.net/browse/SW-371>`__ - Fix MarkDown syntax
   -  `SW-372 <https://0xdata.atlassian.net/browse/SW-372>`__ - Run negative test for PUBDEV-3808 multiple times to observe failure
   -  `SW-375 <https://0xdata.atlassian.net/browse/SW-375>`__ - Documentation fix in external cluster manual
   -  `SW-376 <https://0xdata.atlassian.net/browse/SW-376>`__ - Tests for DecimalType and DataType fail on external backend
   -  `SW-377 <https://0xdata.atlassian.net/browse/SW-377>`__ - Implement stopping of external H2O cluster in external backend mode
   -  `SW-383 <https://0xdata.atlassian.net/browse/SW-383>`__ - Update PySparkling README with info about SW-335 and using SW from Pypi
   -  `SW-385 <https://0xdata.atlassian.net/browse/SW-385>`__ - Fix residual plot R code generator
   -  `SW-386 <https://0xdata.atlassian.net/browse/SW-386>`__ - SW REPL cannot be used in combination with Spark Dataset
   -  `SW-387 <https://0xdata.atlassian.net/browse/SW-387>`__ - Fix typo in setClientIp method
   -  `SW-388 <https://0xdata.atlassian.net/browse/SW-388>`__ - Stop h2o when running inside standalone pysparkling job
   -  `SW-389 <https://0xdata.atlassian.net/browse/SW-389>`__ - Extending h2o jar from SW doesn't work when the jar is already downloaded
   -  `SW-392 <https://0xdata.atlassian.net/browse/SW-392>`__ - Python in gradle is using wrong python - it doesn't respect the PATH variable
   -  `SW-393 <https://0xdata.atlassian.net/browse/SW-393>`__ - Allow to specify timeout for h2o cloud up in external backend mode
   -  `SW-394 <https://0xdata.atlassian.net/browse/SW-394>`__ - Allow to specify log level to external h2o cluster
   -  `SW-396 <https://0xdata.atlassian.net/browse/SW-396>`__ - Create setter in pysparkling conf for h2o client log level
   -  `SW-397 <https://0xdata.atlassian.net/browse/SW-397>`__ - Better error message covering the most often case when cluster info file doesn't exist

-  Improvement

   -  `SW-296 <https://0xdata.atlassian.net/browse/SW-296>`__ - H2OConf remove nulls and make it more Scala-like
   -  `SW-367 <https://0xdata.atlassian.net/browse/SW-367>`__ - Add task to Gradle build which prints all available Hadoop distributions for the corresponding h2o
   -  `SW-382 <https://0xdata.atlassian.net/browse/SW-382>`__ - Upgrade of H2O dependency to 3.10.4.3

2.0.6 (2017-03-21)
------------------

-  Bug

   -  `SW-306 <https://0xdata.atlassian.net/browse/SW->`__ - KubasCluster: Notify file fails on failure
   -  `SW-308 <https://0xdata.atlassian.net/browse/SW->`__ - Intermittent failure in creating H2O cloud
   -  `SW-321 <https://0xdata.atlassian.net/browse/SW->`__ - composite function fail when inner cbind()
   -  `SW-331 <https://0xdata.atlassian.net/browse/SW->`__ - Security.enableSSL does not work
   -  `SW-347 <https://0xdata.atlassian.net/browse/SW->`__ - Cannot start Sparkling Water at HDP Yarn cluster
   -  `SW-349 <https://0xdata.atlassian.net/browse/SW->`__ - Sparkling Shell scripts for Windows do not work
   -  `SW-350 <https://0xdata.atlassian.net/browse/SW->`__ - Fix command line environment for Windows
   -  `SW-357 <https://0xdata.atlassian.net/browse/SW->`__ - PySparkling in Zeppelin environment using wrong class loader
   -  `SW-361 <https://0xdata.atlassian.net/browse/SW->`__ - Flow is not available in Sparkling Water
   -  `SW-362 <https://0xdata.atlassian.net/browse/SW->`__ - PySparkling does not work

-  Improvement

   -  `SW-333 <https://0xdata.atlassian.net/browse/SW->`__ - ApplicationMaster info in Yarn for external cluster
   -  `SW-337 <https://0xdata.atlassian.net/browse/SW->`__ - Use ``h2o.connect`` in PySpark to connect to H2O cluster
   -  `SW-338 <https://0xdata.atlassian.net/browse/SW->`__ - h2o.init in PySpark prints internal IP. We should remove it or replace it with actual IP of driver node (based on spark_DNS settings)
   -  `SW-344 <https://0xdata.atlassian.net/browse/SW->`__ - Use Spark public DNS if available to report Flow UI
   -  `SW-345 <https://0xdata.atlassian.net/browse/SW->`__ - Create configuration manual for External cluster
   -  `SW-356 <https://0xdata.atlassian.net/browse/SW->`__ - Fix documentation for spark.ext.h2o.fail.on.unsupported.spark.param
   -  `SW-359 <https://0xdata.atlassian.net/browse/SW->`__ - Upgrade H2O dependency to 3.10.4.1
   -  `SW-360 <https://0xdata.atlassian.net/browse/SW->`__ - Upgrade H2O dependency to 3.10.4.2
   -  `SW-363 <https://0xdata.atlassian.net/browse/SW->`__ - Use Spark public DNS if available to report Flow UI

2.0.5 (2017-02-10)
------------------

-  Improvement

   -  `SW-325 <https://0xdata.atlassian.net/browse/SW-325>`__ - Implement a generic announcement mechanism
   -  `SW-327 <https://0xdata.atlassian.net/browse/SW-327>`__ - Enrich Spark UI with Sparkling Water specific tab
   -  `SW-328 <https://0xdata.atlassian.net/browse/SW-328>`__ - Put link to h2oai github into README.md

2.0.4 (2017-01-02)
------------------

-  Bug

   -  `SW-303 <https://0xdata.atlassian.net/browse/SW-303>`__ - Failure on DecimalType conversion
   -  `SW-305 <https://0xdata.atlassian.net/browse/SW-305>`__ - Failure on DateType
   -  `SW-309 <https://0xdata.atlassian.net/browse/SW-309>`__ - Handling for Spark DateType in SW
   -  `SW-310 <https://0xdata.atlassian.net/browse/SW-310>`__ - Decimal(2,1) not compatible in h2o frame
   -  `SW-322 <https://0xdata.atlassian.net/browse/SW-322>`__ - Python README.md says it does not support Spark 2.0

-  Improvement

   -  `SW-313 <https://0xdata.atlassian.net/browse/SW-313>`__ - Document and test SSL support
   -  `SW-314 <https://0xdata.atlassian.net/browse/SW-314>`__ - Document SSL security for sparkling water
   -  `SW-317 <https://0xdata.atlassian.net/browse/SW-317>`__ - Upgrade to H2O version 3.10.3.2

2.0.3 (2017-01-04)
------------------

-  Bug

   -  `SW-152 <https://0xdata.atlassian.net/browse/SW-152>`__ - ClassNotFound with spark-submit
   -  `SW-266 <https://0xdata.atlassian.net/browse/SW-266>`__ - H2OContext shouldn't be Serializable
   -  `SW-276 <https://0xdata.atlassian.net/browse/SW-276>`__ - ClassLoading issue when running code using SparkSubmit
   -  `SW-281 <https://0xdata.atlassian.net/browse/SW-281>`__ - Update sparkling water tests so they use correct frame locking
   -  `SW-283 <https://0xdata.atlassian.net/browse/SW-283>`__ - Set spark.sql.warehouse.dir explicitly in tests because of SPARK-17810
   -  `SW-284 <https://0xdata.atlassian.net/browse/SW-284>`__ - Fix CraigsListJobTitlesApp to use local file instead of trying to get one from hdfs
   -  `SW-285 <https://0xdata.atlassian.net/browse/SW-285>`__ - Disable timeline service also in python integration tests
   -  `SW-286 <https://0xdata.atlassian.net/browse/SW-286>`__ - Add missing test in pysparkling for conversion RDD[Double] -> H2OFrame
   -  `SW-287 <https://0xdata.atlassian.net/browse/SW-287>`__ - Fix bug in SparkDataFrame converter where key wasn't random if not specified
   -  `SW-288 <https://0xdata.atlassian.net/browse/SW-288>`__ - Improve performance of Dataset tests and call super.afterAll
   -  `SW-289 <https://0xdata.atlassian.net/browse/SW-289>`__ - Fix PySparkling numeric handling during conversions
   -  `SW-290 <https://0xdata.atlassian.net/browse/SW-290>`__ - Fixes and improvements of task used to extended h2o jars by sparkling-water classes
   -  `SW-292 <https://0xdata.atlassian.net/browse/SW-292>`__ - Fix ScalaCodeHandlerTestSuite

-  New Feature

   -  `SW-178 <https://0xdata.atlassian.net/browse/SW-178>`__ - Allow external h2o cluster to act as h2o backend in Sparkling Water

-  Improvement

   -  `SW-282 <https://0xdata.atlassian.net/browse/SW-282>`__ - Integrate SW with H2O 3.10.1.2 ( Support for external cluster )
   -  `SW-291 <https://0xdata.atlassian.net/browse/SW-291>`__ - Use absolute value for random number in sparkling-water in internal backend
   -  `SW-295 <https://0xdata.atlassian.net/browse/SW-295>`__ - H2OConf should be parameterized by SparkConf and not by SparkContext

2.0.2 (2016-12-09)
------------------

-  Bug

   -  `SW-271 <https://0xdata.atlassian.net/browse/SW-271>`__ - SparklingWater Driver is not using SparkSession
   -  `SW-272 <https://0xdata.atlassian.net/browse/SW-272>`__ - Microsoft Azure: deployment of pysparkling is failing
   -  `SW-274 <https://0xdata.atlassian.net/browse/SW-274>`__ - When grep options are configured, Spark version detection does not work

2.0.1 (2016-12-04)
------------------

-  Bug

   -  `SW-196 <https://0xdata.atlassian.net/browse/SW-196>`__ - Fix wrong output of **str** on H2OContext
   -  `SW-212 <https://0xdata.atlassian.net/browse/SW-212>`__ - Fix depreciation warning regarding the compiler in scala.gradle
   -  `SW-221 <https://0xdata.atlassian.net/browse/SW-221>`__ - SVM: the model is not unlocked after building
   -  `SW-226 <https://0xdata.atlassian.net/browse/SW-226>`__ - SVM: binomial model - AUC curves are missing
   -  `SW-227 <https://0xdata.atlassian.net/browse/SW-227>`__ - java.lang.ClassCastException: com.sun.proxy.$Proxy19 cannot be cast to water.api.API
   -  `SW-242 <https://0xdata.atlassian.net/browse/SW-242>`__ - Fix Python build process
   -  `SW-248 <https://0xdata.atlassian.net/browse/SW-248>`__ - Fix TensorFlow notebook to support Python 3
   -  `SW-264 <https://0xdata.atlassian.net/browse/SW-264>`__ - PySparkling is not using existing SQLContext
   -  `SW-268 <https://0xdata.atlassian.net/browse/SW-268>`__ - Databricks cloud: Jetty class loading problem.

-  New Feature

   -  `SW-267 <https://0xdata.atlassian.net/browse/SW-267>`__ - Add assembly-h2o module which will extend h2o/h2odriver jar by additional classes

-  Improvement

   -  `SW-129 <https://0xdata.atlassian.net/browse/SW-129>`__ - Add support for transformation from H2OFrame -> RDD in PySparkling
   -  `SW-169 <https://0xdata.atlassian.net/browse/SW-169>`__ - Remove deprecated calls
   -  `SW-193 <https://0xdata.atlassian.net/browse/SW-193>`__ - Append scala version to pysparkling package name
   -  `SW-200 <https://0xdata.atlassian.net/browse/SW-200>`__ - Add flows from presentation in Budapest and Paris to flows dir
   -  `SW-208 <https://0xdata.atlassian.net/browse/SW-208>`__ - Generate all PySparkling artefacts into build directory
   -  `SW-209 <https://0xdata.atlassian.net/browse/SW-209>`__ - RSparkling: improve handling of Sparkling Water package ependencies
   -  `SW-215 <https://0xdata.atlassian.net/browse/SW-215>`__ - Improve internal type handling
   -  `SW-219 <https://0xdata.atlassian.net/browse/SW-219>`__ - RSparkling: as_h2o_frame should properly name the frame
   -  `SW-230 <https://0xdata.atlassian.net/browse/SW-230>`__ - Fix sparkling-shell windows script
   -  `SW-235 <https://0xdata.atlassian.net/browse/SW-235>`__ - Discover py4j package version automatically from SPARK_HOME
   -  `SW-243 <https://0xdata.atlassian.net/browse/SW-243>`__ - Remove all references to local-cluster[...] in our doc
   -  `SW-245 <https://0xdata.atlassian.net/browse/SW-245>`__ - Upgrade of H2O dependency to the latest turing release (3.10.0.10)

2.0.0 (2016-09-26)
------------------

-  Bugs

   -  `SW-57 <https://0xdata.atlassian.net/browse/SW-57>`__ - Produce artifacts for Scala 2.11
   -  `SW-71 <https://0xdata.atlassian.net/browse/SW-71>`__ - Expose method ``H2OContext#setLogLevel`` to setup log level of H2O
   -  `SW-128 <https://0xdata.atlassian.net/browse/SW-128>`__ - Publish flows pack in GitHub repo and embed them in distributed JAR
   -  `SW-168 <https://0xdata.atlassian.net/browse/SW-168>`__ - Explore slow-down for fat-dataset with many categorical columns
   -  `SW-172 <https://0xdata.atlassian.net/browse/SW-172>`__ - ``NodeDesc`` should be interned or use ``H2OKey`` instead of ``NodeDesc``
   -  `SW-176 <https://0xdata.atlassian.net/browse/SW-176>`__ - H2O context is failing on CDH-5.7.1 with Spark Version 1.6.0-CDH.5.7.1
   -  `SW-185 <https://0xdata.atlassian.net/browse/SW-185>`__ - Methods on frame can't be called in compute method on external cluster
   -  `SW-186 <https://0xdata.atlassian.net/browse/SW-186>`__ - Hide checks whether incoming data is NA into convertorCtx
   -  `SW-191 <https://0xdata.atlassian.net/browse/SW-191>`__ - Better exception message in case dataframe with the desired key already exist when saving using datasource api
   -  `SW-192 <https://0xdata.atlassian.net/browse/SW-192>`__ - Add ``org.apache.spark.sql._`` to packages imported by default in REPL
   -  `SW-197 <https://0xdata.atlassian.net/browse/SW-197>`__ - Fix all mentions of ``H2OContext(sc)`` to ``H2OContext.getOrCreate(sc)`` in PySparkling
   -  `SW-201 <https://0xdata.atlassian.net/browse/SW-201>`__ - Methods in water.support classes should use ``[T <: Frame]`` instead of ``H2OFrame``
   -  `SW-202 <https://0xdata.atlassian.net/browse/SW-202>`__ - Pipeline scripts are not tested!
   -  `SW-205 <https://0xdata.atlassian.net/browse/SW-205>`__ - PySparkling tests launcher does not report error correctly
   -  `SW-210 <https://0xdata.atlassian.net/browse/SW-210>`__ - Change log level of arguments used to start client to Info

-  New Features

   -  `SW-182 <https://0xdata.atlassian.net/browse/SW-182>`__ - RSparkling: use Sparkling Water API directly from R
   -  `SW-206 <https://0xdata.atlassian.net/browse/SW-206>`__ - Support Spark 2.0

-  Improvements

   -  `SW-158 <https://0xdata.atlassian.net/browse/SW-158>`__ - Support Spark DataSet in the same way as RDD and DataFrame
   -  `SW-163 <https://0xdata.atlassian.net/browse/SW-163>`__ - Upgrade H2O dependency to the latest Turing release
   -  `SW-164 <https://0xdata.atlassian.net/browse/SW-164>`__ - Replace usage of ``SQLContext`` by ``SparkSession``
   -  `SW-165 <https://0xdata.atlassian.net/browse/SW-165>`__ - Change default schema for Scala code to black one.
   -  `SW-170 <https://0xdata.atlassian.net/browse/SW-170>`__ - Unify H2OFrame datasource and asDataFrame API
   -  `SW-171 <https://0xdata.atlassian.net/browse/SW-171>`__ - Internal API refactoring to allow multiple backends
   -  `SW-174 <https://0xdata.atlassian.net/browse/SW-174>`__ - Remove unused fields from H2ORDD
   -  `SW-177 <https://0xdata.atlassian.net/browse/SW-177>`__ - Refactor and simplify REPL
   -  `SW-204 <https://0xdata.atlassian.net/browse/SW-204>`__ - Distribute tests log4j logs to corresponding build directories

-  Breaking API changes

   -  The enum ``hex.Distribution.Family`` is now ``hex.genmodel.utils.DistributionFamily``
   -  The deprecated methods (e.g., ``H2OContext#asSchemaRDD``) were removed

v1.6.x (2016-03-15)
-------------------

-  Sparkling Water 1.6 brings support of Spark 1.6.
-  For detailed changelog, please read `rel-1.6/CHANGELOG <https://github.com/h2oai/sparkling-water/blob/rel-1.6/CHANGELOG.md>`__.

v1.5.x (2015-09-28)
-------------------

-  Sparkling Water 1.5 brings support of Spark 1.5.
-  For detailed changelog, please read `rel-1.5/CHANGELOG <https://github.com/h2oai/sparkling-water/blob/rel-1.5/CHANGELOG.md>`__.

v1.4.x (2015-07-06)
-------------------

-  Sparkling Water 1.4 brings support of Spark 1.4.
-  For detailed changelog, please read `rel-1.4/CHANGELOG <https://github.com/h2oai/sparkling-water/blob/rel-1.4/CHANGELOG.md>`__.

v1.3.x (2015-05-25)
-------------------

-  Sparkling Water 1.3 brings support of Spark 1.3.
-  For detailed changelog, please read `rel-1.3/CHANGELOG <https://github.com/h2oai/sparkling-water/blob/rel-1.3/CHANGELOG.md>`__.

v1.2.x (2015-05-18) and older
-----------------------------

-  Sparkling Water 1.2 brings support of Spark 1.2.
-  For detailed changelog, please read `rel-1.2/CHANGELOG <https://github.com/h2oai/sparkling-water/blob/rel-1.2/CHANGELOG.md>`__.
