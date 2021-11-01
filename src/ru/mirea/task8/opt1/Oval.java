package ru.mirea.task8.opt1;

import java.awt.*;

public class Oval extends Shape {
    // Fields:
    // Constructors:
    public Oval() { super(); }
    public Oval(int posX, int posY) { super(posX, posY); }
    public Oval(int posX, int posY, Color color) { super(posX, posY, color); }
    public Oval(int posX, int posY, String colorHex) { super(posX, posY, colorHex); }
    public Oval(int posX, int posY, int compRed, int compGreen, int compBlue) {
        super(posX, posY, compRed, compGreen, compBlue);
    }
    // Methods:
    public void setSize(int width, int height) { setWidth(width); setHeight(height); }
    public void drawMe(Graphics g) {
        g.setColor(getColor());
        g.drawOval(getPosX(), getPosY(), getWidth(), getHeight());
    }
    public String toString() {
        return "Oval {\r\n"
                + " Position => (" + getPosX() + ", " + getPosY() + ")\r\n"
                + " Color => " + getColor() + "\r\n"
                + "}";
    }
}
