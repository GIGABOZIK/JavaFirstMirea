package ru.mirea.task7.opt3;

public abstract class Shape {
    // Fields:
    protected String color;
    protected boolean filled;
    // Constructors:
    public Shape() {
        color = "#e3256b";
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
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
