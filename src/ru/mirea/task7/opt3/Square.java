package ru.mirea.task7.opt3;

public class Square extends Rectangle {
    // Fields:
    // Constructors:
    public Square() {
        super(0, 0);
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    // Methods:
    public double getSide() { return this.width; }
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    public void setWidth(double side) { this.width = side; }
    public void setLength(double side) { this.length = side; }
    @Override
    public String toString() {
        return ""
        + "Shape: Square {\r\n"
        + " Side => " + getSide() + ",\r\n"
        + " Area => " + getArea() + ",\r\n"
        + " Perimeter => " + getPerimeter() + "\r\n"
        + "}";
    }
}
