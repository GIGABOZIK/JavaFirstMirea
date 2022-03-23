Добавить FOR


*lang -> expr+
*expr -> VAR ASSIGN_OP expr_value
*expr_value -> value (OP value)
*value _> VAR | DIGIT

for (int i = 0; i < 10; i++)
for (int i = 0; i < 10; i = i + 5)

lang -> (expr)+
expr -> init | keyworder
init -> (type)? VAR ASSIGN_OP expr_value
type -> ...
expr_value -> value (OP value)
value _> VAR | DIGIT
keyworder -> for_keyworder | ...
for_keyworder -> KW_FOR SEP_L_BRACKET (init)? SEP_SEMICOLON (cond)? SEP_SEMICOLON (init)? SEP_R_BRACKET content
cond -> 
content -> (SEP_L_BRACE expr* SEP_R_BRACE) | expr




init_value -> (SEP_L_BRACKET init_value SEP_R_BRACKET) | (value (op_line init_value)*)

lang -> expr+
expr -> init | keyworder
init -> type? IDENT ASSIGN_OP init_value
init_value -> br_expr | nbr_expr
br_expr -> (SEP_L_BRACKET init_value SEP_R_BRACKET)
nbr_expr -> (value (op_line init_value)*)
value -> INT | STRING | IDENT | func
op_line -> POW_OP | MUL_OP | DIV_OP | REM_OP | ADD_OP | SUB_OP













