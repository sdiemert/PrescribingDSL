// Generated from Prescription.g4 by ANTLR 4.4
package antlr.prescription;
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, INT=13, NUMBER=14, TIMEUNIT=15, TIMEUNIT_PLURAL=16, 
		UNIT=17, INTERVAL_FREQ=18, INTERVAL_MODIFIER=19, INTERVAL_LENGTH=20, STRING=21, 
		ID=22, NEWLINE=23, WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "INT", "NUMBER", "TIMEUNIT", "TIMEUNIT_PLURAL", 
		"UNIT", "INTERVAL_FREQ", "INTERVAL_MODIFIER", "INTERVAL_LENGTH", "STRING", 
		"ID", "NEWLINE", "WS"
	};


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
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 23: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u0126\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\6\16m\n\16\r\16\16\16n\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u009c"+
		"\n\17\r\17\16\17\u009d\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00b4\n\20"+
		"\r\20\16\20\u00b5\3\21\3\21\6\21\u00ba\n\21\r\21\16\21\u00bb\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c8\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d9"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u00ed\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u010f"+
		"\n\25\3\26\6\26\u0112\n\26\r\26\16\26\u0113\3\27\6\27\u0117\n\27\r\27"+
		"\16\27\u0118\3\30\5\30\u011c\n\30\3\30\3\30\3\31\6\31\u0121\n\31\r\31"+
		"\16\31\u0122\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"\u0148\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2"+
		"\2\5:\3\2\2\2\7?\3\2\2\2\tB\3\2\2\2\13M\3\2\2\2\rP\3\2\2\2\17R\3\2\2\2"+
		"\21U\3\2\2\2\23Y\3\2\2\2\25^\3\2\2\2\27e\3\2\2\2\31i\3\2\2\2\33l\3\2\2"+
		"\2\35\u009b\3\2\2\2\37\u00b3\3\2\2\2!\u00b7\3\2\2\2#\u00c7\3\2\2\2%\u00d8"+
		"\3\2\2\2\'\u00ec\3\2\2\2)\u010e\3\2\2\2+\u0111\3\2\2\2-\u0116\3\2\2\2"+
		"/\u011b\3\2\2\2\61\u0120\3\2\2\2\63\64\7C\2\2\64\65\7E\2\2\65\66\7V\2"+
		"\2\66\67\7K\2\2\678\7Q\2\289\7P\2\29\4\3\2\2\2:;\7V\2\2;<\7J\2\2<=\7G"+
		"\2\2=>\7P\2\2>\6\3\2\2\2?@\7m\2\2@A\7i\2\2A\b\3\2\2\2BC\7O\2\2CD\7G\2"+
		"\2DE\7F\2\2EF\7K\2\2FG\7E\2\2GH\7C\2\2HI\7V\2\2IJ\7K\2\2JK\7Q\2\2KL\7"+
		"P\2\2L\n\3\2\2\2MN\7p\2\2NO\7i\2\2O\f\3\2\2\2PQ\7?\2\2Q\16\3\2\2\2RS\7"+
		"o\2\2ST\7i\2\2T\20\3\2\2\2UV\7o\2\2VW\7e\2\2WX\7i\2\2X\22\3\2\2\2YZ\7"+
		"F\2\2Z[\7Q\2\2[\\\7U\2\2\\]\7G\2\2]\24\3\2\2\2^_\7V\2\2_`\7K\2\2`a\7O"+
		"\2\2ab\7K\2\2bc\7P\2\2cd\7I\2\2d\26\3\2\2\2ef\7H\2\2fg\7Q\2\2gh\7T\2\2"+
		"h\30\3\2\2\2ij\7i\2\2j\32\3\2\2\2km\4\62;\2lk\3\2\2\2mn\3\2\2\2nl\3\2"+
		"\2\2no\3\2\2\2o\34\3\2\2\2pq\7|\2\2qr\7g\2\2rs\7t\2\2s\u009c\7q\2\2tu"+
		"\7q\2\2uv\7p\2\2v\u009c\7g\2\2wx\7v\2\2xy\7y\2\2y\u009c\7q\2\2z{\7v\2"+
		"\2{|\7j\2\2|}\7t\2\2}~\7g\2\2~\u009c\7g\2\2\177\u0080\7h\2\2\u0080\u0081"+
		"\7q\2\2\u0081\u0082\7w\2\2\u0082\u009c\7t\2\2\u0083\u0084\7h\2\2\u0084"+
		"\u0085\7k\2\2\u0085\u0086\7x\2\2\u0086\u009c\7g\2\2\u0087\u0088\7u\2\2"+
		"\u0088\u0089\7k\2\2\u0089\u009c\7z\2\2\u008a\u008b\7u\2\2\u008b\u008c"+
		"\7g\2\2\u008c\u008d\7x\2\2\u008d\u008e\7g\2\2\u008e\u009c\7p\2\2\u008f"+
		"\u0090\7g\2\2\u0090\u0091\7k\2\2\u0091\u0092\7i\2\2\u0092\u0093\7j\2\2"+
		"\u0093\u009c\7v\2\2\u0094\u0095\7p\2\2\u0095\u0096\7k\2\2\u0096\u0097"+
		"\7p\2\2\u0097\u009c\7g\2\2\u0098\u0099\7v\2\2\u0099\u009a\7g\2\2\u009a"+
		"\u009c\7p\2\2\u009bp\3\2\2\2\u009bt\3\2\2\2\u009bw\3\2\2\2\u009bz\3\2"+
		"\2\2\u009b\177\3\2\2\2\u009b\u0083\3\2\2\2\u009b\u0087\3\2\2\2\u009b\u008a"+
		"\3\2\2\2\u009b\u008f\3\2\2\2\u009b\u0094\3\2\2\2\u009b\u0098\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\36\3\2\2"+
		"\2\u009f\u00a0\7j\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7w\2\2\u00a2\u00b4"+
		"\7t\2\2\u00a3\u00a4\7f\2\2\u00a4\u00a5\7c\2\2\u00a5\u00b4\7{\2\2\u00a6"+
		"\u00a7\7y\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7g\2\2\u00a9\u00b4\7m\2\2"+
		"\u00aa\u00ab\7o\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae"+
		"\7v\2\2\u00ae\u00b4\7j\2\2\u00af\u00b0\7{\2\2\u00b0\u00b1\7g\2\2\u00b1"+
		"\u00b2\7c\2\2\u00b2\u00b4\7t\2\2\u00b3\u009f\3\2\2\2\u00b3\u00a3\3\2\2"+
		"\2\u00b3\u00a6\3\2\2\2\u00b3\u00aa\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6 \3\2\2\2\u00b7"+
		"\u00b9\5\37\20\2\u00b8\u00ba\7u\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3"+
		"\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\"\3\2\2\2\u00bd\u00be"+
		"\7o\2\2\u00be\u00c8\7i\2\2\u00bf\u00c8\7i\2\2\u00c0\u00c1\7m\2\2\u00c1"+
		"\u00c8\7i\2\2\u00c2\u00c3\7o\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c8\7i\2\2"+
		"\u00c5\u00c6\7p\2\2\u00c6\u00c8\7i\2\2\u00c7\u00bd\3\2\2\2\u00c7\u00bf"+
		"\3\2\2\2\u00c7\u00c0\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"$\3\2\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7e\2\2\u00cc"+
		"\u00d9\7g\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7y\2\2\u00cf\u00d0\7k\2\2"+
		"\u00d0\u00d1\7e\2\2\u00d1\u00d9\7g\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4"+
		"\7j\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7e\2\2\u00d7"+
		"\u00d9\7g\2\2\u00d8\u00c9\3\2\2\2\u00d8\u00cd\3\2\2\2\u00d8\u00d2\3\2"+
		"\2\2\u00d9&\3\2\2\2\u00da\u00db\7r\2\2\u00db\u00dc\7g\2\2\u00dc\u00ed"+
		"\7t\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7o\2\2\u00e0"+
		"\u00e1\7g\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3\7\"\2\2\u00e3\u00e4\7r\2"+
		"\2\u00e4\u00e5\7g\2\2\u00e5\u00ed\7t\2\2\u00e6\u00ed\7z\2\2\u00e7\u00e8"+
		"\7v\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7o\2\2\u00ea\u00eb\7g\2\2\u00eb"+
		"\u00ed\7u\2\2\u00ec\u00da\3\2\2\2\u00ec\u00dd\3\2\2\2\u00ec\u00e6\3\2"+
		"\2\2\u00ec\u00e7\3\2\2\2\u00ed(\3\2\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0"+
		"\7c\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7n\2\2\u00f2\u010f\7{\2\2\u00f3"+
		"\u00f4\7y\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7m\2\2"+
		"\u00f7\u00f8\7n\2\2\u00f8\u010f\7{\2\2\u00f9\u00fa\7o\2\2\u00fa\u00fb"+
		"\7q\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7j\2\2\u00fe"+
		"\u00ff\7n\2\2\u00ff\u010f\7{\2\2\u0100\u0101\7{\2\2\u0101\u0102\7g\2\2"+
		"\u0102\u0103\7c\2\2\u0103\u0104\7t\2\2\u0104\u0105\7n\2\2\u0105\u010f"+
		"\7{\2\2\u0106\u0107\7c\2\2\u0107\u0108\7p\2\2\u0108\u0109\7p\2\2\u0109"+
		"\u010a\7w\2\2\u010a\u010b\7c\2\2\u010b\u010c\7n\2\2\u010c\u010d\7n\2\2"+
		"\u010d\u010f\7{\2\2\u010e\u00ee\3\2\2\2\u010e\u00f3\3\2\2\2\u010e\u00f9"+
		"\3\2\2\2\u010e\u0100\3\2\2\2\u010e\u0106\3\2\2\2\u010f*\3\2\2\2\u0110"+
		"\u0112\t\2\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114,\3\2\2\2\u0115\u0117\t\2\2\2\u0116\u0115"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		".\3\2\2\2\u011a\u011c\7\17\2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2"+
		"\u011c\u011d\3\2\2\2\u011d\u011e\7\f\2\2\u011e\60\3\2\2\2\u011f\u0121"+
		"\t\3\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\b\31\2\2\u0125\62\3\2\2"+
		"\2\21\2n\u009b\u009d\u00b3\u00b5\u00bb\u00c7\u00d8\u00ec\u010e\u0113\u0118"+
		"\u011b\u0122\3\3\31\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}