# OGC Web Map Service (WMS)  1.3.0 Test-Suite

The OGC Web Map Service (WMS)  1.3.0 Test-Suite provides the Executable Test Script (ETS) to test implementations against the following specification(s):

- OGC WMS 1.3.0 Specification, [OGC 06-042](http://portal.opengeospatial.org/files/?artifact_id=14416)

Detailed information about this test suite is available [here] (http://opengeospatial.github.io/ets-wms13/).

## License

[Apache 2.0 License](LICENSE.md)

## Building

This test is build using [Apache Maven](http://maven.apache.org/) To 
build the test suite run maven from the root directory.
   % mvn install
     
To test an application run:
    % mvn test
    
More information about how to build and install the test in TEAM Engine at the [TEAM Engine project site](https://github.com/opengeospatial/teamengine/tree/master/src/site)

## How to run the tests

### Integrated development environment (IDE)
You can use a Java IDE such as Eclipse, NetBeans, or IntelliJ to run the test suite.
Clone the repository and build the project. The runtime configuration is summarized below.

__Main class__: `org.opengis.cite.wms13.CtlController`

__Arguments__: The first argument must refer to an XML properties file containing the
required test run argument (a reference to a WMS 1.3 capabilities document). If not
specified, the default location at `${user.home}/test-run-props.xml` will be used.

You can modify the default settings in the sample [test-run-props.xml](src/main/config/test-run-props.xml)
file. The value of the `capabilities-url` argument must be an absolute URI that adheres to the 'http'
or 'file' schemes.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE properties SYSTEM "http://java.sun.com/dtd/properties.dtd">
<properties version="1.0">
    <comment>Test run arguments (ets-wms13)</comment>
	<entry key="capabilities-url">http://localhost:9090/wms13/capabilities.xml</entry>
</properties>
```

The TestNG results file (testng-results.xml) will be written to a subdirectory
in ${user.home}/testng/ having a UUID value as its name.

### Command shell (terminal)

One of the build artifacts is an "all-in-one" JAR file that includes the test
suite with all of its dependencies. This makes it very easy to execute the test
suite in a command shell like so:

`java -jar ets-wms13-${version}-aio.jar  [test-run-props.xml]`

### Docker

This test suite comes with a Dockerfile which can be used to easily setup the OGC test harness with
the test suite. Details can be found on https://github.com/opengeospatial/cite/wiki/How-to-create-Docker-Images-of-test-suites#create-docker-image-and-create-and-start-docker-container[Create Docker Image and create and start Docker Container].

### OGC test harness

Use [TEAM Engine](https://github.com/opengeospatial/teamengine), the official
OGC test harness. The latest test suite release should be available at the
[beta testing facility](http://cite.opengeospatial.org/te2/). You can also
[build and deploy](https://github.com/opengeospatial/teamengine) the test
harness yourself and use a local installation.

## Bugs

Issue tracker is available at [github](https://github.com/opengeospatial/ets-wms130/issues)

## Mailing Lists

The [cite-forum](http://cite.opengeospatial.org/forum) is where software developers discuss issues and solutions related to OGC tests. 

## More Information

Visit the [CITE website](http://cite.opengeospatial.org/) to get more information about the CITE program and tools.
