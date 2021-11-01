package ru.mirea.task8.opt2;

import javax.swing.*;
import java.util.Scanner;

public class Appobozik extends JFrame {
    // Fields:
    // Constructors:
    public Appobozik() {
        super("Appobozik - 8.2");
        setSize(800, 600); // Начальные размеры окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Завершать выполнение при закрытии окна
        // Working:
        setVisible(true);
        setLocation(500, 100); // Начальный сдвиг \ положение окна
    }
    // Methods:
    // MAIN:
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите путь к картинке:");
        ImageIcon img = new ImageIcon(scan.nextLine());
        JLabel jLabel = new JLabel(img);
        JFrame Appobozik = new Appobozik();
        Appobozik.add(jLabel);
    }
}
// D:\ivan_\Pictures\2020-08-13 17-56-45.JPG