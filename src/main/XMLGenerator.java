package main;

import java.util.LinkedList;

import org.w3c.dom.Document;

public interface XMLGenerator {
	public Document generateXMLTree(LinkedList<Prescription> list); 
}
