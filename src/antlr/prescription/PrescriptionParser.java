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
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, INT=15, NUMBER=16, TIMEUNIT=17, 
		TIMEUNIT_PLURAL=18, UNIT=19, INTERVAL_FREQ=20, INTERVAL_MODIFIER=21, INTERVAL_LENGTH=22, 
		STRING=23, ID=24, NEWLINE=25, WS=26, D=27;
	public static final String[] tokenNames = {
		"<INVALID>", "'THEN'", "'TO'", "'per'", "'BY'", "')'", "','", "'down'", 
		"'('", "'TITRATE'", "'REPEAT'", "'up'", "'FROM'", "'REPEATS'", "'FOR'", 
		"INT", "NUMBER", "TIMEUNIT", "TIMEUNIT_PLURAL", "UNIT", "INTERVAL_FREQ", 
		"INTERVAL_MODIFIER", "INTERVAL_LENGTH", "STRING", "ID", "NEWLINE", "WS", 
		"D"
	};
	public static final int
		RULE_script = 0, RULE_expr = 1, RULE_repeat = 2, RULE_repeatValue = 3, 
		RULE_atom = 4, RULE_action = 5, RULE_medication = 6, RULE_dose = 7, RULE_fixedDose = 8, 
		RULE_doseAtom = 9, RULE_doseAmount = 10, RULE_doseUnit = 11, RULE_specificDose = 12, 
		RULE_titratingDose = 13, RULE_titratingDirection = 14, RULE_titratingStop = 15, 
		RULE_titratingStart = 16, RULE_titratingChange = 17, RULE_titratingInterval = 18, 
		RULE_timing = 19, RULE_instant = 20, RULE_specificTiming = 21, RULE_interval = 22, 
		RULE_frequency = 23, RULE_intervalLength = 24, RULE_duration = 25, RULE_durationAmount = 26, 
		RULE_durationUnit = 27;
	public static final String[] ruleNames = {
		"script", "expr", "repeat", "repeatValue", "atom", "action", "medication", 
		"dose", "fixedDose", "doseAtom", "doseAmount", "doseUnit", "specificDose", 
		"titratingDose", "titratingDirection", "titratingStop", "titratingStart", 
		"titratingChange", "titratingInterval", "timing", "instant", "specificTiming", 
		"interval", "frequency", "intervalLength", "duration", "durationAmount", 
		"durationUnit"
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
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56); expr(0);
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NEWLINE) | (1L << D))) != 0) );
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
			setState(64);
			switch (_input.LA(1)) {
			case STRING:
			case D:
				{
				setState(62); atom();
				}
				break;
			case NEWLINE:
				{
				setState(63); match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(71);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(66);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(67); match(T__13);
						setState(68); expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(69);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(70); match(NEWLINE);
						}
						break;
					}
					} 
				}
				setState(75);
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

	public static class RepeatContext extends ParserRuleContext {
		public RepeatValueContext repeatValue() {
			return getRuleContext(RepeatValueContext.class,0);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitRepeat(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_repeat);
		try {
			setState(81);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); match(T__4);
				setState(77); repeatValue();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(78); repeatValue();
				setState(79); match(T__1);
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

	public static class RepeatValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PrescriptionParser.INT, 0); }
		public RepeatValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).enterRepeatValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrescriptionListener ) ((PrescriptionListener)listener).exitRepeatValue(this);
		}
	}

	public final RepeatValueContext repeatValue() throws RecognitionException {
		RepeatValueContext _localctx = new RepeatValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_repeatValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(INT);
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

	public static class AtomContext extends ParserRuleContext {
		public DoseContext dose() {
			return getRuleContext(DoseContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
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
		enterRule(_localctx, 8, RULE_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); action();
			setState(86); medication();
			setState(87); dose();
			setState(88); timing();
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(89); repeat();
				}
				break;
			}
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
		public TerminalNode D() { return getToken(PrescriptionParser.D, 0); }
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
		enterRule(_localctx, 10, RULE_action);
		try {
			setState(94);
			switch (_input.LA(1)) {
			case D:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); match(D);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); ((ActionContext)_localctx).s = match(STRING);
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
		enterRule(_localctx, 12, RULE_medication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96); match(STRING);
				}
				}
				setState(99); 
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
		enterRule(_localctx, 14, RULE_dose);
		try {
			setState(103);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); titratingDose();
				}
				break;
			case T__6:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); fixedDose();
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
		enterRule(_localctx, 16, RULE_fixedDose);
		try {
			setState(107);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); specificDose();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); doseAtom();
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
		enterRule(_localctx, 18, RULE_doseAtom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); doseAmount();
			setState(110); doseUnit();
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
		enterRule(_localctx, 20, RULE_doseAmount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(INT);
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
		enterRule(_localctx, 22, RULE_doseUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(UNIT);
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
		enterRule(_localctx, 24, RULE_specificDose);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(T__6);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(117); doseAtom();
					setState(118); match(T__8);
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(125); doseAtom();
			setState(126); match(T__9);
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
		enterRule(_localctx, 26, RULE_titratingDose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(T__5);
			setState(129); titratingDirection();
			setState(130); titratingStart();
			setState(131); titratingStop();
			setState(132); titratingChange();
			setState(133); titratingInterval();
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
		enterRule(_localctx, 28, RULE_titratingDirection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__3) ) {
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
		enterRule(_localctx, 30, RULE_titratingStop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(T__12);
			setState(138); doseAtom();
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
		enterRule(_localctx, 32, RULE_titratingStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(T__2);
			setState(141); doseAtom();
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
		enterRule(_localctx, 34, RULE_titratingChange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(T__10);
			setState(144); doseAtom();
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
		enterRule(_localctx, 36, RULE_titratingInterval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(T__11);
			setState(148);
			_la = _input.LA(1);
			if (_la==INT || _la==NUMBER) {
				{
				setState(147); durationAmount();
				}
			}

			setState(150); durationUnit();
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
		enterRule(_localctx, 38, RULE_timing);
		try {
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152); interval();
				setState(153); specificTiming();
				setState(154); match(T__0);
				setState(155); duration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157); interval();
				setState(158); specificTiming();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160); interval();
				setState(161); match(T__0);
				setState(162); duration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(164); interval();
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
		enterRule(_localctx, 40, RULE_instant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(INT);
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
		enterRule(_localctx, 42, RULE_specificTiming);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(T__6);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(170); instant();
					setState(171); match(T__8);
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(178); instant();
			setState(179); match(T__9);
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
		enterRule(_localctx, 44, RULE_interval);
		try {
			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); frequency();
				setState(182); intervalLength();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184); frequency();
				setState(185); match(INTERVAL_MODIFIER);
				setState(186); intervalLength();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188); frequency();
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
		enterRule(_localctx, 46, RULE_frequency);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
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
		enterRule(_localctx, 48, RULE_intervalLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
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
		enterRule(_localctx, 50, RULE_duration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); durationAmount();
			setState(196); durationUnit();
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
		enterRule(_localctx, 52, RULE_durationAmount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
		enterRule(_localctx, 54, RULE_durationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
		case 0: return precpred(_ctx, 4);
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u00cd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\6\2<\n\2\r\2\16\2=\3\3\3"+
		"\3\3\3\5\3C\n\3\3\3\3\3\3\3\3\3\3\3\7\3J\n\3\f\3\16\3M\13\3\3\4\3\4\3"+
		"\4\3\4\3\4\5\4T\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\7\3\7\5\7a"+
		"\n\7\3\b\6\bd\n\b\r\b\16\be\3\t\3\t\5\tj\n\t\3\n\3\n\5\nn\n\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\7\16{\n\16\f\16\16\16~\13\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\5\24\u0097\n\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u00a8\n\25\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00b0\n\27\f\27\16\27\u00b3"+
		"\13\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00c0"+
		"\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\4|\u00b1"+
		"\3\4\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2"+
		"\7\4\2\t\t\r\r\4\2\21\22\26\26\4\2\23\24\30\30\3\2\21\22\3\2\23\24\u00c2"+
		"\2;\3\2\2\2\4B\3\2\2\2\6S\3\2\2\2\bU\3\2\2\2\nW\3\2\2\2\f`\3\2\2\2\16"+
		"c\3\2\2\2\20i\3\2\2\2\22m\3\2\2\2\24o\3\2\2\2\26r\3\2\2\2\30t\3\2\2\2"+
		"\32v\3\2\2\2\34\u0082\3\2\2\2\36\u0089\3\2\2\2 \u008b\3\2\2\2\"\u008e"+
		"\3\2\2\2$\u0091\3\2\2\2&\u0094\3\2\2\2(\u00a7\3\2\2\2*\u00a9\3\2\2\2,"+
		"\u00ab\3\2\2\2.\u00bf\3\2\2\2\60\u00c1\3\2\2\2\62\u00c3\3\2\2\2\64\u00c5"+
		"\3\2\2\2\66\u00c8\3\2\2\28\u00ca\3\2\2\2:<\5\4\3\2;:\3\2\2\2<=\3\2\2\2"+
		"=;\3\2\2\2=>\3\2\2\2>\3\3\2\2\2?@\b\3\1\2@C\5\n\6\2AC\7\33\2\2B?\3\2\2"+
		"\2BA\3\2\2\2CK\3\2\2\2DE\f\6\2\2EF\7\3\2\2FJ\5\4\3\7GH\f\4\2\2HJ\7\33"+
		"\2\2ID\3\2\2\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\5\3\2\2\2MK\3"+
		"\2\2\2NO\7\f\2\2OT\5\b\5\2PQ\5\b\5\2QR\7\17\2\2RT\3\2\2\2SN\3\2\2\2SP"+
		"\3\2\2\2T\7\3\2\2\2UV\7\21\2\2V\t\3\2\2\2WX\5\f\7\2XY\5\16\b\2YZ\5\20"+
		"\t\2Z\\\5(\25\2[]\5\6\4\2\\[\3\2\2\2\\]\3\2\2\2]\13\3\2\2\2^a\7\35\2\2"+
		"_a\7\31\2\2`^\3\2\2\2`_\3\2\2\2a\r\3\2\2\2bd\7\31\2\2cb\3\2\2\2de\3\2"+
		"\2\2ec\3\2\2\2ef\3\2\2\2f\17\3\2\2\2gj\5\34\17\2hj\5\22\n\2ig\3\2\2\2"+
		"ih\3\2\2\2j\21\3\2\2\2kn\5\32\16\2ln\5\24\13\2mk\3\2\2\2ml\3\2\2\2n\23"+
		"\3\2\2\2op\5\26\f\2pq\5\30\r\2q\25\3\2\2\2rs\7\21\2\2s\27\3\2\2\2tu\7"+
		"\25\2\2u\31\3\2\2\2v|\7\n\2\2wx\5\24\13\2xy\7\b\2\2y{\3\2\2\2zw\3\2\2"+
		"\2{~\3\2\2\2|}\3\2\2\2|z\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\5\24"+
		"\13\2\u0080\u0081\7\7\2\2\u0081\33\3\2\2\2\u0082\u0083\7\13\2\2\u0083"+
		"\u0084\5\36\20\2\u0084\u0085\5\"\22\2\u0085\u0086\5 \21\2\u0086\u0087"+
		"\5$\23\2\u0087\u0088\5&\24\2\u0088\35\3\2\2\2\u0089\u008a\t\2\2\2\u008a"+
		"\37\3\2\2\2\u008b\u008c\7\4\2\2\u008c\u008d\5\24\13\2\u008d!\3\2\2\2\u008e"+
		"\u008f\7\16\2\2\u008f\u0090\5\24\13\2\u0090#\3\2\2\2\u0091\u0092\7\6\2"+
		"\2\u0092\u0093\5\24\13\2\u0093%\3\2\2\2\u0094\u0096\7\5\2\2\u0095\u0097"+
		"\5\66\34\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2"+
		"\u0098\u0099\58\35\2\u0099\'\3\2\2\2\u009a\u009b\5.\30\2\u009b\u009c\5"+
		",\27\2\u009c\u009d\7\20\2\2\u009d\u009e\5\64\33\2\u009e\u00a8\3\2\2\2"+
		"\u009f\u00a0\5.\30\2\u00a0\u00a1\5,\27\2\u00a1\u00a8\3\2\2\2\u00a2\u00a3"+
		"\5.\30\2\u00a3\u00a4\7\20\2\2\u00a4\u00a5\5\64\33\2\u00a5\u00a8\3\2\2"+
		"\2\u00a6\u00a8\5.\30\2\u00a7\u009a\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a2"+
		"\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8)\3\2\2\2\u00a9\u00aa\7\21\2\2\u00aa"+
		"+\3\2\2\2\u00ab\u00b1\7\n\2\2\u00ac\u00ad\5*\26\2\u00ad\u00ae\7\b\2\2"+
		"\u00ae\u00b0\3\2\2\2\u00af\u00ac\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b5\5*\26\2\u00b5\u00b6\7\7\2\2\u00b6-\3\2\2\2\u00b7\u00b8\5\60\31"+
		"\2\u00b8\u00b9\5\62\32\2\u00b9\u00c0\3\2\2\2\u00ba\u00bb\5\60\31\2\u00bb"+
		"\u00bc\7\27\2\2\u00bc\u00bd\5\62\32\2\u00bd\u00c0\3\2\2\2\u00be\u00c0"+
		"\5\60\31\2\u00bf\u00b7\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00be\3\2\2\2"+
		"\u00c0/\3\2\2\2\u00c1\u00c2\t\3\2\2\u00c2\61\3\2\2\2\u00c3\u00c4\t\4\2"+
		"\2\u00c4\63\3\2\2\2\u00c5\u00c6\5\66\34\2\u00c6\u00c7\58\35\2\u00c7\65"+
		"\3\2\2\2\u00c8\u00c9\t\5\2\2\u00c9\67\3\2\2\2\u00ca\u00cb\t\6\2\2\u00cb"+
		"9\3\2\2\2\21=BIKS\\`eim|\u0096\u00a7\u00b1\u00bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}