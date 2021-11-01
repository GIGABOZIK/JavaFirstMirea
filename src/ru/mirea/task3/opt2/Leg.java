package ru.mirea.task3.opt2;

public class Leg {
    // Fields:
    protected boolean isHairy;
    protected int averageToesLength;
    protected boolean isFlatFeet;
    protected int agility;
    // Constructor:
    public Leg() {
        isHairy = true;
        averageToesLength = 2;
        isFlatFeet = false;
        agility = 50;
    }
    public Leg(boolean isHairy, int averageToesLength, boolean isFlatFeet, int agility) {
        this.isHairy = isHairy;
        this.averageToesLength = averageToesLength;
        this.isFlatFeet = isFlatFeet;
        this.agility = agility;
    }
    // Methods:
    public void setHairy(boolean isHairy) { this.isHairy = isHairy; }
    public boolean isHairy() { return isHairy; }
    public void setAverageToesLength(int averageToesLength) { this.averageToesLength = averageToesLength; }
    public int getAverageToesLength() { return averageToesLength; }
    public void setFlatFeet(boolean isFlatFeet) { this.isFlatFeet = isFlatFeet; }
    public boolean isFlatFeet() { return isFlatFeet; }
    public void setAgility(int agility) { this.agility = agility; }
    public int getAgility() { return agility; }
    public String toString() {
        return "Leg {\r\n"
        + " IsHairy => " + isHairy() + "\r\n"
        + " AverageToesLength=> " + getAverageToesLength() + "\r\n"
        + " IsFlatFeet => " + isFlatFeet + "\r\n"
        + " Agility => " + getAgility() + "\r\n"
        + "}";
    }
}
