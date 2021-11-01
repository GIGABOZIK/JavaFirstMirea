package ru.mirea.task3.opt2;

public class Head {
    // Fields:
    protected String hairType;
    protected String browsType;
    protected String eyeColor;
    protected int teethNum;
    // Constructor:
    public Head() {
        hairType = "bold";
        browsType = "normal";
        eyeColor = "brown";
        teethNum = 32;
    }
    public Head(String hairType, String browsType, String eyeColor, int teethNum) {
        this.hairType = hairType;
        this.browsType = browsType;
        this.eyeColor = eyeColor;
        this.teethNum = teethNum;
    }
    // Methods:
    public void setHairType(String hairType) { this.hairType = hairType; }
    public String getHairType() { return hairType; }
    public void setBrowsType(String browsType) { this.browsType = browsType; }
    public String getBrowsType() { return browsType; }
    public void setEyeColor(String eyeColor) { this.eyeColor = eyeColor; }
    public String getEyeColor() { return eyeColor; }
    public void setTeethNum(int teethNum) { this.teethNum = teethNum; }
    public int getTeethNum() { return teethNum; }
    public String toString() {
        return "Head {\r\n"
        + " HairType => " + getHairType() + "\r\n"
        + " BrowsType => " + getBrowsType() + "\r\n"
        + " EyeColor => " + getEyeColor() + "\r\n"
        + " TeethNum => " + getTeethNum() + "\r\n"
        + "}";
    }
}
