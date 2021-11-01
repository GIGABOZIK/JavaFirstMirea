package ru.mirea.task7.opt6;

import ru.mirea.task7.opt5.Movable;
import ru.mirea.task7.opt5.MovablePoint;

public class MovableRectangle implements Movable {
    // Fields:
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    // Constructors:
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    // Methods:
    public String toString() {
        return ""
                + "Rectangle {\r\n"
                + " topLeft => " + topLeft + ",\r\n"
                + " bottomRight => " + bottomRight + "\r\n"
                + "}";
    }
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}