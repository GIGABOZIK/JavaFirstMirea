package ru.mirea.task2.opt2;

public class Ball {
    // Fields:
    private String color;
    private int radius;
    // Constructors:
    public Ball(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }
    // Methods:
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public int getRadius() { return radius; }
    public void setRadius(int radius) { this.radius = radius; }
    public String toString() { return this.color + ", radius " + this.radius; }
}
