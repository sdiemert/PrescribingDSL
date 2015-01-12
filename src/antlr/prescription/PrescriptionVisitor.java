// Generated from /Users/sdiemert/Documents/workspace/AntlrTestDriver/src/antlr/prescription/Prescription.g4 by ANTLR 4.1

	import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PrescriptionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PrescriptionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PrescriptionParser#medication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedication(@NotNull PrescriptionParser.MedicationContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrescriptionParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull PrescriptionParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrescriptionParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(@NotNull PrescriptionParser.ActionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrescriptionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull PrescriptionParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrescriptionParser#timing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiming(@NotNull PrescriptionParser.TimingContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrescriptionParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(@NotNull PrescriptionParser.ScriptContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrescriptionParser#dose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDose(@NotNull PrescriptionParser.DoseContext ctx);
}