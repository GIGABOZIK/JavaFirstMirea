package ru.mirea.task7.opt5;

public class MovablePoint implements Movable {
    // Fields:
    private int x, y, xSpeed, ySpeed;
    // Constructors:
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    // Methods:
    public String toString() { return "Point {" + x + ", " + y + "}"; }
    public void moveUp() { y += ySpeed; }
    public void moveDown() { y -= ySpeed; }
    public void moveLeft() { x -= xSpeed; }
    public void moveRight() { x += xSpeed; }
}