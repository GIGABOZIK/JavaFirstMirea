package ru.mirea.task8.opt1;

import java.awt.*;

public class Circle extends Oval {
    // Fields:
    // Constructors:
    public Circle() { super(); }
    public Circle(int posX, int posY) { super(posX, posY); }
    public Circle(int posX, int posY, Color color) { super(posX, posY, color); }
    public Circle(int posX, int posY, String colorHex) { super(posX, posY, colorHex); }
    public Circle(int posX, int posY, int compRed, int compGreen, int compBlue) {
        super(posX, posY, compRed, compGreen, compBlue);
    }
    // Methods:
    public void setSize(int radius) { setWidth(radius / 2); setHeight(radius / 2); }
    public void drawMe(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getPosX(), getPosY(), getWidth(), getHeight());
    }
    public String toString() {
        return "Circle {\r\n"
                + " Position => (" + getPosX() + ", " + getPosY() + ")\r\n"
                + " Color => " + getColor() + "\r\n"
                + "}";
    }
}
