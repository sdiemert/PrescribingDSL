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
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, INT=8, NUMBER=9, 
		TIMEUNIT=10, TIMEUNIT_PLURAL=11, UNIT=12, INTERVAL_FREQ=13, INTERVAL_MODIFIER=14, 
		INTERVAL_LENGTH=15, STRING=16, ID=17, NEWLINE=18, WS=19;
	public static final String[] tokenNames = {
		"<INVALID>", "'ACTION'", "'THEN'", "'MEDICATION'", "'='", "'DOSE'", "'TIMING'", 
		"'FOR'", "INT", "NUMBER", "TIMEUNIT", "TIMEUNIT_PLURAL", "UNIT", "INTERVAL_FREQ", 
		"INTERVAL_MODIFIER", "INTERVAL_LENGTH", "STRING", "ID", "NEWLINE", "WS"
	};
	public static final int
		RULE_script = 0, RULE_expr = 1, RULE_atom = 2, RULE_assignment = 3, RULE_action = 4, 
		RULE_medication = 5, RULE_dose = 6, RULE_dose_amount = 7, RULE_dose_unit = 8, 
		RULE_timing = 9, RULE_interval = 10, RULE_frequency = 11, RULE_interval_length = 12, 
		RULE_duration = 13, RULE_duration_amount = 14, RULE_duration_unit = 15;
	public static final String[] ruleNames = {
		"script", "expr", "atom", "assignment", "action", "medication", "dose", 
		"dose_amount", "dose_unit", "timing", "interval", "frequency", "interval_length", 
		"duration", "duration_amount", "duration_unit"
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
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32); expr(0);
				}
				}
				setState(35); 
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
			setState(43);
			switch (_input.LA(1)) {
			case STRING:
			case ID:
				{
				setState(38); atom();
				}
				break;
			case T__6:
			case T__4:
			case T__2:
			case T__1:
				{
				setState(39); assignment();
				setState(40); match(NEWLINE);
				}
				break;
			case NEWLINE:
				{
				setState(42); match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(50);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(45);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(46); match(T__5);
						setState(47); expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(48);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(49); match(NEWLINE);
						}
						break;
					}
					} 
				}
				setState(54);
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
			setState(55); ((AtomContext)_localctx).a = action();
			setState(56); ((AtomContext)_localctx).m = medication();
			setState(57); ((AtomContext)_localctx).d = dose();
			setState(58); ((AtomContext)_localctx).t = timing();
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
			setState(76);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(60); match(T__6);
				setState(61); match(ID);
				setState(62); match(T__3);
				setState(63); ((AssignmentContext)_localctx).a = action();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64); match(T__2);
				setState(65); match(ID);
				setState(66); match(T__3);
				setState(67); ((AssignmentContext)_localctx).d = dose();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(68); match(T__4);
				setState(69); match(ID);
				setState(70); match(T__3);
				setState(71); ((AssignmentContext)_localctx).m = medication();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(72); match(T__1);
				setState(73); match(ID);
				setState(74); match(T__3);
				setState(75); ((AssignmentContext)_localctx).t = timing();
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
			setState(80);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); match(ID);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); ((ActionContext)_localctx).s = match(STRING);
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
		public Token s;
		public TerminalNode STRING() { return getToken(PrescriptionParser.STRING, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); ((MedicationContext)_localctx).s = match(STRING);
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
		public Dose_unitContext u;
		public Dose_amountContext dose_amount() {
			return getRuleContext(Dose_amountContext.class,0);
		}
		public Dose_unitContext dose_unit() {
			return getRuleContext(Dose_unitContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(84); dose_amount();
			setState(85); ((DoseContext)_localctx).u = dose_unit();
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
			setState(87); match(INT);
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
			setState(89); match(UNIT);
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
		enterRule(_localctx, 18, RULE_timing);
		try {
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91); interval();
				setState(92); match(T__0);
				setState(93); duration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95); interval();
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

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL_MODIFIER() { return getToken(PrescriptionParser.INTERVAL_MODIFIER, 0); }
		public FrequencyContext frequency() {
			return getRuleContext(FrequencyContext.class,0);
		}
		public Interval_lengthContext interval_length() {
			return getRuleContext(Interval_lengthContext.class,0);
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
		enterRule(_localctx, 20, RULE_interval);
		try {
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); frequency();
				setState(99); interval_length();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101); frequency();
				setState(102); match(INTERVAL_MODIFIER);
				setState(103); interval_length();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105); frequency();
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
		enterRule(_localctx, 22, RULE_frequency);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
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

	public static class Interval_lengthContext extends ParserRuleContext {
		public TerminalNode INTERVAL_LENGTH() { return getToken(PrescriptionParser.INTERVAL_LENGTH, 0); }
		public TerminalNode TIMEUNIT() { return getToken(PrescriptionParser.TIMEUNIT, 0); }
		public TerminalNode TIMEUNIT_PLURAL() { return getToken(PrescriptionParser.TIMEUNIT_PLURAL, 0); }
		public Interval_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterInterval_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitInterval_length(this);
		}
	}

	public final Interval_lengthContext interval_length() throws RecognitionException {
		Interval_lengthContext _localctx = new Interval_lengthContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interval_length);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
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
		enterRule(_localctx, 26, RULE_duration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); ((DurationContext)_localctx).n = duration_amount();
			setState(113); ((DurationContext)_localctx).tu = duration_unit();
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
		enterRule(_localctx, 28, RULE_duration_amount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
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
		enterRule(_localctx, 30, RULE_duration_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2$\n\2\r"+
		"\2\16\2%\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\3\3\3\3\3\3\3\3\3\7\3\65\n"+
		"\3\f\3\16\38\13\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6\5\6S\n\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13c\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\fm\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\2\3\4\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\2\6\4\2\n\13\17\17\4\2\f\r\21\21\3\2\n\13\3\2\f\ru\2#\3\2\2\2\4-\3\2"+
		"\2\2\69\3\2\2\2\bN\3\2\2\2\nR\3\2\2\2\fT\3\2\2\2\16V\3\2\2\2\20Y\3\2\2"+
		"\2\22[\3\2\2\2\24b\3\2\2\2\26l\3\2\2\2\30n\3\2\2\2\32p\3\2\2\2\34r\3\2"+
		"\2\2\36u\3\2\2\2 w\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%"+
		"&\3\2\2\2&\3\3\2\2\2\'(\b\3\1\2(.\5\6\4\2)*\5\b\5\2*+\7\24\2\2+.\3\2\2"+
		"\2,.\7\24\2\2-\'\3\2\2\2-)\3\2\2\2-,\3\2\2\2.\66\3\2\2\2/\60\f\7\2\2\60"+
		"\61\7\4\2\2\61\65\5\4\3\b\62\63\f\4\2\2\63\65\7\24\2\2\64/\3\2\2\2\64"+
		"\62\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\5\3\2\2\28\66\3"+
		"\2\2\29:\5\n\6\2:;\5\f\7\2;<\5\16\b\2<=\5\24\13\2=\7\3\2\2\2>?\7\3\2\2"+
		"?@\7\23\2\2@A\7\6\2\2AO\5\n\6\2BC\7\7\2\2CD\7\23\2\2DE\7\6\2\2EO\5\16"+
		"\b\2FG\7\5\2\2GH\7\23\2\2HI\7\6\2\2IO\5\f\7\2JK\7\b\2\2KL\7\23\2\2LM\7"+
		"\6\2\2MO\5\24\13\2N>\3\2\2\2NB\3\2\2\2NF\3\2\2\2NJ\3\2\2\2O\t\3\2\2\2"+
		"PS\7\23\2\2QS\7\22\2\2RP\3\2\2\2RQ\3\2\2\2S\13\3\2\2\2TU\7\22\2\2U\r\3"+
		"\2\2\2VW\5\20\t\2WX\5\22\n\2X\17\3\2\2\2YZ\7\n\2\2Z\21\3\2\2\2[\\\7\16"+
		"\2\2\\\23\3\2\2\2]^\5\26\f\2^_\7\t\2\2_`\5\34\17\2`c\3\2\2\2ac\5\26\f"+
		"\2b]\3\2\2\2ba\3\2\2\2c\25\3\2\2\2de\5\30\r\2ef\5\32\16\2fm\3\2\2\2gh"+
		"\5\30\r\2hi\7\20\2\2ij\5\32\16\2jm\3\2\2\2km\5\30\r\2ld\3\2\2\2lg\3\2"+
		"\2\2lk\3\2\2\2m\27\3\2\2\2no\t\2\2\2o\31\3\2\2\2pq\t\3\2\2q\33\3\2\2\2"+
		"rs\5\36\20\2st\5 \21\2t\35\3\2\2\2uv\t\4\2\2v\37\3\2\2\2wx\t\5\2\2x!\3"+
		"\2\2\2\n%-\64\66NRbl";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}