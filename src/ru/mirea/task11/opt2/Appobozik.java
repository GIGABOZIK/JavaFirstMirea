package ru.mirea.task11.opt2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Appobozik extends JFrame {
    // Fields:
    Font font1 = new Font("Comic Sans MS", Font.BOLD, 12);
    Color colorSueta = Color.decode("#e3256b");
    String[] stText = { "Добро пожаловать ", // 0
            "в Центр (⊙_⊙)？",
            "на Север 🙄",
            "на Юг (。_。)",
            "на Запад ←_←",
            "на Восток →_→", // 5
    };
    JLabel[] jla = {
            new JLabel(stText[0] + stText[1]), // Center
            new JLabel(stText[0] + stText[2]), // North
            new JLabel(stText[0] + stText[3]), // South
            new JLabel(stText[0] + stText[4]), // West
            new JLabel(stText[0] + stText[5]), // East
    };
    JPanel[] jpa = {
            new JPanel(), // Center
            new JPanel(), // North
            new JPanel(), // South
            new JPanel(), // West
            new JPanel(), // East
    };
    // Constructors:
    public Appobozik() {
        super("Appobozik - 11.2");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(500, 100);
        setLayout(new BorderLayout());
        //
        add(jpa[0], BorderLayout.CENTER);
        add(jpa[1], BorderLayout.NORTH);
        add(jpa[2], BorderLayout.SOUTH);
        add(jpa[3], BorderLayout.WEST);
        add(jpa[4], BorderLayout.EAST);
        for (int i = 0; i < jpa.length; i++) {
            jla[i].setVisible(false);
            jpa[i].add(jla[i]);
            int finalI = i;
            jpa[i].addMouseListener(new MouseListener() {
                @Override public void mouseClicked(MouseEvent e) {}
                @Override public void mousePressed(MouseEvent e) {}
                @Override public void mouseReleased(MouseEvent e) {}
                @Override
                public void mouseEntered(MouseEvent e) {
                    jla[finalI].setVisible(true);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    jla[finalI].setVisible(false);
                }
            });
        }
    }
    // MAIN:
    public static void main (String[] args) { new Appobozik(); }
}
