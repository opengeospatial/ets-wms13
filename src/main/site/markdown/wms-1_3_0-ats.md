![OGC logo](http://www.opengeospatial.org/themes/ogc/logo.png)

# Abstract Test Suite for WMS 1.3.0

### 1 Test module main:main

1.1 Test case main:main

Test case ID

main:main

Test purpose

Verify that the implementation under test complies with the WMS 1.3.0
specification.

Test method

Pass if all the submodules and subtests (1.1.2 - 1.1.9) pass.

Reference

Test type

Capability

### 1.2 Test module interactive:main

1.2.1 Test case interactive:main

Test case ID

interactive:main

Test purpose

Verify that the tests that require user interaction behave properly.

Test method

Pass if all the submodules and subtests (1.2.1.2 - 1.2.1.7) pass.

Reference

Test type

Capability

1.2.2 Test case interactive:basic-polygons-sanity-check

Test case ID

interactive:basic-polygons-sanity-check

Test purpose

Verify that the diamond from the cite:BasicPolygons layer displays correctly.

Test method

Pass if the diamond from the cite:BasicPolygons layer displays correctly.

Reference

Test type

Capability

1.2.3 Test case interactive:blue-lake-sanity-check

Test case ID

interactive:blue-lake-sanity-check

Test purpose

Verify that the layers from the Blue Lake dataset display correctly.

Test method

Pass if the layers from the Blue Lake dataset display correctly.

Reference

Test type

Capability

1.2.4 Test case interactive:layer-order

Test case ID

interactive:layer-order

Test purpose

Verify that when a GetMap request contains multiple layers, then the response
renders the requested layers by drawing the leftmost in the list bottommost,
and the next one over that.

Test method

Pass if when a GetMap request contains multiple layers, then the response
renders the requested layers by drawing the leftmost in the list bottommost,
and the next one over that.

Reference

[WMS 1.3.0 section 7.3.3.3](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.layers)

Test type

Capability

1.2.5 Test case interactive:aspect-ratio

Test case ID

interactive:aspect-ratio

Test purpose

Verify that when a GetMap request is made where the aspect ratio of the BBOX
and the aspect ratio of the WIDTH/HEIGHT parameters is different, then the map
returned is stretched.

Test method

Pass if when a GetMap request is made where the aspect ratio of the BBOX and
the aspect ratio of the WIDTH/HEIGHT parameters is different, then the map
returned is stretched.

Reference

[WMS 1.3.0 section 7.3.3.8](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.width_height)

Test type

Capability

1.2.6 Test case interactive:exceptions-inimage

Test case ID

interactive:exceptions-inimage

Test purpose

Verify that when an exception is raised and EXCEPTIONS=INIMAGE, then the error
messages are graphically returned as part of the content.

Test method

Pass if when an exception is raised and EXCEPTIONS=INIMAGE, then the error
messages are graphically returned as part of the content.

Reference

[WMS 1.3.0 section 7.3.3.11](http://cite.opengeospatial.org/OGCTestData/wms/1.
3.0/spec/wms1_3.html#wmsops.getmap.params.exceptions)

Test type

Capability

1.2.7 Test case interactive:fees-and-access-constraints

Test case ID

interactive:fees-and-access-constraints

Test purpose

Verify that when there are no fees or access constraints for using of the
service and Fees and AccessConstraints elements are supplied in the service
metadata, the reserved word "none" (case-insensitive) is used.

Test method

Pass if when there are no fees or access constraints for using of the service
and Fees and AccessConstraints elements are supplied in the service metadata,
the reserved word "none" (case-insensitive) is used.

Reference

[WMS 1.3.0 section 7.3.3.11](http://cite.opengeospatial.org/OGCTestData/wms/1.
3.0/spec/wms1_3.html#wmsops.getmap.params.exceptions); [WMS 1.3.0 section 7.2.
4.3](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0/spec/wms1_3.html#wms
ops.getcapabilities.response.general_metadata)

Test type

Capability

### 1.3 Test module main:options-requirements

1.3.1 Test case main:options-requirements

Test case ID

main:options-requirements

Test purpose

Verify that the requirements for testing the selected options are met.

Test method

Pass if all the submodules and subtests (1.3.1.2 - 1.3.1.8) pass.

Reference

Test type

Capability

1.3.2 Test case main:gif-or-png

Test case ID

main:gif-or-png

Test purpose

Verify that the server supports GetMap format image/gif and/or image/png.

Test method

Pass if the server supports GetMap format image/gif and/or image/png.

Reference

[Test requirements](docs/wms/1.3.0/#requirements)

Test type

Capability

1.3.3 Test case main:std-data-present

Test case ID

main:std-data-present

Test purpose

Verify that the server implements the CITE standard dataset in subsettable,
resizable layers that support CRS:84.

Test method

Pass if the server implements the CITE standard dataset in subsettable,
resizable layers that support CRS:84.

Reference

[Test requirements](docs/wms/1.3.0/#requirements)

Test type

Capability

1.3.4 Test case main:getfeatureinfo-supported

Test case ID

main:getfeatureinfo-supported

Test purpose

Verify that getFeatureInfo requests are supported.

Test method

Pass if getFeatureInfo requests are supported.

Reference

[Test requirements](docs/wms/1.3.0/#requirements)

Test type

Capability

1.3.5 Test case main:std-data-queryable

Test case ID

main:std-data-queryable

Test purpose

Verify that the CITE standard dataset layers containing polygons are
queryable.

Test method

Pass if the CITE standard dataset layers containing polygons are queryable.

Reference

[Test requirements](docs/wms/1.3.0/#requirements)

Test type

Capability

1.3.6 Test case main:raster_elevation

Test case ID

main:raster_elevation

Test purpose

Verify that the server supports the cite:Terrain layer with a properly
declared elevation dimenson.

Test method

Pass if the server supports the cite:Terrain layer with a properly declared
elevation dimenson.

Reference

[Test requirements](docs/wms/1.3.0/#requirements)

Test type

Capability

1.3.7 Test case main:vector_elevation

Test case ID

main:vector_elevation

Test purpose

Verify that the server supports the cite:Lakes layer with a properly declared
elevation dimenson.

Test method

Pass if the server supports the cite:Lakes layer with a properly declared
elevation dimenson.

Reference

[Test requirements](docs/wms/1.3.0/#requirements)

Test type

Capability

1.3.8 Test case main:time

Test case ID

main:time

Test purpose

Verify that the server supports the cite:Autos layer with a properly declared
time dimenson.

Test method

Pass if the server supports the cite:Autos layer with a properly declared time
dimenson.

Reference

[Test requirements](docs/wms/1.3.0/#requirements)

Test type

Capability

### 1.4 Test module basic_elements:main

1.4.1 Test case basic_elements:main

Test case ID

basic_elements:main

Test purpose

Verify that the basic service elements behave properly.

Test method

Pass if all the submodules and subtests (1.4.1.2 - 1.4.1.4) pass.

Reference

Test type

Capability

### 1.4.2 Test module basic_elements:version-negotiation

1.4.2.1 Test case basic_elements:version-negotiation

Test case ID

basic_elements:version-negotiation

Test purpose

Verify that version negotiation behaves properly.

Test method

Pass if all the submodules and subtests (1.4.2.1.2 - 1.4.2.1.5) pass.

Reference

Test type

Capability

1.4.2.2 Test case basic_elements:negotiate-no-version

Test case ID

basic_elements:negotiate-no-version

Test purpose

Verify that when a GetCapabilities request is made without a version number,
then the response is not lower than 1.3.0.

Test method

Pass if when a GetCapabilities request is made without a version number, then
the response is not lower than 1.3.0.

Reference

[WMS 1.3.0 section 6.2.4](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#basic_elements.version.negotiation)

Test type

Capability

1.4.2.3 Test case basic_elements:negotiate-basic_elements-version

Test case ID

basic_elements:negotiate-basic_elements-version

Test purpose

Verify that when a GetCapabilities request is made for version 1.3.0, then the
response is version 1.3.0.

Test method

Pass if when a GetCapabilities request is made for version 1.3.0, then the
response is version 1.3.0.

Reference

[WMS 1.3.0 section 6.2.4](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#basic_elements.version.negotiation)

Test type

Capability

1.4.2.4 Test case basic_elements:negotiate-higher-version

Test case ID

basic_elements:negotiate-higher-version

Test purpose

Verify that when a GetCapabilities request is made for version 100.0.0, then
the response is not lower than 1.3.0.

Test method

Pass if when a GetCapabilities request is made for version 100.0.0, then the
response is not lower than 1.3.0.

Reference

[WMS 1.3.0 section 6.2.4](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#basic_elements.version.negotiation)

Test type

Capability

1.4.2.5 Test case basic_elements:negotiate-lower-version

Test case ID

basic_elements:negotiate-lower-version

Test purpose

Verify that when a GetCapabilities request is made for version 0.0.0, the
response is not higher than 1.3.0.

Test method

Pass if when a GetCapabilities request is made for version 0.0.0, the response
is not higher than 1.3.0.

Reference

[WMS 1.3.0 section 6.2.4](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#basic_elements.version.negotiation)

Test type

Capability

### 1.4.3 Test module basic_elements:reserved-chars

1.4.3.1 Test case basic_elements:reserved-chars

Test case ID

basic_elements:reserved-chars

Test purpose

Verify that reserved characters in HTTP GET URLs are hanled properly.

Test method

Pass if all the submodules and subtests (1.4.3.1.2 - 1.4.3.1.3) pass.

Reference

Test type

Capability

1.4.3.2 Test case basic_elements:escaped-chars

Test case ID

basic_elements:escaped-chars

Test purpose

Verify that the server can decode escaped hex values.

Test method

Pass if the server can decode escaped hex values.

Reference

[WMS 1.3.0 section 6.3.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#basic_elements.request_rules.reserved_chars)

Test type

Capability

1.4.3.3 Test case basic_elements:escaped-space

Test case ID

basic_elements:escaped-space

Test purpose

Verify that the server can decode the "+" character as a space.

Test method

Pass if the server can decode the "+" character as a space.

Reference

[WMS 1.3.0 section 6.3.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#basic_elements.request_rules.reserved_chars)

Test type

Capability

### 1.4.4 Test module basic_elements:param-rules

1.4.4.1 Test case basic_elements:param-rules

Test case ID

basic_elements:param-rules

Test purpose

Verify that the request parameter rules behave properly.

Test method

Pass if all the submodules and subtests (1.4.4.1.2 - 1.4.4.1.4) pass.

Reference

Test type

Capability

1.4.4.2 Test case basic_elements:extra-GetCapabilities-param

Test case ID

basic_elements:extra-GetCapabilities-param

Test purpose

Verify that when a GetCapabilities request contains a parameter which is not
defined by the spec, the result is valid.

Test method

Pass if when a GetCapabilities request contains a parameter which is not
defined by the spec, the result is valid.

Reference

[WMS 1.3.0 section 6.8.1](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#basic_elements.param_rules.order_and_case)

Test type

Capability

1.4.4.3 Test case basic_elements:extra-GetMap-param

Test case ID

basic_elements:extra-GetMap-param

Test purpose

Verify that when a GetMap request contains a parameter which is not defined by
the spec, the result is valid.

Test method

Pass if when a GetMap request contains a parameter which is not defined by the
spec, the result is valid.

Reference

[WMS 1.3.0 section 6.8.1](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#basic_elements.param_rules.order_and_case)

Test type

Capability

1.4.4.4 Test case basic_elements:extra-GetFeatureInfo-param

Test case ID

basic_elements:extra-GetFeatureInfo-param

Test purpose

Verify that when a GetFeatureInfo request contains a parameter which is not
defined by the spec, the result is valid.

Test method

Pass if when a GetFeatureInfo request contains a parameter which is not
defined by the spec, the result is valid.

Reference

[WMS 1.3.0 section 6.8.1](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#basic_elements.param_rules.order_and_case)

Test type

Capability

### 1.5 Test module getcapabilities:main

1.5.1 Test case getcapabilities:main

Test case ID

getcapabilities:main

Test purpose

Verify that the GetCapabilities request behaves properly.

Test method

Pass if all the submodules and subtests (1.5.1.2 - 1.5.1.6) pass.

Reference

Test type

Capability

### 1.5.2 Test module getcapabilities:requests

1.5.2.1 Test case getcapabilities:requests

Test case ID

getcapabilities:requests

Test purpose

Verify that each request parameter behaves properly.

Test method

Pass if all the submodules and subtests (1.5.2.1.2 - 1.5.2.1.8) pass.

Reference

Test type

Capability

1.5.2.2 Test case getcapabilities:each-format

Test case ID

getcapabilities:each-format

Test purpose

Verify that for each GetCapabilities format, when the FORMAT parameter is set
to that format, the MIME type of the response matches that format.

Test method

Pass if for each GetCapabilities format, when the FORMAT parameter is set to
that format, the MIME type of the response matches that format.

Reference

[WMS 1.3.0 section 7.2.3.1](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getcapabilities.params.format)

Test type

Capability

1.5.2.3 Test case getcapabilities:no-format

Test case ID

getcapabilities:no-format

Test purpose

Verify that when no FORMAT parameter is supplied, the response is capabilities
XML with MIME type text/xml.

Test method

Pass if when no FORMAT parameter is supplied, the response is capabilities XML
with MIME type text/xml.

Reference

[WMS 1.3.0 section 7.2.3.1](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getcapabilities.params.format)

Test type

Capability

1.5.2.4 Test case getcapabilities:invalid-format

Test case ID

getcapabilities:invalid-format

Test purpose

Verify that when an invalid FORMAT parameter is supplied, the response is
capabilities XML with MIME type text/xml.

Test method

Pass if when an invalid FORMAT parameter is supplied, the response is
capabilities XML with MIME type text/xml.

Reference

[WMS 1.3.0 section 7.2.3.1](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getcapabilities.params.format)

Test type

Capability

1.5.2.5 Test case getcapabilities:updatesequence-ignored

Test case ID

getcapabilities:updatesequence-ignored

Test purpose

Verify that when no updateSequence number is advertised in the Capabilities
XML, The UPDATESEQUENCE parameter is ignored.

Test method

Pass if when no updateSequence number is advertised in the Capabilities XML,
The UPDATESEQUENCE parameter is ignored.

Reference

[WMS 1.3.0 section 7.2.3.5](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getcapabilities.params.updatesequence)

Test type

Capability

1.5.2.6 Test case getcapabilities:updatesequence-current

Test case ID

getcapabilities:updatesequence-current

Test purpose

Verify that when a GetCapabilities request is made with an UPDATESEQUENCE
parameter set to the current update sequence value, then the server returns a
valid exception (code=CurrentUpdateSequence).

Test method

Pass if when a GetCapabilities request is made with an UPDATESEQUENCE
parameter set to the current update sequence value, then the server returns a
valid exception (code=CurrentUpdateSequence).

Reference

[WMS 1.3.0 section 7.2.3.5](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getcapabilities.params.updatesequence)

Test type

Capability

1.5.2.7 Test case getcapabilities:updatesequence-lower

Test case ID

getcapabilities:updatesequence-lower

Test purpose

Verify that when a GetCapabilities request is made with an UPDATESEQUENCE
parameter set to a value lower than the current update sequence value, then
the server returns capabilities XML.

Test method

Pass if when a GetCapabilities request is made with an UPDATESEQUENCE
parameter set to a value lower than the current update sequence value, then
the server returns capabilities XML.

Reference

[WMS 1.3.0 section 7.2.3.5](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getcapabilities.params.updatesequence)

Test type

Capability

1.5.2.8 Test case getcapabilities:updatesequence-higher

Test case ID

getcapabilities:updatesequence-higher

Test purpose

Verify that when a GetCapabilities request is made with an UPDATESEQUENCE
parameter set to a value higher than the current update sequence value, then
the server returns an exception (code=InvalidUpdateSequence).

Test method

Pass if when a GetCapabilities request is made with an UPDATESEQUENCE
parameter set to a value higher than the current update sequence value, then
the server returns an exception (code=InvalidUpdateSequence).

Reference

[WMS 1.3.0 section 7.2.3.5](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getcapabilities.params.updatesequence)

Test type

Capability

### 1.5.3 Test module getcapabilities:xml-validation

1.5.3.1 Test case getcapabilities:xml-validation

Test case ID

getcapabilities:xml-validation

Test purpose

Verify that the Capabilities XML validates.

Test method

Pass if all the submodules and subtests (1.5.3.1.2 - 1.5.3.1.3) pass.

Reference

Test type

Capability

1.5.3.2 Test case getcapabilities:normative-schema

Test case ID

getcapabilities:normative-schema

Test purpose

Verify that the normative content of the schema document referred to by the
schemaLocation attribute in the capabilities document is identical to the
normative content of the on-line schema referred to in Annex E.1.

Test method

Pass if the normative content of the schema document referred to by the
schemaLocation attribute in the capabilities document is identical to the
normative content of the on-line schema referred to in Annex E.1.

Reference

[WMS 1.3.0 section 7.2.4](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#wmsops.getcapabilities.response)

Test type

Capability

1.5.3.3 Test case getcapabilities:validate-using-schemaLocation

Test case ID

getcapabilities:validate-using-schemaLocation

Test purpose

Verify that the response to a GetCapabilities request validates against the
schema(s) provided with the schemaLocation attribute.

Test method

Pass if the response to a GetCapabilities request validates against the
schema(s) provided with the schemaLocation attribute.

Reference

[WMS 1.3.0 section 7.2.4](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#wmsops.getcapabilities.response)

Test type

Capability

### 1.5.4 Test module getcapabilities:capability-metadata

1.5.4.1 Test case getcapabilities:capability-metadata

Test case ID

getcapabilities:capability-metadata

Test purpose

Verify that the capability metadata is advertised correctly.

Test method

Pass if all the submodules and subtests (1.5.4.1.2 - 1.5.4.1.4) pass.

Reference

Test type

Capability

1.5.4.2 Test case getcapabilities:capability-onlineresource

Test case ID

getcapabilities:capability-onlineresource

Test purpose

Verify that each OnlineResource URL intended for HTTP Get requests in the
capabilities document is a URL prefix

Test method

Pass if each OnlineResource URL intended for HTTP Get requests in the
capabilities document is a URL prefix

Reference

[WMS 1.3.0 section 7.2.4.4](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getcapabilities.response.capability_metadata)

Test type

Capability

1.5.4.3 Test case getcapabilities:capability-xml-getcapabilities-format

Test case ID

getcapabilities:capability-xml-getcapabilities-format

Test purpose

Verify that the server advertises the text/xml format for the GetCapabilities
operation.

Test method

Pass if the server advertises the text/xml format for the GetCapabilities
operation.

Reference

[WMS 1.3.0 section 7.2.4.4](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getcapabilities.response.capability_metadata); [WMS
1.3.0 section 7.2.3.1](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0/sp
ec/wms1_3.html#wmsops.getcapabilities.params.format)

Test type

Capability

1.5.4.4 Test case getcapabilities:capability-xml-exception-format

Test case ID

getcapabilities:capability-xml-exception-format

Test purpose

Verify that the server advertises the XML service exception format.

Test method

Pass if the server advertises the XML service exception format.

Reference

[WMS 1.3.0 section 7.2.4.4](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getcapabilities.response.capability_metadata); [WMS
1.3.0 section 7.3.3.11](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0/s
pec/wms1_3.html#wmsops.getmap.params.exceptions)

Test type

Capability

### 1.5.5 Test module getcapabilities:layer-properties

1.5.5.1 Test case getcapabilities:layer-properties

Test case ID

getcapabilities:layer-properties

Test purpose

Verify that the layer properties are advertised correctly.

Test method

Pass if all the submodules and subtests (1.5.5.1.2 - 1.5.5.1.19) pass.

Reference

Test type

Capability

### 1.5.5.2 Test module getcapabilities:logourls

1.5.5.2.1 Test case getcapabilities:logourls

Test case ID

getcapabilities:logourls

Test purpose

Verify that the metadata for each of the LogoURL resources is correct.

Test method

Pass if all the submodules and subtests (1.5.5.2.1.2 - 1.5.5.2.1.3) pass.

Reference

[WMS 1.3.0 section 7.2.4.6.12](http://cite.opengeospatial.org/OGCTestData/wms/
1.3.0/spec/wms1_3.html#wmsops.getcapabilities.response.layer_properties.attrib
ution)

Test type

Capability

1.5.5.2.2 Test case getcapabilities:resource-format

Test case ID

getcapabilities:resource-format

Test purpose

Verify that the MIME-type returned for the LogoURL resource is the advertised
format.

Test method

Pass if the MIME-type returned for the LogoURL resource is the advertised
format.

Reference

Test type

Capability

1.5.5.2.3 Test case getcapabilities:resource-size

Test case ID

getcapabilities:resource-size

Test purpose

Verify that the size of the LogoURL resource is the advertised widthxthe
advertised height.

Test method

Pass if the size of the LogoURL resource is the advertised widthxthe
advertised height.

Reference

Test type

Capability

1.5.5.3 Test case getcapabilities:bbox-crs-advertised

Test case ID

getcapabilities:bbox-crs-advertised

Test purpose

Verify that there are no BoundingBoxes provided for a CRS that is not
advertised.

Test method

Pass if there are no BoundingBoxes provided for a CRS that is not advertised.

Reference

[WMS 1.3.0 section 7.2.4.6.8](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getcapabilities.response.layer_properties.bbox)

Test type

Capability

1.5.5.4 Test case getcapabilities:bbox-present

Test case ID

getcapabilities:bbox-present

Test purpose

Verify that every named layer in the capabilities document has at least one
BoundingBox element (direct or inherited).

Test method

Pass if every named layer in the capabilities document has at least one
BoundingBox element (direct or inherited).

Reference

[WMS 1.3.0 section 7.2.4.6.8](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getcapabilities.response.layer_properties.bbox)

Test type

Capability

1.5.5.5 Test case getcapabilities:bbox-distinct-crs

Test case ID

getcapabilities:bbox-distinct-crs

Test purpose

Verify that for each of the layer elements in the capabilities document, each
BoundingBox on the layer states a different CRS.

Test method

Pass if for each of the layer elements in the capabilities document, each
BoundingBox on the layer states a different CRS.

Reference

[WMS 1.3.0 section 7.2.4.6.8](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getcapabilities.response.layer_properties.bbox)

Test type

Capability

1.5.5.6 Test case getcapabilities:crs-auto2-declarations

Test case ID

getcapabilities:crs-auto2-declarations

Test purpose

Verify that none of the CRS declarations in the AUTO2 namespace contain
factor, longitude, or latitude variables.

Test method

Pass if none of the CRS declarations in the AUTO2 namespace contain factor,
longitude, or latitude variables.

Reference

[WMS 1.3.0 section 6.7.3.4](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#basic_elements.cs.layer.auto2); [WMS 1.3.0 section 7.2.4.6
.7](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0/spec/wms1_3.html#wmso
ps.getcapabilities.response.layer_properties.crs)

Test type

Capability

1.5.5.7 Test case getcapabilities:crs-present

Test case ID

getcapabilities:crs-present

Test purpose

Verify that every named layer in the capabilities document has at least one
CRS element that is either stated explicitly or inherited from a parent Layer.

Test method

Pass if every named layer in the capabilities document has at least one CRS
element that is either stated explicitly or inherited from a parent Layer.

Reference

[WMS 1.3.0 section 7.2.4.6.7](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getcapabilities.response.layer_properties.crs)

Test type

Capability

1.5.5.8 Test case getcapabilities:crs-for-all-layers

Test case ID

getcapabilities:crs-for-all-layers

Test purpose

Verify that the root layer lists all CRSs that are common to all subsidiary
layers.

Test method

Pass if the root layer lists all CRSs that are common to all subsidiary
layers.

Reference

[WMS 1.3.0 section 7.2.4.6.7](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getcapabilities.response.layer_properties.crs)

Test type

Capability

### 1.5.5.9 Test module getcapabilities:dataurls

1.5.5.9.1 Test case getcapabilities:dataurls

Test case ID

getcapabilities:dataurls

Test purpose

Verify that for each of the DataURL elements in the capabilities document, the
MIME-type returned by the resource is the same as the Format element.

Test method

Pass if all the submodules and subtests (1.5.5.9.1.2) pass.

Reference

[WMS 1.3.0 section 7.2.4.6.15](http://cite.opengeospatial.org/OGCTestData/wms/
1.3.0/spec/wms1_3.html#wmsops.getcapabilities.response.layer_properties.dataur
l)

Test type

Capability

1.5.5.9.2 Test case getcapabilities:resource-format

Test case ID

getcapabilities:resource-format

Test purpose

Verify that the MIME-type returned for the DataURL resource is the advertised
format.

Test method

Pass if the MIME-type returned for the DataURL resource is the advertised
format.

Reference

Test type

Capability

1.5.5.10 Test case getcapabilities:ex_geobbox-present

Test case ID

getcapabilities:ex_geobbox-present

Test purpose

Verify that every named layer in the capabilities document has an
EX_GeographicBoundingBox element that is either stated explicitly or inherited
from a parent Layer.

Test method

Pass if every named layer in the capabilities document has an
EX_GeographicBoundingBox element that is either stated explicitly or inherited
from a parent Layer.

Reference

[WMS 1.3.0 section 7.2.4.6.6](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getcapabilities.response.layer_properties.ex_geob
box)

Test type

Capability

1.5.5.11 Test case getcapabilities:ex_geobbox-coordinates

Test case ID

getcapabilities:ex_geobbox-coordinates

Test purpose

Verify that for each EX_GeographicBoundingBox element, westBoundLongitude is
less than eastBoundLongitude and southBoundLatitude is less than
northBoundLatitude.

Test method

Pass if for each EX_GeographicBoundingBox element, westBoundLongitude is less
than eastBoundLongitude and southBoundLatitude is less than
northBoundLatitude.

Reference

[WMS 1.3.0 section 7.2.4.6.6](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getcapabilities.response.layer_properties.ex_geob
box)

Test type

Capability

### 1.5.5.12 Test module getcapabilities:featurelisturls

1.5.5.12.1 Test case getcapabilities:featurelisturls

Test case ID

getcapabilities:featurelisturls

Test purpose

Verify that for each of the FeatureListURL elements in the capabilities
document, the MIME-type returned by the resource is the same as the Format
element.

Test method

Pass if all the submodules and subtests (1.5.5.12.1.2) pass.

Reference

[WMS 1.3.0 section 7.2.4.6.14](http://cite.opengeospatial.org/OGCTestData/wms/
1.3.0/spec/wms1_3.html#wmsops.getcapabilities.response.layer_properties.featur
elisturl)

Test type

Capability

1.5.5.12.2 Test case getcapabilities:resource-format

Test case ID

getcapabilities:resource-format

Test purpose

Verify that the MIME-type returned for the FeatureListURL resource is the
advertised format.

Test method

Pass if the MIME-type returned for the FeatureListURL resource is the
advertised format.

Reference

Test type

Capability

1.5.5.13 Test case getcapabilities:authorityurl-unique

Test case ID

getcapabilities:authorityurl-unique

Test purpose

Verify that there are no child Layer elements in the capabilities document
that define an AuthorityURL with the same name attribute as one inherited from
a parent layer.

Test method

Pass if there are no child Layer elements in the capabilities document that
define an AuthorityURL with the same name attribute as one inherited from a
parent layer.

Reference

[WMS 1.3.0 section 7.2.4.6.13](http://cite.opengeospatial.org/OGCTestData/wms/
1.3.0/spec/wms1_3.html#wmsops.getcapabilities.response.layer_properties.identi
fier_and_authorityurl)

Test type

Capability

1.5.5.14 Test case getcapabilities:identifier-matches-authorityurl

Test case ID

getcapabilities:identifier-matches-authorityurl

Test purpose

Verify that there are no Layer elements in the capabilities document that
declare an Identifier without also declaring or inheriting a corresponding
AuthorityURL.

Test method

Pass if there are no Layer elements in the capabilities document that declare
an Identifier without also declaring or inheriting a corresponding
AuthorityURL.

Reference

[WMS 1.3.0 section 7.2.4.6.13](http://cite.opengeospatial.org/OGCTestData/wms/
1.3.0/spec/wms1_3.html#wmsops.getcapabilities.response.layer_properties.identi
fier_and_authorityurl)

Test type

Capability

### 1.5.5.15 Test module getcapabilities:metadataurls

1.5.5.15.1 Test case getcapabilities:metadataurls

Test case ID

getcapabilities:metadataurls

Test purpose

Verify that for each of the MetadataURL elements in the capabilities document,
the MIME-type returned by the resource is the same as the Format element.

Test method

Pass if all the submodules and subtests (1.5.5.15.1.2) pass.

Reference

[WMS 1.3.0 section 7.2.4.6.11](http://cite.opengeospatial.org/OGCTestData/wms/
1.3.0/spec/wms1_3.html#wmsops.getcapabilities.response.layer_properties.metada
taurl)

Test type

Capability

1.5.5.15.2 Test case getcapabilities:resource-format

Test case ID

getcapabilities:resource-format

Test purpose

Verify that the MIME-type returned for the MetadataURL resource is the
advertised format.

Test method

Pass if the MIME-type returned for the MetadataURL resource is the advertised
format.

Reference

Test type

Capability

1.5.5.16 Test case getcapabilities:style-unique

Test case ID

getcapabilities:style-unique

Test purpose

Verify that there are no child layers in the capabilities document that
redefine a Style with the same name as one inherited from one of its parents.

Test method

Pass if there are no child layers in the capabilities document that redefine a
Style with the same name as one inherited from one of its parents.

Reference

[WMS 1.3.0 section 7.2.4.6.5](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getcapabilities.response.layer_properties.style)

Test type

Capability

### 1.5.5.17 Test module getcapabilities:style-legendurls

1.5.5.17.1 Test case getcapabilities:style-legendurls

Test case ID

getcapabilities:style-legendurls

Test purpose

Verify that the metadata for each LegendURL resource in each Style element is
correct.

Test method

Pass if all the submodules and subtests (1.5.5.17.1.2 - 1.5.5.17.1.3) pass.

Reference

[WMS 1.3.0 section 7.2.4.6.5](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getcapabilities.response.layer_properties.style)

Test type

Capability

1.5.5.17.2 Test case getcapabilities:resource-format

Test case ID

getcapabilities:resource-format

Test purpose

Verify that the MIME-type returned for the LegendURL resource is the
advertised format.

Test method

Pass if the MIME-type returned for the LegendURL resource is the advertised
format.

Reference

Test type

Capability

1.5.5.17.3 Test case getcapabilities:resource-size

Test case ID

getcapabilities:resource-size

Test purpose

Verify that the size of the LegendURL resource is the advertised widthxthe
advertised height.

Test method

Pass if the size of the LegendURL resource is the advertised widthxthe
advertised height.

Reference

Test type

Capability

### 1.5.5.18 Test module getcapabilities:style-stylesheeturls

1.5.5.18.1 Test case getcapabilities:style-stylesheeturls

Test case ID

getcapabilities:style-stylesheeturls

Test purpose

Verify that the metadata for the StyleSheetURL resource in each Style element
is correct.

Test method

Pass if all the submodules and subtests (1.5.5.18.1.2) pass.

Reference

[WMS 1.3.0 section 7.2.4.6.5](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getcapabilities.response.layer_properties.style)

Test type

Capability

1.5.5.18.2 Test case getcapabilities:resource-format

Test case ID

getcapabilities:resource-format

Test purpose

Verify that the MIME-type returned for the StyleSheetURL resource is the
advertised format.

Test method

Pass if the MIME-type returned for the StyleSheetURL resource is the
advertised format.

Reference

Test type

Capability

### 1.5.5.19 Test module getcapabilities:style-styleurls

1.5.5.19.1 Test case getcapabilities:style-styleurls

Test case ID

getcapabilities:style-styleurls

Test purpose

Verify that the metadata for the StyleURL resource in each Style element is
correct.

Test method

Pass if all the submodules and subtests (1.5.5.19.1.2) pass.

Reference

[WMS 1.3.0 section 7.2.4.6.5](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getcapabilities.response.layer_properties.style)

Test type

Capability

1.5.5.19.2 Test case getcapabilities:resource-format

Test case ID

getcapabilities:resource-format

Test purpose

Verify that the MIME-type returned for the StyleURL resource is the advertised
format.

Test method

Pass if the MIME-type returned for the StyleURL resource is the advertised
format.

Reference

Test type

Capability

### 1.5.6 Test module getcapabilities:dimensions

1.5.6.1 Test case getcapabilities:dimensions

Test case ID

getcapabilities:dimensions

Test purpose

Verify that dimensions are declared properly.

Test method

Pass if all the submodules and subtests (1.5.6.1.2 - 1.5.6.1.4) pass.

Reference

Test type

Capability

1.5.6.2 Test case getcapabilities:dims-time

Test case ID

getcapabilities:dims-time

Test purpose

Verify that all declarations for the time dimension use 'ISO8601' for units.

Test method

Pass if all declarations for the time dimension use 'ISO8601' for units.

Reference

[WMS 1.3.0, Annex C, Section C.2](http://cite.opengeospatial.org/OGCTestData/w
ms/1.3.0/spec/wms1_3.html#dims.declaring)

Test type

Capability

1.5.6.3 Test case getcapabilities:dims-elevation-crs88

Test case ID

getcapabilities:dims-elevation-crs88

Test purpose

Verify that no declarations for the elevation dimension using the vertical
datum CRS:88 use a unitSymbol other than 'm'.

Test method

Pass if no declarations for the elevation dimension using the vertical datum
CRS:88 use a unitSymbol other than 'm'.

Reference

[WMS 1.3.0, Annex C, Section C.2](http://cite.opengeospatial.org/OGCTestData/w
ms/1.3.0/spec/wms1_3.html#dims.declaring)

Test type

Capability

1.5.6.4 Test case getcapabilities:dims-no-redeclarations

Test case ID

getcapabilities:dims-no-redeclarations

Test purpose

Verify that there are no Dimension elements in the capabilities document that
are redeclared using conflicting unit or unitSymbol attributes.

Test method

Pass if there are no Dimension elements in the capabilities document that are
redeclared using conflicting unit or unitSymbol attributes.

Reference

[WMS 1.3.0, Annex C, Section C.2](http://cite.opengeospatial.org/OGCTestData/w
ms/1.3.0/spec/wms1_3.html#dims.declaring)

Test type

Capability

### 1.6 Test module getmap:main

1.6.1 Test case getmap:main

Test case ID

getmap:main

Test purpose

Verify that the GetMap request behaves properly.

Test method

Pass if all the submodules and subtests (1.6.1.2 - 1.6.1.10) pass.

Reference

Test type

Capability

### 1.6.2 Test module getmap:bbox

1.6.2.1 Test case getmap:bbox

Test case ID

getmap:bbox

Test purpose

Verify that the BBOX parameter behaves properly.

Test method

Pass if all the submodules and subtests (1.6.2.1.2 - 1.6.2.1.13) pass.

Reference

Test type

Capability

1.6.2.2 Test case getmap:bbox-direct

Test case ID

getmap:bbox-direct

Test purpose

Verify that when a GetMap request contains a layer whose BoundingBox is
contained directly in the layer, then the response is valid.

Test method

Pass if when a GetMap request contains a layer whose BoundingBox is contained
directly in the layer, then the response is valid.

Reference

[WMS 1.3.0 section 7.3.3.6](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.bbox)

Test type

Capability

1.6.2.3 Test case getmap:bbox-inherited

Test case ID

getmap:bbox-inherited

Test purpose

Verify that when a GetMap request contains a layer whose BoundingBox is
inherited from a parent layer, then the response is valid.

Test method

Pass if when a GetMap request contains a layer whose BoundingBox is inherited
from a parent layer, then the response is valid.

Reference

[WMS 1.3.0 section 7.3.3.6](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.bbox)

Test type

Capability

1.6.2.4 Test case getmap:bbox-below-scale

Test case ID

getmap:bbox-below-scale

Test purpose

Verify that when a map is requested where the scale is below the appropriate
range as indicated by the MinScaleDenominator element, then the response is
not an exception.

Test method

Pass if when a map is requested where the scale is below the appropriate range
as indicated by the MinScaleDenominator element, then the response is not an
exception.

Reference

[WMS 1.3.0 section 7.3.3.6](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.bbox); [WMS 1.3.0 section 7.2.4.6.9](
http://cite.opengeospatial.org/OGCTestData/wms/1.3.0/spec/wms1_3.html#wmsops.g
etcapabilities.response.layer_properties.scale_denominators)

Test type

Capability

1.6.2.5 Test case getmap:bbox-above-scale

Test case ID

getmap:bbox-above-scale

Test purpose

Verify that when a map is requested where the scale is above the appropriate
range as indicated by the MaxScaleDenominator element, then the response is
not an exception.

Test method

Pass if when a map is requested where the scale is above the appropriate range
as indicated by the MaxScaleDenominator element, then the response is not an
exception.

Reference

[WMS 1.3.0 section 7.3.3.6](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.bbox); [WMS 1.3.0 section 7.2.4.6.9](
http://cite.opengeospatial.org/OGCTestData/wms/1.3.0/spec/wms1_3.html#wmsops.g
etcapabilities.response.layer_properties.scale_denominators)

Test type

Capability

1.6.2.6 Test case getmap:bbox-exponential

Test case ID

getmap:bbox-exponential

Test purpose

Verify that when a GetMap request uses exponential notation values for the
BBOX parameter, then the response is valid.

Test method

Pass if when a GetMap request uses exponential notation values for the BBOX
parameter, then the response is valid.

Reference

[WMS 1.3.0 section 7.3.3.6](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.bbox); [WMS 1.3.0 section 6.5](http:/
/cite.opengeospatial.org/OGCTestData/wms/1.3.0/spec/wms1_3.html#basic_elements
.numeric_and_boolean)

Test type

Capability

1.6.2.7 Test case getmap:bbox-pixel-interpretation

Test case ID

getmap:bbox-pixel-interpretation

Test purpose

Verify that the server interprets the bounding box as going around the
"outside" of the pixels of the image rather than through the centers of the
border pixels.

Test method

Pass if the server interprets the bounding box as going around the "outside"
of the pixels of the image rather than through the centers of the border
pixels.

Reference

[WMS 1.3.0 section 7.3.3.6](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.bbox)

Test type

Capability

1.6.2.8 Test case getmap:bbox-minx-gt-maxx

Test case ID

getmap:bbox-minx-gt-maxx

Test purpose

Verify that when the BBOX parameter's minimum X is greater than the maximum X,
then the server throws an exception.

Test method

Pass if when the BBOX parameter's minimum X is greater than the maximum X,
then the server throws an exception.

Reference

[WMS 1.3.0 section 7.3.3.6](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.bbox)

Test type

Capability

1.6.2.9 Test case getmap:bbox-minx-eq-maxx

Test case ID

getmap:bbox-minx-eq-maxx

Test purpose

Verify that when the BBOX parameter's minimum X is equal to the maximum X,
then the server throws an exception.

Test method

Pass if when the BBOX parameter's minimum X is equal to the maximum X, then
the server throws an exception.

Reference

[WMS 1.3.0 section 7.3.3.6](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.bbox)

Test type

Capability

1.6.2.10 Test case getmap:bbox-miny-gt-maxy

Test case ID

getmap:bbox-miny-gt-maxy

Test purpose

Verify that when the BBOX parameter's minimum Y is greater than the maximum Y,
then the server throws an exception.

Test method

Pass if when the BBOX parameter's minimum Y is greater than the maximum Y,
then the server throws an exception.

Reference

[WMS 1.3.0 section 7.3.3.6](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.bbox)

Test type

Capability

1.6.2.11 Test case getmap:bbox-miny-eq-maxy

Test case ID

getmap:bbox-miny-eq-maxy

Test purpose

Verify that when the BBOX parameter's minimum Y is equal to the maximum Y,
then the server throws an exception.

Test method

Pass if when the BBOX parameter's minimum Y is equal to the maximum Y, then
the server throws an exception.

Reference

[WMS 1.3.0 section 7.3.3.6](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.bbox)

Test type

Capability

1.6.2.12 Test case getmap:bbox-no-overlap

Test case ID

getmap:bbox-no-overlap

Test purpose

Verify that when a request contains a Bounding Box whose area does not overlap
at all with the BoundingBox advertised, then the server returns empty content.

Test method

Pass if when a request contains a Bounding Box whose area does not overlap at
all with the BoundingBox advertised, then the server returns empty content.

Reference

[WMS 1.3.0 section 7.3.3.6](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.bbox)

Test type

Capability

1.6.2.13 Test case getmap:bbox-outside-crs

Test case ID

getmap:bbox-outside-crs

Test purpose

Verify that when a request contains a Bounding Box that falls outside of the
defined range of the CRS, then the server returns empty content for the area.

Test method

Pass if when a request contains a Bounding Box that falls outside of the
defined range of the CRS, then the server returns empty content for the area.

Reference

[WMS 1.3.0 section 7.3.3.6](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.bbox)

Test type

Capability

### 1.6.3 Test module getmap:bgcolor

1.6.3.1 Test case getmap:bgcolor

Test case ID

getmap:bgcolor

Test purpose

Verify that the BGCOLOR parameter behaves properly.

Test method

Pass if all the submodules and subtests (1.6.3.1.2 - 1.6.3.1.3) pass.

Reference

Test type

Capability

1.6.3.2 Test case getmap:no-bgcolor

Test case ID

getmap:no-bgcolor

Test purpose

Verify that when a GetMap request is made with no BGCOLOR parameter, then
areas which are not covered contain white (0xFFFFFF) pixels.

Test method

Pass if when a GetMap request is made with no BGCOLOR parameter, then areas
which are not covered contain white (0xFFFFFF) pixels.

Reference

[WMS 1.3.0 section 7.3.3.10](http://cite.opengeospatial.org/OGCTestData/wms/1.
3.0/spec/wms1_3.html#wmsops.getmap.params.bgcolor)

Test type

Capability

1.6.3.3 Test case getmap:blue-bgcolor

Test case ID

getmap:blue-bgcolor

Test purpose

Verify that when a GetMap request is made with a BGCOLOR parameter, then areas
which are not covered are set to the value of BGCOLOR.

Test method

Pass if when a GetMap request is made with a BGCOLOR parameter, then areas
which are not covered are set to the value of BGCOLOR.

Reference

[WMS 1.3.0 section 7.3.3.10](http://cite.opengeospatial.org/OGCTestData/wms/1.
3.0/spec/wms1_3.html#wmsops.getmap.params.bgcolor)

Test type

Capability

### 1.6.4 Test module getmap:crs

1.6.4.1 Test case getmap:crs

Test case ID

getmap:crs

Test purpose

Verify that the CRS parameter behaves properly.

Test method

Pass if all the submodules and subtests (1.6.4.1.2 - 1.6.4.1.5) pass.

Reference

Test type

Capability

1.6.4.2 Test case getmap:crs-direct

Test case ID

getmap:crs-direct

Test purpose

Verify that when a GetMap request contains a single layer and a CRS where the
CRS is contained directly in the layer in the capabilities document, then the
response is valid.

Test method

Pass if when a GetMap request contains a single layer and a CRS where the CRS
is contained directly in the layer in the capabilities document, then the
response is valid.

Reference

[WMS 1.3.0 section 7.3.3.5](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.crs)

Test type

Capability

1.6.4.3 Test case getmap:crs-inherited

Test case ID

getmap:crs-inherited

Test purpose

Verify that when a GetMap request contains a single layer and a CRS where the
CRS is inherited from a parent layer in the capabilities document, then the
response is valid.

Test method

Pass if when a GetMap request contains a single layer and a CRS where the CRS
is inherited from a parent layer in the capabilities document, then the
response is valid.

Reference

[WMS 1.3.0 section 7.3.3.5](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.crs)

Test type

Capability

1.6.4.4 Test case getmap:invalid-crs

Test case ID

getmap:invalid-crs

Test purpose

Verify that when the CRS parameter in a GetMap request contains a CRS that is
not valid for any of the layers being requested, then the server shall throw a
Service Exception (code=InvalidCRS).

Test method

Pass if when the CRS parameter in a GetMap request contains a CRS that is not
valid for any of the layers being requested, then the server shall throw a
Service Exception (code=InvalidCRS).

Reference

[WMS 1.3.0 section 7.3.3.5](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.crs)

Test type

Capability

1.6.4.5 Test case getmap:each-crs

Test case ID

getmap:each-crs

Test purpose

Verify that for each CRS, when the CRS parameter is set to that CRS, then the
response is valid.

Test method

Pass if for each CRS, when the CRS parameter is set to that CRS, then the
response is valid.

Reference

[WMS 1.3.0 section 7.3.3.5](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.crs)

Test type

Capability

### 1.6.5 Test module getmap:exceptions

1.6.5.1 Test case getmap:exceptions

Test case ID

getmap:exceptions

Test purpose

Verify that the EXCEPTIONS parameter behaves properly.

Test method

Pass if all the submodules and subtests (1.6.5.1.2 - 1.6.5.1.7) pass.

Reference

Test type

Capability

1.6.5.2 Test case getmap:exceptions-default

Test case ID

getmap:exceptions-default

Test purpose

Verify that when an exception is raised without specifying the EXCEPTIONS
parameter, then the response is a valid exception with a Content-type header
of text/xml.

Test method

Pass if when an exception is raised without specifying the EXCEPTIONS
parameter, then the response is a valid exception with a Content-type header
of text/xml.

Reference

[WMS 1.3.0 section 7.3.3.11](http://cite.opengeospatial.org/OGCTestData/wms/1.
3.0/spec/wms1_3.html#wmsops.getmap.params.exceptions); [WMS 1.3.0 Annex E
section E.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0/spec/wms1_3.
html#schemas.service_exception)

Test type

Capability

1.6.5.3 Test case getmap:exceptions-xml

Test case ID

getmap:exceptions-xml

Test purpose

Verify that when an exception is raised and EXCEPTIONS=XML, then the response
is a valid exception with a Content-type header of text/xml.

Test method

Pass if when an exception is raised and EXCEPTIONS=XML, then the response is a
valid exception with a Content-type header of text/xml.

Reference

[WMS 1.3.0 section 7.3.3.11](http://cite.opengeospatial.org/OGCTestData/wms/1.
3.0/spec/wms1_3.html#wmsops.getmap.params.exceptions); [WMS 1.3.0 Annex E
section E.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0/spec/wms1_3.
html#schemas.service_exception)

Test type

Capability

1.6.5.4 Test case getmap:exceptions-inimage-mime

Test case ID

getmap:exceptions-inimage-mime

Test purpose

Verify that when an exception is raised and EXCEPTIONS=INIMAGE, then the
Content-type of the return header is the same as the FORMAT requested.

Test method

Pass if when an exception is raised and EXCEPTIONS=INIMAGE, then the Content-
type of the return header is the same as the FORMAT requested.

Reference

[WMS 1.3.0 section 7.3.3.11](http://cite.opengeospatial.org/OGCTestData/wms/1.
3.0/spec/wms1_3.html#wmsops.getmap.params.exceptions)

Test type

Capability

1.6.5.5 Test case getmap:exceptions-blank-red

Test case ID

getmap:exceptions-blank-red

Test purpose

Verify that when an exception is raised and EXCEPTIONS=BLANK,
TRANSPRENT=FALSE, and BGCOLOR=0xFF0000, then the image returned contains only
red pixels.

Test method

Pass if when an exception is raised and EXCEPTIONS=BLANK, TRANSPRENT=FALSE,
and BGCOLOR=0xFF0000, then the image returned contains only red pixels.

Reference

[WMS 1.3.0 section 7.3.3.11](http://cite.opengeospatial.org/OGCTestData/wms/1.
3.0/spec/wms1_3.html#wmsops.getmap.params.exceptions)

Test type

Capability

1.6.5.6 Test case getmap:exceptions-blank-transparent

Test case ID

getmap:exceptions-blank-transparent

Test purpose

Verify that when an exception is raised and EXCEPTIONS=BLANK and
TRANSPRENT=TRUE, then the image returned contains only transparent pixels.

Test method

Pass if when an exception is raised and EXCEPTIONS=BLANK and TRANSPRENT=TRUE,
then the image returned contains only transparent pixels.

Reference

[WMS 1.3.0 section 7.3.3.11](http://cite.opengeospatial.org/OGCTestData/wms/1.
3.0/spec/wms1_3.html#wmsops.getmap.params.exceptions)

Test type

Capability

1.6.5.7 Test case getmap:exceptions-blank-mime

Test case ID

getmap:exceptions-blank-mime

Test purpose

Verify that when an exception is raised and EXCEPTIONS=BLANK, then the
Content-type of the return header is the same as the FORMAT requested.

Test method

Pass if when an exception is raised and EXCEPTIONS=BLANK, then the Content-
type of the return header is the same as the FORMAT requested.

Reference

[WMS 1.3.0 section 7.3.3.11](http://cite.opengeospatial.org/OGCTestData/wms/1.
3.0/spec/wms1_3.html#wmsops.getmap.params.exceptions)

Test type

Capability

### 1.6.6 Test module getmap:format

1.6.6.1 Test case getmap:format

Test case ID

getmap:format

Test purpose

Verify that the FORMAT parameter behaves properly.

Test method

Pass if all the submodules and subtests (1.6.6.1.2 - 1.6.6.1.3) pass.

Reference

Test type

Capability

1.6.6.2 Test case getmap:invalid-format

Test case ID

getmap:invalid-format

Test purpose

Verify that when a GetMap request contains a Format that is not advertised,
then the server throws a Service Exception (code=InvalidFormat).

Test method

Pass if when a GetMap request contains a Format that is not advertised, then
the server throws a Service Exception (code=InvalidFormat).

Reference

[WMS 1.3.0 section 7.3.3.7](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.format)

Test type

Capability

1.6.6.3 Test case getmap:each-format

Test case ID

getmap:each-format

Test purpose

Verify that for each GetMap format, when the FORMAT parameter is set to that
format, the MIME type of the response matches that format.

Test method

Pass if for each GetMap format, when the FORMAT parameter is set to that
format, the MIME type of the response matches that format.

Reference

[WMS 1.3.0 section 7.3.3.7](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.format)

Test type

Capability

### 1.6.7 Test module getmap:layers

1.6.7.1 Test case getmap:layers

Test case ID

getmap:layers

Test purpose

Verify that the LAYERS parameter behaves properly.

Test method

Pass if all the submodules and subtests (1.6.7.1.2 - 1.6.7.1.9) pass.

Reference

Test type

Capability

1.6.7.2 Test case getmap:two-layers

Test case ID

getmap:two-layers

Test purpose

Verify that when a GetMap request contains two valid layer names (separated by
a comma), then the response is valid.

Test method

Pass if when a GetMap request contains two valid layer names (separated by a
comma), then the response is valid.

Reference

[WMS 1.3.0 section 7.3.3.3](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.layers)

Test type

Capability

1.6.7.3 Test case getmap:three-layers

Test case ID

getmap:three-layers

Test purpose

Verify that when a GetMap request contains three valid layer names (separated
by commas), then the response is valid.

Test method

Pass if when a GetMap request contains three valid layer names (separated by
commas), then the response is valid.

Reference

[WMS 1.3.0 section 7.3.3.3](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.layers)

Test type

Capability

1.6.7.4 Test case getmap:invalid-layer

Test case ID

getmap:invalid-layer

Test purpose

Verify that when the layer in a GetMap request is invalid, then the response
is an exception (code=LayerNotDefined).

Test method

Pass if when the layer in a GetMap request is invalid, then the response is an
exception (code=LayerNotDefined).

Reference

[WMS 1.3.0 section 7.3.3.3](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.layers); [WMS 1.3.0 section 7.2.4.6.3
](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0/spec/wms1_3.html#wmsops
.getcapabilities.response.layer_properties.name)

Test type

Capability

1.6.7.5 Test case getmap:first-layer-invalid

Test case ID

getmap:first-layer-invalid

Test purpose

Verify that when a GetMap request contains two layers where the first is
invalid and the second is valid, then the response is an exception
(code=LayerNotDefined).

Test method

Pass if when a GetMap request contains two layers where the first is invalid
and the second is valid, then the response is an exception
(code=LayerNotDefined).

Reference

[WMS 1.3.0 section 7.3.3.3](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.layers); [WMS 1.3.0 section 7.2.4.6.3
](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0/spec/wms1_3.html#wmsops
.getcapabilities.response.layer_properties.name)

Test type

Capability

1.6.7.6 Test case getmap:second-layer-invalid

Test case ID

getmap:second-layer-invalid

Test purpose

Verify that when a GetMap request contains two layers where the first is valid
and the second is invalid, then the response is an exception
(code=LayerNotDefined).

Test method

Pass if when a GetMap request contains two layers where the first is valid and
the second is invalid, then the response is an exception
(code=LayerNotDefined).

Reference

[WMS 1.3.0 section 7.3.3.3](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.layers); [WMS 1.3.0 section 7.2.4.6.3
](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0/spec/wms1_3.html#wmsops
.getcapabilities.response.layer_properties.name)

Test type

Capability

1.6.7.7 Test case getmap:layerlimit

Test case ID

getmap:layerlimit

Test purpose

Verify that if the service advertises a LayerLimit, it can handle a GetMap
request that includes that many layers.

Test method

Pass if if the service advertises a LayerLimit, it can handle a GetMap request
that includes that many layers.

Reference

[WMS 1.3.0 section 7.3.3.3](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.layers)

Test type

Capability

### 1.6.7.8 Test module getmap:each-layer-crs-combination

1.6.7.8.1 Test case getmap:each-layer-crs-combination

Test case ID

getmap:each-layer-crs-combination

Test purpose

Verify that for each named layer, each of its CRSs is valid.

Test method

Pass if all the submodules and subtests (1.6.7.8.1.2) pass.

Reference

[WMS 1.3.0 section 7.3.3.3](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.layers)

Test type

Capability

1.6.7.8.2 Test case getmap:each-crs

Test case ID

getmap:each-crs

Test purpose

Verify that for each CRS, when the CRS parameter is set to that CRS, then the
response is valid.

Test method

Pass if for each CRS, when the CRS parameter is set to that CRS, then the
response is valid.

Reference

[WMS 1.3.0 section 7.3.3.5](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.crs)

Test type

Capability

1.6.7.9 Test case getmap:each-layer

Test case ID

getmap:each-layer

Test purpose

Verify that for each named layer, when the LAYERS parameter is set to that
layer name, the MIME type of the response is valid.

Test method

Pass if for each named layer, when the LAYERS parameter is set to that layer
name, the MIME type of the response is valid.

Reference

[WMS 1.3.0 section 7.3.3.3](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.layers)

Test type

Capability

### 1.6.8 Test module getmap:styles

1.6.8.1 Test case getmap:styles

Test case ID

getmap:styles

Test purpose

Verify that the STYLES parameter behaves properly.

Test method

Pass if all the submodules and subtests (1.6.8.1.2 - 1.6.8.1.13) pass.

Reference

Test type

Capability

1.6.8.2 Test case getmap:styles-direct

Test case ID

getmap:styles-direct

Test purpose

Verify that when a GetMap request contains a single layer and a single style
where the style is contained directly in the layer in the capabilities
document, then the response is valid.

Test method

Pass if when a GetMap request contains a single layer and a single style where
the style is contained directly in the layer in the capabilities document,
then the response is valid.

Reference

[WMS 1.3.0 section 7.2.4.6.5](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getmap.params.styles)

Test type

Capability

1.6.8.3 Test case getmap:styles-inherited

Test case ID

getmap:styles-inherited

Test purpose

Verify that when a GetMap request contains a single layer and a single style
where the style is inherited by the layer in the capabilities document, then
the response is valid.

Test method

Pass if when a GetMap request contains a single layer and a single style where
the style is inherited by the layer in the capabilities document, then the
response is valid.

Reference

[WMS 1.3.0 section 7.2.4.6.5](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getmap.params.styles)

Test type

Capability

1.6.8.4 Test case getmap:two-styles

Test case ID

getmap:two-styles

Test purpose

Verify that when a GetMap request contains two valid layers and two valid
styles (separated by a comma), then the response is valid.

Test method

Pass if when a GetMap request contains two valid layers and two valid styles
(separated by a comma), then the response is valid.

Reference

[WMS 1.3.0 section 7.2.4.6.5](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getmap.params.styles)

Test type

Capability

1.6.8.5 Test case getmap:three-styles

Test case ID

getmap:three-styles

Test purpose

Verify that when a GetMap request contains three valid layers and three valid
styles (separated by commas), then the response is valid.

Test method

Pass if when a GetMap request contains three valid layers and three valid
styles (separated by commas), then the response is valid.

Reference

[WMS 1.3.0 section 7.2.4.6.5](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getmap.params.styles)

Test type

Capability

1.6.8.6 Test case getmap:invalid-style

Test case ID

getmap:invalid-style

Test purpose

Verify that when a GetMap request contains an unadvertised Style, then the
response is an exception (code=StyleNotDefined).

Test method

Pass if when a GetMap request contains an unadvertised Style, then the
response is an exception (code=StyleNotDefined).

Reference

[WMS 1.3.0 section 7.2.4.6.5](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getmap.params.styles)

Test type

Capability

1.6.8.7 Test case getmap:styles-default-single-layer

Test case ID

getmap:styles-default-single-layer

Test purpose

Verify that when a GetMap request contains a single layer and a null style
value (as in "STYLES="), then the response is valid.

Test method

Pass if when a GetMap request contains a single layer and a null style value
(as in "STYLES="), then the response is valid.

Reference

[WMS 1.3.0 section 7.2.4.6.5](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getmap.params.styles)

Test type

Capability

1.6.8.8 Test case getmap:styles-default-multiple-layers

Test case ID

getmap:styles-default-multiple-layers

Test purpose

Verify that when a GetMap request contains multiple layers and requests all
layers to be shown in the default style by using a single null value (as in
"STYLES="), then the response is valid.

Test method

Pass if when a GetMap request contains multiple layers and requests all layers
to be shown in the default style by using a single null value (as in
"STYLES="), then the response is valid.

Reference

[WMS 1.3.0 section 7.2.4.6.5](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getmap.params.styles)

Test type

Capability

1.6.8.9 Test case getmap:styles-default-commas

Test case ID

getmap:styles-default-commas

Test purpose

Verify that when a GetMap request contains multiple layers and requests all
layers to be shown in the default style by using null values between commas
(as in "STYLES=,,,"), then the response is valid.

Test method

Pass if when a GetMap request contains multiple layers and requests all layers
to be shown in the default style by using null values between commas (as in
"STYLES=,,,"), then the response is valid.

Reference

[WMS 1.3.0 section 7.2.4.6.5](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getmap.params.styles)

Test type

Capability

1.6.8.10 Test case getmap:styles-some-default

Test case ID

getmap:styles-some-default

Test purpose

Verify that when a GetMap request contains multiple layers and a mixture of
named and default styles (as in "STYLES=style1,,style2,,"), then the response
is valid.

Test method

Pass if when a GetMap request contains multiple layers and a mixture of named
and default styles (as in "STYLES=style1,,style2,,"), then the response is
valid.

Reference

[WMS 1.3.0 section 7.2.4.6.5](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getmap.params.styles)

Test type

Capability

1.6.8.11 Test case getmap:first-style-invalid

Test case ID

getmap:first-style-invalid

Test purpose

Verify that when a GetMap request contains two layers, where the first style
is not valid and the second style is, then the response is an exception
(code=StyleNotDefined).

Test method

Pass if when a GetMap request contains two layers, where the first style is
not valid and the second style is, then the response is an exception
(code=StyleNotDefined).

Reference

[WMS 1.3.0 section 7.2.4.6.5](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getmap.params.styles)

Test type

Capability

1.6.8.12 Test case getmap:second-style-invalid

Test case ID

getmap:second-style-invalid

Test purpose

Verify that when a GetMap request contains two layers, where the first style
is valid and the second style is not, then the response is an exception
(code=StyleNotDefined).

Test method

Pass if when a GetMap request contains two layers, where the first style is
valid and the second style is not, then the response is an exception
(code=StyleNotDefined).

Reference

[WMS 1.3.0 section 7.2.4.6.5](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getmap.params.styles)

Test type

Capability

1.6.8.13 Test case getmap:each-style

Test case ID

getmap:each-style

Test purpose

Verify that for each style, when the STYLES parameter is set to that style
name, the MIME type of the response is valid.

Test method

Pass if for each style, when the STYLES parameter is set to that style name,
the MIME type of the response is valid.

Reference

[WMS 1.3.0 section 7.2.4.6.5](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getmap.params.styles)

Test type

Capability

### 1.6.9 Test module getmap:transparent

1.6.9.1 Test case getmap:transparent

Test case ID

getmap:transparent

Test purpose

Verify that the TRANSPARENT parameter behaves properly.

Test method

Pass if all the submodules and subtests (1.6.9.1.2 - 1.6.9.1.5) pass.

Reference

Test type

Capability

1.6.9.2 Test case getmap:transparent-default

Test case ID

getmap:transparent-default

Test purpose

Verify that when a GetMap request is made with no TRANSPARENT parameter and a
FORMAT that supports transparency over a layer that is not opaque, then the
response contains no transparent pixels.

Test method

Pass if when a GetMap request is made with no TRANSPARENT parameter and a
FORMAT that supports transparency over a layer that is not opaque, then the
response contains no transparent pixels.

Reference

[WMS 1.3.0 section 7.3.3.9](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.transparent)

Test type

Capability

1.6.9.3 Test case getmap:transparent-false

Test case ID

getmap:transparent-false

Test purpose

Verify that when a GetMap request is made with TRANSPARENT=FALSE and a FORMAT
that supports transparency over a layer that is not opaque, then the response
contains no transparent pixels.

Test method

Pass if when a GetMap request is made with TRANSPARENT=FALSE and a FORMAT that
supports transparency over a layer that is not opaque, then the response
contains no transparent pixels.

Reference

[WMS 1.3.0 section 7.3.3.9](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.transparent)

Test type

Capability

1.6.9.4 Test case getmap:transparent-true

Test case ID

getmap:transparent-true

Test purpose

Verify that when a GetMap request is made with TRANSPARENT=TRUE and a FORMAT
that supports transparency over a BBOX that is not completely covered, then
the response contains transparent pixels.

Test method

Pass if when a GetMap request is made with TRANSPARENT=TRUE and a FORMAT that
supports transparency over a BBOX that is not completely covered, then the
response contains transparent pixels.

Reference

[WMS 1.3.0 section 7.3.3.9](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.transparent)

Test type

Capability

1.6.9.5 Test case getmap:transparent-opaque-layer

Test case ID

getmap:transparent-opaque-layer

Test purpose

Verify that clients may request TRANSPARENT=TRUE on a layer that is opaque.

Test method

Pass if clients may request TRANSPARENT=TRUE on a layer that is opaque.

Reference

[WMS 1.3.0 section 7.3.3.9](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.transparent)

Test type

Capability

### 1.6.10 Test module getmap:width-and-height

1.6.10.1 Test case getmap:width-and-height

Test case ID

getmap:width-and-height

Test purpose

Verify that the WIDTH and HEIGHT parameters behaves properly.

Test method

Pass if all the submodules and subtests (1.6.10.1.2 - 1.6.10.1.3) pass.

Reference

Test type

Capability

1.6.10.2 Test case getmap:large-size

Test case ID

getmap:large-size

Test purpose

Verify that when a request is made for a large map (1024x768 or largest map
supported), the image returned is exactly the size requested.

Test method

Pass if when a request is made for a large map (1024x768 or largest map
supported), the image returned is exactly the size requested.

Reference

[WMS 1.3.0 section 7.3.3.8](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.width_height)

Test type

Capability

1.6.10.3 Test case getmap:small-size

Test case ID

getmap:small-size

Test purpose

Verify that when a request is made with WIDTH=8 and HEIGHT=5, the image
returned is exactly the size requested.

Test method

Pass if when a request is made with WIDTH=8 and HEIGHT=5, the image returned
is exactly the size requested.

Reference

[WMS 1.3.0 section 7.3.3.8](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getmap.params.width_height)

Test type

Capability

### 1.7 Test module getfeatureinfo:main

1.7.1 Test case getfeatureinfo:main

Test case ID

getfeatureinfo:main

Test purpose

Verify that the GetFeatureInfo request behaves properly.

Test method

Pass if all the submodules and subtests (1.7.1.2 - 1.7.1.6) pass.

Reference

Test type

Capability

### 1.7.2 Test module getfeatureinfo:exceptions

1.7.2.1 Test case getfeatureinfo:exceptions

Test case ID

getfeatureinfo:exceptions

Test purpose

Verify that the EXCEPTIONS parameter behaves properly.

Test method

Pass if all the submodules and subtests (1.7.2.1.2 - 1.7.2.1.3) pass.

Reference

Test type

Capability

1.7.2.2 Test case getfeatureinfo:exceptions-default

Test case ID

getfeatureinfo:exceptions-default

Test purpose

Verify that when an exception is raised and the EXCEPTIONS parameter is absent
from the request, then the response is a valid exception with a Content-type
header of text/xml.

Test method

Pass if when an exception is raised and the EXCEPTIONS parameter is absent
from the request, then the response is a valid exception with a Content-type
header of text/xml.

Reference

[WMS 1.3.0 section 7.4.3.8](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getfeatureinfo.params.exceptions); [WMS 1.3.0 Annex
E section E.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0/spec/wms1_
3.html#schemas.service_exception)

Test type

Capability

1.7.2.3 Test case getfeatureinfo:exceptions-xml

Test case ID

getfeatureinfo:exceptions-xml

Test purpose

Verify that when an exception is raised and EXCEPTIONS=XML, then the response
is a valid exception with a Content-type header of text/xml.

Test method

Pass if when an exception is raised and EXCEPTIONS=XML, then the response is a
valid exception with a Content-type header of text/xml.

Reference

[WMS 1.3.0 section 7.4.3.8](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getfeatureinfo.params.exceptions); [WMS 1.3.0 Annex
E section E.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0/spec/wms1_
3.html#schemas.service_exception)

Test type

Capability

### 1.7.3 Test module getfeatureinfo:feature_count

1.7.3.1 Test case getfeatureinfo:feature_count

Test case ID

getfeatureinfo:feature_count

Test purpose

Verify that the FEATURE_COUNT parameter behaves properly.

Test method

Pass if all the submodules and subtests (1.7.3.1.2 - 1.7.3.1.3) pass.

Reference

Test type

Capability

1.7.3.2 Test case getfeatureinfo:feature_count-default

Test case ID

getfeatureinfo:feature_count-default

Test purpose

Verify that when the FEATURE_COUNT parameter is not specified, then less data
is returned than when FEATURE_COUNT is 2.

Test method

Pass if when the FEATURE_COUNT parameter is not specified, then less data is
returned than when FEATURE_COUNT is 2.

Reference

[WMS 1.3.0 section 7.4.3.6](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getfeatureinfo.params.feature_count)

Test type

Capability

1.7.3.3 Test case getfeatureinfo:feature_count-1

Test case ID

getfeatureinfo:feature_count-1

Test purpose

Verify that when the FEATURE_COUNT parameter is 1, then less data is returned
than when FEATURE_COUNT is 2.

Test method

Pass if when the FEATURE_COUNT parameter is 1, then less data is returned than
when FEATURE_COUNT is 2.

Reference

[WMS 1.3.0 section 7.4.3.6](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getfeatureinfo.params.feature_count)

Test type

Capability

### 1.7.4 Test module getfeatureinfo:info_format

1.7.4.1 Test case getfeatureinfo:info_format

Test case ID

getfeatureinfo:info_format

Test purpose

Verify that the FORMAT parameter behaves properly.

Test method

Pass if all the submodules and subtests (1.7.4.1.2 - 1.7.4.1.3) pass.

Reference

Test type

Capability

1.7.4.2 Test case getfeatureinfo:invalid-info_format

Test case ID

getfeatureinfo:invalid-info_format

Test purpose

Verify that when a GetFeatureInfo request is made with an invalid INFO_FORMAT
parameter, then the server returns an exception (code=InvalidFormat).

Test method

Pass if when a GetFeatureInfo request is made with an invalid INFO_FORMAT
parameter, then the server returns an exception (code=InvalidFormat).

Reference

[WMS 1.3.0 section 7.4.3.5](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getfeatureinfo.params.info_format)

Test type

Capability

1.7.4.3 Test case getfeatureinfo:each-info_format

Test case ID

getfeatureinfo:each-info_format

Test purpose

Verify that for each GetFeatureInfo format, when the INFO_FORMAT parameter is
set to that format, the MIME type of the response matches that format.

Test method

Pass if for each GetFeatureInfo format, when the INFO_FORMAT parameter is set
to that format, the MIME type of the response matches that format.

Reference

[WMS 1.3.0 section 7.4.3.5](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getfeatureinfo.params.info_format)

Test type

Capability

### 1.7.5 Test module getfeatureinfo:i-and-j

1.7.5.1 Test case getfeatureinfo:i-and-j

Test case ID

getfeatureinfo:i-and-j

Test purpose

Verify that the I and J parameters behaves properly.

Test method

Pass if all the submodules and subtests (1.7.5.1.2 - 1.7.5.1.3) pass.

Reference

Test type

Capability

1.7.5.2 Test case getfeatureinfo:invalid-i

Test case ID

getfeatureinfo:invalid-i

Test purpose

Verify that when a GetFeatureInfo request is made with an invalid I parameter,
then the response is an exception (code=InvalidPoint).

Test method

Pass if when a GetFeatureInfo request is made with an invalid I parameter,
then the response is an exception (code=InvalidPoint).

Reference

[WMS 1.3.0 section 7.4.3.7](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getfeatureinfo.params.i_j)

Test type

Capability

1.7.5.3 Test case getfeatureinfo:invalid-j

Test case ID

getfeatureinfo:invalid-j

Test purpose

Verify that when a GetFeatureInfo request is made with an invalid J parameter,
then the response is an exception (code=InvalidPoint).

Test method

Pass if when a GetFeatureInfo request is made with an invalid J parameter,
then the response is an exception (code=InvalidPoint).

Reference

[WMS 1.3.0 section 7.4.3.7](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getfeatureinfo.params.i_j)

Test type

Capability

### 1.7.6 Test module getfeatureinfo:query-layers

1.7.6.1 Test case getfeatureinfo:query-layers

Test case ID

getfeatureinfo:query-layers

Test purpose

Verify that the QUERY_LAYERS parameter behaves properly.

Test method

Pass if all the submodules and subtests (1.7.6.1.2 - 1.7.6.1.7) pass.

Reference

Test type

Capability

1.7.6.2 Test case getfeatureinfo:two-query_layers

Test case ID

getfeatureinfo:two-query_layers

Test purpose

Verify that when a GetFeatureInfo request contains two layers, then the
response is valid.

Test method

Pass if when a GetFeatureInfo request contains two layers, then the response
is valid.

Reference

[WMS 1.3.0 section 7.4.3.4](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getfeatureinfo.params.query_layers)

Test type

Capability

1.7.6.3 Test case getfeatureinfo:three-query_layers

Test case ID

getfeatureinfo:three-query_layers

Test purpose

Verify that when a GetFeatureInfo request contains three layers, then the
response is valid.

Test method

Pass if when a GetFeatureInfo request contains three layers, then the response
is valid.

Reference

[WMS 1.3.0 section 7.4.3.4](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getfeatureinfo.params.query_layers)

Test type

Capability

1.7.6.4 Test case getfeatureinfo:less-query_layers

Test case ID

getfeatureinfo:less-query_layers

Test purpose

Verify that when a GetFeatureInfo request contains fewer layers in the
QUERY_LAYERS parameter than it does in the LAYERS parameter, then the response
is valid.

Test method

Pass if when a GetFeatureInfo request contains fewer layers in the
QUERY_LAYERS parameter than it does in the LAYERS parameter, then the response
is valid.

Reference

[WMS 1.3.0 section 7.4.3.4](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getfeatureinfo.params.query_layers)

Test type

Capability

1.7.6.5 Test case getfeatureinfo:invalid-query_layers

Test case ID

getfeatureinfo:invalid-query_layers

Test purpose

Verify that when a layer requested is not contained in the Capabilities XML of
the WMS, then the server issues a Service Exception (code=LayerNotDefined).

Test method

Pass if when a layer requested is not contained in the Capabilities XML of the
WMS, then the server issues a Service Exception (code=LayerNotDefined).

Reference

[WMS 1.3.0 section 7.4.3.4](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getfeatureinfo.params.query_layers)

Test type

Capability

1.7.6.6 Test case getfeatureinfo:query_layers-not-queryable

Test case ID

getfeatureinfo:query_layers-not-queryable

Test purpose

Verify that when GetFeatureInfo is requested on a Layer that is not queryable,
then the server issues a Service Exception (code=LayerNotQueryable).

Test method

Pass if when GetFeatureInfo is requested on a Layer that is not queryable,
then the server issues a Service Exception (code=LayerNotQueryable).

Reference

[WMS 1.3.0 section 7.4.3.4](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getfeatureinfo.params.query_layers); [WMS 1.3.0
section 7.2.4.7.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0/spec/w
ms1_3.html#wmsops.getcapabilities.response.layer_attributes.queryable)

Test type

Capability

1.7.6.7 Test case getfeatureinfo:each-queryable-layer

Test case ID

getfeatureinfo:each-queryable-layer

Test purpose

Verify that for each queryable layer, when the QUERY_LAYERS parameter is set
to that layer name, the MIME type of the response is valid.

Test method

Pass if for each queryable layer, when the QUERY_LAYERS parameter is set to
that layer name, the MIME type of the response is valid.

Reference

[WMS 1.3.0 section 7.4.3.4](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getfeatureinfo.params.query_layers)

Test type

Capability

### 1.8 Test module recomendations:main

1.8.1 Test case recomendations:main

Test case ID

recomendations:main

Test purpose

Verify that if the "Check Recommendations" option was selected, the server
supports fuctionality which is recommended in the spec, but not required.

Test method

Pass if all the submodules and subtests (1.8.1.2 - 1.8.1.10) pass.

Reference

Test type

Capability

1.8.2 Test case recomendations:service-keywords

Test case ID

recomendations:service-keywords

Test purpose

Verify that the capabilities document includes a list of keywords or keyword
phrases describing the server.

Test method

Pass if the capabilities document includes a list of keywords or keyword
phrases describing the server.

Reference

[WMS 1.3.0 section 7.2.4.3](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getcapabilities.response.general_metadata)

Test type

Capability

1.8.3 Test case recomendations:service-contact-info

Test case ID

recomendations:service-contact-info

Test purpose

Verify that the capabilities document includes contact information.

Test method

Pass if the capabilities document includes contact information.

Reference

[WMS 1.3.0 section 7.2.4.3](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getcapabilities.response.general_metadata)

Test type

Capability

1.8.4 Test case recomendations:png-getmap-format

Test case ID

recomendations:png-getmap-format

Test purpose

Verify that the server advertises the image/png format for the GetMap
operation.

Test method

Pass if the server advertises the image/png format for the GetMap operation.

Reference

[WMS 1.3.0 section 7.2.4.4](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#wmsops.getcapabilities.response.capability_metadata); [WMS
1.3.0 section 6.6](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0/spec/w
ms1_3.html#basic_elements.output_formats)

Test type

Capability

1.8.5 Test case recomendations:layer-abstracts

Test case ID

recomendations:layer-abstracts

Test purpose

Verify that each Layer in the capabilities document contains an abstract.

Test method

Pass if each Layer in the capabilities document contains an abstract.

Reference

[WMS 1.3.0 section 7.2.4.6.4](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getcapabilities.response.layer_properties.abstrac
t_and_keywordlist)

Test type

Capability

1.8.6 Test case recomendations:layer-keywordlists

Test case ID

recomendations:layer-keywordlists

Test purpose

Verify that each Layer in the capabilities document contains a keyword list.

Test method

Pass if each Layer in the capabilities document contains a keyword list.

Reference

[WMS 1.3.0 section 7.2.4.6.4](http://cite.opengeospatial.org/OGCTestData/wms/1
.3.0/spec/wms1_3.html#wmsops.getcapabilities.response.layer_properties.abstrac
t_and_keywordlist)

Test type

Capability

1.8.7 Test case recomendations:layer-crs

Test case ID

recomendations:layer-crs

Test purpose

Verify that all layers in the capabilities document are available in the
CRS:84 and/or EPSG:4326 CRS.

Test method

Pass if all layers in the capabilities document are available in the CRS:84
and/or EPSG:4326 CRS.

Reference

[WMS 1.3.0 section 6.7.3.1](http://cite.opengeospatial.org/OGCTestData/wms/1.3
.0/spec/wms1_3.html#basic_elements.cs.layer.intro)

Test type

Capability

1.8.8 Test case recomendations:metadataurls

Test case ID

recomendations:metadataurls

Test purpose

Verify that every named Layer in the capabilities document contains a
MetadataURL element.

Test method

Pass if every named Layer in the capabilities document contains a MetadataURL
element.

Reference

[WMS 1.3.0 section 7.2.4.6.11](http://cite.opengeospatial.org/OGCTestData/wms/
1.3.0/spec/wms1_3.html#wmsops.getcapabilities.response.layer_properties.metada
taurl)

Test type

Capability

1.8.9 Test case recomendations:dims-no-whitespace

Test case ID

recomendations:dims-no-whitespace

Test purpose

Verify that no dimension name values in the capabilities document contain
whitespace.

Test method

Pass if no dimension name values in the capabilities document contain
whitespace.

Reference

[WMS 1.3.0, Annex C, Section C.2](http://cite.opengeospatial.org/OGCTestData/w
ms/1.3.0/spec/wms1_3.html#dims.declaring)

Test type

Capability

1.8.10 Test case recomendations:dims-defaults

Test case ID

recomendations:dims-defaults

Test purpose

Verify that each dimension declaration in the capabilities document contains a
default value.

Test method

Pass if each dimension declaration in the capabilities document contains a
default value.

Reference

[WMS 1.3.0, Annex C, Section C.2](http://cite.opengeospatial.org/OGCTestData/w
ms/1.3.0/spec/wms1_3.html#dims.declaring)

Test type

Capability

### 1.9 Test module dims:main

1.9.1 Test case dims:main

Test case ID

dims:main

Test purpose

Verify that support for dimensional data is correct.

Test method

Pass if all the submodules and subtests (1.9.1.2 - 1.9.1.5) pass.

Reference

Test type

Capability

### 1.9.2 Test module dims:terrain

1.9.2.1 Test case dims:terrain

Test case ID

dims:terrain

Test purpose

Verify that support for a raster layer that supports the elevation dimension
is correct.

Test method

Pass if all the submodules and subtests (1.9.2.1.2 - 1.9.2.1.10) pass.

Reference

Test type

Capability

1.9.2.2 Test case dims:terrain-low-range

Test case ID

dims:terrain-low-range

Test purpose

Verify that when elevations in a low range are requested, only the matching
pixels are returned.

Test method

Request ELEVATION=0/200 and verify that the pixels in the "low spot" are solid
and all the other pixels are transparent.

Reference

[WMS 1.3.0 section C.3.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.requests.elevation_and_time)

Test type

Capability

1.9.2.3 Test case dims:terrain-mid-range

Test case ID

dims:terrain-mid-range

Test purpose

Verify that when elevations in a mid range are requested, only the matching
pixels are returned.

Test method

Request ELEVATION=200/335 and verify that the pixels in the "low spot" and the
"high spot" are transparent and all the other pixels are solid.

Reference

[WMS 1.3.0 section C.3.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.requests.elevation_and_time)

Test type

Capability

1.9.2.4 Test case dims:terrain-high-range

Test case ID

dims:terrain-high-range

Test purpose

Verify that when elevations in a high range are requested, only the matching
pixels are returned.

Test method

Request ELEVATION=335/425 and verify that the pixels in the "low spot" are
solid and all the other pixels are transparent.

Reference

[WMS 1.3.0 section C.3.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.requests.elevation_and_time)

Test type

Capability

1.9.2.5 Test case dims:terrain-low-and-high-ranges

Test case ID

dims:terrain-low-and-high-ranges

Test purpose

Verify that when elevations in a low range and a high range are requested,
only the matching pixels are returned.

Test method

Request ELEVATION=0/200,335/425 and verify that the pixels in the "low spot"
and the "high spot" are solid and all the other pixels are transparent.

Reference

[WMS 1.3.0 section C.3.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.requests.elevation_and_time)

Test type

Capability

1.9.2.6 Test case dims:terrain-range-and-value

Test case ID

dims:terrain-range-and-value

Test purpose

Verify that when elevations in an interval range and at a single value are
requested, only the matching pixels are returned.

Test method

Request ELEVATION=0/200,250 and verify that all of the pixels in the "low
spot" as well as some of the other pixels are not transparent.

Reference

[WMS 1.3.0 section C.3.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.requests.elevation_and_time)

Test type

Capability

1.9.2.7 Test case dims:terrain-value

Test case ID

dims:terrain-value

Test purpose

Verify that when elevations at a single value are requested, only the matching
pixels are returned.

Test method

Request ELEVATION=250 and verify that some pixels in the response are not
transparent.

Reference

[WMS 1.3.0 section C.3.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.requests.elevation_and_time)

Test type

Capability

1.9.2.8 Test case dims:terrain-invalid

Test case ID

dims:terrain-invalid

Test purpose

Verify that when an elevation outside of the advertised range is requested,
the response is an exception with code=InvalidDimensionValue.

Test method

Request ELEVATION=1000 and verify that the service returns an exception with
code=InvalidDimensionValue.

Reference

[WMS 1.3.0 section C.4.1](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.responses.incorrect)

Test type

Capability

1.9.2.9 Test case dims:terrain-default

Test case ID

dims:terrain-default

Test purpose

Verify that when the elevation parameter is missing but there is a default
elevation value, the default value is used and a warning header is set.

Test method

Submit a request without an ELEVATION parameter and verify that the response
is equivalent to the default value and the "default value used" warning header
is returned.

Reference

[WMS 1.3.0 section C.4.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.responses.default)

Test type

Capability

1.9.2.10 Test case dims:terrain-and-other-layer

Test case ID

dims:terrain-and-other-layer

Test purpose

Verify that when a terrain layer that supports elevation and a layer that does
not support elevation are both requested, the response is a map.

Test method

Submit a request involving both the Terrain layer and a layer that does not
support the ELEVATION dimension and verify that the response is a map.

Reference

[WMS 1.3.0 section C.3.5](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.requests.applicability)

Test type

Capability

### 1.9.3 Test module dims:geometry

1.9.3.1 Test case dims:geometry

Test case ID

dims:geometry

Test purpose

Verify that support for a geometric layer that supports the elevation
dimension is correct.

Test method

Pass if all the submodules and subtests (1.9.3.1.2 - 1.9.3.1.8) pass.

Reference

Test type

Capability

1.9.3.2 Test case dims:geometry-low

Test case ID

dims:geometry-low

Test purpose

Verify that when the geometry at a low elevation is requested, the matching
pixels are returned.

Test method

Request ELEVATION=480 and verify that the response is correct.

Reference

[WMS 1.3.0 section C.3.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.requests.elevation_and_time)

Test type

Capability

1.9.3.3 Test case dims:geometry-med

Test case ID

dims:geometry-med

Test purpose

Verify that when the geometry at a medium elevation is requested, the matching
pixels are returned.

Test method

Request ELEVATION=490 and verify that the response is correct.

Reference

[WMS 1.3.0 section C.3.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.requests.elevation_and_time)

Test type

Capability

1.9.3.4 Test case dims:geometry-high

Test case ID

dims:geometry-high

Test purpose

Verify that when the geometry at a high elevation is requested, the matching
pixels are returned.

Test method

Request ELEVATION=500 and verify that the response is correct.

Reference

[WMS 1.3.0 section C.3.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.requests.elevation_and_time)

Test type

Capability

1.9.3.5 Test case dims:geometry-multiple-values

Test case ID

dims:geometry-multiple-values

Test purpose

Verify that when the geometries for a list of elevations are requested and
multiple values are not supported, the response is an exception with
code=InvalidDimensionValue.

Test method

Request ELEVATION=500,480 and verify that the response is an exception with
code=InvalidDimensionValue.

Reference

[WMS 1.3.0 section C.3.4](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.requests.single_vs_multiple); [WMS 1.3.0 section C.4.1]
(http://cite.opengeospatial.org/OGCTestData/wms/1.3.0/spec/wms1_3.html#dims.re
sponses.incorrect)

Test type

Capability

1.9.3.6 Test case dims:geometry-nearest-value

Test case ID

dims:geometry-nearest-value

Test purpose

Verify that when a request for the geometry at an unadvertised elevation value
is requested and support for nearest values is advertised, the nearest value
is used and a warning header is set.

Test method

Submit a request with ELEVATION=492 and verify that the response is equivalent
to the 490 value and the "nearest value used" warning header is returned.

Reference

[WMS 1.3.0 section C.4.3](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.responses.nearest)

Test type

Capability

1.9.3.7 Test case dims:geometry-default-value

Test case ID

dims:geometry-default-value

Test purpose

Verify that when the elevation parameter is missing but there is a default
elevation value, the default value is used and a warning header is set.

Test method

Submit a request without an ELEVATION parameter and verify that the response
is equivalent to the default value and the "default value used" warning header
is returned.

Reference

[WMS 1.3.0 section C.4.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.responses.default)

Test type

Capability

1.9.3.8 Test case dims:geometry-and-other-layer

Test case ID

dims:geometry-and-other-layer

Test purpose

Verify that when a geometry layer that supports elevation and a layer that
does not support elevation are both requested, the response is a map.

Test method

Submit a request invloving both the Lakes layer and a layer that does not
support the ELEVATION dimension and verify that the response is a map

Reference

[WMS 1.3.0 section C.3.5](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.requests.applicability)

Test type

Capability

### 1.9.4 Test module dims:time

1.9.4.1 Test case dims:time

Test case ID

dims:time

Test purpose

Verify that support for a layer that supports the time dimension is correct.

Test method

Pass if all the submodules and subtests (1.9.4.1.2 - 1.9.4.1.10) pass.

Reference

Test type

Capability

1.9.4.2 Test case dims:time-each-instant

Test case ID

dims:time-each-instant

Test purpose

Verify that for each time instant from 00:00 to 01:00, the appropriate map is
returned.

Test method

Pass if for each time instant from 00:00 to 01:00, the appropriate map is
returned.

Reference

[WMS 1.3.0 section C.3.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.requests.elevation_and_time)

Test type

Capability

1.9.4.3 Test case dims:time-interval

Test case ID

dims:time-interval

Test purpose

Verify that for a time interval, the appropriate map is returned.

Test method

Pass if for a time interval, the appropriate map is returned.

Reference

[WMS 1.3.0 section C.3.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.requests.elevation_and_time)

Test type

Capability

1.9.4.4 Test case dims:time-interval-and-instant

Test case ID

dims:time-interval-and-instant

Test purpose

Verify that for a time value consiting of a time interval and a time instant,
the appropriate map is returned.

Test method

Pass if for a time value consiting of a time interval and a time instant, the
appropriate map is returned.

Reference

[WMS 1.3.0 section C.3.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.requests.elevation_and_time)

Test type

Capability

1.9.4.5 Test case dims:time-interval-list

Test case ID

dims:time-interval-list

Test purpose

Verify that for a time value consiting of a list of time intervals, the
appropriate map is returned.

Test method

Pass if for a time value consiting of a list of time intervals, the
appropriate map is returned.

Reference

[WMS 1.3.0 section C.3.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.requests.elevation_and_time)

Test type

Capability

1.9.4.6 Test case dims:time-instant-list

Test case ID

dims:time-instant-list

Test purpose

Verify that for a time value consiting of a list of time instants, the
appropriate map is returned.

Test method

Pass if for a time value consiting of a list of time instants, the appropriate
map is returned.

Reference

[WMS 1.3.0 section C.3.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.requests.elevation_and_time)

Test type

Capability

1.9.4.7 Test case dims:time-current-instant

Test case ID

dims:time-current-instant

Test purpose

Verify that if the time dimension supports the current keyword, a request for
TIME=current returns a map.

Test method

If the dimension decalaration sets the current attribute, submit a request
with TIME=current and verify that the service returns a map

Reference

[WMS 1.3.0 section C.3.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.requests.elevation_and_time)

Test type

Capability

1.9.4.8 Test case dims:time-current-interval

Test case ID

dims:time-current-interval

Test purpose

Verify that if the time dimension supports the current keyword and advertises
an interval ending with current, a request for that interval returns a map.

Test method

If the dimension decalaration sets the current attribute and advertises an
interval ending with current, submit a request with TIME=current and verify
that the service returns a map

Reference

[WMS 1.3.0 section C.3.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.requests.elevation_and_time)

Test type

Capability

1.9.4.9 Test case dims:time-default

Test case ID

dims:time-default

Test purpose

Verify that if the dimension decalaration includes a default value, a request
without a TIME parameter returns a map and sets the "default value used"
warning header.

Test method

If the dimension decalaration includes a default value, submit a request
without a TIME parameter and verify that the service returns a map and sets
the "default value used" warning header

Reference

[WMS 1.3.0 section C.4.2](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.responses.default)

Test type

Capability

1.9.4.10 Test case dims:time-and-other-layer

Test case ID

dims:time-and-other-layer

Test purpose

Verify that when a layer that supports time and other layers that do not
support time are requested, the response is a map.

Test method

Submit a request involving both the Autos layer and a layer that does not
support the TIME dimension and verify that the response is a map

Reference

[WMS 1.3.0 section C.3.5](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.requests.applicability)

Test type

Capability

1.9.5 Test case dims:missing-no-default

Test case ID

dims:missing-no-default

Test purpose

Verify that when a layer that has a dimension without a default value is
requested without supplying the dimension parameter, the response is an
exception with code=MissingDimensionValue.

Test method

Pass if when a layer that has a dimension without a default value is requested
without supplying the dimension parameter, the response is an exception with
code=MissingDimensionValue.

Reference

[WMS 1.3.0 section C.4.1](http://cite.opengeospatial.org/OGCTestData/wms/1.3.0
/spec/wms1_3.html#dims.responses.incorrect)

Test type

Capability

