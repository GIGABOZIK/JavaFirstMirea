package ru.mirea.task15.opt2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Outputter {
    public static void main(String[] args) {
        try {
            Scanner fRead = new Scanner(new File("src/ru/mirea/task15/opt2/gfile_15_2.txt"));
            System.out.println("File content:");
            while (fRead.hasNextLine()) System.out.println(fRead.nextLine());
            fRead.close();
        } catch (FileNotFoundException e) {
            System.out.println("ErRoR ;_(");
        }
    }
}
