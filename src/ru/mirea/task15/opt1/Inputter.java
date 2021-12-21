package ru.mirea.task15.opt1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Inputter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter fW = new FileWriter("src/ru/mirea/task15/opt1/gfile_15_1.txt");
            System.out.println("Enter smth:");
            fW.write(sc.nextLine());
            fW.close();
        } catch (IOException e) {
            System.out.println("ErRoR ;_(");
        }
    }
}
