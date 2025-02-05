// Generated from C:/Users/rensh/Desktop/HAN_ICA/ASD/Compiler/startcode/src/main/antlr4/nl/han/ica/icss/parser\ICSS.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ICSSParser}.
 */
public interface ICSSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ICSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(ICSSParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(ICSSParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#variableassignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableassignment(ICSSParser.VariableassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#variableassignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableassignment(ICSSParser.VariableassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ICSSParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ICSSParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ICSSParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ICSSParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ICSSParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ICSSParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#scalar_literal}.
	 * @param ctx the parse tree
	 */
	void enterScalar_literal(ICSSParser.Scalar_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#scalar_literal}.
	 * @param ctx the parse tree
	 */
	void exitScalar_literal(ICSSParser.Scalar_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#pixelsize_literal}.
	 * @param ctx the parse tree
	 */
	void enterPixelsize_literal(ICSSParser.Pixelsize_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#pixelsize_literal}.
	 * @param ctx the parse tree
	 */
	void exitPixelsize_literal(ICSSParser.Pixelsize_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#percentage_literal}.
	 * @param ctx the parse tree
	 */
	void enterPercentage_literal(ICSSParser.Percentage_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#percentage_literal}.
	 * @param ctx the parse tree
	 */
	void exitPercentage_literal(ICSSParser.Percentage_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#color_literal}.
	 * @param ctx the parse tree
	 */
	void enterColor_literal(ICSSParser.Color_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#color_literal}.
	 * @param ctx the parse tree
	 */
	void exitColor_literal(ICSSParser.Color_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(ICSSParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(ICSSParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void enterConditional_operator(ICSSParser.Conditional_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void exitConditional_operator(ICSSParser.Conditional_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(ICSSParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(ICSSParser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#stylerule}.
	 * @param ctx the parse tree
	 */
	void enterStylerule(ICSSParser.StyleruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#stylerule}.
	 * @param ctx the parse tree
	 */
	void exitStylerule(ICSSParser.StyleruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(ICSSParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(ICSSParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ICSSParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ICSSParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ICSSParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ICSSParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(ICSSParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(ICSSParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#elseclause}.
	 * @param ctx the parse tree
	 */
	void enterElseclause(ICSSParser.ElseclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#elseclause}.
	 * @param ctx the parse tree
	 */
	void exitElseclause(ICSSParser.ElseclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#ifclause}.
	 * @param ctx the parse tree
	 */
	void enterIfclause(ICSSParser.IfclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#ifclause}.
	 * @param ctx the parse tree
	 */
	void exitIfclause(ICSSParser.IfclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#elseifclause}.
	 * @param ctx the parse tree
	 */
	void enterElseifclause(ICSSParser.ElseifclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#elseifclause}.
	 * @param ctx the parse tree
	 */
	void exitElseifclause(ICSSParser.ElseifclauseContext ctx);
}