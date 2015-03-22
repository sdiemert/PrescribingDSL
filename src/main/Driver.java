package main;

import groove.explore.Generator;

import java.io.File;
import java.util.LinkedList;

import main.graphics.RxFrame;

import org.w3c.dom.*;

import antlr.prescription.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Driver {

	public static void main(String[] args) throws Exception{
		//runConsole(); 
		runGUI(); 
	}
	
	public static void runGUI() throws Exception{

		RxFrame frame = new RxFrame("RxManager");
		
		frame.setVisible(true);

	}
	
	public void operateOnStringInput(String in) throws Exception{
		PrescriptionLexer lexer = new PrescriptionLexer(new ANTLRInputStream(in));
		
		System.out.println(lexer);
		PrescriptionParser parser = new PrescriptionParser(new CommonTokenStream(lexer));
		
		ParseTree tree = parser.script();
		System.out.println(tree.toStringTree(parser));
		
		ParseTreeWalker walker = new ParseTreeWalker();
		PrescriptionTreeListener list = new PrescriptionTreeListener();
		walker.walk(list, tree);
		
		LinkedList<Prescription> p = list.getPrescription();

		Boolean val = true; 
		for(Prescription rx : p){
			if(!rx.sanityCheck()){
				System.out.println("Error, could not validate prescription: "+rx.toString());
				val = false; 
			}
		}
		System.out.println("Prescription: "+p); 
		if(val){
			GrooveXMLGenerator g = new GrooveXMLGenerator(); 
			Document doc = g.generateXMLTree(p); 
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.printXML(doc, new File("/Users/sdiemert/Documents/workspace/PrescribingDsl/groove/grammar.gps/inputGraph.gst"));
			System.out.println("Groove XML output to file");
		}else{
			System.out.println("------------>Failed to generate Groove file"); 
		}
		
		Generator g = new Generator();  
		String[] input = {"-v","2","-r","1","-s", "random", "-f", "/Users/sdiemert/Documents/workspace/PrescribingDsl/groove/reconcil.gps/plan.gst", "/Users/sdiemert/Documents/workspace/PrescribingDsl/groove/grammar.gps", "inputGraph"};
		g.execute(input); 

        System.out.println("\n================");
		System.out.println("COMPLETED");

	}
	
	public static void runConsole() throws Exception{
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

		Boolean val = true; 
		for(Prescription rx : p){
			if(!rx.sanityCheck()){
				System.out.println("Error, could not validate prescription: "+rx.toString());
				val = false; 
			}
		}
		System.out.println("Prescription: "+p); 
		if(val){
			GrooveXMLGenerator g = new GrooveXMLGenerator(); 
			Document doc = g.generateXMLTree(p); 
			GrooveXMLGenerator.GrooveXMLGeneratorUtils.printXML(doc, new File("/Users/sdiemert/Documents/workspace/PrescribingDsl/groove/grammar.gps/inputGraph.gst"));
			System.out.println("Groove XML output to file");
		}else{
			System.out.println("------------>Failed to generate Groove file"); 
		}
		
		Generator g = new Generator();  
		String[] input = {"-v","2","-r","1","-s", "random", "-f", "/Users/sdiemert/Documents/workspace/PrescribingDsl/groove/reconcil.gps/plan.gst", "/Users/sdiemert/Documents/workspace/PrescribingDsl/groove/grammar.gps", "inputGraph"};
		g.execute(input); 

        System.out.println("\n================");
		System.out.println("COMPLETED");

	}
}
 