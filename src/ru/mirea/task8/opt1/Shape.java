package ru.mirea.task8.opt1;

import java.awt.*;

public abstract class Shape {
    // Fields:
    protected int posX, posY;
    protected Color color;
    protected int width, height;
    // Constructors:
    public Shape() {
        this.color = Color.decode("#e3256b");
        this.posX = 0;
        this.posY = 0;
    }
    public Shape(int posX, int posY) {
        this.color = Color.decode("#e3256b");
        this.posX = posX;
        this.posY = posY;
    }
    public Shape(int posX, int posY, Color color) {
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    }
    public Shape(int posX, int posY, String colorHex) {
        this.color = Color.decode(colorHex);
        this.posX = posX;
        this.posY = posY;
    }
    public Shape(int posX, int posY, int compRed, int compGreen, int compBlue) {
        this.color = new Color(compRed, compGreen, compBlue);
        this.posX = posX;
        this.posY = posY;
    }
    // Methods:
    public Color getColor() { return color; }
    public void setColor(Color color) { this.color = color; }
    public void setColor(String colorHex) { this.color = Color.decode(colorHex); }
    public void setColor(int compRed, int compGreen, int compBlue) {
        this.color = new Color(compRed, compGreen, compBlue);
    }
    public int getPosX() { return posX; }
    public void setPosX(int posX) { this.posX = posX; }
    public int getPosY() { return posY; }
    public void setPosY(int posY) { this.posY = posY; }
    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }
    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }
    public abstract String toString();
}
