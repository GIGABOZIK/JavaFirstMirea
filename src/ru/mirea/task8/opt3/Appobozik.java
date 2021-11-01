package ru.mirea.task8.opt3;

import javax.swing.*;

public class Appobozik extends JFrame {
    // Fields:
    // Constructors:
    public Appobozik() {
        super("Appobozik - 8.3");
        setSize(800, 600); // Начальные размеры окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Завершать выполнение при закрытии окна
        // Working:
        //setVisible(true);
        setLocation(500, 100); // Начальный сдвиг \ положение окна
        goAnimation();
    }
    // Methods:
    public void goAnimation() {
        while(true) {
            for (int i = 0; i < 5; i++) {
                add(new JLabel(new ImageIcon("D:\\Google Диск\\Creativity\\animations\\wink_emoji\\emw" + (i+1) + ".png")));
                setVisible(true);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {}
                getContentPane().removeAll();
            }
        }
    }
    // MAIN:
    public static void main(String[] args) { new Appobozik(); }
}