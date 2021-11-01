package ru.mirea.task5.opt2;

public class JackRusselTerrier extends Dog {
    // Fields:
    protected String features;
    // Constructors:
    public JackRusselTerrier() {
        super();
        features = "Jumps";
    }
    public JackRusselTerrier(String name, int age, int weight, boolean pet, String furType, String features) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.pet = pet;
        this.furType = furType;
        this.features = features;
    }
    // Methods:
    public void setFeatures(String features) { this.features = features; }
    public String getFeatures() { return features; }
    public String toString() {
        return ""
                + getName() + " {\r\n"
                + " Breed => Jack Russel Terrier,\r\n"
                + " Age => " + getAge() + ",\r\n"
                + " Weight => " + getWeight() + ",\r\n"
                + " IsPet => " + isPet() + ",\r\n"
                + " FurType => " + getFurType() + ",\r\n"
                + " Features => " + getFeatures() + "\r\n"
                + "}";
    }
}
