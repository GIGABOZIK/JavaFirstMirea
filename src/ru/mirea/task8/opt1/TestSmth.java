package ru.mirea.task8.opt1;

import java.util.Random;

public class TestSmth {
    public static void main(String[] args) {
        Random rand = new Random();
        int posX = rand.nextInt(1000) - 500;
        int posY = rand.nextInt(1000) - 500;
        int compRed = rand.nextInt(255);
        int compGreen = rand.nextInt(255);
        int compBlue = rand.nextInt(255);
        Oval oval1 = new Oval(posX, posY, compRed, compGreen, compBlue);
        Oval oval2 = new Oval();
        oval2.setColor("#e3256b");
        Circle circle1 = new Circle();
        Rectangle rectangle1 = new Rectangle();
        System.out.println(oval1);
        System.out.println(oval2);
        System.out.println(circle1);
        System.out.println(rectangle1);
    }
}
