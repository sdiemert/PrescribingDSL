package test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class XMLGeneratorTest {
	private Document doc; 
	private Element parentNode; 

	@Before
	public void setUp() throws Exception {
		try{
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = docFactory.newDocumentBuilder();
			this.doc = builder.newDocument();
			this.parentNode = doc.createElement("root"); 
			this.doc.appendChild(parentNode); 
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	@After
	public void tearDown() throws Exception {
		this.doc = null; //clear the doc class attribute by setting it to null
		this.parentNode = null;  //clear the parentNode as well. 
	}

	@Test
	/**
	 * Tests the XML utils addNode method with normal input.  
	 */
	public void testUtilsAddNodeWithNormalInput() {
			
	}

}
