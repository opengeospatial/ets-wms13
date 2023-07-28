WMS 1.3.0 Test Suite Release Notes
==================================

1.30 (2023-07-28)
------------------
* [#107](https://github.com/opengeospatial/ets-wms13/pull/107) - Introduce limit of 10 for tested CRS

1.29 (2023-03-30)
------------------
* [#12](https://github.com/opengeospatial/ets-wms13/issues/12) - Develop test for a WMS 1.3 raster conformance class
* [#100](https://github.com/opengeospatial/ets-wms13/pull/100) - Add credentials to SoapUI project
* [#89](https://github.com/opengeospatial/ets-wms13/pull/89) - Bump commons-io from 2.5 to 2.7

1.28 (2021-11-26)
------------------
* [#95](https://github.com/opengeospatial/ets-wms13/issues/95) - Tests basic:transparent-true and queryable:std-data-queryable are failing when non mandatory cite prefix is missing in layer name

1.27 (2021-11-11)
------------------
* [#93](https://github.com/opengeospatial/ets-wms13/issues/93) - Update the scripts to remove cite: prefix from the Layer Names

1.26 (2021-05-28)
------------------
* [#85](https://github.com/opengeospatial/ets-wms13/issues/85) - WMS 1.3.0 Compliance Test Failed Although the Response Contains the Required Code
* [#80](https://github.com/opengeospatial/ets-wms13/issues/80) - GetMap request is not tested for mandatory version parameter
* [#77](https://github.com/opengeospatial/ets-wms13/issues/77) - Issues about the Compliance Testing
* [#74](https://github.com/opengeospatial/ets-wms13/issues/74) - Ignore CRS with AUTO2 prefixes
* [#81](https://github.com/opengeospatial/ets-wms13/issues/81) - Add template to get an XML/JSON response via rest endpoint
* [#88](https://github.com/opengeospatial/ets-wms13/pull/88) - Set Docker TEAM Engine version to 5.4.1
* [#79](https://github.com/opengeospatial/ets-wms13/pull/79) - Bump junit from 4.12 to 4.13.1
* [#86](https://github.com/opengeospatial/ets-wms13/pull/86) - Added header for soapui test.

1.25 (2019-12-09)
------------------
* [#65](https://github.com/opengeospatial/ets-wms13/issues/65) - Update version of teamengine-spi-ctl
* [#69](https://github.com/opengeospatial/ets-wms13/issues/69) - REST API: URI of test suite is equal to WMS 1.1 test suite
* [#73](https://github.com/opengeospatial/ets-wms13/pull/73) - Updated the maven dependency in pom.xml
* [#68](https://github.com/opengeospatial/ets-wms13/issues/68) - Update tests to use TEAM Engine 5.4
* [#54](https://github.com/opengeospatial/ets-wms13/issues/54) - Description of parameter basic in REST API documentation is missing
* [#62](https://github.com/opengeospatial/ets-wms13/issues/62) - XPath seems to need use of braces
* [#61](https://github.com/opengeospatial/ets-wms13/issues/61) - Introduce Dockerfile and Maven Docker plugin
* [#56](https://github.com/opengeospatial/ets-wms13/issues/56) - Create SoapUI tests and integrate them into Maven and Jenkinsfile

1.24 (2018-05-16)
------------------
* [#48](https://github.com/opengeospatial/ets-wms13/issues/48) - Update CTL with better information about conformance classes
* [#52](https://github.com/opengeospatial/ets-wms13/issues/52) - Cannot view the CTL test of a test case from current session result

1.23 (2017-08-23)
------------------
* [#50](https://github.com/opengeospatial/ets-wms13/issues/50) - Enable REST API
* [#28](https://github.com/opengeospatial/ets-wms13/issues/28) - ServletException thrown when attempting to view test results containing non-XML entity

1.22 (2017-05-10)
------------------
* [#39](https://github.com/opengeospatial/ets-wms13/issues/39) - Extracting local names and prefixes

1.21 (2017-03-07)
------------------
* [#40](https://github.com/opengeospatial/ets-wms13/issues/40) - the getfeatureinfo:each-queryable-layer tests pass an empty CRS string

1.20 (2017-01-31)
------------------
* [#35](https://github.com/opengeospatial/ets-wms13/issues/35) - Test should represent better the conformance classes
* [#37](https://github.com/opengeospatial/ets-wms13/issues/37) - missing urlencoding

1.19 (2016-11-18)
------------------
* [#34](https://github.com/opengeospatial/ets-wms13/issues/34) - Add CtlController to enable execution via RESTful API (skips tests requiring manual verification)
* [#36](https://github.com/opengeospatial/ets-wms13/issues/36) - Test execution with Web GUI does not work with current status of master branch
* TEAM Engine version 4.9 or later is required.

1.18 (2016-06-02)
------------------
* [#11](https://github.com/opengeospatial/ets-wms13/issues/11) - r10 does not send mandatory SERVICE parameter

1.17 (2016-04-29)
------------------
* [#26](https://github.com/opengeospatial/ets-wms13/issues/26) - values of "false"/"true" are not accepted for boolean attributes

1.16 (2016-01-29)
------------------
* [#19](https://github.com/opengeospatial/ets-wms13/issues/19) - Invalid function calls in time:main
* [#7](https://github.com/opengeospatial/ets-wms13/issues/7) - image/png8 and image/png24 are not valid iana media types

1.15 (2015-11-30)
------------------
* [#20](https://github.com/opengeospatial/ets-wms13/issues/20) - Malformed test results if response to `invalid-crs` test is not XML.

1.14 (2015-10-15)
------------------
* Minor update: Remove obsolete Ant buildfile, update README.md and udpate pom.xml

1.13 (2015-09-24)
------------------
* [#17](https://github.com/opengeospatial/ets-wms13/pull/17) - Fixed XPath to detect layer CRS (also consider root layer)
* [#18](https://github.com/opengeospatial/ets-wms13/pull/18) - Fixed XPath to prevent selection of multiple layers

1.12 (2015-07-30)
------------------
* Update POM file to build with Maven 2

1.11 (2015-02-20)
-----------------
* Starting this revision, the revision number will follow the conventions described in the [wiki](https://github.com/opengeospatial/cite/wiki/OGC-Compliance-Testing-Tools)
* [#9](https://github.com/opengeospatial/ets-wms13/issues/9) - Test main:time defect 

r10 (2014-10-01)
------------------
* [#1](https://github.com/opengeospatial/ets-wms13/issues/1) - update maven structure and clean project for release
* [#7](https://github.com/opengeospatial/ets-wms13/issues/7) - image/png8 and image/png24 are not valid iana media types

r9 (2014-06-20)
---------------
* Fix CITE-950: XPath error in getfeatureinfo:query_layers-not-queryable

r8 (2013-12-10)
----------------
* Fixed 912 Handling of queryable attribute in GFI requests. 
* Fixed 829 Problem with negative coordinates in boundingbox

r7 (2013-09-19)
---------------
* Removed FPS tests to separate test suite (wms-sld).

r6 (2013-05-30)
---------------
* Added FPS profile (WMS-SLD 1.1, Conformance Class C).

r5
---------------
* Fixed functions:layer-info so only one CRS reference is included in result.
* Modified functions:encode to use encode-for-uri XPath function instead of deprecated java.net.URLEncoder.encode method.
* Fixed various XPath errors in getmap.xml: A sequence of more than one item is not allowed as the first argument of string()
* Added assertion error messages to basic_elements.xml.
* Fixed various typos.

r4
---------------
* https://portal.opengeospatial.org/?m=projects&amp;a=view&amp;project_id=85&amp;tab=5&amp;act=details&amp;issue_id=665[Issue #665]:
  Added test (layer-extents) to check that layer extent is consistent with 
  CRS reference.

r3 (2012-04-05)
---------------
* 4549 - properly encode bboxes
* 4548 - updated coordinate system as suggested in ticket #644


