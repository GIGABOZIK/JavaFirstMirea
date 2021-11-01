package ru.mirea.task5.opt1;

public class Plate extends Dish {
    // Fields:
    protected int volume;
    protected boolean disposable;
    // Constructors:
    public Plate() {
        material = "plastic";
        use = "eating";
        color = "white";
        volume = 200;
        disposable = true;
    }
    public Plate(String material, String use, String color, int volume, boolean disposable) {
        this.material = material;
        this.use = use;
        this.color = color;
        this.volume = volume;
        this.disposable = disposable;
    }
    // Methods:
    public int getVolume() { return volume; }
    public void setVolume(int volume) { this.volume = volume; }
    public boolean isDisposable() { return disposable; }
    public void setDisposable(boolean disposable) { this.disposable = disposable; }
    public String toString() {
        return ""
                + "Plate {\r\n"
                + " Material => " + getMaterial() + ",\r\n"
                + " Use => " + getUse() + ",\r\n"
                + " Color => " + getColor() + ",\r\n"
                + " Volume => " + getVolume() + ",\r\n"
                + " IsDisposable => " + isDisposable() + "\r\n"
                + "}";
    }
}

