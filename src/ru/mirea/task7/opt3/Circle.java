package ru.mirea.task7.opt3;

public class Circle extends Shape {
    // Fields:
    protected double radius;
    // Constructors:
    public Circle() {
        super();
        this.radius = 0;
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    // Methods:
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
    @Override
    public double getArea() { return Math.PI * radius * radius; }
    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }
    @Override
    public String toString() {
        return ""
                + "Shape: Circle {\r\n"
                + " Radius => " + getRadius() + ",\r\n"
                + " Area => " + getArea() + ",\r\n"
                + " Perimeter => " + getPerimeter() + "\r\n"
                + "}";
    }
}
