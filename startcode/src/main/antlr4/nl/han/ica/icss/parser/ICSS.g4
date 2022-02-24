grammar ICSS;

//--- LEXER: ---

// IF support:
ICH01F: 'if';
ELSE: 'else';
BOX_BRACKET_OPEN: '[';
BOX_BRACKET_CLOSE: ']';


//Literals
TRUE: 'TRUE';
FALSE: 'FALSE';
PIXELSIZE: [0-9]+ 'px';
PERCENTAGE: [0-9]+ '%';
SCALAR: [0-9]+;


//Color value takes precedence over id idents
COLOR: '#' [0-9a-f] [0-9a-f] [0-9a-f] [0-9a-f] [0-9a-f] [0-9a-f];

//Specific identifiers for id's and css classes
ID_IDENT: '#' [a-z0-9\-]+;
CLASS_IDENT: '.' [a-z0-9\-]+;

//General identifiers
LOWER_IDENT: [a-z] [a-z0-9\-]*;
CAPITAL_IDENT: [A-Z] [A-Za-z0-9_]*;

//All whitespace is skipped
WS: [ \t\r\n]+ -> skip;

//
OPEN_BRACE: '{';
CLOSE_BRACE: '}';
SEMICOLON: ';';
COLON: ':';
PLUS: '+';
MIN: '-';
MUL: '*';
ASSIGNMENT_OPERATOR: ':=';
EQUAL_TO: '==';
GREATER_THAN: '>';
LESS_THAN: '<';
NOT_EQUAL_TO: '!=';
GREATER_THAN_OR_EQUAL_TO: '>=';
LESS_THAN_OR_EQUAL_TO: '<=';
AND: '&&';
OR: '||';


//--- PARSER: ---
stylesheet: variableassignment* stylerule* EOF;

variableassignment: variable ASSIGNMENT_OPERATOR expression SEMICOLON;
variable: CAPITAL_IDENT;
// The order of the multiple "expression <operator> expression" enabels a correct calculation sequence
expression: variable | literal | expression MUL expression | expression PLUS expression | expression MIN expression;

literal: scalar_literal | pixelsize_literal | percentage_literal | color_literal | bool_literal;
scalar_literal: SCALAR;
pixelsize_literal: PIXELSIZE;
percentage_literal: PERCENTAGE;
color_literal: COLOR;
bool_literal: TRUE | FALSE;
conditional_operator: EQUAL_TO | NOT_EQUAL_TO | LESS_THAN | GREATER_THAN | LESS_THAN_OR_EQUAL_TO | GREATER_THAN_OR_EQUAL_TO;
conditional: variable | bool_literal | variable conditional_operator variable | variable conditional_operator literal |conditional AND conditional | conditional OR conditional;

stylerule: selector OPEN_BRACE stylerule_body CLOSE_BRACE;
selector: ID_IDENT | CLASS_IDENT | LOWER_IDENT;
stylerule_body: ifclause* propertyassignment* variableassignment*;

propertyassignment: LOWER_IDENT COLON expression SEMICOLON;
elseclause: ELSE OPEN_BRACE stylerule_body CLOSE_BRACE;
ifclause: ICH01F BOX_BRACKET_OPEN conditional BOX_BRACKET_CLOSE OPEN_BRACE stylerule_body CLOSE_BRACE (elseifclause*) (elseclause);
elseifclause: ELSE ICH01F BOX_BRACKET_OPEN conditional BOX_BRACKET_CLOSE OPEN_BRACE stylerule_body CLOSE_BRACE;
