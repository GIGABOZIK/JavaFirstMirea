package ru.mirea.task5.opt2;

public class YorkshireTerrier extends Dog {
    // Fields:
    // Constructors:
    public YorkshireTerrier() {
        super();
    }
    public YorkshireTerrier(String name, int age, int weight, boolean pet, String furType) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.pet = pet;
        this.furType = furType;
    }
    // Methods:
    public String toString() {
        return ""
                + getName() + " {\r\n"
                + " Breed => Yorkshire Terrier,\r\n"
                + " Age => " + getAge() + ",\r\n"
                + " Weight => " + getWeight() + ",\r\n"
                + " IsPet => " + isPet() + ",\r\n"
                + " FurType => " + getFurType() + "\r\n"
                + "}";
    }
}
