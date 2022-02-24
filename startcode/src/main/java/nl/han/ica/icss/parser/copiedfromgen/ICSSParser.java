package nl.han.ica.icss.parser.copiedfromgen;// Generated from C:/Users/rensh/Desktop/HAN_ICA/ASD/Compiler/startcode/src/main/antlr4/nl/han/ica/icss/parser\ICSS.g4 by ANTLR 4.9.2

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ICSSParser extends Parser {
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
	public static final int
		RULE_stylesheet = 0, RULE_variableassignment = 1, RULE_variable = 2, RULE_expression = 3, 
		RULE_literal = 4, RULE_scalar_literal = 5, RULE_pixelsize_literal = 6, 
		RULE_percentage_literal = 7, RULE_color_literal = 8, RULE_bool_literal = 9, 
		RULE_conditional_operator = 10, RULE_conditional_expression = 11, RULE_stylerule = 12, 
		RULE_selector = 13, RULE_body = 14, RULE_declaration = 15, RULE_property = 16, 
		RULE_elseclause = 17, RULE_ifclause = 18, RULE_elseifclause = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"stylesheet", "variableassignment", "variable", "expression", "literal", 
			"scalar_literal", "pixelsize_literal", "percentage_literal", "color_literal", 
			"bool_literal", "conditional_operator", "conditional_expression", "stylerule", 
			"selector", "body", "declaration", "property", "elseclause", "ifclause", 
			"elseifclause"
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

	@Override
	public String getGrammarFileName() { return "ICSS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ICSSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StylesheetContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ICSSParser.EOF, 0); }
		public List<VariableassignmentContext> variableassignment() {
			return getRuleContexts(VariableassignmentContext.class);
		}
		public VariableassignmentContext variableassignment(int i) {
			return getRuleContext(VariableassignmentContext.class,i);
		}
		public List<StyleruleContext> stylerule() {
			return getRuleContexts(StyleruleContext.class);
		}
		public StyleruleContext stylerule(int i) {
			return getRuleContext(StyleruleContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor) return ((ICSSVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CAPITAL_IDENT) {
				{
				{
				setState(40);
				variableassignment();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID_IDENT) | (1L << CLASS_IDENT) | (1L << LOWER_IDENT))) != 0)) {
				{
				{
				setState(46);
				stylerule();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(EOF);
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

	public static class VariableassignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(ICSSParser.ASSIGNMENT_OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ICSSParser.SEMICOLON, 0); }
		public VariableassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).enterVariableassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).exitVariableassignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor) return ((ICSSVisitor<? extends T>)visitor).visitVariableassignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableassignmentContext variableassignment() throws RecognitionException {
		VariableassignmentContext _localctx = new VariableassignmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variableassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			variable();
			setState(55);
			match(ASSIGNMENT_OPERATOR);
			setState(56);
			expression(0);
			setState(57);
			match(SEMICOLON);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode CAPITAL_IDENT() { return getToken(ICSSParser.CAPITAL_IDENT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor) return ((ICSSVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(CAPITAL_IDENT);
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

	public static class ExpressionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ICSSParser.MUL, 0); }
		public TerminalNode PLUS() { return getToken(ICSSParser.PLUS, 0); }
		public TerminalNode MIN() { return getToken(ICSSParser.MIN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor) return ((ICSSVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAPITAL_IDENT:
				{
				setState(62);
				variable();
				}
				break;
			case TRUE:
			case FALSE:
			case PIXELSIZE:
			case PERCENTAGE:
			case SCALAR:
			case COLOR:
				{
				setState(63);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(75);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(66);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(67);
						match(MUL);
						setState(68);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(69);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(70);
						match(PLUS);
						setState(71);
						expression(3);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(72);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(73);
						match(MIN);
						setState(74);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public Scalar_literalContext scalar_literal() {
			return getRuleContext(Scalar_literalContext.class,0);
		}
		public Pixelsize_literalContext pixelsize_literal() {
			return getRuleContext(Pixelsize_literalContext.class,0);
		}
		public Percentage_literalContext percentage_literal() {
			return getRuleContext(Percentage_literalContext.class,0);
		}
		public Color_literalContext color_literal() {
			return getRuleContext(Color_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor) return ((ICSSVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_literal);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCALAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				scalar_literal();
				}
				break;
			case PIXELSIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				pixelsize_literal();
				}
				break;
			case PERCENTAGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				percentage_literal();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				color_literal();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				bool_literal();
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

	public static class Scalar_literalContext extends ParserRuleContext {
		public TerminalNode SCALAR() { return getToken(ICSSParser.SCALAR, 0); }
		public Scalar_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).enterScalar_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).exitScalar_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor) return ((ICSSVisitor<? extends T>)visitor).visitScalar_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scalar_literalContext scalar_literal() throws RecognitionException {
		Scalar_literalContext _localctx = new Scalar_literalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_scalar_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(SCALAR);
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

	public static class Pixelsize_literalContext extends ParserRuleContext {
		public TerminalNode PIXELSIZE() { return getToken(ICSSParser.PIXELSIZE, 0); }
		public Pixelsize_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pixelsize_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).enterPixelsize_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).exitPixelsize_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor) return ((ICSSVisitor<? extends T>)visitor).visitPixelsize_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pixelsize_literalContext pixelsize_literal() throws RecognitionException {
		Pixelsize_literalContext _localctx = new Pixelsize_literalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pixelsize_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(PIXELSIZE);
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

	public static class Percentage_literalContext extends ParserRuleContext {
		public TerminalNode PERCENTAGE() { return getToken(ICSSParser.PERCENTAGE, 0); }
		public Percentage_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percentage_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).enterPercentage_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).exitPercentage_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor) return ((ICSSVisitor<? extends T>)visitor).visitPercentage_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Percentage_literalContext percentage_literal() throws RecognitionException {
		Percentage_literalContext _localctx = new Percentage_literalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_percentage_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(PERCENTAGE);
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

	public static class Color_literalContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(ICSSParser.COLOR, 0); }
		public Color_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).enterColor_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).exitColor_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor) return ((ICSSVisitor<? extends T>)visitor).visitColor_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Color_literalContext color_literal() throws RecognitionException {
		Color_literalContext _localctx = new Color_literalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_color_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(COLOR);
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

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ICSSParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ICSSParser.FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).exitBool_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor) return ((ICSSVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Conditional_operatorContext extends ParserRuleContext {
		public TerminalNode EQUAL_TO() { return getToken(ICSSParser.EQUAL_TO, 0); }
		public TerminalNode NOT_EQUAL_TO() { return getToken(ICSSParser.NOT_EQUAL_TO, 0); }
		public TerminalNode LESS_THAN() { return getToken(ICSSParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(ICSSParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL_TO() { return getToken(ICSSParser.LESS_THAN_OR_EQUAL_TO, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL_TO() { return getToken(ICSSParser.GREATER_THAN_OR_EQUAL_TO, 0); }
		public Conditional_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).enterConditional_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).exitConditional_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor) return ((ICSSVisitor<? extends T>)visitor).visitConditional_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_operatorContext conditional_operator() throws RecognitionException {
		Conditional_operatorContext _localctx = new Conditional_operatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditional_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL_TO) | (1L << GREATER_THAN) | (1L << LESS_THAN) | (1L << NOT_EQUAL_TO) | (1L << GREATER_THAN_OR_EQUAL_TO) | (1L << LESS_THAN_OR_EQUAL_TO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Conditional_expressionContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public Conditional_operatorContext conditional_operator() {
			return getRuleContext(Conditional_operatorContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<Conditional_expressionContext> conditional_expression() {
			return getRuleContexts(Conditional_expressionContext.class);
		}
		public Conditional_expressionContext conditional_expression(int i) {
			return getRuleContext(Conditional_expressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(ICSSParser.AND, 0); }
		public TerminalNode OR() { return getToken(ICSSParser.OR, 0); }
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).exitConditional_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor) return ((ICSSVisitor<? extends T>)visitor).visitConditional_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		return conditional_expression(0);
	}

	private Conditional_expressionContext conditional_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, _parentState);
		Conditional_expressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_conditional_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(100);
				variable();
				}
				break;
			case 2:
				{
				setState(101);
				bool_literal();
				}
				break;
			case 3:
				{
				setState(102);
				variable();
				setState(103);
				conditional_operator();
				setState(104);
				variable();
				}
				break;
			case 4:
				{
				setState(106);
				variable();
				setState(107);
				conditional_operator();
				setState(108);
				literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new Conditional_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional_expression);
						setState(112);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(113);
						match(AND);
						setState(114);
						conditional_expression(3);
						}
						break;
					case 2:
						{
						_localctx = new Conditional_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional_expression);
						setState(115);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(116);
						match(OR);
						setState(117);
						conditional_expression(2);
						}
						break;
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class StyleruleContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(ICSSParser.OPEN_BRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(ICSSParser.CLOSE_BRACE, 0); }
		public StyleruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylerule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).enterStylerule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).exitStylerule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor) return ((ICSSVisitor<? extends T>)visitor).visitStylerule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleruleContext stylerule() throws RecognitionException {
		StyleruleContext _localctx = new StyleruleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stylerule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			selector();
			setState(124);
			match(OPEN_BRACE);
			setState(125);
			body();
			setState(126);
			match(CLOSE_BRACE);
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

	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode ID_IDENT() { return getToken(ICSSParser.ID_IDENT, 0); }
		public TerminalNode CLASS_IDENT() { return getToken(ICSSParser.CLASS_IDENT, 0); }
		public TerminalNode LOWER_IDENT() { return getToken(ICSSParser.LOWER_IDENT, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor) return ((ICSSVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID_IDENT) | (1L << CLASS_IDENT) | (1L << LOWER_IDENT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BodyContext extends ParserRuleContext {
		public List<IfclauseContext> ifclause() {
			return getRuleContexts(IfclauseContext.class);
		}
		public IfclauseContext ifclause(int i) {
			return getRuleContext(IfclauseContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<VariableassignmentContext> variableassignment() {
			return getRuleContexts(VariableassignmentContext.class);
		}
		public VariableassignmentContext variableassignment(int i) {
			return getRuleContext(VariableassignmentContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor) return ((ICSSVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ICH01F) {
				{
				{
				setState(130);
				ifclause();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOWER_IDENT) {
				{
				{
				setState(136);
				declaration();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CAPITAL_IDENT) {
				{
				{
				setState(142);
				variableassignment();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DeclarationContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ICSSParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ICSSParser.SEMICOLON, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor) return ((ICSSVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			property();
			setState(149);
			match(COLON);
			setState(150);
			expression(0);
			setState(151);
			match(SEMICOLON);
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

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode LOWER_IDENT() { return getToken(ICSSParser.LOWER_IDENT, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor) return ((ICSSVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(LOWER_IDENT);
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

	public static class ElseclauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ICSSParser.ELSE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(ICSSParser.OPEN_BRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(ICSSParser.CLOSE_BRACE, 0); }
		public ElseclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).enterElseclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).exitElseclause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor) return ((ICSSVisitor<? extends T>)visitor).visitElseclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseclauseContext elseclause() throws RecognitionException {
		ElseclauseContext _localctx = new ElseclauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elseclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ELSE);
			setState(156);
			match(OPEN_BRACE);
			setState(157);
			body();
			setState(158);
			match(CLOSE_BRACE);
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

	public static class IfclauseContext extends ParserRuleContext {
		public TerminalNode ICH01F() { return getToken(ICSSParser.ICH01F, 0); }
		public TerminalNode BOX_BRACKET_OPEN() { return getToken(ICSSParser.BOX_BRACKET_OPEN, 0); }
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public TerminalNode BOX_BRACKET_CLOSE() { return getToken(ICSSParser.BOX_BRACKET_CLOSE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(ICSSParser.OPEN_BRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(ICSSParser.CLOSE_BRACE, 0); }
		public ElseclauseContext elseclause() {
			return getRuleContext(ElseclauseContext.class,0);
		}
		public List<ElseifclauseContext> elseifclause() {
			return getRuleContexts(ElseifclauseContext.class);
		}
		public ElseifclauseContext elseifclause(int i) {
			return getRuleContext(ElseifclauseContext.class,i);
		}
		public IfclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).enterIfclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).exitIfclause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor) return ((ICSSVisitor<? extends T>)visitor).visitIfclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfclauseContext ifclause() throws RecognitionException {
		IfclauseContext _localctx = new IfclauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifclause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ICH01F);
			setState(161);
			match(BOX_BRACKET_OPEN);
			setState(162);
			conditional_expression(0);
			setState(163);
			match(BOX_BRACKET_CLOSE);
			setState(164);
			match(OPEN_BRACE);
			setState(165);
			body();
			setState(166);
			match(CLOSE_BRACE);
			{
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(167);
					elseifclause();
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
			{
			setState(173);
			elseclause();
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

	public static class ElseifclauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ICSSParser.ELSE, 0); }
		public TerminalNode ICH01F() { return getToken(ICSSParser.ICH01F, 0); }
		public TerminalNode BOX_BRACKET_OPEN() { return getToken(ICSSParser.BOX_BRACKET_OPEN, 0); }
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public TerminalNode BOX_BRACKET_CLOSE() { return getToken(ICSSParser.BOX_BRACKET_CLOSE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(ICSSParser.OPEN_BRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(ICSSParser.CLOSE_BRACE, 0); }
		public ElseifclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).enterElseifclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener) ((ICSSListener)listener).exitElseifclause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor) return ((ICSSVisitor<? extends T>)visitor).visitElseifclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifclauseContext elseifclause() throws RecognitionException {
		ElseifclauseContext _localctx = new ElseifclauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elseifclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ELSE);
			setState(176);
			match(ICH01F);
			setState(177);
			match(BOX_BRACKET_OPEN);
			setState(178);
			conditional_expression(0);
			setState(179);
			match(BOX_BRACKET_CLOSE);
			setState(180);
			match(OPEN_BRACE);
			setState(181);
			body();
			setState(182);
			match(CLOSE_BRACE);
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
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 11:
			return conditional_expression_sempred((Conditional_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditional_expression_sempred(Conditional_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00bb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\5\5C\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5"+
		"\3\6\3\6\3\6\3\6\3\6\5\6X\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rq\n\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\7\ry\n\r\f\r\16\r|\13\r\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\7\20\u0086\n\20\f\20\16\20\u0089\13\20\3\20\7\20\u008c\n\20"+
		"\f\20\16\20\u008f\13\20\3\20\7\20\u0092\n\20\f\20\16\20\u0095\13\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\7\24\u00ab\n\24\f\24\16\24\u00ae\13\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\2\4\b\30\26"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\5\3\2\7\b\3\2\32\37\3"+
		"\2\r\17\2\u00b9\2-\3\2\2\2\48\3\2\2\2\6=\3\2\2\2\bB\3\2\2\2\nW\3\2\2\2"+
		"\fY\3\2\2\2\16[\3\2\2\2\20]\3\2\2\2\22_\3\2\2\2\24a\3\2\2\2\26c\3\2\2"+
		"\2\30p\3\2\2\2\32}\3\2\2\2\34\u0082\3\2\2\2\36\u0087\3\2\2\2 \u0096\3"+
		"\2\2\2\"\u009b\3\2\2\2$\u009d\3\2\2\2&\u00a2\3\2\2\2(\u00b1\3\2\2\2*,"+
		"\5\4\3\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\63\3\2\2\2/-\3\2\2\2"+
		"\60\62\5\32\16\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2"+
		"\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\7\2\2\3\67\3\3\2\2\289\5\6\4\29:"+
		"\7\31\2\2:;\5\b\5\2;<\7\24\2\2<\5\3\2\2\2=>\7\20\2\2>\7\3\2\2\2?@\b\5"+
		"\1\2@C\5\6\4\2AC\5\n\6\2B?\3\2\2\2BA\3\2\2\2CO\3\2\2\2DE\f\5\2\2EF\7\30"+
		"\2\2FN\5\b\5\6GH\f\4\2\2HI\7\26\2\2IN\5\b\5\5JK\f\3\2\2KL\7\27\2\2LN\5"+
		"\b\5\4MD\3\2\2\2MG\3\2\2\2MJ\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\t"+
		"\3\2\2\2QO\3\2\2\2RX\5\f\7\2SX\5\16\b\2TX\5\20\t\2UX\5\22\n\2VX\5\24\13"+
		"\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\13\3\2\2\2YZ\7\13"+
		"\2\2Z\r\3\2\2\2[\\\7\t\2\2\\\17\3\2\2\2]^\7\n\2\2^\21\3\2\2\2_`\7\f\2"+
		"\2`\23\3\2\2\2ab\t\2\2\2b\25\3\2\2\2cd\t\3\2\2d\27\3\2\2\2ef\b\r\1\2f"+
		"q\5\6\4\2gq\5\24\13\2hi\5\6\4\2ij\5\26\f\2jk\5\6\4\2kq\3\2\2\2lm\5\6\4"+
		"\2mn\5\26\f\2no\5\n\6\2oq\3\2\2\2pe\3\2\2\2pg\3\2\2\2ph\3\2\2\2pl\3\2"+
		"\2\2qz\3\2\2\2rs\f\4\2\2st\7 \2\2ty\5\30\r\5uv\f\3\2\2vw\7!\2\2wy\5\30"+
		"\r\4xr\3\2\2\2xu\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\31\3\2\2\2|z\3"+
		"\2\2\2}~\5\34\17\2~\177\7\22\2\2\177\u0080\5\36\20\2\u0080\u0081\7\23"+
		"\2\2\u0081\33\3\2\2\2\u0082\u0083\t\4\2\2\u0083\35\3\2\2\2\u0084\u0086"+
		"\5&\24\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u008d\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\5 "+
		"\21\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0093\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\5\4"+
		"\3\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\37\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\5\"\22"+
		"\2\u0097\u0098\7\25\2\2\u0098\u0099\5\b\5\2\u0099\u009a\7\24\2\2\u009a"+
		"!\3\2\2\2\u009b\u009c\7\17\2\2\u009c#\3\2\2\2\u009d\u009e\7\4\2\2\u009e"+
		"\u009f\7\22\2\2\u009f\u00a0\5\36\20\2\u00a0\u00a1\7\23\2\2\u00a1%\3\2"+
		"\2\2\u00a2\u00a3\7\3\2\2\u00a3\u00a4\7\5\2\2\u00a4\u00a5\5\30\r\2\u00a5"+
		"\u00a6\7\6\2\2\u00a6\u00a7\7\22\2\2\u00a7\u00a8\5\36\20\2\u00a8\u00ac"+
		"\7\23\2\2\u00a9\u00ab\5(\25\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2"+
		"\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00af\u00b0\5$\23\2\u00b0\'\3\2\2\2\u00b1\u00b2\7\4\2\2\u00b2"+
		"\u00b3\7\3\2\2\u00b3\u00b4\7\5\2\2\u00b4\u00b5\5\30\r\2\u00b5\u00b6\7"+
		"\6\2\2\u00b6\u00b7\7\22\2\2\u00b7\u00b8\5\36\20\2\u00b8\u00b9\7\23\2\2"+
		"\u00b9)\3\2\2\2\17-\63BMOWpxz\u0087\u008d\u0093\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
