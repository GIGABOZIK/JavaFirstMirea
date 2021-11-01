package ru.mirea.task7.opt5;

public class MovableCircle implements Movable {
    // Fields:
    private int radius;
    private MovablePoint center;
    // Constructors:
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    // Methods:
    public String toString() {
        return ""
                + "Circle {\r\n"
                + " Center => " + center + ",\r\n"
                + " Radius => " + radius + "\r\n"
                + "}";
    }
    public void moveUp() { center.moveUp(); }
    public void moveDown() { center.moveDown(); }
    public void moveLeft() { center.moveLeft(); }
    public void moveRight() { center.moveRight(); }
}