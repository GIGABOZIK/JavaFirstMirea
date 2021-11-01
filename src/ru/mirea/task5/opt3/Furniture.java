package ru.mirea.task5.opt3;

public abstract class Furniture {
    // Fields:
    protected static int idIter = 0;
    protected int id;
    protected String type;
    protected double price;
    protected boolean available;
    protected String material;
    protected double length;
    protected double width;
    protected double height;
    // Constructors:
    public Furniture() {
        this.id = ++idIter;
        this.price = 0;
        this.material = "Wood";
        this.length = 0;
        this.width = 0;
        this.height = 0;
    }
    public Furniture(double price, String material, double length, double width, double height) {
        this.id = ++idIter;
        this.price = price;
        this.material = material;
        this.length = length;
        this.width = width;
        this.height = height;
    }
    // Methods:
    public int getId() { return id; }
    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }
    public abstract String toString();
}
