package ru.mirea.task19.optAlt;

import java.util.Scanner;

public class RightTriangle {
    public static void main (String[] args) throws TriangleExc {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        System.out.println("Enter triangle parameters:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if ((a == 90 || b == 90 || c == 90) && a + b + c == 180 && a * b * c > 0) {
            System.out.println("Triangle is Right");
        } else {
            throw new TriangleExc("Triangle parameters are not right");
        }
    }
}

class TriangleExc extends Exception {
    public TriangleExc (String message) {
        super(message);
    }
}