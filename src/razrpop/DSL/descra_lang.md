14.03.2022

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

_________________________________________________________________

04.04.2022

Реализовать грамматику для:
* беск скобки
* while
* функция (с поддержкой вложенных функций в параметрах)

lang -> expr+
    expr -> init_expr | kw_expr | func_expr | func_decl
        init_expr -> type? IDENT ASSIGN_OP init_value
            type -> 
            init_value -> br_expr | nobr_expr
                br_expr -> (SEP_L_BRACKET init_value SEP_R_BRACKET)
                nobr_expr -> (value (op_line init_value)*)
                    value -> IDENT | INT | STRING | func_expr
                    op_line -> op_arithmetic | op_compare
        kw_expr -> kw_while_expr | ...
            kw_while_expr -> KW_WHILE br_expr SEP_L_BRACE expr+ SEP_R_BRACE
        func_expr -> IDENT SEP_L_BRACKET parameters? SEP_R_BRACKET
            parameters -> (value SEP_COMMA)*
        func_decl -> KW_FUNC IDENT SEP_L_BRACKET parameters_list? SEP_R_BRACKET SEP_L_BRACE expr+ SEP_R_BRACE 

в 107 аудитории







