package razrpop.DSL.flexer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Lexer
public class Lexer {
    private static final LinkedHashMap<String, Pattern> tokens = new LinkedHashMap<String, Pattern>();
    static {
        tokens.put("OL_COMMENT", Pattern.compile("#.*")); // *
        // multi_line_comment // *

//        tokens.put("SPACE", Pattern.compile("\s+")); // *

        // KW_VAR
        tokens.put("KW_BEGIN", Pattern.compile("begin")); // *
        tokens.put("KW_END", Pattern.compile("end")); // *
        tokens.put("KW_WHILE", Pattern.compile("while")); // *
        tokens.put("KW_DO", Pattern.compile("do")); // *
        tokens.put("KW_IF", Pattern.compile("if")); // *
        tokens.put("KW_THEN", Pattern.compile("then")); // *
        tokens.put("KW_ELSE", Pattern.compile("else")); // *
        tokens.put("KW_FOR", Pattern.compile("for")); // *
        // to // *
        tokens.put("KW_READ", Pattern.compile("read")); // *
        tokens.put("KW_WRITE", Pattern.compile("write")); // *
        //******** KW BOOL,INT,STRING..
        tokens.put("KW_VAR", Pattern.compile("Var")); // *
        tokens.put("KW_BOOL", Pattern.compile("Bool")); // *
        tokens.put("KW_INT", Pattern.compile("Int")); // *
        tokens.put("KW_STRING", Pattern.compile("String")); // *
        //******** KW BOOL,INT,STRING..
        tokens.put("KW_LOGIC_AND", Pattern.compile("and")); // *
        tokens.put("KW_LOGIC_OR", Pattern.compile("or")); // *

        tokens.put("KW_LOGIC_TRUE", Pattern.compile("True")); // *
        tokens.put("KW_LOGIC_FALSE", Pattern.compile("False")); // *

        tokens.put("IDENT", Pattern.compile("[a-z]([a-zA-Z\\d])*")); //
        tokens.put("INT", Pattern.compile("0|(-?[1-9](\\d)*)")); //
        tokens.put("STRING", Pattern.compile("\"(.*)\"")); //
//        tokens.put("FUNC_NAME", Pattern.compile("[a-zA-Z][a-zA-Z0-9]*\\([.]*\\)")); // хз пока

        // COMMENT

        /*
        tokens.put("KW_VAR", Pattern.compile("Var")); // *
        tokens.put("KW_BOOL", Pattern.compile("Bool")); // *
        tokens.put("KW_INT", Pattern.compile("Int")); // *
        tokens.put("KW_STRING", Pattern.compile("String")); // *
         */

//        tokens.put("MATH_OP", Pattern.compile("\\+-|\\*{1,2}|/|\\^|%")); // 1

        // Доступ через указатель //
        tokens.put("POW_OP", Pattern.compile("\\*\\*")); //
        tokens.put("MUL_OP", Pattern.compile("\\*")); //
        tokens.put("DIV_OP", Pattern.compile("/")); //
        tokens.put("REM_OP", Pattern.compile("%")); //
        // Преобразование типа //
        tokens.put("ADD_OP", Pattern.compile("\\+")); //
        tokens.put("SUB_OP", Pattern.compile("-")); //
        // Битовый Сдвиг влево-вправо //
        tokens.put("COMP_VAL", Pattern.compile("<=?|>=?")); //
        tokens.put("COMP_EQL", Pattern.compile("==|!=")); //
        tokens.put("B_AND", Pattern.compile("&")); //
        tokens.put("B_XOR", Pattern.compile("\\^")); //
        tokens.put("B_OR", Pattern.compile("\\|")); //
        tokens.put("LOGIC_AND", Pattern.compile("&&")); //
        tokens.put("LOGIC_OR", Pattern.compile("\\|\\|")); //
        // cond ? (a_if_true) : (b_if_false) //

        //+++++ ++ -- += -=...

        tokens.put("ASSIGN_OP", Pattern.compile("=")); //

        tokens.put("SEP_END_LINE", Pattern.compile("(;3)")); // * хз
//        tokens.put("SEP_END_LINE", Pattern.compile("(;\\))")); // * хз

        tokens.put("SEP_L_BRACKET", Pattern.compile("\\(")); // cnt
        tokens.put("SEP_R_BRACKET", Pattern.compile("\\)")); // cnt
        tokens.put("SEP_L_BRACE", Pattern.compile("\\{")); // cnt
        tokens.put("SEP_R_BRACE", Pattern.compile("}")); // cnt
        tokens.put("SEP_SEMICOLON", Pattern.compile(";\s")); //
        tokens.put("SEP_COLON", Pattern.compile(":")); //
        tokens.put("SEP_COMMA", Pattern.compile(",")); //
        tokens.put("SEP_DOT", Pattern.compile("\\.")); //
        tokens.put("SEP_QUOTE", Pattern.compile("['\"]")); // хз
        //
    }
    private LinkedList<Token> tokList = new LinkedList<>();
// main
    public static void main(String[] args) {
        Lexer lxr = new Lexer();
//        lxr.getTokens();
        lxr.getTokens();
    }
// readInput
    private LinkedList<String> readInput() {
        System.out.println("Выбери тип ввода: (0 - файл, 1 - консоль)");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 0 -> {
                System.out.println("INPUT - FILE");
                sc = null;
                try {
                    sc = new Scanner(new File("src/razrpop/dsl/somecode.txt"));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            case 1 -> {
                System.out.println("INPUT - CONSOLE");
                sc = new Scanner(System.in);
            }
        }
        LinkedList<String> strList = new LinkedList<>();
        for (int i = 0; true; i++) {
            strList.add(i, sc.nextLine());
            if (strList.get(i).isEmpty()) {
                strList.remove(i);
                break;
            }
        }
        return strList;
    }
// getTokens
    public LinkedList<Token> getTokens() {
        LinkedList<String> strList;
        LinkedList<Token> tokList = new LinkedList<>();
        // Ввод
        strList = readInput();
        //
        System.out.println("Your input:\n " + strList); // Проверка ввода
        if (strList.isEmpty()) return tokList;
        //
        // Обработка введенных данных
        for (String strG : strList) {
            while (!strG.isEmpty()) {
                int pos = 0;
                int tokCnt = 0;
                for (String tokName : tokens.keySet()) {
                    Pattern rgxPtn = tokens.get(tokName);
                    Matcher rgxMtr = rgxPtn.matcher(strG);
                    if (rgxMtr.find()) {
                        if (rgxMtr.start() == pos) {
                            tokCnt++;
                            pos = rgxMtr.end();
                            String tokValue = strG.substring(rgxMtr.start(), rgxMtr.end());
                            Token newTok = new Token(tokName, tokValue);
    //                    if (!tokName.equals("SPACE"))
//                            System.out.println(newTok);
                            tokList.add(newTok);
                        }
                    }
                }
                if (tokCnt == 0) pos++;
                strG = strG.substring(pos);
            }
//            System.out.println("EOL");
        }
//        System.out.println("\nRESULT:\n");
//        for (Token token : tokList) System.out.println(token);
        return tokList;
    }
}
