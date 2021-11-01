package ru.mirea.task8.opt1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Appobozik extends JFrame {
    // Fields:
    Font font1 = new Font("Comic Sans MS", Font.BOLD, 24);
    Color colorSueta = Color.decode("#e3256b");
    Random rand = new Random();
    //
    // Constructors:
    public Appobozik() {
        super("Appobozik - 8.1");
        setSize(800, 600); // Начальные размеры окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Завершать выполнение при закрытии окна
        // Working:
        setVisible(true);
        setLocation(500, 100); // Начальный сдвиг \ положение окна
        //setLayout(new FlowLayout(FlowLayout.CENTER)); // Типа display: flex; justify-content: center;
    }
    // Methods WORK:
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Oval oval;
        Circle circle;
        Rectangle rectangle;
        Square square;
        int posX, posY;
        int compRed, compGreen, compBlue;
        for (int i = 0; i < 20; i++) {
            posX = rand.nextInt(getWidth());
            posY = rand.nextInt(getHeight());
            compRed = rand.nextInt(255);
            compGreen = rand.nextInt(255);
            compBlue = rand.nextInt(255);
            switch (rand.nextInt(4) + 1) { // 1=oval, 2=circle, 3=rectangle, 4=square..
                case 1:
                    oval = new Oval(posX, posY, compRed, compGreen, compBlue);
                    oval.setSize(rand.nextInt(400)+1, rand.nextInt(400)+1);
                    oval.drawMe(g);
                    break;
                case 2:
                    circle = new Circle(posX, posY, compRed, compGreen, compBlue);
                    circle.setSize(rand.nextInt(400)+1);
                    circle.drawMe(g);
                    break;
                case 3:
                    rectangle = new Rectangle(posX, posY, compRed, compGreen, compBlue);
                    rectangle.setSize(rand.nextInt(400)+1, rand.nextInt(400)+1);
                    rectangle.drawMe(g);
                    break;
                case 4:
                    square = new Square(posX, posY, compRed, compGreen, compBlue);
                    square.setSize(rand.nextInt(400)+1);
                    square.drawMe(g);
                    break;
            }
        }
    }
    // MAIN:
    public static void main (String[] args) { new Appobozik(); }
}
