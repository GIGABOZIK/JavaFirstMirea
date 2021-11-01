package ru.mirea.task5.opt1;

public abstract class Dish {
    // Fields:
    protected String material;
    protected String use;
    protected String color;
    // Constructors:
    // Methods:
    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public String getUse() { return use; }
    public void setUse(String use) { this.use = use; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public abstract String toString();
}
