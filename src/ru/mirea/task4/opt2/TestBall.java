package ru.mirea.task4.opt2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(12.5, -6.2);
        ball1.move(-2.5, 4);
        System.out.println(ball1.toString());
    }
}