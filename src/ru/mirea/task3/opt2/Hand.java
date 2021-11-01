package ru.mirea.task3.opt2;

public class Hand {
    // Fields:
    protected boolean isHairy;
    protected int averageToesLength;
    protected String palmShape;
    protected int agility;
    // Constructor:
    public Hand() {
        isHairy = true;
        averageToesLength = 4;
        palmShape = "conical";
        agility = 75;
    }
    public Hand(boolean isHairy, int averageToesLength, String palmShape, int agility) {
        this.isHairy = isHairy;
        this.averageToesLength = averageToesLength;
        this.palmShape = palmShape;
        this.agility = agility;
    }
    // Methods:
    public void setHairy(boolean isHairy) { this.isHairy = isHairy; }
    public boolean isHairy() { return isHairy; }
    public void setAverageToesLength(int averageToesLength) { this.averageToesLength = averageToesLength; }
    public int getAverageToesLength() { return averageToesLength; }
    public void setPalmShape(String palmShape) { this.palmShape = palmShape; }
    public String getPalmShape() { return palmShape; }
    public void setAgility(int agility) { this.agility = agility; }
    public int getAgility() { return agility; }
    public String toString() {
        return "Leg {\r\n"
        + " IsHairy => " + isHairy() + "\r\n"
        + " AverageToesLength=> " + getAverageToesLength() + "\r\n"
        + " PalmShape => " + getPalmShape() + "\r\n"
        + " Agility => " + getAgility() + "\r\n"
        + "}";
    }
}
