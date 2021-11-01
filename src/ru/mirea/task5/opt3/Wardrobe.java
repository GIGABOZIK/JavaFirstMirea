package ru.mirea.task5.opt3;

public class Wardrobe extends Furniture {
    // Fields:
    protected int shelves;
    // Constructors:
    public Wardrobe() {
        super();
        type = "wardrobe";
        shelves = 0;
    }
    public Wardrobe(double price, String material, double length, double width, double height, int shelves) {
        super(price, material, length, width, height);
        type = "wardrobe";
        this.shelves = shelves;
    }
    // Methods:
    public int getShelves() { return shelves; }
    public void setShelves(int shelves) { this.shelves = shelves; }
    public String toString() {
        return ""
                + "Table {\r\n"
                + " Id => " + getId() + ",\r\n"
                + " Price => " + getPrice() + ",\r\n"
                + " Material => " + getMaterial() + ",\r\n"
                + " Length => " + getLength() + ",\r\n"
                + " Width => " + getWidth() + ",\r\n"
                + " Height => " + getHeight() + ",\r\n"
                + " Shelves => " + getShelves() + "\r\n"
                + "}";
    }
}
