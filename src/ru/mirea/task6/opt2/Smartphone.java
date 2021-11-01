package ru.mirea.task6.opt2;

public class Smartphone implements Priceable {
    // Fields:
    private double price;
    private String name;
    private int memory;
    // Constructors:
    public Smartphone() {
        price = 0;
        name = "Smartphone";
        memory = 0;
    }
    public Smartphone(double price, String name, int memory) {
        this.price = price;
        this.name = name;
        this.memory = memory;
    }
    // Methods:
    @Override
    public double getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getMemory() { return memory; }
    public void setMemory(int memory) { this.memory = memory; }
    public String toString() {
        return ""
                + "Smartphone {\r\n"
                + " Price => " + getPrice() + ",\r\n"
                + " Name => " + getName() + ",\r\n"
                + " Memory => " + getMemory() + "\r\n"
                + "}";
    }
}
