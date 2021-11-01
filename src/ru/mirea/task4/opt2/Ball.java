package ru.mirea.task4.opt2;

public class Ball {
    // Fields:
    private double x = 0.0;
    private double y = 0.0;
    // Constructors:
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Ball() {
        this.x = 0.0;
        this.y = 0.0;
    }
    // Methods:
    public double getX() { return x; }
    public void setX(double x) { this.x = x; }
    public double getY() { return y; }
    public void setY(double y) { this.y = y; }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }
    public String toString() { return "Ball @ (" + this.x + " , " + this.y + ")"; }
}
