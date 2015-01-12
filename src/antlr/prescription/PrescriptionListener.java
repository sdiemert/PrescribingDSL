// Generated from /Users/sdiemert/Documents/workspace/AntlrTestDriver/src/antlr/prescription/Prescription.g4 by ANTLR 4.1

	import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PrescriptionParser}.
 */
public interface PrescriptionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PrescriptionParser#medication}.
	 * @param ctx the parse tree
	 */
	void enterMedication(@NotNull PrescriptionParser.MedicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#medication}.
	 * @param ctx the parse tree
	 */
	void exitMedication(@NotNull PrescriptionParser.MedicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PrescriptionParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull PrescriptionParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull PrescriptionParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link PrescriptionParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(@NotNull PrescriptionParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(@NotNull PrescriptionParser.ActionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PrescriptionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull PrescriptionParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull PrescriptionParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link PrescriptionParser#timing}.
	 * @param ctx the parse tree
	 */
	void enterTiming(@NotNull PrescriptionParser.TimingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#timing}.
	 * @param ctx the parse tree
	 */
	void exitTiming(@NotNull PrescriptionParser.TimingContext ctx);

	/**
	 * Enter a parse tree produced by {@link PrescriptionParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(@NotNull PrescriptionParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(@NotNull PrescriptionParser.ScriptContext ctx);

	/**
	 * Enter a parse tree produced by {@link PrescriptionParser#dose}.
	 * @param ctx the parse tree
	 */
	void enterDose(@NotNull PrescriptionParser.DoseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#dose}.
	 * @param ctx the parse tree
	 */
	void exitDose(@NotNull PrescriptionParser.DoseContext ctx);
}