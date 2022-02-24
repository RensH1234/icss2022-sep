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
bool_literal: TRUE | FALSE;
color_literal: COLOR;

stylerule: selector OPEN_BRACE stylerule_body CLOSE_BRACE;
selector: ID_IDENT | CLASS_IDENT | LOWER_IDENT;
stylerule_body: ifclause* propertyassignment* variableassignment*;

propertyassignment: LOWER_IDENT COLON expression SEMICOLON;
elseclause: ELSE OPEN_BRACE stylerule_body CLOSE_BRACE;
ifclause: ICH01F BOX_BRACKET_OPEN conditional BOX_BRACKET_CLOSE OPEN_BRACE stylerule_body CLOSE_BRACE (elseclause);
conditional: variable | bool_literal;
