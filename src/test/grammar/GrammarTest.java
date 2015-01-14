/**
 * 
 */
package test.grammar;

import static org.junit.Assert.*;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import antlr.prescription.PrescriptionLexer;
import antlr.prescription.PrescriptionParser;

/**
 * @author sdiemert
 *
 */
public class GrammarTest {
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSimpleInput1() {
		PrescriptionLexer lexer = new PrescriptionLexer(new ANTLRInputStream("take aspirin 81 mg once daily\n"));
		PrescriptionParser parser = new PrescriptionParser(new CommonTokenStream(lexer));
		ParseTree tree = parser.script();
		
		String output = tree.toStringTree(parser);
		
		assertEquals(output, "(script (expr (expr (action take) (medication aspirin) (dose 81 mg) (timing (interval once daily))) \\n))");
	}
	
	@Test
	public void testSimpleInput2(){
		PrescriptionLexer lexer = new PrescriptionLexer(new ANTLRInputStream("take aspirin 81 mg once daily THEN take aspirin 162 mg twice daily\n"));
		PrescriptionParser parser = new PrescriptionParser(new CommonTokenStream(lexer));
		ParseTree tree = parser.script();
		
		String output = tree.toStringTree(parser);
		
		assertEquals(output, 
				"(script (expr (expr (expr (action take) (medication aspirin) (dose 81 mg) (timing (interval once daily))) THEN (expr (action take) (medication aspirin) (dose 162 mg) (timing (interval twice daily)))) \\n))");
	}
	
	@Test
	public void testSimpleInput3(){
		PrescriptionLexer lexer = new PrescriptionLexer(new ANTLRInputStream("take aspirin 81 mg once daily FOR three weeks\n"));
		PrescriptionParser parser = new PrescriptionParser(new CommonTokenStream(lexer));
		ParseTree tree = parser.script();
		
		String output = tree.toStringTree(parser);
		
		assertEquals(output, 
				"(script (expr (expr (action take) (medication aspirin) (dose 81 mg) (timing (interval once daily) FOR (duration three weeks))) \\n))");
	}
}
