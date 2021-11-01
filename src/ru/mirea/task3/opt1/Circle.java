package ru.mirea.task3.opt1;

public class Circle {
    // Fields:
    protected String color;
    protected boolean filled;
    protected double radius;
    // Constructors:
    public Circle() {
        this.radius = 0;
        this.color = "#e3256b";
        this.filled = false;
    }
    public Circle(double radius) {
        this.radius = radius;
        this.color = "#e3256b";
        this.filled = false;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    // Methods:
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
    public double getArea() { return Math.PI * radius * radius; }
    public double getPerimeter() { return 2 * Math.PI * radius; }
    public String toString() {
        return ""
                + "Shape: circle {\r\n"
                + " color => " + getColor() + ",\r\n"
                + " filled => " + isFilled() + ",\r\n"
                + " radius => " + getRadius() + ",\r\n"
                + " area => " + getArea() + ",\r\n"
                + " perimeter => " + getPerimeter() + "\r\n"
                + "}";
    }
}