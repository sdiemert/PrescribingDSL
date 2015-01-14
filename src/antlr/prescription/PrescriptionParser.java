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
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, INT=13, NUMBER=14, TIMEUNIT=15, TIMEUNIT_PLURAL=16, 
		UNIT=17, INTERVAL_FREQ=18, INTERVAL_MODIFIER=19, INTERVAL_LENGTH=20, STRING=21, 
		ID=22, NEWLINE=23, WS=24;
	public static final String[] tokenNames = {
		"<INVALID>", "'ACTION'", "'THEN'", "'kg'", "'MEDICATION'", "'ng'", "'='", 
		"'mg'", "'mcg'", "'DOSE'", "'TIMING'", "'FOR'", "'g'", "INT", "NUMBER", 
		"TIMEUNIT", "TIMEUNIT_PLURAL", "UNIT", "INTERVAL_FREQ", "INTERVAL_MODIFIER", 
		"INTERVAL_LENGTH", "STRING", "ID", "NEWLINE", "WS"
	};
	public static final int
		RULE_script = 0, RULE_expr = 1, RULE_assignment = 2, RULE_action = 3, 
		RULE_medication = 4, RULE_dose = 5, RULE_timing = 6, RULE_interval = 7, 
		RULE_duration = 8;
	public static final String[] ruleNames = {
		"script", "expr", "assignment", "action", "medication", "dose", "timing", 
		"interval", "duration"
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
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18); expr(0);
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__8) | (1L << T__3) | (1L << T__2) | (1L << STRING) | (1L << ID) | (1L << NEWLINE))) != 0) );
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
		public ActionContext a;
		public MedicationContext m;
		public DoseContext d;
		public TimingContext t;
		public TerminalNode NEWLINE() { return getToken(PrescriptionParser.NEWLINE, 0); }
		public DoseContext dose() {
			return getRuleContext(DoseContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
			setState(33);
			switch (_input.LA(1)) {
			case T__11:
			case T__8:
			case T__3:
			case T__2:
				{
				setState(24); assignment();
				setState(25); match(NEWLINE);
				}
				break;
			case STRING:
			case ID:
				{
				setState(27); ((ExprContext)_localctx).a = action();
				setState(28); ((ExprContext)_localctx).m = medication();
				setState(29); ((ExprContext)_localctx).d = dose();
				setState(30); ((ExprContext)_localctx).t = timing();
				}
				break;
			case NEWLINE:
				{
				setState(32); match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(40);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(35);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(36); match(T__10);
						setState(37); expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(38);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(39); match(NEWLINE);
						}
						break;
					}
					} 
				}
				setState(44);
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
		enterRule(_localctx, 4, RULE_assignment);
		try {
			setState(61);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(45); match(T__11);
				setState(46); match(ID);
				setState(47); match(T__6);
				setState(48); ((AssignmentContext)_localctx).a = action();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); match(T__3);
				setState(50); match(ID);
				setState(51); match(T__6);
				setState(52); ((AssignmentContext)_localctx).d = dose();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(53); match(T__8);
				setState(54); match(ID);
				setState(55); match(T__6);
				setState(56); ((AssignmentContext)_localctx).m = medication();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(57); match(T__2);
				setState(58); match(ID);
				setState(59); match(T__6);
				setState(60); ((AssignmentContext)_localctx).t = timing();
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
		enterRule(_localctx, 6, RULE_action);
		try {
			setState(65);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(63); match(ID);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(64); ((ActionContext)_localctx).s = match(STRING);
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
		enterRule(_localctx, 8, RULE_medication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); ((MedicationContext)_localctx).s = match(STRING);
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
		public Token u;
		public TerminalNode INT() { return getToken(PrescriptionParser.INT, 0); }
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
		enterRule(_localctx, 10, RULE_dose);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(INT);
			setState(70);
			((DoseContext)_localctx).u = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__7) | (1L << T__5) | (1L << T__4) | (1L << T__0))) != 0)) ) {
				((DoseContext)_localctx).u = (Token)_errHandler.recoverInline(this);
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
		enterRule(_localctx, 12, RULE_timing);
		try {
			setState(77);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); interval();
				setState(73); match(T__1);
				setState(74); duration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); interval();
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
		public TerminalNode INTERVAL_LENGTH() { return getToken(PrescriptionParser.INTERVAL_LENGTH, 0); }
		public TerminalNode INT() { return getToken(PrescriptionParser.INT, 0); }
		public TerminalNode TIMEUNIT() { return getToken(PrescriptionParser.TIMEUNIT, 0); }
		public TerminalNode TIMEUNIT_PLURAL() { return getToken(PrescriptionParser.TIMEUNIT_PLURAL, 0); }
		public TerminalNode NUMBER() { return getToken(PrescriptionParser.NUMBER, 0); }
		public TerminalNode INTERVAL_FREQ() { return getToken(PrescriptionParser.INTERVAL_FREQ, 0); }
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
		enterRule(_localctx, 14, RULE_interval);
		int _la;
		try {
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << NUMBER) | (1L << INTERVAL_FREQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(80);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMEUNIT) | (1L << TIMEUNIT_PLURAL) | (1L << INTERVAL_LENGTH))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << NUMBER) | (1L << INTERVAL_FREQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(82); match(INTERVAL_MODIFIER);
				setState(83);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMEUNIT) | (1L << TIMEUNIT_PLURAL) | (1L << INTERVAL_LENGTH))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << NUMBER) | (1L << INTERVAL_FREQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class DurationContext extends ParserRuleContext {
		public Token n;
		public Token tu;
		public TerminalNode INT() { return getToken(PrescriptionParser.INT, 0); }
		public TerminalNode TIMEUNIT() { return getToken(PrescriptionParser.TIMEUNIT, 0); }
		public TerminalNode NUMBER() { return getToken(PrescriptionParser.NUMBER, 0); }
		public TerminalNode TIMEUNIT_PLURAL() { return getToken(PrescriptionParser.TIMEUNIT_PLURAL, 0); }
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
		enterRule(_localctx, 16, RULE_duration);
		int _la;
		try {
			setState(91);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				((DurationContext)_localctx).n = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==NUMBER) ) {
					((DurationContext)_localctx).n = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(88); ((DurationContext)_localctx).tu = match(TIMEUNIT_PLURAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				((DurationContext)_localctx).n = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==NUMBER) ) {
					((DurationContext)_localctx).n = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(90); ((DurationContext)_localctx).tu = match(TIMEUNIT);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32`\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3$\n\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\5\5D\n\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bP\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tX\n"+
		"\t\3\n\3\n\3\n\3\n\5\n^\n\n\3\n\2\3\4\13\2\4\6\b\n\f\16\20\22\2\6\6\2"+
		"\5\5\7\7\t\n\16\16\4\2\17\20\24\24\4\2\21\22\26\26\3\2\17\20c\2\25\3\2"+
		"\2\2\4#\3\2\2\2\6?\3\2\2\2\bC\3\2\2\2\nE\3\2\2\2\fG\3\2\2\2\16O\3\2\2"+
		"\2\20W\3\2\2\2\22]\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\27\3\2\2\2\27"+
		"\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\32\b\3\1\2\32\33\5\6\4\2\33"+
		"\34\7\31\2\2\34$\3\2\2\2\35\36\5\b\5\2\36\37\5\n\6\2\37 \5\f\7\2 !\5\16"+
		"\b\2!$\3\2\2\2\"$\7\31\2\2#\31\3\2\2\2#\35\3\2\2\2#\"\3\2\2\2$,\3\2\2"+
		"\2%&\f\7\2\2&\'\7\4\2\2\'+\5\4\3\b()\f\4\2\2)+\7\31\2\2*%\3\2\2\2*(\3"+
		"\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\5\3\2\2\2.,\3\2\2\2/\60\7\3\2\2"+
		"\60\61\7\30\2\2\61\62\7\b\2\2\62@\5\b\5\2\63\64\7\13\2\2\64\65\7\30\2"+
		"\2\65\66\7\b\2\2\66@\5\f\7\2\678\7\6\2\289\7\30\2\29:\7\b\2\2:@\5\n\6"+
		"\2;<\7\f\2\2<=\7\30\2\2=>\7\b\2\2>@\5\16\b\2?/\3\2\2\2?\63\3\2\2\2?\67"+
		"\3\2\2\2?;\3\2\2\2@\7\3\2\2\2AD\7\30\2\2BD\7\27\2\2CA\3\2\2\2CB\3\2\2"+
		"\2D\t\3\2\2\2EF\7\27\2\2F\13\3\2\2\2GH\7\17\2\2HI\t\2\2\2I\r\3\2\2\2J"+
		"K\5\20\t\2KL\7\r\2\2LM\5\22\n\2MP\3\2\2\2NP\5\20\t\2OJ\3\2\2\2ON\3\2\2"+
		"\2P\17\3\2\2\2QR\t\3\2\2RX\t\4\2\2ST\t\3\2\2TU\7\25\2\2UX\t\4\2\2VX\t"+
		"\3\2\2WQ\3\2\2\2WS\3\2\2\2WV\3\2\2\2X\21\3\2\2\2YZ\t\5\2\2Z^\7\22\2\2"+
		"[\\\t\5\2\2\\^\7\21\2\2]Y\3\2\2\2][\3\2\2\2^\23\3\2\2\2\13\27#*,?COW]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}