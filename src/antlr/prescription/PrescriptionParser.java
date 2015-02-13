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
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, INT=11, NUMBER=12, TIMEUNIT=13, TIMEUNIT_PLURAL=14, UNIT=15, 
		INTERVAL_FREQ=16, INTERVAL_MODIFIER=17, INTERVAL_LENGTH=18, STRING=19, 
		ID=20, NEWLINE=21, WS=22;
	public static final String[] tokenNames = {
		"<INVALID>", "'ACTION'", "'THEN'", "')'", "'MEDICATION'", "','", "'('", 
		"'='", "'DOSE'", "'TIMING'", "'FOR'", "INT", "NUMBER", "TIMEUNIT", "TIMEUNIT_PLURAL", 
		"UNIT", "INTERVAL_FREQ", "INTERVAL_MODIFIER", "INTERVAL_LENGTH", "STRING", 
		"ID", "NEWLINE", "WS"
	};
	public static final int
		RULE_script = 0, RULE_expr = 1, RULE_atom = 2, RULE_assignment = 3, RULE_action = 4, 
		RULE_medication = 5, RULE_dose = 6, RULE_dose_amount = 7, RULE_dose_unit = 8, 
		RULE_specificDose = 9, RULE_timing = 10, RULE_instant = 11, RULE_specificTiming = 12, 
		RULE_interval = 13, RULE_frequency = 14, RULE_intervalLength = 15, RULE_duration = 16, 
		RULE_duration_amount = 17, RULE_duration_unit = 18;
	public static final String[] ruleNames = {
		"script", "expr", "atom", "assignment", "action", "medication", "dose", 
		"dose_amount", "dose_unit", "specificDose", "timing", "instant", "specificTiming", 
		"interval", "frequency", "intervalLength", "duration", "duration_amount", 
		"duration_unit"
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
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38); expr(0);
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__6) | (1L << T__2) | (1L << T__1) | (1L << STRING) | (1L << ID) | (1L << NEWLINE))) != 0) );
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
			setState(49);
			switch (_input.LA(1)) {
			case STRING:
			case ID:
				{
				setState(44); atom();
				}
				break;
			case T__9:
			case T__6:
			case T__2:
			case T__1:
				{
				setState(45); assignment();
				setState(46); match(NEWLINE);
				}
				break;
			case NEWLINE:
				{
				setState(48); match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(56);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(51);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(52); match(T__8);
						setState(53); expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(54);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(55); match(NEWLINE);
						}
						break;
					}
					} 
				}
				setState(60);
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
			setState(61); ((AtomContext)_localctx).a = action();
			setState(62); ((AtomContext)_localctx).m = medication();
			setState(63); ((AtomContext)_localctx).d = dose();
			setState(64); ((AtomContext)_localctx).t = timing();
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
			setState(82);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(66); match(T__9);
				setState(67); match(ID);
				setState(68); match(T__3);
				setState(69); ((AssignmentContext)_localctx).a = action();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); match(T__2);
				setState(71); match(ID);
				setState(72); match(T__3);
				setState(73); ((AssignmentContext)_localctx).d = dose();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(74); match(T__6);
				setState(75); match(ID);
				setState(76); match(T__3);
				setState(77); ((AssignmentContext)_localctx).m = medication();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(78); match(T__1);
				setState(79); match(ID);
				setState(80); match(T__3);
				setState(81); ((AssignmentContext)_localctx).t = timing();
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
			setState(86);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); match(ID);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); ((ActionContext)_localctx).s = match(STRING);
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
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88); match(STRING);
				}
				}
				setState(91); 
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
		public Dose_amountContext dose_amount() {
			return getRuleContext(Dose_amountContext.class,0);
		}
		public Dose_unitContext dose_unit() {
			return getRuleContext(Dose_unitContext.class,0);
		}
		public SpecificDoseContext specificDose() {
			return getRuleContext(SpecificDoseContext.class,0);
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
			setState(97);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(93); specificDose();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(94); dose_amount();
				setState(95); dose_unit();
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

	public static class Dose_amountContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PrescriptionParser.INT, 0); }
		public Dose_amountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dose_amount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterDose_amount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitDose_amount(this);
		}
	}

	public final Dose_amountContext dose_amount() throws RecognitionException {
		Dose_amountContext _localctx = new Dose_amountContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dose_amount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(INT);
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

	public static class Dose_unitContext extends ParserRuleContext {
		public TerminalNode UNIT() { return getToken(PrescriptionParser.UNIT, 0); }
		public Dose_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dose_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterDose_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitDose_unit(this);
		}
	}

	public final Dose_unitContext dose_unit() throws RecognitionException {
		Dose_unitContext _localctx = new Dose_unitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dose_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(UNIT);
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
		public Dose_unitContext dose_unit(int i) {
			return getRuleContext(Dose_unitContext.class,i);
		}
		public List<Dose_amountContext> dose_amount() {
			return getRuleContexts(Dose_amountContext.class);
		}
		public Dose_amountContext dose_amount(int i) {
			return getRuleContext(Dose_amountContext.class,i);
		}
		public List<Dose_unitContext> dose_unit() {
			return getRuleContexts(Dose_unitContext.class);
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
		enterRule(_localctx, 18, RULE_specificDose);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(T__4);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(104); dose_amount();
					setState(105); dose_unit();
					setState(106); match(T__5);
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(113); dose_amount();
			setState(114); dose_unit();
			setState(115); match(T__7);
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
		enterRule(_localctx, 20, RULE_timing);
		try {
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117); interval();
				setState(118); specificTiming();
				setState(119); match(T__0);
				setState(120); duration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122); interval();
				setState(123); specificTiming();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125); interval();
				setState(126); match(T__0);
				setState(127); duration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129); interval();
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
		enterRule(_localctx, 22, RULE_instant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(INT);
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
		enterRule(_localctx, 24, RULE_specificTiming);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(T__4);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(135); instant();
					setState(136); match(T__5);
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(143); instant();
			setState(144); match(T__7);
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
		enterRule(_localctx, 26, RULE_interval);
		try {
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146); frequency();
				setState(147); intervalLength();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149); frequency();
				setState(150); match(INTERVAL_MODIFIER);
				setState(151); intervalLength();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153); frequency();
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
		enterRule(_localctx, 28, RULE_frequency);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		enterRule(_localctx, 30, RULE_intervalLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
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
		public Duration_amountContext n;
		public Duration_unitContext tu;
		public Duration_amountContext duration_amount() {
			return getRuleContext(Duration_amountContext.class,0);
		}
		public Duration_unitContext duration_unit() {
			return getRuleContext(Duration_unitContext.class,0);
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
		enterRule(_localctx, 32, RULE_duration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); ((DurationContext)_localctx).n = duration_amount();
			setState(161); ((DurationContext)_localctx).tu = duration_unit();
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

	public static class Duration_amountContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PrescriptionParser.INT, 0); }
		public TerminalNode NUMBER() { return getToken(PrescriptionParser.NUMBER, 0); }
		public Duration_amountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duration_amount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterDuration_amount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitDuration_amount(this);
		}
	}

	public final Duration_amountContext duration_amount() throws RecognitionException {
		Duration_amountContext _localctx = new Duration_amountContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_duration_amount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
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

	public static class Duration_unitContext extends ParserRuleContext {
		public TerminalNode TIMEUNIT() { return getToken(PrescriptionParser.TIMEUNIT, 0); }
		public TerminalNode TIMEUNIT_PLURAL() { return getToken(PrescriptionParser.TIMEUNIT_PLURAL, 0); }
		public Duration_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duration_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterDuration_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitDuration_unit(this);
		}
	}

	public final Duration_unitContext duration_unit() throws RecognitionException {
		Duration_unitContext _localctx = new Duration_unitContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_duration_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u00aa\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\64\n\3\3\3\3\3\3\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5U\n\5\3\6\3\6\5\6Y\n\6\3\7\6\7\\\n\7\r\7\16\7]\3\b\3\b\3\b\3\b\5\bd"+
		"\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13o\n\13\f\13\16\13r\13"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u0085\n\f\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u008d\n\16\f\16"+
		"\16\16\u0090\13\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u009d\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\4p\u008e\3\4\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&\2\6\4\2\r\16\22\22\4\2\17\20\24\24\3\2\r\16\3\2\17\20\u00a8\2)\3\2\2"+
		"\2\4\63\3\2\2\2\6?\3\2\2\2\bT\3\2\2\2\nX\3\2\2\2\f[\3\2\2\2\16c\3\2\2"+
		"\2\20e\3\2\2\2\22g\3\2\2\2\24i\3\2\2\2\26\u0084\3\2\2\2\30\u0086\3\2\2"+
		"\2\32\u0088\3\2\2\2\34\u009c\3\2\2\2\36\u009e\3\2\2\2 \u00a0\3\2\2\2\""+
		"\u00a2\3\2\2\2$\u00a5\3\2\2\2&\u00a7\3\2\2\2(*\5\4\3\2)(\3\2\2\2*+\3\2"+
		"\2\2+)\3\2\2\2+,\3\2\2\2,\3\3\2\2\2-.\b\3\1\2.\64\5\6\4\2/\60\5\b\5\2"+
		"\60\61\7\27\2\2\61\64\3\2\2\2\62\64\7\27\2\2\63-\3\2\2\2\63/\3\2\2\2\63"+
		"\62\3\2\2\2\64<\3\2\2\2\65\66\f\7\2\2\66\67\7\4\2\2\67;\5\4\3\b89\f\4"+
		"\2\29;\7\27\2\2:\65\3\2\2\2:8\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\5"+
		"\3\2\2\2><\3\2\2\2?@\5\n\6\2@A\5\f\7\2AB\5\16\b\2BC\5\26\f\2C\7\3\2\2"+
		"\2DE\7\3\2\2EF\7\26\2\2FG\7\t\2\2GU\5\n\6\2HI\7\n\2\2IJ\7\26\2\2JK\7\t"+
		"\2\2KU\5\16\b\2LM\7\6\2\2MN\7\26\2\2NO\7\t\2\2OU\5\f\7\2PQ\7\13\2\2QR"+
		"\7\26\2\2RS\7\t\2\2SU\5\26\f\2TD\3\2\2\2TH\3\2\2\2TL\3\2\2\2TP\3\2\2\2"+
		"U\t\3\2\2\2VY\7\26\2\2WY\7\25\2\2XV\3\2\2\2XW\3\2\2\2Y\13\3\2\2\2Z\\\7"+
		"\25\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\r\3\2\2\2_d\5\24\13"+
		"\2`a\5\20\t\2ab\5\22\n\2bd\3\2\2\2c_\3\2\2\2c`\3\2\2\2d\17\3\2\2\2ef\7"+
		"\r\2\2f\21\3\2\2\2gh\7\21\2\2h\23\3\2\2\2ip\7\b\2\2jk\5\20\t\2kl\5\22"+
		"\n\2lm\7\7\2\2mo\3\2\2\2nj\3\2\2\2or\3\2\2\2pq\3\2\2\2pn\3\2\2\2qs\3\2"+
		"\2\2rp\3\2\2\2st\5\20\t\2tu\5\22\n\2uv\7\5\2\2v\25\3\2\2\2wx\5\34\17\2"+
		"xy\5\32\16\2yz\7\f\2\2z{\5\"\22\2{\u0085\3\2\2\2|}\5\34\17\2}~\5\32\16"+
		"\2~\u0085\3\2\2\2\177\u0080\5\34\17\2\u0080\u0081\7\f\2\2\u0081\u0082"+
		"\5\"\22\2\u0082\u0085\3\2\2\2\u0083\u0085\5\34\17\2\u0084w\3\2\2\2\u0084"+
		"|\3\2\2\2\u0084\177\3\2\2\2\u0084\u0083\3\2\2\2\u0085\27\3\2\2\2\u0086"+
		"\u0087\7\r\2\2\u0087\31\3\2\2\2\u0088\u008e\7\b\2\2\u0089\u008a\5\30\r"+
		"\2\u008a\u008b\7\7\2\2\u008b\u008d\3\2\2\2\u008c\u0089\3\2\2\2\u008d\u0090"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0092\5\30\r\2\u0092\u0093\7\5\2\2\u0093\33\3\2\2"+
		"\2\u0094\u0095\5\36\20\2\u0095\u0096\5 \21\2\u0096\u009d\3\2\2\2\u0097"+
		"\u0098\5\36\20\2\u0098\u0099\7\23\2\2\u0099\u009a\5 \21\2\u009a\u009d"+
		"\3\2\2\2\u009b\u009d\5\36\20\2\u009c\u0094\3\2\2\2\u009c\u0097\3\2\2\2"+
		"\u009c\u009b\3\2\2\2\u009d\35\3\2\2\2\u009e\u009f\t\2\2\2\u009f\37\3\2"+
		"\2\2\u00a0\u00a1\t\3\2\2\u00a1!\3\2\2\2\u00a2\u00a3\5$\23\2\u00a3\u00a4"+
		"\5&\24\2\u00a4#\3\2\2\2\u00a5\u00a6\t\4\2\2\u00a6%\3\2\2\2\u00a7\u00a8"+
		"\t\5\2\2\u00a8\'\3\2\2\2\16+\63:<TX]cp\u0084\u008e\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}