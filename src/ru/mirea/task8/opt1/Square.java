package ru.mirea.task8.opt1;

import java.awt.*;

public class Square extends Shape {
    // Fields:
    // Constructors:
    public Square() { super(); }
    public Square(int posX, int posY) { super(posX, posY); }
    public Square(int posX, int posY, Color color) { super(posX, posY, color); }
    public Square(int posX, int posY, String colorHex) { super(posX, posY, colorHex); }
    public Square(int posX, int posY, int compRed, int compGreen, int compBlue) {
        super(posX, posY, compRed, compGreen, compBlue);
    }
    // Methods:
    public void setSize(int side) { setWidth(side); setHeight(side); }
    public void drawMe(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getPosX(), getPosY(), getWidth(), getHeight());
    }
    public String toString() {
        return "Square {\r\n"
                + " Position => (" + getPosX() + ", " + getPosY() + ")\r\n"
                + " Color => " + getColor() + "\r\n"
                + "}";
    }
}
