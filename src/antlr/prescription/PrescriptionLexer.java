// Generated from /Users/sdiemert/Documents/workspace/AntlrTestDriver/src/antlr/prescription/Prescription.g4 by ANTLR 4.1

	import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PrescriptionLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, STRING=12, ID=13, UNIT=14, INT=15, NEWLINE=16, WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'ACTION'", "'THEN'", "'kg'", "'MEDICATION'", "'ng'", "'='", "'mg'", "'mcg'", 
		"'DOSE'", "'TIMING'", "'g'", "STRING", "ID", "UNIT", "INT", "NEWLINE", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "STRING", "ID", "UNIT", "INT", "NEWLINE", "WS"
	};


		HashMap memory = new HashMap();


	public PrescriptionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Prescription.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 16: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\23\u0080\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\6\r[\n\r\r\r\16\r\\\3\16\6\16`\n\16\r\16\16\16a\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17n\n\17\3\20\6\20q\n\20"+
		"\r\20\16\20r\3\21\5\21v\n\21\3\21\3\21\3\22\6\22{\n\22\r\22\16\22|\3\22"+
		"\3\22\2\23\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1"+
		"\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\2\3\2\4\4\2C"+
		"\\c|\5\2\13\f\17\17\"\"\u0088\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5,\3\2\2\2\7\61\3\2\2\2\t"+
		"\64\3\2\2\2\13?\3\2\2\2\rB\3\2\2\2\17D\3\2\2\2\21G\3\2\2\2\23K\3\2\2\2"+
		"\25P\3\2\2\2\27W\3\2\2\2\31Z\3\2\2\2\33_\3\2\2\2\35m\3\2\2\2\37p\3\2\2"+
		"\2!u\3\2\2\2#z\3\2\2\2%&\7C\2\2&\'\7E\2\2\'(\7V\2\2()\7K\2\2)*\7Q\2\2"+
		"*+\7P\2\2+\4\3\2\2\2,-\7V\2\2-.\7J\2\2./\7G\2\2/\60\7P\2\2\60\6\3\2\2"+
		"\2\61\62\7m\2\2\62\63\7i\2\2\63\b\3\2\2\2\64\65\7O\2\2\65\66\7G\2\2\66"+
		"\67\7F\2\2\678\7K\2\289\7E\2\29:\7C\2\2:;\7V\2\2;<\7K\2\2<=\7Q\2\2=>\7"+
		"P\2\2>\n\3\2\2\2?@\7p\2\2@A\7i\2\2A\f\3\2\2\2BC\7?\2\2C\16\3\2\2\2DE\7"+
		"o\2\2EF\7i\2\2F\20\3\2\2\2GH\7o\2\2HI\7e\2\2IJ\7i\2\2J\22\3\2\2\2KL\7"+
		"F\2\2LM\7Q\2\2MN\7U\2\2NO\7G\2\2O\24\3\2\2\2PQ\7V\2\2QR\7K\2\2RS\7O\2"+
		"\2ST\7K\2\2TU\7P\2\2UV\7I\2\2V\26\3\2\2\2WX\7i\2\2X\30\3\2\2\2Y[\t\2\2"+
		"\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\32\3\2\2\2^`\t\2\2\2_^"+
		"\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\34\3\2\2\2cd\7o\2\2dn\7i\2\2e"+
		"n\7i\2\2fg\7m\2\2gn\7i\2\2hi\7o\2\2ij\7e\2\2jn\7i\2\2kl\7p\2\2ln\7i\2"+
		"\2mc\3\2\2\2me\3\2\2\2mf\3\2\2\2mh\3\2\2\2mk\3\2\2\2n\36\3\2\2\2oq\4\62"+
		";\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s \3\2\2\2tv\7\17\2\2ut\3\2"+
		"\2\2uv\3\2\2\2vw\3\2\2\2wx\7\f\2\2x\"\3\2\2\2y{\t\3\2\2zy\3\2\2\2{|\3"+
		"\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\b\22\2\2\177$\3\2\2\2\t\2\\"+
		"amru|";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}