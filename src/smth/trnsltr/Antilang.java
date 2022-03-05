package smth.trnsltr;

import java.util.Scanner;

public class Antilang {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        while (scann.hasNextInt())
        {
            int s = scann.nextInt();
            if (s == 0) {
                System.out.print(" ");
            } else {
                System.out.print((char) ('Z' + 1 - s));
            }
        }

    }
}
