package ru.mirea.task11.opt1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Appobozik extends JFrame {
    // Fields:
    Font font1 = new Font("Comic Sans MS", Font.BOLD, 12);
    Color colorSueta = Color.decode("#e3256b");
    int attempts = 3;
    int number = (int) (Math.random() * 20);
    JButton jBtn = new JButton("Try");
    JTextField jTField = new JTextField("");
    JLabel jlaMsg = new JLabel("Угадайте число (" + attempts + ")");
    // Constructors:
    public Appobozik() {
        super("Appobozik - 11.1");
        setSize(800, 600); // Начальные размеры окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Завершать выполнение при закрытии окна
        setVisible(true);
        setLocation(500, 100); // Начальный сдвиг \ положение окна
        setLayout(null);
        //
        jTField.setBounds(25, 25, 100, 50);
        jBtn.setBounds(jTField.getX() + jTField.getWidth(), jTField.getY(), 100, jTField.getHeight());
        jlaMsg.setBounds(jTField.getX(), jTField.getY() + jTField.getHeight(), getWidth(), 100);
        jTField.setFont(font1);
        jBtn.setFont(font1);
        jlaMsg.setFont(font1);
        jBtn.setBackground(colorSueta);
        add(jTField);
        add(jBtn);
        add(jlaMsg);
        //
        System.out.println("Загаданное число: " + number);
        jBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                attempts--;
                if (attempts == 3) {
                    jTField.setText("");
                    jlaMsg.setText("Угадайте число (" + attempts + ")");
                    jBtn.setText("Try");
                    number = (int) (Math.random() * 20);
                    System.out.println("Загаданное число: " + number);
                }
                else {
                    int entered = Integer.parseInt(jTField.getText().trim());
                    if (entered == number || attempts == 0) {
                        if (entered == number) jlaMsg.setText("Congratulations!");
                        else jlaMsg.setText("Game over");
                        jBtn.setText("Restart");
                        attempts = 4;
                    }
                    else if (entered > number) jlaMsg.setText("Попробуйте меньше (" + attempts + ")");
                    else jlaMsg.setText("Попробуйте больше (" + attempts + ")");
                }
            }
        });
    }
    // MAIN:
    public static void main (String[] args) { new Appobozik(); }
}
