// Generated from Prescription.g4 by ANTLR 4.4
package antlr.prescription;
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
	 * Enter a parse tree produced by {@link PrescriptionParser#duration_amount}.
	 * @param ctx the parse tree
	 */
	void enterDuration_amount(@NotNull PrescriptionParser.Duration_amountContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#duration_amount}.
	 * @param ctx the parse tree
	 */
	void exitDuration_amount(@NotNull PrescriptionParser.Duration_amountContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrescriptionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull PrescriptionParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull PrescriptionParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrescriptionParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(@NotNull PrescriptionParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(@NotNull PrescriptionParser.IntervalContext ctx);
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
	 * Enter a parse tree produced by {@link PrescriptionParser#frequency}.
	 * @param ctx the parse tree
	 */
	void enterFrequency(@NotNull PrescriptionParser.FrequencyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#frequency}.
	 * @param ctx the parse tree
	 */
	void exitFrequency(@NotNull PrescriptionParser.FrequencyContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link PrescriptionParser#dose_unit}.
	 * @param ctx the parse tree
	 */
	void enterDose_unit(@NotNull PrescriptionParser.Dose_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#dose_unit}.
	 * @param ctx the parse tree
	 */
	void exitDose_unit(@NotNull PrescriptionParser.Dose_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrescriptionParser#duration_unit}.
	 * @param ctx the parse tree
	 */
	void enterDuration_unit(@NotNull PrescriptionParser.Duration_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#duration_unit}.
	 * @param ctx the parse tree
	 */
	void exitDuration_unit(@NotNull PrescriptionParser.Duration_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrescriptionParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterDuration(@NotNull PrescriptionParser.DurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitDuration(@NotNull PrescriptionParser.DurationContext ctx);
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
	 * Enter a parse tree produced by {@link PrescriptionParser#interval_length}.
	 * @param ctx the parse tree
	 */
	void enterInterval_length(@NotNull PrescriptionParser.Interval_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#interval_length}.
	 * @param ctx the parse tree
	 */
	void exitInterval_length(@NotNull PrescriptionParser.Interval_lengthContext ctx);
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
	 * Enter a parse tree produced by {@link PrescriptionParser#dose_amount}.
	 * @param ctx the parse tree
	 */
	void enterDose_amount(@NotNull PrescriptionParser.Dose_amountContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#dose_amount}.
	 * @param ctx the parse tree
	 */
	void exitDose_amount(@NotNull PrescriptionParser.Dose_amountContext ctx);
}