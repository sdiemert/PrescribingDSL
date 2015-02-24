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
	 * Enter a parse tree produced by {@link PrescriptionParser#doseAtom}.
	 * @param ctx the parse tree
	 */
	void enterDoseAtom(@NotNull PrescriptionParser.DoseAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#doseAtom}.
	 * @param ctx the parse tree
	 */
	void exitDoseAtom(@NotNull PrescriptionParser.DoseAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrescriptionParser#doseAmount}.
	 * @param ctx the parse tree
	 */
	void enterDoseAmount(@NotNull PrescriptionParser.DoseAmountContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#doseAmount}.
	 * @param ctx the parse tree
	 */
	void exitDoseAmount(@NotNull PrescriptionParser.DoseAmountContext ctx);
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
	 * Enter a parse tree produced by {@link PrescriptionParser#durationUnit}.
	 * @param ctx the parse tree
	 */
	void enterDurationUnit(@NotNull PrescriptionParser.DurationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#durationUnit}.
	 * @param ctx the parse tree
	 */
	void exitDurationUnit(@NotNull PrescriptionParser.DurationUnitContext ctx);
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
	 * Enter a parse tree produced by {@link PrescriptionParser#titratingChange}.
	 * @param ctx the parse tree
	 */
	void enterTitratingChange(@NotNull PrescriptionParser.TitratingChangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#titratingChange}.
	 * @param ctx the parse tree
	 */
	void exitTitratingChange(@NotNull PrescriptionParser.TitratingChangeContext ctx);
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
	 * Enter a parse tree produced by {@link PrescriptionParser#instant}.
	 * @param ctx the parse tree
	 */
	void enterInstant(@NotNull PrescriptionParser.InstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#instant}.
	 * @param ctx the parse tree
	 */
	void exitInstant(@NotNull PrescriptionParser.InstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrescriptionParser#titratingDirection}.
	 * @param ctx the parse tree
	 */
	void enterTitratingDirection(@NotNull PrescriptionParser.TitratingDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#titratingDirection}.
	 * @param ctx the parse tree
	 */
	void exitTitratingDirection(@NotNull PrescriptionParser.TitratingDirectionContext ctx);
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
	 * Enter a parse tree produced by {@link PrescriptionParser#titratingStop}.
	 * @param ctx the parse tree
	 */
	void enterTitratingStop(@NotNull PrescriptionParser.TitratingStopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#titratingStop}.
	 * @param ctx the parse tree
	 */
	void exitTitratingStop(@NotNull PrescriptionParser.TitratingStopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrescriptionParser#specificTiming}.
	 * @param ctx the parse tree
	 */
	void enterSpecificTiming(@NotNull PrescriptionParser.SpecificTimingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#specificTiming}.
	 * @param ctx the parse tree
	 */
	void exitSpecificTiming(@NotNull PrescriptionParser.SpecificTimingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrescriptionParser#specificDose}.
	 * @param ctx the parse tree
	 */
	void enterSpecificDose(@NotNull PrescriptionParser.SpecificDoseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#specificDose}.
	 * @param ctx the parse tree
	 */
	void exitSpecificDose(@NotNull PrescriptionParser.SpecificDoseContext ctx);
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
	 * Enter a parse tree produced by {@link PrescriptionParser#titratingInterval}.
	 * @param ctx the parse tree
	 */
	void enterTitratingInterval(@NotNull PrescriptionParser.TitratingIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#titratingInterval}.
	 * @param ctx the parse tree
	 */
	void exitTitratingInterval(@NotNull PrescriptionParser.TitratingIntervalContext ctx);
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
	 * Enter a parse tree produced by {@link PrescriptionParser#titratingDose}.
	 * @param ctx the parse tree
	 */
	void enterTitratingDose(@NotNull PrescriptionParser.TitratingDoseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#titratingDose}.
	 * @param ctx the parse tree
	 */
	void exitTitratingDose(@NotNull PrescriptionParser.TitratingDoseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrescriptionParser#doseUnit}.
	 * @param ctx the parse tree
	 */
	void enterDoseUnit(@NotNull PrescriptionParser.DoseUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#doseUnit}.
	 * @param ctx the parse tree
	 */
	void exitDoseUnit(@NotNull PrescriptionParser.DoseUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrescriptionParser#titratingStart}.
	 * @param ctx the parse tree
	 */
	void enterTitratingStart(@NotNull PrescriptionParser.TitratingStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#titratingStart}.
	 * @param ctx the parse tree
	 */
	void exitTitratingStart(@NotNull PrescriptionParser.TitratingStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrescriptionParser#intervalLength}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLength(@NotNull PrescriptionParser.IntervalLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#intervalLength}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLength(@NotNull PrescriptionParser.IntervalLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrescriptionParser#fixedDose}.
	 * @param ctx the parse tree
	 */
	void enterFixedDose(@NotNull PrescriptionParser.FixedDoseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#fixedDose}.
	 * @param ctx the parse tree
	 */
	void exitFixedDose(@NotNull PrescriptionParser.FixedDoseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrescriptionParser#durationAmount}.
	 * @param ctx the parse tree
	 */
	void enterDurationAmount(@NotNull PrescriptionParser.DurationAmountContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrescriptionParser#durationAmount}.
	 * @param ctx the parse tree
	 */
	void exitDurationAmount(@NotNull PrescriptionParser.DurationAmountContext ctx);
}