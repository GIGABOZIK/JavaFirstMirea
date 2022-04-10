package razrpop.DSL;

import razrpop.DSL.flexer.Lexer;
import razrpop.DSL.flexer.Token;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Lexer lxr = new Lexer();
        LinkedList<Token> tokList = lxr.getTokens();
        System.out.println("\nTokens:\n");
        for (Token token : tokList) System.out.println(token);
    }
}
