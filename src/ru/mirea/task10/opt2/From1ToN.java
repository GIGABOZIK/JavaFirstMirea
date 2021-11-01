package ru.mirea.task10.opt2;

import java.util.Scanner;

public class From1ToN {
    public static void recIntRow(int n) {
        if (n != 1) recIntRow(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число n:");
        int n = sc.nextInt();
        if (n < 1) return; // dumb
        recIntRow(n);
        //for (int i = 1; i < n; i++) System.out.print(i + "; ");
        //System.out.print(n);
    }
}
