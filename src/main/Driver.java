package main;

import java.util.LinkedList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;

import antlr.prescription.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Driver {

	public static void main(String[] args) throws Exception{
		System.out.println("Program Started");
		System.out.println("================");
		
		PrescriptionLexer lexer = new PrescriptionLexer(new ANTLRInputStream(System.in));
		
		System.out.println(lexer);
		PrescriptionParser parser = new PrescriptionParser(new CommonTokenStream(lexer));
		
		ParseTree tree = parser.script();
		System.out.println(tree.toStringTree(parser));
		
		ParseTreeWalker walker = new ParseTreeWalker();
		PrescriptionTreeListener list = new PrescriptionTreeListener();
		walker.walk(list, tree);
		
		LinkedList<Prescription> p = list.getPrescription();
		System.out.println("Prescription: "+p); 
        GrooveXMLGenerator g = new GrooveXMLGenerator(); 
		
		Document doc = g.generateXMLTree(p); 

		GrooveXMLGenerator.GrooveXMLGeneratorUtils.printXML(doc);
	
		System.out.println("\n================");
		System.out.println("COMPLETED");
	}
}
 