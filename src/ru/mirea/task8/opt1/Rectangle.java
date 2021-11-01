package ru.mirea.task8.opt1;

import java.awt.*;

public class Rectangle extends Shape {
    // Fields:
    // Constructors:
    public Rectangle() { super(); }
    public Rectangle(int posX, int posY) { super(posX, posY); }
    public Rectangle(int posX, int posY, Color color) { super(posX, posY, color); }
    public Rectangle(int posX, int posY, String colorHex) { super(posX, posY, colorHex); }
    public Rectangle(int posX, int posY, int compRed, int compGreen, int compBlue) {
        super(posX, posY, compRed, compGreen, compBlue);
    }
    // Methods:
    public void setSize(int width, int height) { setWidth(width); setHeight(height); }
    public void drawMe(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getPosX(), getPosY(), getWidth(), getHeight());
    }
    public String toString() {
        return "Rectangle {\r\n"
                + " Position => (" + getPosX() + ", " + getPosY() + ")\r\n"
                + " Color => " + getColor() + "\r\n"
                + "}";
    }
}
