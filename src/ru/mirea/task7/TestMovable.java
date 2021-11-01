package ru.mirea.task7;

import ru.mirea.task7.opt5.Movable;
import ru.mirea.task7.opt5.MovablePoint;
import ru.mirea.task7.opt5.MovableCircle;
import ru.mirea.task7.opt6.MovableRectangle;

public class TestMovable {
    public static void main(String[] args) {
        //
        Movable point1 = new MovablePoint(2, 5, 1, 2);
        Movable circle1 = new MovableCircle(-5, 4, 2, 3, 3);
        Movable rectangle1 = new MovableRectangle(6,6,9,2, 3,5);
        //
        System.out.println(point1); // Ok
        point1.moveDown();
        point1.moveLeft();
        point1.moveDown();
        System.out.println(point1); // Ok
        //
        System.out.println(circle1); // Ok
        circle1.moveUp();
        circle1.moveUp();
        circle1.moveLeft();
        System.out.println(circle1); // Ok
        //
        System.out.println(rectangle1); // Ok
        rectangle1.moveLeft();
        rectangle1.moveRight();
        rectangle1.moveDown();
        System.out.println(rectangle1); // Ok
        //
    }
}
