package ru.mirea.task3.opt2;

public class Human {
    // Fields:
    protected String name;
    protected char gender;
    protected Head head;
    protected Leg leg;
    protected Hand hand;
    // Constructors:
    public Human() {
        name = "John";
        gender = 'M';
        head = new Head();
        leg = new Leg();
        hand = new Hand();
    }
    public Human(String name, char gender,
                 String headHairType, String headBrowsType, String eyesColor, int teethNum,
                 boolean legIsHairy, int legAvToesLen, boolean isFlatFeet, int legAgility,
                 boolean handIsHairy, int handAvToesLen, String palmShape, int handAgility
                 ) {
        this.name = name;
        this.gender = gender;
        head = new Head(headHairType, headBrowsType, eyesColor, teethNum);
        leg = new Leg(legIsHairy, legAvToesLen, isFlatFeet, legAgility);
        hand = new Hand(handIsHairy, handAvToesLen, palmShape, handAgility);
    }
    // Methods:
    public String getName() { return name; };
    public String toString() {
        return "Human {\r\n"
                + " Name => " + getName() + "\r\n"
                + " Head => " + head + "\r\n"
                + " Leg => " + leg + "\r\n"
                + " Hand => " + hand + "\r\n"
                + "}";
    }
}