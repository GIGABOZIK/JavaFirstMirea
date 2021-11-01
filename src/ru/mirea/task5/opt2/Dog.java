package ru.mirea.task5.opt2;

public abstract class Dog {
    // Fields:
    protected String name;
    protected int age;
    protected int weight;
    protected boolean pet;
    protected String furType;
    // Constructors:
    public Dog() {
        name = "Puppy";
        age = 0;
        weight = 100;
        pet = false;
        furType = "Short";
    }
    // Methods:
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    //
    public void setAge(int age) { this.age = age; }
    public int getAge() { return age; }
    //
    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }
    //
    public void setPet(boolean pet) { this.pet = pet; }
    public boolean isPet() { return pet; }
    //
    public void setFurType(String furType) { this.furType = furType; }
    public String getFurType() { return furType; }
    //
    public abstract String toString();
}
