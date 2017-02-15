WMS 1.3.0 Test Suite Release Notes
==================================

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


