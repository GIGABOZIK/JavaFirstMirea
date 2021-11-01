package ru.mirea.task5.opt3;

public class Table extends Furniture {
    // Fields:
    protected int legs;
    // Constructors:
    public Table() {
        super();
        type = "table";
        legs = 4;
    }
    public Table(double price, String material, double length, double width, double height, int legs) {
        super(price, material, length, width, height);
        type = "table";
        this.legs = legs;
    }
    // Methods:
    public int getLegs() { return legs; }
    public void setLegs(int legs) { this.legs = legs; }
    public String toString() {
        return ""
                + "Table {\r\n"
                + " Id => " + getId() + ",\r\n"
                + " Price => " + getPrice() + ",\r\n"
                + " Material => " + getMaterial() + ",\r\n"
                + " Length => " + getLength() + ",\r\n"
                + " Width => " + getWidth() + ",\r\n"
                + " Height => " + getHeight() + ",\r\n"
                + " Legs => " + getLegs() + "\r\n"
                + "}";
    }
}
