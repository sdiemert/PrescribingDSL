package main;

import java.io.File;
import java.util.LinkedList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Element; 
import org.w3c.dom.Document; 
import org.w3c.dom.Node;

import java.util.Date; 

public class GrooveXMLGenerator implements XMLGenerator{
	
	private DocumentBuilderFactory docFactory;
	private DocumentBuilder docBuilder; 
	
	public GrooveXMLGenerator(){
		try{
			this.docFactory = DocumentBuilderFactory.newInstance(); 
			this.docBuilder = this.docFactory.newDocumentBuilder();
		}catch(ParserConfigurationException pce){
			pce.printStackTrace();
		}
	}
	
	public Document generateXMLTree(LinkedList<Prescription> scriptList){
		Document doc = this.docBuilder.newDocument();
		
		Element gxlRoot = this.addGXLRoot(doc);
		Element graphRoot = this.addGraphRoot(doc, gxlRoot); 
		this.addVersionTag(doc, graphRoot); 
		
		int i = 0; 
		Element previous = null; 
		Element current  = null; 
		for(Prescription p : scriptList){
			current = p.toGrooveXML(doc, graphRoot, i, null);
			if(previous != null){
				GrooveXMLGeneratorUtils.addEdgeNode(doc, graphRoot, previous.getAttribute("id"), current.getAttribute("id"), "then");
			}
			previous = current; 
			i++; 
		}
		return doc;
	}
	
	private Element addVersionTag(Document doc, Element graphRoot){
		Element versionTag = (Element)GrooveXMLGeneratorUtils.addTag(doc, graphRoot, "version");
		versionTag.setAttribute("name", "$version");
		Element versionString = (Element)GrooveXMLGeneratorUtils.addTag(doc, versionTag, "string");
		versionString.setTextContent("curly");
		return versionTag; 
	}
	
	private Element addGXLRoot(Document doc){
		Element gxlNode =(Element)GrooveXMLGeneratorUtils.addTag(doc, doc, "gxl");
		gxlNode.setAttribute("xmlns", "http://www.gupro.de/GXL/gxl-1.0.dtd");
		return gxlNode;
	}
	
	private Element addGraphRoot(Document doc, Element gxlRoot){
		Date d = new Date(); 
		Element graphRoot = (Element)GrooveXMLGeneratorUtils.addTag(doc, gxlRoot, "graph");
		graphRoot.setAttribute("role", "graph");
		graphRoot.setAttribute("edgeids", "false");
		graphRoot.setAttribute("edgemode", "directed");
		graphRoot.setAttribute("id", "prescription_"+d.toString());
		return graphRoot;
	}
	
	public static class GrooveXMLGeneratorUtils{
		
		/**
		 * Adds a new edge node to the specified document. 
		 * Edge conforms to Groove input format:
		 * 
		 *   """
		 *   <edge from="srcNode" to="dstNode">
         *   	<attr name="label">
         *       	<string>@param edgeValue</string>
         *   	</attr>
         *   </edge>
		 *	"""
		 *
		 * @param doc
		 * @param rootNode
		 * @param sourceNode
		 * @param dstNode
		 * @param edgeValue
		 * @return nothing is returned, however the Document doc is updated to contain the new node 
		 */
		public static void addEdgeNode(Document doc, Node rootNode, String sourceNode, 
				String dstNode, String edgeValue)
		{
			Element edge = doc.createElement("edge");
			edge.setAttribute("from", sourceNode);
			edge.setAttribute("to", dstNode);
			Element edgeAttr = doc.createElement("attr");
			edgeAttr.setAttribute("name", "label"); 
			Element edgeAttrString = doc.createElement("string");
			edgeAttrString.appendChild(doc.createTextNode(edgeValue)); 
			edgeAttr.appendChild(edgeAttrString);
			edge.appendChild(edgeAttr);
			rootNode.appendChild(edge);
		}
		
		/**
		 * Adds a node to the Document doc under the node parentNode
		 * as per the groove input xml format.  
		 * 
		 * @param doc - the Document we are working with.
		 * @param nodeId - a string identifier for the node. 
		 * @param parentNode - the parent to append this under, may be of type Document or Element
		 * @return the node that was created.
		 */
		public static Node addNode(Document doc, Node parentNode, String nodeId){
			Element node = doc.createElement("node");
			node.setAttribute("id", nodeId);
			parentNode.appendChild(node);
			return node;
		}
			
		/**
		 * Adds a node to the Document doc under the node parentNode
		 * as per the groove input xml format.  
		 * 
		 * @param doc - the Document we are working with.
		 * @param parentNode - the parent to append this under, may be of type Document or Element
		 * @return the node that was created.
		 */
		public static Node addTag(Document doc, Node parentNode, String tagType){
			Element node = doc.createElement(tagType);
			parentNode.appendChild(node);
			return node;
		}
		
		/**
		 * Adds a new value to an existing node in the document.
		 * In the groove input this has the effect of adding an new edge
		 * from the node to node with a value on it. In groove this looks
		 * like it is an attribute on the node.  
		 * 
		 * @param doc - document the node belongs to.
		 * @param node - node to add to.
		 * @param value - the string value to put into the node.
		 */
		public static void addValueToNode(Document doc, Element parent, Element node, String value){
			String nodeId = node.getAttribute("id");
			addEdgeNode(doc, parent, nodeId, nodeId, value);
		}
		
		/**
		 * Prints out the XML tree that is held within the doc parameter.
		 * @param doc - the main document which contains the XML tree
		 * @throws TransformerException if the routine is unable to transform the XML tree to a string
		 */
		public static void printXML(Document doc, File output) throws TransformerException{
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result =  new StreamResult(output);
			transformer.transform(source, result);
			System.out.println("\n"); 
		}
	}

}
