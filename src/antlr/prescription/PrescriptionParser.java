// Generated from /Users/sdiemert/Documents/workspace/AntlrTestDriver/src/antlr/prescription/Prescription.g4 by ANTLR 4.1

	import java.util.HashMap;

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
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, STRING=12, ID=13, UNIT=14, INT=15, NEWLINE=16, WS=17;
	public static final String[] tokenNames = {
		"<INVALID>", "'ACTION'", "'THEN'", "'kg'", "'MEDICATION'", "'ng'", "'='", 
		"'mg'", "'mcg'", "'DOSE'", "'TIMING'", "'g'", "STRING", "ID", "UNIT", 
		"INT", "NEWLINE", "WS"
	};
	public static final int
		RULE_script = 0, RULE_expr = 1, RULE_assignment = 2, RULE_action = 3, 
		RULE_medication = 4, RULE_dose = 5, RULE_timing = 6;
	public static final String[] ruleNames = {
		"script", "expr", "assignment", "action", "medication", "dose", "timing"
	};

	@Override
	public String getGrammarFileName() { return "Prescription.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


		HashMap memory = new HashMap();

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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrescriptionVisitor ) return ((PrescriptionVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14); expr(0);
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 9) | (1L << 10) | (1L << STRING) | (1L << ID) | (1L << NEWLINE))) != 0) );
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
		public int _p;
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
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrescriptionVisitor ) return ((PrescriptionVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			switch (_input.LA(1)) {
			case STRING:
			case ID:
				{
				setState(20); ((ExprContext)_localctx).a = action();
				setState(21); ((ExprContext)_localctx).m = medication();
				setState(22); ((ExprContext)_localctx).d = dose();
				setState(23); ((ExprContext)_localctx).t = timing();
				setState(24); match(NEWLINE);
				System.out.println("a="+((ExprContext)_localctx).a.val+" m="+((ExprContext)_localctx).m.val+" d="+(((ExprContext)_localctx).d!=null?_input.getText(((ExprContext)_localctx).d.start,((ExprContext)_localctx).d.stop):null)+" t="+(((ExprContext)_localctx).t!=null?_input.getText(((ExprContext)_localctx).t.start,((ExprContext)_localctx).t.stop):null));
				}
				break;
			case 1:
			case 4:
			case 9:
			case 10:
				{
				setState(27); assignment();
				setState(28); match(NEWLINE);
				}
				break;
			case NEWLINE:
				{
				setState(30); match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(33);
					if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
					setState(34); match(2);
					setState(35); expr(0);
					setState(36); match(NEWLINE);
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		public Token ID;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrescriptionVisitor ) return ((PrescriptionVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			setState(67);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43); match(1);
				setState(44); ((AssignmentContext)_localctx).ID = match(ID);
				setState(45); match(6);
				setState(46); ((AssignmentContext)_localctx).a = action();
				memory.put((((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null), (((AssignmentContext)_localctx).a!=null?_input.getText(((AssignmentContext)_localctx).a.start,((AssignmentContext)_localctx).a.stop):null));
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); match(9);
				setState(50); ((AssignmentContext)_localctx).ID = match(ID);
				setState(51); match(6);
				setState(52); ((AssignmentContext)_localctx).d = dose();
				memory.put((((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null), (((AssignmentContext)_localctx).d!=null?_input.getText(((AssignmentContext)_localctx).d.start,((AssignmentContext)_localctx).d.stop):null));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 3);
				{
				setState(55); match(4);
				setState(56); ((AssignmentContext)_localctx).ID = match(ID);
				setState(57); match(6);
				setState(58); ((AssignmentContext)_localctx).m = medication();
				memory.put((((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null), (((AssignmentContext)_localctx).m!=null?_input.getText(((AssignmentContext)_localctx).m.start,((AssignmentContext)_localctx).m.stop):null));
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 4);
				{
				setState(61); match(10);
				setState(62); ((AssignmentContext)_localctx).ID = match(ID);
				setState(63); match(6);
				setState(64); ((AssignmentContext)_localctx).t = timing();
				memory.put((((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null), (((AssignmentContext)_localctx).t!=null?_input.getText(((AssignmentContext)_localctx).t.start,((AssignmentContext)_localctx).t.stop):null));
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
		public String val;
		public Token ID;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrescriptionVisitor ) return ((PrescriptionVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_action);
		try {
			setState(73);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); ((ActionContext)_localctx).ID = match(ID);
				 
								String s = (String)memory.get((((ActionContext)_localctx).ID!=null?((ActionContext)_localctx).ID.getText():null));
								if(s != null){
									((ActionContext)_localctx).val =  s;
								}
							
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(71); ((ActionContext)_localctx).s = match(STRING);
				((ActionContext)_localctx).val =  (((ActionContext)_localctx).s!=null?((ActionContext)_localctx).s.getText():null); System.out.println("action: "+_localctx.val);
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
		public String val;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrescriptionVisitor ) return ((PrescriptionVisitor<? extends T>)visitor).visitMedication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MedicationContext medication() throws RecognitionException {
		MedicationContext _localctx = new MedicationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_medication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); ((MedicationContext)_localctx).s = match(STRING);
			((MedicationContext)_localctx).val =  (((MedicationContext)_localctx).s!=null?((MedicationContext)_localctx).s.getText():null); System.out.println("med: "+_localctx.val);
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
		public String val;
		public Token INT;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrescriptionVisitor ) return ((PrescriptionVisitor<? extends T>)visitor).visitDose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoseContext dose() throws RecognitionException {
		DoseContext _localctx = new DoseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dose);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); ((DoseContext)_localctx).INT = match(INT);
			setState(79);
			((DoseContext)_localctx).u = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << 7) | (1L << 8) | (1L << 11))) != 0)) ) {
				((DoseContext)_localctx).u = (Token)_errHandler.recoverInline(this);
			}
			consume();
			((DoseContext)_localctx).val =  (((DoseContext)_localctx).INT!=null?((DoseContext)_localctx).INT.getText():null) + (((DoseContext)_localctx).u!=null?((DoseContext)_localctx).u.getText():null); System.out.println("dose: "+_localctx.val);
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
		public String val;
		public Token x;
		public TerminalNode STRING(int i) {
			return getToken(PrescriptionParser.STRING, i);
		}
		public List<TerminalNode> STRING() { return getTokens(PrescriptionParser.STRING); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrescriptionVisitor ) return ((PrescriptionVisitor<? extends T>)visitor).visitTiming(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimingContext timing() throws RecognitionException {
		TimingContext _localctx = new TimingContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_timing);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(82); ((TimingContext)_localctx).x = match(STRING);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(85); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=1 && _alt!=-1 );
			((TimingContext)_localctx).val =  (((TimingContext)_localctx).x!=null?((TimingContext)_localctx).x.getText():null); System.out.println("timing: "+(((TimingContext)_localctx).x!=null?((TimingContext)_localctx).x.getText():null));
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
		case 0: return 3 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\23\\\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4F\n\4\3"+
		"\5\3\5\3\5\3\5\5\5L\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\6\bV\n\b\r\b\16"+
		"\bW\3\b\3\b\3\b\3W\t\2\4\6\b\n\f\16\2\3\6\2\5\5\7\7\t\n\r\r]\2\21\3\2"+
		"\2\2\4!\3\2\2\2\6E\3\2\2\2\bK\3\2\2\2\nM\3\2\2\2\fP\3\2\2\2\16U\3\2\2"+
		"\2\20\22\5\4\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2"+
		"\2\24\3\3\2\2\2\25\26\b\3\1\2\26\27\5\b\5\2\27\30\5\n\6\2\30\31\5\f\7"+
		"\2\31\32\5\16\b\2\32\33\7\22\2\2\33\34\b\3\1\2\34\"\3\2\2\2\35\36\5\6"+
		"\4\2\36\37\7\22\2\2\37\"\3\2\2\2 \"\7\22\2\2!\25\3\2\2\2!\35\3\2\2\2!"+
		" \3\2\2\2\"*\3\2\2\2#$\6\3\2\3$%\7\4\2\2%&\5\4\3\2&\'\7\22\2\2\')\3\2"+
		"\2\2(#\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\5\3\2\2\2,*\3\2\2\2-.\7"+
		"\3\2\2./\7\17\2\2/\60\7\b\2\2\60\61\5\b\5\2\61\62\b\4\1\2\62F\3\2\2\2"+
		"\63\64\7\13\2\2\64\65\7\17\2\2\65\66\7\b\2\2\66\67\5\f\7\2\678\b\4\1\2"+
		"8F\3\2\2\29:\7\6\2\2:;\7\17\2\2;<\7\b\2\2<=\5\n\6\2=>\b\4\1\2>F\3\2\2"+
		"\2?@\7\f\2\2@A\7\17\2\2AB\7\b\2\2BC\5\16\b\2CD\b\4\1\2DF\3\2\2\2E-\3\2"+
		"\2\2E\63\3\2\2\2E9\3\2\2\2E?\3\2\2\2F\7\3\2\2\2GH\7\17\2\2HL\b\5\1\2I"+
		"J\7\16\2\2JL\b\5\1\2KG\3\2\2\2KI\3\2\2\2L\t\3\2\2\2MN\7\16\2\2NO\b\6\1"+
		"\2O\13\3\2\2\2PQ\7\21\2\2QR\t\2\2\2RS\b\7\1\2S\r\3\2\2\2TV\7\16\2\2UT"+
		"\3\2\2\2VW\3\2\2\2WX\3\2\2\2WU\3\2\2\2XY\3\2\2\2YZ\b\b\1\2Z\17\3\2\2\2"+
		"\b\23!*EKW";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}