package main;

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
		
		System.out.println("COMPLETED");
	}
}
 