package razrpop.DSL.flexer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lexer {
    private static final LinkedHashMap<String, Pattern> tokens = new LinkedHashMap<String, Pattern>();

    static {
        //
        tokens.put("COMMENT", Pattern.compile("#.*")); // *

        tokens.put("KW_FOR", Pattern.compile("for")); // *
        tokens.put("KW_WHILE", Pattern.compile("while")); // *
        tokens.put("KW_IF", Pattern.compile("if")); // *

        tokens.put("VAR", Pattern.compile("[a-zA-Z][a-zA-Z0-9]*"));
        //tokens.put("FUNC_NAME", Pattern.compile("f" + tokens.get("VAR").toString())); // хз пока

//        tokens.put("SPACE", Pattern.compile("[\s\n]")); // *

        tokens.put("L_BRACKET", Pattern.compile("\\(")); // 1 cnt
        tokens.put("R_BRACKET", Pattern.compile("\\)")); // 2 cnt
        tokens.put("L_BRACE", Pattern.compile("\\{")); // 1 cnt
        tokens.put("R_BRACE", Pattern.compile("}")); // 2 cnt

        tokens.put("MATH_OP", Pattern.compile("\\+-|\\*{1,2}|/|\\^|%")); // 1
        tokens.put("COMPARISON", Pattern.compile("<=?|>=?|==|!=")); // 1
        tokens.put("ASSIGN_OP", Pattern.compile("=")); // 2

//        tokens.put("STRING", Pattern.compile("\"[\\s0-9a-zA-Z!@#№$;%^:&?*()\\-_=+\\\\|/\\[\\]{}<>']*\"")); // 1
        tokens.put("QUOTE", Pattern.compile("['\"]")); // 2

//        tokens.put("END_LINE", Pattern.compile(";3")); // 1
        tokens.put("INT", Pattern.compile("0|(-?[1-9][0-9]*)")); // 2
        //
    }

    public static void main(String[] args) {
        LinkedList<String> strList = new LinkedList<>();
//        Lexer lxr = new Lexer();
        LinkedList<Token> tokList = new LinkedList<>();

        // Ввод
//        Scanner sc = new Scanner(System.in);

        //* Ввод из файла
        Scanner sc = null;
        try {
            sc = new Scanner(new File("src/razrpop/dsl/flexer/somecode.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //*

        System.out.println("Enter smth");
        for (int i = 0; true; i++) {
            strList.add(i, sc.nextLine());
            if (strList.get(i).isEmpty()) {
                strList.remove(i);
                break;
            }
        }
        System.out.println("Your input:\n " + strList);
        if (strList.isEmpty()) return;

        //* Проверка порядка токенов
//        System.out.println(tokens);
//        for (Token t : tokList) System.out.println(t);
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
            for (String tokName : tokens.keySet()) {
                Pattern rgxPtn = tokens.get(tokName);
                Matcher rgxMtr = rgxPtn.matcher(strG);
//                System.out.println("Token - " + tokName + ":");
                while (rgxMtr.find()) {
                    String tokValue = strG.substring(rgxMtr.start(), rgxMtr.end());
                    Token newTok = new Token(tokName, tokValue);
                    tokList.add(newTok);
                    System.out.println(newTok);
                }
            }
            System.out.println("EOL");
            //*
            //*
        }
        System.out.println("\nRESULT:\n");
        for (Token t : tokList) System.out.println(t);
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