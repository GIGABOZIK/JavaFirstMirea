package razrpop.DSL.flexer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lexer {
    private static final LinkedHashMap<String, Pattern> tokens = new LinkedHashMap<String, Pattern>();

    static {
        // Константы: числа/строки ( 2 0.11 "Текстик да" )
        // Имена переменных \ функций: VAR FUNC_NAME
        // Ключевые слова: KW double float int string do if else while for and or break True False print
        // Знаки операций: + - =
        // Разделители: ; [] ,
        //
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
        // KW BOOL,INT,STRING..
        tokens.put("KW_LOGIC_AND", Pattern.compile("and")); // *
        tokens.put("KW_LOGIC_OR", Pattern.compile("or")); // *

        tokens.put("KW_LOGIC_TRUE", Pattern.compile("True")); // *
        tokens.put("KW_LOGIC_FALSE", Pattern.compile("False")); // *

        tokens.put("IDENT", Pattern.compile("[a-z]([a-zA-Z\\d])*")); //
        tokens.put("INT", Pattern.compile("0|(-?[1-9](\\d)*)")); //
        tokens.put("STRING", Pattern.compile("\"(.*)\"")); //
//        tokens.put("STRING", Pattern.compile("\"[\\s0-9a-zA-Z!@#№$;%^:&?*()\\-_=+\\\\|/\\[\\]{}<>']*\"")); //
        tokens.put("FUNC_NAME", Pattern.compile("[a-zA-Z][a-zA-Z0-9]*\\([.]*\\)")); // хз пока

        // COMMENT

        tokens.put("KW_VAR", Pattern.compile("Var")); // *
        tokens.put("KW_BOOL", Pattern.compile("Bool")); // *
        tokens.put("KW_INT", Pattern.compile("Int")); // *
        tokens.put("KW_STRING", Pattern.compile("String")); // *

//        tokens.put("MATH_OP", Pattern.compile("\\+-|\\*{1,2}|/|\\^|%")); // 1

        // Доступ через указатель //
        tokens.put("POW_OP", Pattern.compile("\\*\\*")); //
        tokens.put("MUL_OP", Pattern.compile("\\*")); //
        tokens.put("DIV_OP", Pattern.compile("/")); //
        tokens.put("REM_OP", Pattern.compile("%")); //
        // Преобразование типа //
        tokens.put("ADD_OP", Pattern.compile("\\+")); //
        tokens.put("SUB_OP", Pattern.compile("-")); //
        // Сдвиг влево \ вправо в 2 с.с. //
        tokens.put("COMP_VAL", Pattern.compile("<=?|>=?")); //
        tokens.put("COMP_EQL", Pattern.compile("==|!=")); //
        tokens.put("B_AND", Pattern.compile("&")); //
        tokens.put("B_XOR", Pattern.compile("\\^")); //
        tokens.put("B_OR", Pattern.compile("\\|")); //
        tokens.put("LOGIC_AND", Pattern.compile("&&")); //
        tokens.put("LOGIC_OR", Pattern.compile("\\|\\|")); //
        // cond ? (a_if_true) : (b_if_false) //

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

    public static void main(String[] args) {
        LinkedList<String> strList = new LinkedList<>();
        Lexer lxr = new Lexer();
//        LinkedList<Token> tokList = new LinkedList<>();

        // Ввод
            // Подключение консоли
//            Scanner sc = new Scanner(System.in);
            // Подключение файла
            Scanner sc = null;
            try {
                sc = new Scanner(new File("src/razrpop/dsl/flexer/somecode.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            //
        System.out.println("Enter smth");
        for (int i = 0; true; i++) {
            strList.add(i, sc.nextLine());
            if (strList.get(i).isEmpty()) {
                strList.remove(i);
                break;
            }
        }
        System.out.println("Your input:\n " + strList); // Проверка ввода
        if (strList.isEmpty()) return;

        //* Проверка порядка токенов
        System.out.println(tokens);
//        for (Token t : lxr.tokList) System.out.println(t);
        //*

        // Обработка введенных данных
        for (String strG : strList) {
            // Обработка строки

            //* Обработка строка #3
//            String subStrG = strG;
//            while (!subStrG.isEmpty()) {
//                for (String tokName : tokens.keySet()) {
//                    Pattern rgxPtn = tokens.get(tokName);
//                    Matcher rgxMtr = rgxPtn.matcher(subStrG);
//                    while (rgxMtr.find()) {
////                        System.out.print(tokName + " : "); //*
//                        String tokValue = subStrG.substring(rgxMtr.start(), rgxMtr.end());
//                        Token newTok = new Token(tokName, tokValue);
//                        tokList.add(newTok);
//                        System.out.println(newTok);
//                        subStrG = subStrG.substring(rgxMtr.end());
//                        break;
//                    }
////                    System.out.println(" gg ");
//                }
//            }
//            System.out.println("EOL");
            //*

            //* Обработка строки #4
//            for (String tokName : tokens.keySet()) {
//                Pattern rgxPtn = tokens.get(tokName);
//                Matcher rgxMtr = rgxPtn.matcher(strG);
//                if (rgxMtr.find()) {
////                    System.out.print(tokName + " : "); //*
//                    String tokValue = strG.substring(rgxMtr.start(), rgxMtr.end());
//                    Token newTok = new Token(tokName, tokValue);
//                    tokList.add(newTok);
//                    System.out.println(newTok);
//                }
//            }
            //*

            //* Обработка строки #5
//            for (String tokName : tokens.keySet()) {
//                Pattern rgxPtn = tokens.get(tokName);
//                Matcher rgxMtr = rgxPtn.matcher(strG);
////                System.out.println("Token - " + tokName + ":");
//                while (rgxMtr.find()) {
//                    String tokValue = strG.substring(rgxMtr.start(), rgxMtr.end());
//                    Token newTok = new Token(tokName, tokValue);
//                    tokList.add(newTok);
//                    System.out.println(newTok);
//                }
//            }
//            System.out.println("EOL");
            //*
            //* Обработка строки #6
            strProcessor(lxr, strG);
            System.out.println("EOL");
//          //*
        }
        System.out.println("\nRESULT:\n");
        for (Token token : lxr.tokList) System.out.println(token);
    }

    private static void strProcessor (Lexer lxr, String strG) {
        if (strG.isEmpty()) return;
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
//                    Token newTok = new Token(tokName, tokValue, rgxMtr.start(), rgxMtr.end());
                    Token newTok = new Token(tokName, tokValue);
//                    if (!tokName.equals("SPACE"))
                        System.out.println(newTok);
                    lxr.tokList.add(newTok);
                }
            }
        }
        if (tokCnt == 0) pos++;
        strProcessor(lxr, strG.substring(pos));
    }
}

    /*
Ввод 000:
go code with me
lets try again
ill show you some magic

Ввод 001:
a40;3

Ввод 002:
som4juice = 23 + 72f * (myLexer);

Ввод 003:
#commentario
int leVar = -123 + 43;3

Ввод 004:
#commentario
int leVar = (-123 + 43) / 25 ** a;3
String sweet = "my string";3

    */