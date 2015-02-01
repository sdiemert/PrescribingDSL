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
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, INT=11, NUMBER=12, TIMEUNIT=13, TIMEUNIT_PLURAL=14, UNIT=15, 
		INTERVAL_FREQ=16, INTERVAL_MODIFIER=17, INTERVAL_LENGTH=18, STRING=19, 
		ID=20, NEWLINE=21, WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'"
	};
	public static final String[] ruleNames = {
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "INT", "NUMBER", "TIMEUNIT", "TIMEUNIT_PLURAL", "UNIT", "INTERVAL_FREQ", 
		"INTERVAL_MODIFIER", "INTERVAL_LENGTH", "STRING", "ID", "NEWLINE", "WS"
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
		case 21: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u0119\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\6\f`\n\f\r\f\16\fa\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u008f\n\r\r\r\16\r\u0090\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\6\16\u00a7\n\16\r\16\16\16\u00a8\3\17\3\17\6\17\u00ad\n"+
		"\17\r\17\16\17\u00ae\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00bb\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00cc\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e0\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0102\n\23\3\24\6\24\u0105\n\24\r\24\16\24\u0106"+
		"\3\25\6\25\u010a\n\25\r\25\16\25\u010b\3\26\5\26\u010f\n\26\3\26\3\26"+
		"\3\27\6\27\u0114\n\27\r\27\16\27\u0115\3\27\3\27\2\2\30\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"\u013b\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\66\3"+
		"\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13H\3\2\2\2\rJ\3\2\2\2\17L\3\2\2\2\21N\3"+
		"\2\2\2\23S\3\2\2\2\25Z\3\2\2\2\27_\3\2\2\2\31\u008e\3\2\2\2\33\u00a6\3"+
		"\2\2\2\35\u00aa\3\2\2\2\37\u00ba\3\2\2\2!\u00cb\3\2\2\2#\u00df\3\2\2\2"+
		"%\u0101\3\2\2\2\'\u0104\3\2\2\2)\u0109\3\2\2\2+\u010e\3\2\2\2-\u0113\3"+
		"\2\2\2/\60\7C\2\2\60\61\7E\2\2\61\62\7V\2\2\62\63\7K\2\2\63\64\7Q\2\2"+
		"\64\65\7P\2\2\65\4\3\2\2\2\66\67\7V\2\2\678\7J\2\289\7G\2\29:\7P\2\2:"+
		"\6\3\2\2\2;<\7+\2\2<\b\3\2\2\2=>\7O\2\2>?\7G\2\2?@\7F\2\2@A\7K\2\2AB\7"+
		"E\2\2BC\7C\2\2CD\7V\2\2DE\7K\2\2EF\7Q\2\2FG\7P\2\2G\n\3\2\2\2HI\7.\2\2"+
		"I\f\3\2\2\2JK\7*\2\2K\16\3\2\2\2LM\7?\2\2M\20\3\2\2\2NO\7F\2\2OP\7Q\2"+
		"\2PQ\7U\2\2QR\7G\2\2R\22\3\2\2\2ST\7V\2\2TU\7K\2\2UV\7O\2\2VW\7K\2\2W"+
		"X\7P\2\2XY\7I\2\2Y\24\3\2\2\2Z[\7H\2\2[\\\7Q\2\2\\]\7T\2\2]\26\3\2\2\2"+
		"^`\4\62;\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\30\3\2\2\2cd\7|\2"+
		"\2de\7g\2\2ef\7t\2\2f\u008f\7q\2\2gh\7q\2\2hi\7p\2\2i\u008f\7g\2\2jk\7"+
		"v\2\2kl\7y\2\2l\u008f\7q\2\2mn\7v\2\2no\7j\2\2op\7t\2\2pq\7g\2\2q\u008f"+
		"\7g\2\2rs\7h\2\2st\7q\2\2tu\7w\2\2u\u008f\7t\2\2vw\7h\2\2wx\7k\2\2xy\7"+
		"x\2\2y\u008f\7g\2\2z{\7u\2\2{|\7k\2\2|\u008f\7z\2\2}~\7u\2\2~\177\7g\2"+
		"\2\177\u0080\7x\2\2\u0080\u0081\7g\2\2\u0081\u008f\7p\2\2\u0082\u0083"+
		"\7g\2\2\u0083\u0084\7k\2\2\u0084\u0085\7i\2\2\u0085\u0086\7j\2\2\u0086"+
		"\u008f\7v\2\2\u0087\u0088\7p\2\2\u0088\u0089\7k\2\2\u0089\u008a\7p\2\2"+
		"\u008a\u008f\7g\2\2\u008b\u008c\7v\2\2\u008c\u008d\7g\2\2\u008d\u008f"+
		"\7p\2\2\u008ec\3\2\2\2\u008eg\3\2\2\2\u008ej\3\2\2\2\u008em\3\2\2\2\u008e"+
		"r\3\2\2\2\u008ev\3\2\2\2\u008ez\3\2\2\2\u008e}\3\2\2\2\u008e\u0082\3\2"+
		"\2\2\u008e\u0087\3\2\2\2\u008e\u008b\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\32\3\2\2\2\u0092\u0093\7j\2\2"+
		"\u0093\u0094\7q\2\2\u0094\u0095\7w\2\2\u0095\u00a7\7t\2\2\u0096\u0097"+
		"\7f\2\2\u0097\u0098\7c\2\2\u0098\u00a7\7{\2\2\u0099\u009a\7y\2\2\u009a"+
		"\u009b\7g\2\2\u009b\u009c\7g\2\2\u009c\u00a7\7m\2\2\u009d\u009e\7o\2\2"+
		"\u009e\u009f\7q\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a7"+
		"\7j\2\2\u00a2\u00a3\7{\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7c\2\2\u00a5"+
		"\u00a7\7t\2\2\u00a6\u0092\3\2\2\2\u00a6\u0096\3\2\2\2\u00a6\u0099\3\2"+
		"\2\2\u00a6\u009d\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\34\3\2\2\2\u00aa\u00ac\5\33\16"+
		"\2\u00ab\u00ad\7u\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\36\3\2\2\2\u00b0\u00b1\7o\2\2\u00b1"+
		"\u00bb\7i\2\2\u00b2\u00bb\7i\2\2\u00b3\u00b4\7m\2\2\u00b4\u00bb\7i\2\2"+
		"\u00b5\u00b6\7o\2\2\u00b6\u00b7\7e\2\2\u00b7\u00bb\7i\2\2\u00b8\u00b9"+
		"\7p\2\2\u00b9\u00bb\7i\2\2\u00ba\u00b0\3\2\2\2\u00ba\u00b2\3\2\2\2\u00ba"+
		"\u00b3\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb \3\2\2\2"+
		"\u00bc\u00bd\7q\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7e\2\2\u00bf\u00cc"+
		"\7g\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7y\2\2\u00c2\u00c3\7k\2\2\u00c3"+
		"\u00c4\7e\2\2\u00c4\u00cc\7g\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7j\2\2"+
		"\u00c7\u00c8\7t\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cc"+
		"\7g\2\2\u00cb\u00bc\3\2\2\2\u00cb\u00c0\3\2\2\2\u00cb\u00c5\3\2\2\2\u00cc"+
		"\"\3\2\2\2\u00cd\u00ce\7r\2\2\u00ce\u00cf\7g\2\2\u00cf\u00e0\7t\2\2\u00d0"+
		"\u00d1\7v\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7o\2\2\u00d3\u00d4\7g\2\2"+
		"\u00d4\u00e0\7u\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8"+
		"\7o\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7\"\2\2\u00db"+
		"\u00dc\7r\2\2\u00dc\u00dd\7g\2\2\u00dd\u00e0\7t\2\2\u00de\u00e0\7z\2\2"+
		"\u00df\u00cd\3\2\2\2\u00df\u00d0\3\2\2\2\u00df\u00d5\3\2\2\2\u00df\u00de"+
		"\3\2\2\2\u00e0$\3\2\2\2\u00e1\u00e2\7f\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4"+
		"\7k\2\2\u00e4\u00e5\7n\2\2\u00e5\u0102\7{\2\2\u00e6\u00e7\7y\2\2\u00e7"+
		"\u00e8\7g\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7m\2\2\u00ea\u00eb\7n\2\2"+
		"\u00eb\u0102\7{\2\2\u00ec\u00ed\7o\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef"+
		"\7p\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7j\2\2\u00f1\u00f2\7n\2\2\u00f2"+
		"\u0102\7{\2\2\u00f3\u00f4\7{\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7c\2\2"+
		"\u00f6\u00f7\7t\2\2\u00f7\u00f8\7n\2\2\u00f8\u0102\7{\2\2\u00f9\u00fa"+
		"\7c\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7w\2\2\u00fd"+
		"\u00fe\7c\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7n\2\2\u0100\u0102\7{\2\2"+
		"\u0101\u00e1\3\2\2\2\u0101\u00e6\3\2\2\2\u0101\u00ec\3\2\2\2\u0101\u00f3"+
		"\3\2\2\2\u0101\u00f9\3\2\2\2\u0102&\3\2\2\2\u0103\u0105\t\2\2\2\u0104"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107(\3\2\2\2\u0108\u010a\t\2\2\2\u0109\u0108\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c*\3\2\2\2\u010d"+
		"\u010f\7\17\2\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3"+
		"\2\2\2\u0110\u0111\7\f\2\2\u0111,\3\2\2\2\u0112\u0114\t\3\2\2\u0113\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\b\27\2\2\u0118.\3\2\2\2\21\2a\u008e\u0090\u00a6"+
		"\u00a8\u00ae\u00ba\u00cb\u00df\u0101\u0106\u010b\u010e\u0115\3\3\27\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}