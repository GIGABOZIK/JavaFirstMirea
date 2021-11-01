package ru.mirea.task6.opt1;

public class Car implements Nameable {
    // Fields:
    private String name;
    private String type;
    private int power;
    // Constructors:
    public Car() {
        name = "car";
        type = "sedan";
        power = 0;
    }
    public Car(String name, String type, int power) {
        this.name = name;
        this.type = type;
        this.power = power;
    }
    // Methods:
    public void setName(String name) { this.name = name; }
    @Override
    public String getName() { return name; }
    public void setType(String type) { this.type = type; }
    public String getType() { return type; }
    public void setPower(int power) { this.power = power; }
    public double getPower() { return power; }
    public String toString() {
        return ""
                + "Car {\r\n"
                + " Name => " + getName() + ",\r\n"
                + " Type => " + getType() + ",\r\n"
                + " Power => " + getPower() + "\r\n"
                + "}";
    }
}
