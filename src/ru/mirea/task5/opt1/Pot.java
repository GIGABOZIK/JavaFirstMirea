package ru.mirea.task5.opt1;

public class Pot extends Dish {
    // Fields:
    protected int volume;
    protected boolean grip;
    protected boolean nonStickCoating;
    // Constructors:
    public Pot() {
        material = "iron";
        use = "cooking";
        color = "black";
        volume = 2000;
        grip = true;
        nonStickCoating = true;
    }
    public Pot(String material, String use, String color, int volume, boolean grip, boolean nonStickCoating) {
        this.material = material;
        this.use = use;
        this.color = color;
        this.volume = volume;
        this.grip = grip;
        this.nonStickCoating = nonStickCoating;
    }
    // Methods:
    public int getVolume() { return volume; }
    public void setVolume(int volume) { this.volume = volume; }
    public boolean hasGrip() { return grip; }
    public void setGrip(boolean grip) { this.grip = grip; }
    public boolean hasNonStickCoating() { return grip; }
    public void setNonStickCoating(boolean nonStickCoating) { this.nonStickCoating = nonStickCoating; }
    public String toString() {
        return ""
                + "Pot {\r\n"
                + " Material => " + getMaterial() + ",\r\n"
                + " Use => " + getUse() + ",\r\n"
                + " Color => " + getColor() + ",\r\n"
                + " Volume => " + getVolume() + ",\r\n"
                + " HasGrip => " + hasGrip() + ",\r\n"
                + " HasNonStickCoating => " + hasNonStickCoating() + "\r\n"
                + "}";
    }
}

