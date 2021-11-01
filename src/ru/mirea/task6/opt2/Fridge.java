package ru.mirea.task6.opt2;

public class Fridge implements Priceable {
    // Fields:
    private double price;
    private String name;
    private int volume;
    // Constructors:
    public Fridge() {
        price = 0;
        name = "Smartphone";
        volume = 0;
    }
    public Fridge(double price, String name, int volume) {
        this.price = price;
        this.name = name;
        this.volume = volume;
    }
    // Methods:
    @Override
    public double getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getVolume() { return volume; }
    public void setVolume(int volume) { this.volume = volume; }
    public String toString() {
        return ""
                + "Fridge {\r\n"
                + " Price => " + getPrice() + ",\r\n"
                + " Name => " + getName() + ",\r\n"
                + " Volume => " + getVolume() + "\r\n"
                + "}";
    }
}
