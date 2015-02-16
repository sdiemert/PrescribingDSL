package main;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public interface PrescriptionElement {

	public Element toGrooveXML(Document doc, Element rootNode, int rxNumber); 
	
	public Boolean sanityCheck(); 
	
	public String toString(); 
}
