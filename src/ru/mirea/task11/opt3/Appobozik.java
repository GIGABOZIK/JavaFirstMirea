package ru.mirea.task11.opt3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Appobozik extends JFrame {
    // Fields:
    String[] colors = {"Black", "GreenSea", "Sueta", "SkyBlue"};
    String[] encColors = {"#000000", "#16a085", "#E3256B", "#87CEEB"};
    String[] fonts = {"Times New Roman", "Comic Sans MS", "Cambria", "MV Boli"};
    JMenuBar jMenuBar = new JMenuBar();
    JComboBox jComboColor = new JComboBox(colors);
    JComboBox jComboFont = new JComboBox(fonts);
    JTextArea jTArea = new JTextArea();
    // Constructors:
    public Appobozik() {
        super("Appobozik - 11.3");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(500, 100);
        setLayout(null);
        //
        setJMenuBar(jMenuBar);
        jMenuBar.add(jComboColor);
        jMenuBar.add(jComboFont);
        jTArea.setBounds(0, 0, getWidth(), getHeight());
        add(jTArea);
        jComboColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTArea.setForeground(Color.decode(encColors[jComboColor.getSelectedIndex()]));
            }
        });
        jComboFont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTArea.setFont(Font.decode((String) jComboFont.getSelectedItem()));
            }
        });
    }
    // MAIN:
    public static void main (String[] args) { new Appobozik(); }
}
