package ru.mirea.task10.opt3;

import java.util.Scanner;

public class FromAToB {
    public static void recNumRow(int a, int b) {
        System.out.println(a);
        if (a == b) return;
        else if (a < b) recNumRow(a + 1, b);
        else recNumRow(a - 1, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целые числа A и B:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        recNumRow(a, b);
    }
}
