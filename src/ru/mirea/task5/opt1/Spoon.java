package ru.mirea.task5.opt1;

public class Spoon extends Dish {
    // Fields:
    protected int length;
    // Constructors:
    public Spoon() {
        material = "silver";
        use = "eating";
        color = "gray";
        length = 25;
    }
    public Spoon(String material, String use, String color, int length) {
        this.material = material;
        this.use = use;
        this.color = color;
        this.length = length;
    }
    // Methods:
    public int getLength() { return length; }
    public void setLength(int length) { this.length = length; }
    public String toString() {
        return ""
                + "Spoon {\r\n"
                + " Material => " + getMaterial() + ",\r\n"
                + " Use => " + getUse() + ",\r\n"
                + " Color => " + getColor() + ",\r\n"
                + " Length => " + getLength() + "\r\n"
                + "}";
    }
}

