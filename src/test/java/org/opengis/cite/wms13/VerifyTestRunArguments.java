package org.opengis.cite.wms13;

import static org.junit.Assert.*;

import java.util.Properties;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class VerifyTestRunArguments {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void getPropertiesAsDocument() {
		Properties props = new Properties();
		props.setProperty(WMS13.CAPABILITIES_URL, "http://localhost:7070/wms?service=WMS&request=GetCapabilities");
		Document doc = TestRunArguments.propertiesAsDocument(props);
		assertNotNull("Document is null.", doc);
		NodeList entries = doc.getElementsByTagName("entry");
		assertEquals("Unexpected number of properties.", 1, entries.getLength());
	}

	@Test
	public void relativeUriRefIsInvalid() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Not an absolute URI");
		Properties props = new Properties();
		props.setProperty(WMS13.CAPABILITIES_URL, "wms?service=WMS&request=GetCapabilities");
		Document args = TestRunArguments.propertiesAsDocument(props);
		TestRunArguments.validateArguments(args);
	}

}
