package ru.mirea.task10.opt6;

import java.util.Scanner;

public class CheckNumPrime {
    public static boolean checkPrime(int n, int d) {
        if (n == 2) return true;
        else if (n % d == 0) return false;
        else if (d < n / 2) return checkPrime(n, d + 1);
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число N:");
        int n = sc.nextInt();
        if (n < 1) return; // dumb
        if (checkPrime(n, 2)) System.out.println("YES");
        else System.out.println("NO");
    }
}
