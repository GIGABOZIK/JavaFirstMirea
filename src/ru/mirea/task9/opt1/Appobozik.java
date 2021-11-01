package ru.mirea.task9.opt1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Appobozik extends JFrame {
    // Fields:
    int scoreWin = 10, score1 = 0, score2 = 0;
    String teamWin = "DRAW", team1 = "Milan", team2 = "Madrid";
    JButton but1 = new JButton("Team 1: " + team1);
    JButton but2 = new JButton("Team 2: " + team2);
    JLabel jlRes = new JLabel("Result: " + score1 + " X " + score2);
    JLabel jlLast = new JLabel("Last Scorer: N/A");
    JLabel jlWin = new JLabel("Winner: " + teamWin);
    // Constructor:
    public Appobozik() {
        super("Appobozik - 9");
        setSize(800, 600); // Начальные размеры окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Завершать выполнение при закрытии окна
        setVisible(true); // Показать окно
        setLocation(500, 100); // Начальный сдвиг \ положение окна
        setLayout(null);
        //
        but1.setBounds(100, 100, 200, 50);
        but2.setBounds(320, 100, 200, 50);
        but1.setBounds(100, 100, 200, 50);
        but2.setBounds(320, 100, 200, 50);
        jlRes.setBounds(100, 250, 420, 30);
        jlLast.setBounds(100, 290, 420, 30);
        jlWin.setBounds(100, 320, 420, 30);
        //
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score1++;
                jlRes.setText("Result: " + score1 + " X " + score2);
                jlLast.setText("Last Scorer: " + team1);
                checkWin();
            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score2++;
                jlRes.setText("Result: " + score1 + " X " + score2);
                jlLast.setText("Last Scorer: " + team2);
                checkWin();
            }
        });
        add(but1);
        add(but2);
        add(jlRes);
        add(jlLast);
        add(jlWin);
    }
    public void checkWin() {
        if (score1 >= scoreWin || score2 >= scoreWin) {
            teamWin = (score1 > score2) ? "Milan" : "Madrid";
        }
        System.out.println(score1 + "-1 " + score2 + "-2 " + teamWin + "-win ");
        jlWin.setText("Winner: " + teamWin);
    }
    // MAIN
    public static void main(String[] args) {
        new Appobozik();
    }
}
