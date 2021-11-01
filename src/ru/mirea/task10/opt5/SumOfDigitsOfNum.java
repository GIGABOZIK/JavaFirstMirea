package ru.mirea.task10.opt5;

import java.util.Scanner;

public class SumOfDigitsOfNum {
    public static int recDigitSum(int n) {
        if (n % 10 == n) return n;
        return recDigitSum(n / 10) + (n % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число N:");
        int n = sc.nextInt();
        System.out.println("Сумма цифр: " + recDigitSum(n));
    }
}
