package ru.mirea.task6.opt1;

public class Animal implements Nameable {
    // Fields:
    private String name;
    private String type;
    private boolean pet;
    // Constructors:
    public Animal() {
        name = "Animal";
        type = "Mammal";
        pet = false;
    }
    public Animal(String name, String type, boolean pet) {
        this.name = name;
        this.type = type;
        this.pet = pet;
    }
    // Methods:
    public void setName(String name) { this.name = name; }
    @Override
    public String getName() { return name; }
    public void setType(String type) { this.type = type; }
    public String getType() { return type; }
    public void setPower(boolean pet) { this.pet = pet; }
    public boolean isPet() { return pet; }
    public String toString() {
        return ""
                + "Animal {\r\n"
                + " Name => " + getName() + ",\r\n"
                + " Type => " + getType() + ",\r\n"
                + " IsPet => " + isPet() + "\r\n"
                + "}";
    }
}
