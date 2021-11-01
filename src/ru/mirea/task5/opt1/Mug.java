package ru.mirea.task5.opt1;

public class Mug extends Dish {
    // Fields:
    protected int volume;
    protected boolean grip;
    // Constructors:
    public Mug() {
        material = "ceramics";
        use = "eating";
        color = "white";
        volume = 400;
        grip = true;
    }
    public Mug(String material, String use, String color, int volume, boolean grip) {
        this.material = material;
        this.use = use;
        this.color = color;
        this.volume = volume;
        this.grip = grip;
    }
    // Methods:
    public int getVolume() { return volume; }
    public void setVolume(int volume) { this.volume = volume; }
    public boolean hasGrip() { return grip; }
    public void setGrip(boolean grip) { this.grip = grip; }
    public String toString() {
        return ""
                + "Mug {\r\n"
                + " Material => " + getMaterial() + ",\r\n"
                + " Use => " + getUse() + ",\r\n"
                + " Color => " + getColor() + ",\r\n"
                + " Volume => " + getVolume() + ",\r\n"
                + " HasGrip => " + hasGrip() + "\r\n"
                + "}";
    }
}

