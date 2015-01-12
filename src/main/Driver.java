package main;

import antlr.prescription.*;

import org.antlr.v4.runtime.*;

public class Driver {

	public static void main(String[] args) throws Exception{
		System.out.println("Program Started");
		System.out.println("================");
		
		PrescriptionLexer lexer = new PrescriptionLexer(new ANTLRInputStream(System.in));
		
		System.out.println(lexer);
		PrescriptionParser parser = new PrescriptionParser(new CommonTokenStream(lexer));
		parser.script();
		
		System.out.println("COMPLETED");
	}

}
