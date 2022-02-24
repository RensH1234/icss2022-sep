package nl.han.ica.icss.parser.copiedfromgen;// Generated from C:/Users/rensh/Desktop/HAN_ICA/ASD/Compiler/startcode/src/main/antlr4/nl/han/ica/icss/parser\ICSS.g4 by ANTLR 4.9.2

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ICSSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ICH01F=1, ELSE=2, BOX_BRACKET_OPEN=3, BOX_BRACKET_CLOSE=4, TRUE=5, FALSE=6, 
		PIXELSIZE=7, PERCENTAGE=8, SCALAR=9, COLOR=10, ID_IDENT=11, CLASS_IDENT=12, 
		LOWER_IDENT=13, CAPITAL_IDENT=14, WS=15, OPEN_BRACE=16, CLOSE_BRACE=17, 
		SEMICOLON=18, COLON=19, PLUS=20, MIN=21, MUL=22, ASSIGNMENT_OPERATOR=23, 
		EQUAL_TO=24, GREATER_THAN=25, LESS_THAN=26, NOT_EQUAL_TO=27, GREATER_THAN_OR_EQUAL_TO=28, 
		LESS_THAN_OR_EQUAL_TO=29, AND=30, OR=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ICH01F", "ELSE", "BOX_BRACKET_OPEN", "BOX_BRACKET_CLOSE", "TRUE", "FALSE", 
			"PIXELSIZE", "PERCENTAGE", "SCALAR", "COLOR", "ID_IDENT", "CLASS_IDENT", 
			"LOWER_IDENT", "CAPITAL_IDENT", "WS", "OPEN_BRACE", "CLOSE_BRACE", "SEMICOLON", 
			"COLON", "PLUS", "MIN", "MUL", "ASSIGNMENT_OPERATOR", "EQUAL_TO", "GREATER_THAN", 
			"LESS_THAN", "NOT_EQUAL_TO", "GREATER_THAN_OR_EQUAL_TO", "LESS_THAN_OR_EQUAL_TO", 
			"AND", "OR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'['", "']'", "'TRUE'", "'FALSE'", null, null, 
			null, null, null, null, null, null, null, "'{'", "'}'", "';'", "':'", 
			"'+'", "'-'", "'*'", "':='", "'=='", "'>'", "'<'", "'!='", "'>='", "'<='", 
			"'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ICH01F", "ELSE", "BOX_BRACKET_OPEN", "BOX_BRACKET_CLOSE", "TRUE", 
			"FALSE", "PIXELSIZE", "PERCENTAGE", "SCALAR", "COLOR", "ID_IDENT", "CLASS_IDENT", 
			"LOWER_IDENT", "CAPITAL_IDENT", "WS", "OPEN_BRACE", "CLOSE_BRACE", "SEMICOLON", 
			"COLON", "PLUS", "MIN", "MUL", "ASSIGNMENT_OPERATOR", "EQUAL_TO", "GREATER_THAN", 
			"LESS_THAN", "NOT_EQUAL_TO", "GREATER_THAN_OR_EQUAL_TO", "LESS_THAN_OR_EQUAL_TO", 
			"AND", "OR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ICSSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ICSS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00bc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\6\bZ\n\b\r\b\16\b[\3\b\3\b\3\b\3\t\6\tb\n\t\r\t"+
		"\16\tc\3\t\3\t\3\n\6\ni\n\n\r\n\16\nj\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\6\fw\n\f\r\f\16\fx\3\r\3\r\6\r}\n\r\r\r\16\r~\3\16\3"+
		"\16\7\16\u0083\n\16\f\16\16\16\u0086\13\16\3\17\3\17\7\17\u008a\n\17\f"+
		"\17\16\17\u008d\13\17\3\20\6\20\u0090\n\20\r\20\16\20\u0091\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \2\2!\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!\3\2\t\3\2\62"+
		";\4\2\62;ch\5\2//\62;c|\3\2c|\3\2C\\\6\2\62;C\\aac|\5\2\13\f\17\17\"\""+
		"\2\u00c3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5D\3\2\2\2\7I\3\2\2\2"+
		"\tK\3\2\2\2\13M\3\2\2\2\rR\3\2\2\2\17Y\3\2\2\2\21a\3\2\2\2\23h\3\2\2\2"+
		"\25l\3\2\2\2\27t\3\2\2\2\31z\3\2\2\2\33\u0080\3\2\2\2\35\u0087\3\2\2\2"+
		"\37\u008f\3\2\2\2!\u0095\3\2\2\2#\u0097\3\2\2\2%\u0099\3\2\2\2\'\u009b"+
		"\3\2\2\2)\u009d\3\2\2\2+\u009f\3\2\2\2-\u00a1\3\2\2\2/\u00a3\3\2\2\2\61"+
		"\u00a6\3\2\2\2\63\u00a9\3\2\2\2\65\u00ab\3\2\2\2\67\u00ad\3\2\2\29\u00b0"+
		"\3\2\2\2;\u00b3\3\2\2\2=\u00b6\3\2\2\2?\u00b9\3\2\2\2AB\7k\2\2BC\7h\2"+
		"\2C\4\3\2\2\2DE\7g\2\2EF\7n\2\2FG\7u\2\2GH\7g\2\2H\6\3\2\2\2IJ\7]\2\2"+
		"J\b\3\2\2\2KL\7_\2\2L\n\3\2\2\2MN\7V\2\2NO\7T\2\2OP\7W\2\2PQ\7G\2\2Q\f"+
		"\3\2\2\2RS\7H\2\2ST\7C\2\2TU\7N\2\2UV\7U\2\2VW\7G\2\2W\16\3\2\2\2XZ\t"+
		"\2\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7r\2\2^_"+
		"\7z\2\2_\20\3\2\2\2`b\t\2\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2"+
		"de\3\2\2\2ef\7\'\2\2f\22\3\2\2\2gi\t\2\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2"+
		"\2jk\3\2\2\2k\24\3\2\2\2lm\7%\2\2mn\t\3\2\2no\t\3\2\2op\t\3\2\2pq\t\3"+
		"\2\2qr\t\3\2\2rs\t\3\2\2s\26\3\2\2\2tv\7%\2\2uw\t\4\2\2vu\3\2\2\2wx\3"+
		"\2\2\2xv\3\2\2\2xy\3\2\2\2y\30\3\2\2\2z|\7\60\2\2{}\t\4\2\2|{\3\2\2\2"+
		"}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\32\3\2\2\2\u0080\u0084\t\5\2\2\u0081"+
		"\u0083\t\4\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\34\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008b"+
		"\t\6\2\2\u0088\u008a\t\7\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\36\3\2\2\2\u008d\u008b\3\2\2"+
		"\2\u008e\u0090\t\b\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\20\2\2"+
		"\u0094 \3\2\2\2\u0095\u0096\7}\2\2\u0096\"\3\2\2\2\u0097\u0098\7\177\2"+
		"\2\u0098$\3\2\2\2\u0099\u009a\7=\2\2\u009a&\3\2\2\2\u009b\u009c\7<\2\2"+
		"\u009c(\3\2\2\2\u009d\u009e\7-\2\2\u009e*\3\2\2\2\u009f\u00a0\7/\2\2\u00a0"+
		",\3\2\2\2\u00a1\u00a2\7,\2\2\u00a2.\3\2\2\2\u00a3\u00a4\7<\2\2\u00a4\u00a5"+
		"\7?\2\2\u00a5\60\3\2\2\2\u00a6\u00a7\7?\2\2\u00a7\u00a8\7?\2\2\u00a8\62"+
		"\3\2\2\2\u00a9\u00aa\7@\2\2\u00aa\64\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac"+
		"\66\3\2\2\2\u00ad\u00ae\7#\2\2\u00ae\u00af\7?\2\2\u00af8\3\2\2\2\u00b0"+
		"\u00b1\7@\2\2\u00b1\u00b2\7?\2\2\u00b2:\3\2\2\2\u00b3\u00b4\7>\2\2\u00b4"+
		"\u00b5\7?\2\2\u00b5<\3\2\2\2\u00b6\u00b7\7(\2\2\u00b7\u00b8\7(\2\2\u00b8"+
		">\3\2\2\2\u00b9\u00ba\7~\2\2\u00ba\u00bb\7~\2\2\u00bb@\3\2\2\2\13\2[c"+
		"jx~\u0084\u008b\u0091\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
