package ru.mirea.task15.opt4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Inputter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputText;
        try {
            FileWriter fW = new FileWriter("src/ru/mirea/task15/opt4/gfile_15_4.txt", true);
            System.out.println("Enter smth:");
            inputText = sc.nextLine();
            do {
                fW.append(inputText + "\r\n");
                inputText = sc.nextLine();
            } while (!inputText.isEmpty());
            fW.close();
        } catch (IOException e) {
            System.out.println("ErRoR ;_(");
        }
    }
}
