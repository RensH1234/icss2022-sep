// Generated from C:/Users/rensh/Desktop/HAN_ICA/ASD/Compiler/startcode/src/main/antlr4/nl/han/ica/icss/parser\ICSS.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ICSSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ICSSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ICSSParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(ICSSParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#variableassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableassignment(ICSSParser.VariableassignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ICSSParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ICSSParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ICSSParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#scalar_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_literal(ICSSParser.Scalar_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#pixelsize_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPixelsize_literal(ICSSParser.Pixelsize_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#percentage_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentage_literal(ICSSParser.Percentage_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#color_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor_literal(ICSSParser.Color_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(ICSSParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#conditional_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_operator(ICSSParser.Conditional_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(ICSSParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#stylerule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylerule(ICSSParser.StyleruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(ICSSParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#stylerule_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylerule_body(ICSSParser.Stylerule_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#propertyassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyassignment(ICSSParser.PropertyassignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#elseclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseclause(ICSSParser.ElseclauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#ifclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfclause(ICSSParser.IfclauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#elseifclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifclause(ICSSParser.ElseifclauseContext ctx);
}