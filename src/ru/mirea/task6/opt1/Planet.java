package ru.mirea.task6.opt1;

public class Planet implements Nameable {
    // Fields:
    private String name;
    private double weight;
    // Constructors:
    public Planet() {
        name = "planet";
        weight = 0.0;
    }
    public Planet(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    // Methods:
    public void setName(String name) { this.name = name; }
    @Override
    public String getName() { return name; }
    public void setWeight(double weight) { this.weight = weight; }
    public double getWeight() { return weight; }
    public String toString() {
        return ""
                + "Planet {\r\n"
                + " Name => " + getName() + ",\r\n"
                + " Weight => " + getWeight() + "x10^24\r\n"
                + "}";
    }
}
