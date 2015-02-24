// Generated from Prescription.g4 by ANTLR 4.4
package antlr.prescription;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PrescriptionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__16=1, T__15=2, T__14=3, T__13=4, T__12=5, T__11=6, T__10=7, T__9=8, 
		T__8=9, T__7=10, T__6=11, T__5=12, T__4=13, T__3=14, T__2=15, T__1=16, 
		T__0=17, INT=18, NUMBER=19, TIMEUNIT=20, TIMEUNIT_PLURAL=21, UNIT=22, 
		INTERVAL_FREQ=23, INTERVAL_MODIFIER=24, INTERVAL_LENGTH=25, STRING=26, 
		ID=27, NEWLINE=28, WS=29;
	public static final String[] tokenNames = {
		"<INVALID>", "'THEN'", "'TO'", "'per'", "')'", "'BY'", "','", "'down'", 
		"'('", "'='", "'TITRATE'", "'ACTION'", "'up'", "'MEDICATION'", "'FROM'", 
		"'TIMING'", "'DOSE'", "'FOR'", "INT", "NUMBER", "TIMEUNIT", "TIMEUNIT_PLURAL", 
		"UNIT", "INTERVAL_FREQ", "INTERVAL_MODIFIER", "INTERVAL_LENGTH", "STRING", 
		"ID", "NEWLINE", "WS"
	};
	public static final int
		RULE_script = 0, RULE_expr = 1, RULE_atom = 2, RULE_assignment = 3, RULE_action = 4, 
		RULE_medication = 5, RULE_dose = 6, RULE_fixedDose = 7, RULE_doseAtom = 8, 
		RULE_doseAmount = 9, RULE_doseUnit = 10, RULE_specificDose = 11, RULE_titratingDose = 12, 
		RULE_titratingDirection = 13, RULE_titratingStop = 14, RULE_titratingStart = 15, 
		RULE_titratingChange = 16, RULE_titratingInterval = 17, RULE_timing = 18, 
		RULE_instant = 19, RULE_specificTiming = 20, RULE_interval = 21, RULE_frequency = 22, 
		RULE_intervalLength = 23, RULE_duration = 24, RULE_durationAmount = 25, 
		RULE_durationUnit = 26;
	public static final String[] ruleNames = {
		"script", "expr", "atom", "assignment", "action", "medication", "dose", 
		"fixedDose", "doseAtom", "doseAmount", "doseUnit", "specificDose", "titratingDose", 
		"titratingDirection", "titratingStop", "titratingStart", "titratingChange", 
		"titratingInterval", "timing", "instant", "specificTiming", "interval", 
		"frequency", "intervalLength", "duration", "durationAmount", "durationUnit"
	};

	@Override
	public String getGrammarFileName() { return "Prescription.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PrescriptionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScriptContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54); expr(0);
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__4) | (1L << T__2) | (1L << T__1) | (1L << STRING) | (1L << ID) | (1L << NEWLINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(PrescriptionParser.NEWLINE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			switch (_input.LA(1)) {
			case STRING:
			case ID:
				{
				setState(60); atom();
				}
				break;
			case T__6:
			case T__4:
			case T__2:
			case T__1:
				{
				setState(61); assignment();
				setState(62); match(NEWLINE);
				}
				break;
			case NEWLINE:
				{
				setState(64); match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(72);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(67);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(68); match(T__16);
						setState(69); expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(70);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(71); match(NEWLINE);
						}
						break;
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public ActionContext a;
		public MedicationContext m;
		public DoseContext d;
		public TimingContext t;
		public DoseContext dose() {
			return getRuleContext(DoseContext.class,0);
		}
		public MedicationContext medication() {
			return getRuleContext(MedicationContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public TimingContext timing() {
			return getRuleContext(TimingContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); ((AtomContext)_localctx).a = action();
			setState(78); ((AtomContext)_localctx).m = medication();
			setState(79); ((AtomContext)_localctx).d = dose();
			setState(80); ((AtomContext)_localctx).t = timing();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public ActionContext a;
		public DoseContext d;
		public MedicationContext m;
		public TimingContext t;
		public DoseContext dose() {
			return getRuleContext(DoseContext.class,0);
		}
		public TerminalNode ID() { return getToken(PrescriptionParser.ID, 0); }
		public MedicationContext medication() {
			return getRuleContext(MedicationContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public TimingContext timing() {
			return getRuleContext(TimingContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			setState(98);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); match(T__6);
				setState(83); match(ID);
				setState(84); match(T__8);
				setState(85); ((AssignmentContext)_localctx).a = action();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(86); match(T__1);
				setState(87); match(ID);
				setState(88); match(T__8);
				setState(89); ((AssignmentContext)_localctx).d = dose();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(90); match(T__4);
				setState(91); match(ID);
				setState(92); match(T__8);
				setState(93); ((AssignmentContext)_localctx).m = medication();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(94); match(T__2);
				setState(95); match(ID);
				setState(96); match(T__8);
				setState(97); ((AssignmentContext)_localctx).t = timing();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public Token s;
		public TerminalNode ID() { return getToken(PrescriptionParser.ID, 0); }
		public TerminalNode STRING() { return getToken(PrescriptionParser.STRING, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_action);
		try {
			setState(102);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(100); match(ID);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(101); ((ActionContext)_localctx).s = match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MedicationContext extends ParserRuleContext {
		public TerminalNode STRING(int i) {
			return getToken(PrescriptionParser.STRING, i);
		}
		public List<TerminalNode> STRING() { return getTokens(PrescriptionParser.STRING); }
		public MedicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_medication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterMedication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitMedication(this);
		}
	}

	public final MedicationContext medication() throws RecognitionException {
		MedicationContext _localctx = new MedicationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_medication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104); match(STRING);
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoseContext extends ParserRuleContext {
		public FixedDoseContext fixedDose() {
			return getRuleContext(FixedDoseContext.class,0);
		}
		public TitratingDoseContext titratingDose() {
			return getRuleContext(TitratingDoseContext.class,0);
		}
		public DoseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterDose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitDose(this);
		}
	}

	public final DoseContext dose() throws RecognitionException {
		DoseContext _localctx = new DoseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dose);
		try {
			setState(111);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); titratingDose();
				}
				break;
			case T__9:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); fixedDose();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FixedDoseContext extends ParserRuleContext {
		public SpecificDoseContext specificDose() {
			return getRuleContext(SpecificDoseContext.class,0);
		}
		public DoseAtomContext doseAtom() {
			return getRuleContext(DoseAtomContext.class,0);
		}
		public FixedDoseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedDose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterFixedDose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitFixedDose(this);
		}
	}

	public final FixedDoseContext fixedDose() throws RecognitionException {
		FixedDoseContext _localctx = new FixedDoseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fixedDose);
		try {
			setState(115);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); specificDose();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(114); doseAtom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoseAtomContext extends ParserRuleContext {
		public DoseUnitContext doseUnit() {
			return getRuleContext(DoseUnitContext.class,0);
		}
		public DoseAmountContext doseAmount() {
			return getRuleContext(DoseAmountContext.class,0);
		}
		public DoseAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doseAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterDoseAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitDoseAtom(this);
		}
	}

	public final DoseAtomContext doseAtom() throws RecognitionException {
		DoseAtomContext _localctx = new DoseAtomContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_doseAtom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); doseAmount();
			setState(118); doseUnit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoseAmountContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PrescriptionParser.INT, 0); }
		public DoseAmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doseAmount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterDoseAmount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitDoseAmount(this);
		}
	}

	public final DoseAmountContext doseAmount() throws RecognitionException {
		DoseAmountContext _localctx = new DoseAmountContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_doseAmount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoseUnitContext extends ParserRuleContext {
		public TerminalNode UNIT() { return getToken(PrescriptionParser.UNIT, 0); }
		public DoseUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doseUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterDoseUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitDoseUnit(this);
		}
	}

	public final DoseUnitContext doseUnit() throws RecognitionException {
		DoseUnitContext _localctx = new DoseUnitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_doseUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(UNIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecificDoseContext extends ParserRuleContext {
		public List<DoseAtomContext> doseAtom() {
			return getRuleContexts(DoseAtomContext.class);
		}
		public DoseAtomContext doseAtom(int i) {
			return getRuleContext(DoseAtomContext.class,i);
		}
		public SpecificDoseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specificDose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterSpecificDose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitSpecificDose(this);
		}
	}

	public final SpecificDoseContext specificDose() throws RecognitionException {
		SpecificDoseContext _localctx = new SpecificDoseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_specificDose);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(T__9);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(125); doseAtom();
					setState(126); match(T__11);
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(133); doseAtom();
			setState(134); match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TitratingDoseContext extends ParserRuleContext {
		public TitratingStopContext titratingStop() {
			return getRuleContext(TitratingStopContext.class,0);
		}
		public TitratingIntervalContext titratingInterval() {
			return getRuleContext(TitratingIntervalContext.class,0);
		}
		public TitratingStartContext titratingStart() {
			return getRuleContext(TitratingStartContext.class,0);
		}
		public TitratingDirectionContext titratingDirection() {
			return getRuleContext(TitratingDirectionContext.class,0);
		}
		public TitratingChangeContext titratingChange() {
			return getRuleContext(TitratingChangeContext.class,0);
		}
		public TitratingDoseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titratingDose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterTitratingDose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitTitratingDose(this);
		}
	}

	public final TitratingDoseContext titratingDose() throws RecognitionException {
		TitratingDoseContext _localctx = new TitratingDoseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_titratingDose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(T__7);
			setState(137); titratingDirection();
			setState(138); titratingStart();
			setState(139); titratingStop();
			setState(140); titratingChange();
			setState(141); titratingInterval();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TitratingDirectionContext extends ParserRuleContext {
		public TitratingDirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titratingDirection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterTitratingDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitTitratingDirection(this);
		}
	}

	public final TitratingDirectionContext titratingDirection() throws RecognitionException {
		TitratingDirectionContext _localctx = new TitratingDirectionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_titratingDirection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__5) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TitratingStopContext extends ParserRuleContext {
		public DoseAtomContext doseAtom() {
			return getRuleContext(DoseAtomContext.class,0);
		}
		public TitratingStopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titratingStop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterTitratingStop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitTitratingStop(this);
		}
	}

	public final TitratingStopContext titratingStop() throws RecognitionException {
		TitratingStopContext _localctx = new TitratingStopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_titratingStop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); match(T__15);
			setState(146); doseAtom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TitratingStartContext extends ParserRuleContext {
		public DoseAtomContext doseAtom() {
			return getRuleContext(DoseAtomContext.class,0);
		}
		public TitratingStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titratingStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterTitratingStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitTitratingStart(this);
		}
	}

	public final TitratingStartContext titratingStart() throws RecognitionException {
		TitratingStartContext _localctx = new TitratingStartContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_titratingStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(T__3);
			setState(149); doseAtom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TitratingChangeContext extends ParserRuleContext {
		public DoseAtomContext doseAtom() {
			return getRuleContext(DoseAtomContext.class,0);
		}
		public TitratingChangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titratingChange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterTitratingChange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitTitratingChange(this);
		}
	}

	public final TitratingChangeContext titratingChange() throws RecognitionException {
		TitratingChangeContext _localctx = new TitratingChangeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_titratingChange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(T__12);
			setState(152); doseAtom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TitratingIntervalContext extends ParserRuleContext {
		public DurationUnitContext durationUnit() {
			return getRuleContext(DurationUnitContext.class,0);
		}
		public DurationAmountContext durationAmount() {
			return getRuleContext(DurationAmountContext.class,0);
		}
		public TitratingIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titratingInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterTitratingInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitTitratingInterval(this);
		}
	}

	public final TitratingIntervalContext titratingInterval() throws RecognitionException {
		TitratingIntervalContext _localctx = new TitratingIntervalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_titratingInterval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(T__14);
			setState(156);
			_la = _input.LA(1);
			if (_la==INT || _la==NUMBER) {
				{
				setState(155); durationAmount();
				}
			}

			setState(158); durationUnit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimingContext extends ParserRuleContext {
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public SpecificTimingContext specificTiming() {
			return getRuleContext(SpecificTimingContext.class,0);
		}
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TimingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterTiming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitTiming(this);
		}
	}

	public final TimingContext timing() throws RecognitionException {
		TimingContext _localctx = new TimingContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_timing);
		try {
			setState(173);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160); interval();
				setState(161); specificTiming();
				setState(162); match(T__0);
				setState(163); duration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165); interval();
				setState(166); specificTiming();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168); interval();
				setState(169); match(T__0);
				setState(170); duration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172); interval();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstantContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PrescriptionParser.INT, 0); }
		public InstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterInstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitInstant(this);
		}
	}

	public final InstantContext instant() throws RecognitionException {
		InstantContext _localctx = new InstantContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_instant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecificTimingContext extends ParserRuleContext {
		public InstantContext instant(int i) {
			return getRuleContext(InstantContext.class,i);
		}
		public List<InstantContext> instant() {
			return getRuleContexts(InstantContext.class);
		}
		public SpecificTimingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specificTiming; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterSpecificTiming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitSpecificTiming(this);
		}
	}

	public final SpecificTimingContext specificTiming() throws RecognitionException {
		SpecificTimingContext _localctx = new SpecificTimingContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_specificTiming);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177); match(T__9);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(178); instant();
					setState(179); match(T__11);
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(186); instant();
			setState(187); match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL_MODIFIER() { return getToken(PrescriptionParser.INTERVAL_MODIFIER, 0); }
		public IntervalLengthContext intervalLength() {
			return getRuleContext(IntervalLengthContext.class,0);
		}
		public FrequencyContext frequency() {
			return getRuleContext(FrequencyContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitInterval(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_interval);
		try {
			setState(197);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189); frequency();
				setState(190); intervalLength();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192); frequency();
				setState(193); match(INTERVAL_MODIFIER);
				setState(194); intervalLength();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196); frequency();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrequencyContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PrescriptionParser.INT, 0); }
		public TerminalNode NUMBER() { return getToken(PrescriptionParser.NUMBER, 0); }
		public TerminalNode INTERVAL_FREQ() { return getToken(PrescriptionParser.INTERVAL_FREQ, 0); }
		public FrequencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frequency; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterFrequency(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitFrequency(this);
		}
	}

	public final FrequencyContext frequency() throws RecognitionException {
		FrequencyContext _localctx = new FrequencyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_frequency);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << NUMBER) | (1L << INTERVAL_FREQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalLengthContext extends ParserRuleContext {
		public TerminalNode INTERVAL_LENGTH() { return getToken(PrescriptionParser.INTERVAL_LENGTH, 0); }
		public TerminalNode TIMEUNIT() { return getToken(PrescriptionParser.TIMEUNIT, 0); }
		public TerminalNode TIMEUNIT_PLURAL() { return getToken(PrescriptionParser.TIMEUNIT_PLURAL, 0); }
		public IntervalLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterIntervalLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitIntervalLength(this);
		}
	}

	public final IntervalLengthContext intervalLength() throws RecognitionException {
		IntervalLengthContext _localctx = new IntervalLengthContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_intervalLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMEUNIT) | (1L << TIMEUNIT_PLURAL) | (1L << INTERVAL_LENGTH))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DurationContext extends ParserRuleContext {
		public DurationAmountContext n;
		public DurationUnitContext tu;
		public DurationUnitContext durationUnit() {
			return getRuleContext(DurationUnitContext.class,0);
		}
		public DurationAmountContext durationAmount() {
			return getRuleContext(DurationAmountContext.class,0);
		}
		public DurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitDuration(this);
		}
	}

	public final DurationContext duration() throws RecognitionException {
		DurationContext _localctx = new DurationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_duration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); ((DurationContext)_localctx).n = durationAmount();
			setState(204); ((DurationContext)_localctx).tu = durationUnit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DurationAmountContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PrescriptionParser.INT, 0); }
		public TerminalNode NUMBER() { return getToken(PrescriptionParser.NUMBER, 0); }
		public DurationAmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_durationAmount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterDurationAmount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitDurationAmount(this);
		}
	}

	public final DurationAmountContext durationAmount() throws RecognitionException {
		DurationAmountContext _localctx = new DurationAmountContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_durationAmount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DurationUnitContext extends ParserRuleContext {
		public TerminalNode TIMEUNIT() { return getToken(PrescriptionParser.TIMEUNIT, 0); }
		public TerminalNode TIMEUNIT_PLURAL() { return getToken(PrescriptionParser.TIMEUNIT_PLURAL, 0); }
		public DurationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_durationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterDurationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitDurationUnit(this);
		}
	}

	public final DurationUnitContext durationUnit() throws RecognitionException {
		DurationUnitContext _localctx = new DurationUnitContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_durationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !(_la==TIMEUNIT || _la==TIMEUNIT_PLURAL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u00d5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\6\2:\n\2\r\2\16\2;\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3D\n\3\3\3\3\3\3\3\3\3\3\3\7\3K\n\3\f\3\16\3N\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5e\n\5\3\6\3\6\5\6i\n\6\3\7\6\7l\n\7\r\7\16\7m\3\b\3\b\5\br\n"+
		"\b\3\t\3\t\5\tv\n\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\7\r"+
		"\u0083\n\r\f\r\16\r\u0086\13\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\5\23\u009f\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u00b0\n\24\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\7\26\u00b8\n\26\f\26\16\26\u00bb\13\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u00c8\n\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\34\4\u0084\u00b9\3\4\35\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\7\4\2\t\t\16\16\4\2\24\25"+
		"\31\31\4\2\26\27\33\33\3\2\24\25\3\2\26\27\u00cd\29\3\2\2\2\4C\3\2\2\2"+
		"\6O\3\2\2\2\bd\3\2\2\2\nh\3\2\2\2\fk\3\2\2\2\16q\3\2\2\2\20u\3\2\2\2\22"+
		"w\3\2\2\2\24z\3\2\2\2\26|\3\2\2\2\30~\3\2\2\2\32\u008a\3\2\2\2\34\u0091"+
		"\3\2\2\2\36\u0093\3\2\2\2 \u0096\3\2\2\2\"\u0099\3\2\2\2$\u009c\3\2\2"+
		"\2&\u00af\3\2\2\2(\u00b1\3\2\2\2*\u00b3\3\2\2\2,\u00c7\3\2\2\2.\u00c9"+
		"\3\2\2\2\60\u00cb\3\2\2\2\62\u00cd\3\2\2\2\64\u00d0\3\2\2\2\66\u00d2\3"+
		"\2\2\28:\5\4\3\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\3\3\2\2\2=>"+
		"\b\3\1\2>D\5\6\4\2?@\5\b\5\2@A\7\36\2\2AD\3\2\2\2BD\7\36\2\2C=\3\2\2\2"+
		"C?\3\2\2\2CB\3\2\2\2DL\3\2\2\2EF\f\7\2\2FG\7\3\2\2GK\5\4\3\bHI\f\4\2\2"+
		"IK\7\36\2\2JE\3\2\2\2JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\5\3\2\2"+
		"\2NL\3\2\2\2OP\5\n\6\2PQ\5\f\7\2QR\5\16\b\2RS\5&\24\2S\7\3\2\2\2TU\7\r"+
		"\2\2UV\7\35\2\2VW\7\13\2\2We\5\n\6\2XY\7\22\2\2YZ\7\35\2\2Z[\7\13\2\2"+
		"[e\5\16\b\2\\]\7\17\2\2]^\7\35\2\2^_\7\13\2\2_e\5\f\7\2`a\7\21\2\2ab\7"+
		"\35\2\2bc\7\13\2\2ce\5&\24\2dT\3\2\2\2dX\3\2\2\2d\\\3\2\2\2d`\3\2\2\2"+
		"e\t\3\2\2\2fi\7\35\2\2gi\7\34\2\2hf\3\2\2\2hg\3\2\2\2i\13\3\2\2\2jl\7"+
		"\34\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\r\3\2\2\2or\5\32\16\2"+
		"pr\5\20\t\2qo\3\2\2\2qp\3\2\2\2r\17\3\2\2\2sv\5\30\r\2tv\5\22\n\2us\3"+
		"\2\2\2ut\3\2\2\2v\21\3\2\2\2wx\5\24\13\2xy\5\26\f\2y\23\3\2\2\2z{\7\24"+
		"\2\2{\25\3\2\2\2|}\7\30\2\2}\27\3\2\2\2~\u0084\7\n\2\2\177\u0080\5\22"+
		"\n\2\u0080\u0081\7\b\2\2\u0081\u0083\3\2\2\2\u0082\177\3\2\2\2\u0083\u0086"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0088\5\22\n\2\u0088\u0089\7\6\2\2\u0089\31\3\2\2"+
		"\2\u008a\u008b\7\f\2\2\u008b\u008c\5\34\17\2\u008c\u008d\5 \21\2\u008d"+
		"\u008e\5\36\20\2\u008e\u008f\5\"\22\2\u008f\u0090\5$\23\2\u0090\33\3\2"+
		"\2\2\u0091\u0092\t\2\2\2\u0092\35\3\2\2\2\u0093\u0094\7\4\2\2\u0094\u0095"+
		"\5\22\n\2\u0095\37\3\2\2\2\u0096\u0097\7\20\2\2\u0097\u0098\5\22\n\2\u0098"+
		"!\3\2\2\2\u0099\u009a\7\7\2\2\u009a\u009b\5\22\n\2\u009b#\3\2\2\2\u009c"+
		"\u009e\7\5\2\2\u009d\u009f\5\64\33\2\u009e\u009d\3\2\2\2\u009e\u009f\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\5\66\34\2\u00a1%\3\2\2\2\u00a2"+
		"\u00a3\5,\27\2\u00a3\u00a4\5*\26\2\u00a4\u00a5\7\23\2\2\u00a5\u00a6\5"+
		"\62\32\2\u00a6\u00b0\3\2\2\2\u00a7\u00a8\5,\27\2\u00a8\u00a9\5*\26\2\u00a9"+
		"\u00b0\3\2\2\2\u00aa\u00ab\5,\27\2\u00ab\u00ac\7\23\2\2\u00ac\u00ad\5"+
		"\62\32\2\u00ad\u00b0\3\2\2\2\u00ae\u00b0\5,\27\2\u00af\u00a2\3\2\2\2\u00af"+
		"\u00a7\3\2\2\2\u00af\u00aa\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\'\3\2\2\2"+
		"\u00b1\u00b2\7\24\2\2\u00b2)\3\2\2\2\u00b3\u00b9\7\n\2\2\u00b4\u00b5\5"+
		"(\25\2\u00b5\u00b6\7\b\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\5(\25\2\u00bd\u00be\7\6\2\2\u00be"+
		"+\3\2\2\2\u00bf\u00c0\5.\30\2\u00c0\u00c1\5\60\31\2\u00c1\u00c8\3\2\2"+
		"\2\u00c2\u00c3\5.\30\2\u00c3\u00c4\7\32\2\2\u00c4\u00c5\5\60\31\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c8\5.\30\2\u00c7\u00bf\3\2\2\2\u00c7\u00c2\3\2"+
		"\2\2\u00c7\u00c6\3\2\2\2\u00c8-\3\2\2\2\u00c9\u00ca\t\3\2\2\u00ca/\3\2"+
		"\2\2\u00cb\u00cc\t\4\2\2\u00cc\61\3\2\2\2\u00cd\u00ce\5\64\33\2\u00ce"+
		"\u00cf\5\66\34\2\u00cf\63\3\2\2\2\u00d0\u00d1\t\5\2\2\u00d1\65\3\2\2\2"+
		"\u00d2\u00d3\t\6\2\2\u00d3\67\3\2\2\2\20;CJLdhmqu\u0084\u009e\u00af\u00b9"+
		"\u00c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}