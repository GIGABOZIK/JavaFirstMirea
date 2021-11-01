package ru.mirea.task1.opt7;

import java.util.Scanner;

public class TestFactorial {
    public static void main(String[] args) {
        //
        System.out.println("New Int:");
        Scanner scanner = new Scanner(System.in);
        int myNum = (scanner.hasNextInt()) ? (scanner.nextInt()) : 0;
        System.out.println("Your Int: " + myNum);
        if (myNum >= 1) {
            int it = 1, output = 1;
            while (it <= myNum) {
                output *= it;
                it++;
            }
            System.out.println(myNum + "! = " + output);
        } else { System.out.println("ErRoR!!!"); }
    }
}
