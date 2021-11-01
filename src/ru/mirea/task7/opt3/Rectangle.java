package ru.mirea.task7.opt3;

public class Rectangle extends Shape {
    // Fields:
    protected double width;
    protected double length;
    // Constructors:
    public Rectangle() {
        super();
        width = 0;
        length = 0;
    }
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    // Methods:
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }
    @Override
    public double getArea() { return width * length; }
    @Override
    public double getPerimeter() { return 2 * (width + length); }
    @Override
    public String toString() {
        return ""
                + "Shape: Rectangle {\r\n"
                + " Length => " + getLength() + ",\r\n"
                + " Width => " + getWidth() + ",\r\n"
                + " Area => " + getArea() + ",\r\n"
                + " Perimeter => " + getPerimeter() + "\r\n"
                + "}";
    }
}
