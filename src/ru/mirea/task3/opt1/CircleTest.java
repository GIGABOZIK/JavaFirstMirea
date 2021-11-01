package ru.mirea.task3.opt1;

public class CircleTest {
    public static void main(String[] args) {
        Circle cir = new Circle(12, "#A9CADE", true);
        System.out.println(cir);
        cir.setRadius(5);
        System.out.println(cir.getRadius());
        cir.setColor("#e3256b");
        cir.setFilled(false);
        System.out.println(cir);
    }
}
