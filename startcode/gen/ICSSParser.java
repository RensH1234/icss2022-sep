// Generated from C:/Users/rensh/Desktop/HAN_ICA/ASD/Compiler/startcode/src/main/antlr4/nl/han/ica/icss/parser\ICSS.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

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
		SEMICOLON=18, COLON=19, PLUS=20, MIN=21, MUL=22, ASSIGNMENT_OPERATOR=23;
	public static final int
		RULE_stylesheet = 0, RULE_variableassignment = 1, RULE_variable = 2, RULE_expression = 3, 
		RULE_literal = 4, RULE_scalar_literal = 5, RULE_pixelsize_literal = 6, 
		RULE_percentage_literal = 7, RULE_bool_literal = 8, RULE_color_literal = 9, 
		RULE_stylerule = 10, RULE_selector = 11, RULE_stylerule_body = 12, RULE_propertyassignment = 13, 
		RULE_elseclause = 14, RULE_ifclause = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"stylesheet", "variableassignment", "variable", "expression", "literal", 
			"scalar_literal", "pixelsize_literal", "percentage_literal", "bool_literal", 
			"color_literal", "stylerule", "selector", "stylerule_body", "propertyassignment", 
			"elseclause", "ifclause"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'['", "']'", "'TRUE'", "'FALSE'", null, null, 
			null, null, null, null, null, null, null, "'{'", "'}'", "';'", "':'", 
			"'+'", "'-'", "'*'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ICH01F", "ELSE", "BOX_BRACKET_OPEN", "BOX_BRACKET_CLOSE", "TRUE", 
			"FALSE", "PIXELSIZE", "PERCENTAGE", "SCALAR", "COLOR", "ID_IDENT", "CLASS_IDENT", 
			"LOWER_IDENT", "CAPITAL_IDENT", "WS", "OPEN_BRACE", "CLOSE_BRACE", "SEMICOLON", 
			"COLON", "PLUS", "MIN", "MUL", "ASSIGNMENT_OPERATOR"
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
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitStylesheet(this);
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
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CAPITAL_IDENT) {
				{
				{
				setState(32);
				variableassignment();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID_IDENT) | (1L << CLASS_IDENT) | (1L << LOWER_IDENT))) != 0)) {
				{
				{
				setState(38);
				stylerule();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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
		public TerminalNode SEMICOLON() { return getToken(ICSSParser.SEMICOLON, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> ASSIGNMENT_OPERATOR() { return getTokens(ICSSParser.ASSIGNMENT_OPERATOR); }
		public TerminalNode ASSIGNMENT_OPERATOR(int i) {
			return getToken(ICSSParser.ASSIGNMENT_OPERATOR, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VariableassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterVariableassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitVariableassignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitVariableassignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableassignmentContext variableassignment() throws RecognitionException {
		VariableassignmentContext _localctx = new VariableassignmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variableassignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				variable();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CAPITAL_IDENT );
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				match(ASSIGNMENT_OPERATOR);
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ASSIGNMENT_OPERATOR );
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				expression(0);
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << PIXELSIZE) | (1L << PERCENTAGE) | (1L << SCALAR) | (1L << COLOR) | (1L << CAPITAL_IDENT))) != 0) );
			setState(61);
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
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
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
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitExpression(this);
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
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAPITAL_IDENT:
				{
				setState(66);
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
				setState(67);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(79);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(70);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(71);
						match(MUL);
						setState(72);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(73);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(74);
						match(PLUS);
						setState(75);
						expression(3);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(76);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(77);
						match(MIN);
						setState(78);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_literal);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCALAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				scalar_literal();
				}
				break;
			case PIXELSIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				pixelsize_literal();
				}
				break;
			case PERCENTAGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				percentage_literal();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				color_literal();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
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
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterScalar_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitScalar_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitScalar_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scalar_literalContext scalar_literal() throws RecognitionException {
		Scalar_literalContext _localctx = new Scalar_literalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_scalar_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
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
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterPixelsize_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitPixelsize_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitPixelsize_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pixelsize_literalContext pixelsize_literal() throws RecognitionException {
		Pixelsize_literalContext _localctx = new Pixelsize_literalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pixelsize_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
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
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterPercentage_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitPercentage_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitPercentage_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Percentage_literalContext percentage_literal() throws RecognitionException {
		Percentage_literalContext _localctx = new Percentage_literalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_percentage_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
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

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ICSSParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ICSSParser.FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitBool_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
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

	public static class Color_literalContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(ICSSParser.COLOR, 0); }
		public Color_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterColor_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitColor_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitColor_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Color_literalContext color_literal() throws RecognitionException {
		Color_literalContext _localctx = new Color_literalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_color_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
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

	public static class StyleruleContext extends ParserRuleContext {
		public TerminalNode CLOSE_BRACE() { return getToken(ICSSParser.CLOSE_BRACE, 0); }
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> OPEN_BRACE() { return getTokens(ICSSParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(ICSSParser.OPEN_BRACE, i);
		}
		public List<Stylerule_bodyContext> stylerule_body() {
			return getRuleContexts(Stylerule_bodyContext.class);
		}
		public Stylerule_bodyContext stylerule_body(int i) {
			return getRuleContext(Stylerule_bodyContext.class,i);
		}
		public StyleruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylerule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterStylerule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitStylerule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitStylerule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleruleContext stylerule() throws RecognitionException {
		StyleruleContext _localctx = new StyleruleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stylerule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				selector();
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID_IDENT) | (1L << CLASS_IDENT) | (1L << LOWER_IDENT))) != 0) );
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106);
				match(OPEN_BRACE);
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_BRACE );
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				stylerule_body();
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ICH01F) | (1L << LOWER_IDENT) | (1L << CAPITAL_IDENT))) != 0) );
			setState(116);
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
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
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

	public static class Stylerule_bodyContext extends ParserRuleContext {
		public IfclauseContext ifclause() {
			return getRuleContext(IfclauseContext.class,0);
		}
		public PropertyassignmentContext propertyassignment() {
			return getRuleContext(PropertyassignmentContext.class,0);
		}
		public VariableassignmentContext variableassignment() {
			return getRuleContext(VariableassignmentContext.class,0);
		}
		public Stylerule_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylerule_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterStylerule_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitStylerule_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitStylerule_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stylerule_bodyContext stylerule_body() throws RecognitionException {
		Stylerule_bodyContext _localctx = new Stylerule_bodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stylerule_body);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ICH01F:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				ifclause();
				}
				break;
			case LOWER_IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				propertyassignment();
				}
				break;
			case CAPITAL_IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				variableassignment();
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

	public static class PropertyassignmentContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(ICSSParser.SEMICOLON, 0); }
		public List<TerminalNode> LOWER_IDENT() { return getTokens(ICSSParser.LOWER_IDENT); }
		public TerminalNode LOWER_IDENT(int i) {
			return getToken(ICSSParser.LOWER_IDENT, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ICSSParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ICSSParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PropertyassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterPropertyassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitPropertyassignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitPropertyassignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyassignmentContext propertyassignment() throws RecognitionException {
		PropertyassignmentContext _localctx = new PropertyassignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_propertyassignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				match(LOWER_IDENT);
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LOWER_IDENT );
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				match(COLON);
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COLON );
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135);
				expression(0);
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << PIXELSIZE) | (1L << PERCENTAGE) | (1L << SCALAR) | (1L << COLOR) | (1L << CAPITAL_IDENT))) != 0) );
			setState(140);
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

	public static class ElseclauseContext extends ParserRuleContext {
		public TerminalNode CLOSE_BRACE() { return getToken(ICSSParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> ELSE() { return getTokens(ICSSParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(ICSSParser.ELSE, i);
		}
		public List<TerminalNode> OPEN_BRACE() { return getTokens(ICSSParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(ICSSParser.OPEN_BRACE, i);
		}
		public List<Stylerule_bodyContext> stylerule_body() {
			return getRuleContexts(Stylerule_bodyContext.class);
		}
		public Stylerule_bodyContext stylerule_body(int i) {
			return getRuleContext(Stylerule_bodyContext.class,i);
		}
		public ElseclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterElseclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitElseclause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitElseclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseclauseContext elseclause() throws RecognitionException {
		ElseclauseContext _localctx = new ElseclauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elseclause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(142);
				match(ELSE);
				}
				}
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ELSE );
			setState(148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				match(OPEN_BRACE);
				}
				}
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_BRACE );
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(152);
				stylerule_body();
				}
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ICH01F) | (1L << LOWER_IDENT) | (1L << CAPITAL_IDENT))) != 0) );
			setState(157);
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
		public List<TerminalNode> ICH01F() { return getTokens(ICSSParser.ICH01F); }
		public TerminalNode ICH01F(int i) {
			return getToken(ICSSParser.ICH01F, i);
		}
		public List<TerminalNode> BOX_BRACKET_OPEN() { return getTokens(ICSSParser.BOX_BRACKET_OPEN); }
		public TerminalNode BOX_BRACKET_OPEN(int i) {
			return getToken(ICSSParser.BOX_BRACKET_OPEN, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<Bool_literalContext> bool_literal() {
			return getRuleContexts(Bool_literalContext.class);
		}
		public Bool_literalContext bool_literal(int i) {
			return getRuleContext(Bool_literalContext.class,i);
		}
		public List<TerminalNode> BOX_BRACKET_CLOSE() { return getTokens(ICSSParser.BOX_BRACKET_CLOSE); }
		public TerminalNode BOX_BRACKET_CLOSE(int i) {
			return getToken(ICSSParser.BOX_BRACKET_CLOSE, i);
		}
		public List<TerminalNode> OPEN_BRACE() { return getTokens(ICSSParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(ICSSParser.OPEN_BRACE, i);
		}
		public List<Stylerule_bodyContext> stylerule_body() {
			return getRuleContexts(Stylerule_bodyContext.class);
		}
		public Stylerule_bodyContext stylerule_body(int i) {
			return getRuleContext(Stylerule_bodyContext.class,i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(ICSSParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(ICSSParser.CLOSE_BRACE, i);
		}
		public ElseclauseContext elseclause() {
			return getRuleContext(ElseclauseContext.class,0);
		}
		public IfclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterIfclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitIfclause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICSSVisitor ) return ((ICSSVisitor<? extends T>)visitor).visitIfclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfclauseContext ifclause() throws RecognitionException {
		IfclauseContext _localctx = new IfclauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifclause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				match(ICH01F);
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ICH01F );
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164);
				match(BOX_BRACKET_OPEN);
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BOX_BRACKET_OPEN );
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(171);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CAPITAL_IDENT:
					{
					setState(169);
					variable();
					}
					break;
				case TRUE:
				case FALSE:
					{
					setState(170);
					bool_literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << CAPITAL_IDENT))) != 0) );
			setState(176); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(175);
				match(BOX_BRACKET_CLOSE);
				}
				}
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BOX_BRACKET_CLOSE );
			setState(181); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(180);
				match(OPEN_BRACE);
				}
				}
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_BRACE );
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				stylerule_body();
				}
				}
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ICH01F) | (1L << LOWER_IDENT) | (1L << CAPITAL_IDENT))) != 0) );
			setState(191); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(190);
					match(CLOSE_BRACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(193); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(195);
				elseclause();
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00c9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\6\3\62\n"+
		"\3\r\3\16\3\63\3\3\6\3\67\n\3\r\3\16\38\3\3\6\3<\n\3\r\3\16\3=\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\5\5G\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5"+
		"R\n\5\f\5\16\5U\13\5\3\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\6\fi\n\f\r\f\16\fj\3\f\6\fn\n\f\r\f\16\fo\3"+
		"\f\6\fs\n\f\r\f\16\ft\3\f\3\f\3\r\3\r\3\16\3\16\3\16\5\16~\n\16\3\17\6"+
		"\17\u0081\n\17\r\17\16\17\u0082\3\17\6\17\u0086\n\17\r\17\16\17\u0087"+
		"\3\17\6\17\u008b\n\17\r\17\16\17\u008c\3\17\3\17\3\20\6\20\u0092\n\20"+
		"\r\20\16\20\u0093\3\20\6\20\u0097\n\20\r\20\16\20\u0098\3\20\6\20\u009c"+
		"\n\20\r\20\16\20\u009d\3\20\3\20\3\21\6\21\u00a3\n\21\r\21\16\21\u00a4"+
		"\3\21\6\21\u00a8\n\21\r\21\16\21\u00a9\3\21\3\21\6\21\u00ae\n\21\r\21"+
		"\16\21\u00af\3\21\6\21\u00b3\n\21\r\21\16\21\u00b4\3\21\6\21\u00b8\n\21"+
		"\r\21\16\21\u00b9\3\21\6\21\u00bd\n\21\r\21\16\21\u00be\3\21\6\21\u00c2"+
		"\n\21\r\21\16\21\u00c3\3\21\5\21\u00c7\n\21\3\21\2\3\b\22\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \2\4\3\2\7\b\3\2\r\17\2\u00d9\2%\3\2\2\2\4"+
		"\61\3\2\2\2\6A\3\2\2\2\bF\3\2\2\2\n[\3\2\2\2\f]\3\2\2\2\16_\3\2\2\2\20"+
		"a\3\2\2\2\22c\3\2\2\2\24e\3\2\2\2\26h\3\2\2\2\30x\3\2\2\2\32}\3\2\2\2"+
		"\34\u0080\3\2\2\2\36\u0091\3\2\2\2 \u00a2\3\2\2\2\"$\5\4\3\2#\"\3\2\2"+
		"\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&+\3\2\2\2\'%\3\2\2\2(*\5\26\f\2)(\3"+
		"\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\2\2\3/\3"+
		"\3\2\2\2\60\62\5\6\4\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64"+
		"\3\2\2\2\64\66\3\2\2\2\65\67\7\31\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3"+
		"\2\2\289\3\2\2\29;\3\2\2\2:<\5\b\5\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3"+
		"\2\2\2>?\3\2\2\2?@\7\24\2\2@\5\3\2\2\2AB\7\20\2\2B\7\3\2\2\2CD\b\5\1\2"+
		"DG\5\6\4\2EG\5\n\6\2FC\3\2\2\2FE\3\2\2\2GS\3\2\2\2HI\f\5\2\2IJ\7\30\2"+
		"\2JR\5\b\5\6KL\f\4\2\2LM\7\26\2\2MR\5\b\5\5NO\f\3\2\2OP\7\27\2\2PR\5\b"+
		"\5\4QH\3\2\2\2QK\3\2\2\2QN\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\t\3"+
		"\2\2\2US\3\2\2\2V\\\5\f\7\2W\\\5\16\b\2X\\\5\20\t\2Y\\\5\24\13\2Z\\\5"+
		"\22\n\2[V\3\2\2\2[W\3\2\2\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\13\3\2\2\2"+
		"]^\7\13\2\2^\r\3\2\2\2_`\7\t\2\2`\17\3\2\2\2ab\7\n\2\2b\21\3\2\2\2cd\t"+
		"\2\2\2d\23\3\2\2\2ef\7\f\2\2f\25\3\2\2\2gi\5\30\r\2hg\3\2\2\2ij\3\2\2"+
		"\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2ln\7\22\2\2ml\3\2\2\2no\3\2\2\2om\3\2"+
		"\2\2op\3\2\2\2pr\3\2\2\2qs\5\32\16\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3"+
		"\2\2\2uv\3\2\2\2vw\7\23\2\2w\27\3\2\2\2xy\t\3\2\2y\31\3\2\2\2z~\5 \21"+
		"\2{~\5\34\17\2|~\5\4\3\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\33\3\2\2\2\177"+
		"\u0081\7\17\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0086\7\25\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u008a\3\2\2\2\u0089\u008b\5\b\5\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u008f\7\24\2\2\u008f\35\3\2\2\2\u0090\u0092\7\4\2\2\u0091\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0096\3\2\2\2\u0095\u0097\7\22\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3"+
		"\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a"+
		"\u009c\5\32\16\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3"+
		"\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7\23\2\2\u00a0"+
		"\37\3\2\2\2\u00a1\u00a3\7\3\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2"+
		"\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a8"+
		"\7\5\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00ae\5\6\4\2\u00ac\u00ae\5\22"+
		"\n\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00b3\7\6"+
		"\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b8\7\22\2\2\u00b7\u00b6\3"+
		"\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bc\3\2\2\2\u00bb\u00bd\5\32\16\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3"+
		"\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00c2\7\23\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c7\5\36\20\2\u00c6"+
		"\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7!\3\2\2\2\36%+\638=FQS[jot}\u0082"+
		"\u0087\u008c\u0093\u0098\u009d\u00a4\u00a9\u00ad\u00af\u00b4\u00b9\u00be"+
		"\u00c3\u00c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}