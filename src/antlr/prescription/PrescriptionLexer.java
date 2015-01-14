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
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, INT=8, NUMBER=9, 
		TIMEUNIT=10, TIMEUNIT_PLURAL=11, UNIT=12, INTERVAL_FREQ=13, INTERVAL_MODIFIER=14, 
		INTERVAL_LENGTH=15, STRING=16, ID=17, NEWLINE=18, WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "INT", "NUMBER", 
		"TIMEUNIT", "TIMEUNIT_PLURAL", "UNIT", "INTERVAL_FREQ", "INTERVAL_MODIFIER", 
		"INTERVAL_LENGTH", "STRING", "ID", "NEWLINE", "WS"
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
		case 18: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u010d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\6\tT\n\t\r\t\16"+
		"\tU\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u0083\n\n\r\n\16\n\u0084\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\6\13\u009b\n\13\r\13\16\13\u009c\3\f\3\f\6\f"+
		"\u00a1\n\f\r\f\16\f\u00a2\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u00af\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00c0\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d4\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00f6\n\20\3\21\6\21\u00f9\n\21\r\21\16\21\u00fa"+
		"\3\22\6\22\u00fe\n\22\r\22\16\22\u00ff\3\23\5\23\u0103\n\23\3\23\3\23"+
		"\3\24\6\24\u0108\n\24\r\24\16\24\u0109\3\24\3\24\2\2\25\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"\u012f\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\3)\3\2\2\2\5\60\3\2\2\2\7\65\3\2\2\2\t@\3\2\2\2\13B\3\2\2\2\rG"+
		"\3\2\2\2\17N\3\2\2\2\21S\3\2\2\2\23\u0082\3\2\2\2\25\u009a\3\2\2\2\27"+
		"\u009e\3\2\2\2\31\u00ae\3\2\2\2\33\u00bf\3\2\2\2\35\u00d3\3\2\2\2\37\u00f5"+
		"\3\2\2\2!\u00f8\3\2\2\2#\u00fd\3\2\2\2%\u0102\3\2\2\2\'\u0107\3\2\2\2"+
		")*\7C\2\2*+\7E\2\2+,\7V\2\2,-\7K\2\2-.\7Q\2\2./\7P\2\2/\4\3\2\2\2\60\61"+
		"\7V\2\2\61\62\7J\2\2\62\63\7G\2\2\63\64\7P\2\2\64\6\3\2\2\2\65\66\7O\2"+
		"\2\66\67\7G\2\2\678\7F\2\289\7K\2\29:\7E\2\2:;\7C\2\2;<\7V\2\2<=\7K\2"+
		"\2=>\7Q\2\2>?\7P\2\2?\b\3\2\2\2@A\7?\2\2A\n\3\2\2\2BC\7F\2\2CD\7Q\2\2"+
		"DE\7U\2\2EF\7G\2\2F\f\3\2\2\2GH\7V\2\2HI\7K\2\2IJ\7O\2\2JK\7K\2\2KL\7"+
		"P\2\2LM\7I\2\2M\16\3\2\2\2NO\7H\2\2OP\7Q\2\2PQ\7T\2\2Q\20\3\2\2\2RT\4"+
		"\62;\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\22\3\2\2\2WX\7|\2\2XY"+
		"\7g\2\2YZ\7t\2\2Z\u0083\7q\2\2[\\\7q\2\2\\]\7p\2\2]\u0083\7g\2\2^_\7v"+
		"\2\2_`\7y\2\2`\u0083\7q\2\2ab\7v\2\2bc\7j\2\2cd\7t\2\2de\7g\2\2e\u0083"+
		"\7g\2\2fg\7h\2\2gh\7q\2\2hi\7w\2\2i\u0083\7t\2\2jk\7h\2\2kl\7k\2\2lm\7"+
		"x\2\2m\u0083\7g\2\2no\7u\2\2op\7k\2\2p\u0083\7z\2\2qr\7u\2\2rs\7g\2\2"+
		"st\7x\2\2tu\7g\2\2u\u0083\7p\2\2vw\7g\2\2wx\7k\2\2xy\7i\2\2yz\7j\2\2z"+
		"\u0083\7v\2\2{|\7p\2\2|}\7k\2\2}~\7p\2\2~\u0083\7g\2\2\177\u0080\7v\2"+
		"\2\u0080\u0081\7g\2\2\u0081\u0083\7p\2\2\u0082W\3\2\2\2\u0082[\3\2\2\2"+
		"\u0082^\3\2\2\2\u0082a\3\2\2\2\u0082f\3\2\2\2\u0082j\3\2\2\2\u0082n\3"+
		"\2\2\2\u0082q\3\2\2\2\u0082v\3\2\2\2\u0082{\3\2\2\2\u0082\177\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\24"+
		"\3\2\2\2\u0086\u0087\7j\2\2\u0087\u0088\7q\2\2\u0088\u0089\7w\2\2\u0089"+
		"\u009b\7t\2\2\u008a\u008b\7f\2\2\u008b\u008c\7c\2\2\u008c\u009b\7{\2\2"+
		"\u008d\u008e\7y\2\2\u008e\u008f\7g\2\2\u008f\u0090\7g\2\2\u0090\u009b"+
		"\7m\2\2\u0091\u0092\7o\2\2\u0092\u0093\7q\2\2\u0093\u0094\7p\2\2\u0094"+
		"\u0095\7v\2\2\u0095\u009b\7j\2\2\u0096\u0097\7{\2\2\u0097\u0098\7g\2\2"+
		"\u0098\u0099\7c\2\2\u0099\u009b\7t\2\2\u009a\u0086\3\2\2\2\u009a\u008a"+
		"\3\2\2\2\u009a\u008d\3\2\2\2\u009a\u0091\3\2\2\2\u009a\u0096\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\26\3\2\2"+
		"\2\u009e\u00a0\5\25\13\2\u009f\u00a1\7u\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\30\3\2\2"+
		"\2\u00a4\u00a5\7o\2\2\u00a5\u00af\7i\2\2\u00a6\u00af\7i\2\2\u00a7\u00a8"+
		"\7m\2\2\u00a8\u00af\7i\2\2\u00a9\u00aa\7o\2\2\u00aa\u00ab\7e\2\2\u00ab"+
		"\u00af\7i\2\2\u00ac\u00ad\7p\2\2\u00ad\u00af\7i\2\2\u00ae\u00a4\3\2\2"+
		"\2\u00ae\u00a6\3\2\2\2\u00ae\u00a7\3\2\2\2\u00ae\u00a9\3\2\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00af\32\3\2\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7p\2\2\u00b2"+
		"\u00b3\7e\2\2\u00b3\u00c0\7g\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7y\2\2"+
		"\u00b6\u00b7\7k\2\2\u00b7\u00b8\7e\2\2\u00b8\u00c0\7g\2\2\u00b9\u00ba"+
		"\7v\2\2\u00ba\u00bb\7j\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7k\2\2\u00bd"+
		"\u00be\7e\2\2\u00be\u00c0\7g\2\2\u00bf\u00b0\3\2\2\2\u00bf\u00b4\3\2\2"+
		"\2\u00bf\u00b9\3\2\2\2\u00c0\34\3\2\2\2\u00c1\u00c2\7r\2\2\u00c2\u00c3"+
		"\7g\2\2\u00c3\u00d4\7t\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7k\2\2\u00c6"+
		"\u00c7\7o\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7\"\2"+
		"\2\u00ca\u00cb\7r\2\2\u00cb\u00cc\7g\2\2\u00cc\u00d4\7t\2\2\u00cd\u00d4"+
		"\7z\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7o\2\2\u00d1"+
		"\u00d2\7g\2\2\u00d2\u00d4\7u\2\2\u00d3\u00c1\3\2\2\2\u00d3\u00c4\3\2\2"+
		"\2\u00d3\u00cd\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d4\36\3\2\2\2\u00d5\u00d6"+
		"\7f\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7n\2\2\u00d9"+
		"\u00f6\7{\2\2\u00da\u00db\7y\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7g\2\2"+
		"\u00dd\u00de\7m\2\2\u00de\u00df\7n\2\2\u00df\u00f6\7{\2\2\u00e0\u00e1"+
		"\7o\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7v\2\2\u00e4"+
		"\u00e5\7j\2\2\u00e5\u00e6\7n\2\2\u00e6\u00f6\7{\2\2\u00e7\u00e8\7{\2\2"+
		"\u00e8\u00e9\7g\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec"+
		"\7n\2\2\u00ec\u00f6\7{\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7p\2\2\u00ef"+
		"\u00f0\7p\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7n\2\2"+
		"\u00f3\u00f4\7n\2\2\u00f4\u00f6\7{\2\2\u00f5\u00d5\3\2\2\2\u00f5\u00da"+
		"\3\2\2\2\u00f5\u00e0\3\2\2\2\u00f5\u00e7\3\2\2\2\u00f5\u00ed\3\2\2\2\u00f6"+
		" \3\2\2\2\u00f7\u00f9\t\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2"+
		"\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\"\3\2\2\2\u00fc\u00fe\t"+
		"\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100$\3\2\2\2\u0101\u0103\7\17\2\2\u0102\u0101\3\2\2\2"+
		"\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\7\f\2\2\u0105&\3"+
		"\2\2\2\u0106\u0108\t\3\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\b\24"+
		"\2\2\u010c(\3\2\2\2\21\2U\u0082\u0084\u009a\u009c\u00a2\u00ae\u00bf\u00d3"+
		"\u00f5\u00fa\u00ff\u0102\u0109\3\3\24\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}