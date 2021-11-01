package ru.mirea.task2.opt1;

public class Shape {
    // Fields:
    protected String color;
    protected boolean filled;
    // Constructors:
    public Shape() {
        color = "black";
        filled = true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    // Methods:
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }
    public String toString() {
        return "Shape {\r\n"
        + " color => " + this.color + ",\r\n"
        + " filled => " + this.filled + "\r\n"
        + "}";
    }
}
