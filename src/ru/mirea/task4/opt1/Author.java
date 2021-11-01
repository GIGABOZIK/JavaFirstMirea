package ru.mirea.task4.opt1;

public class Author {
    // Fields:
    private String name;
    private String email;
    private char gender;
    // Constructors:
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    // Methods:
    public String getName() { return this.name; }
    public String getEmail() { return this.email; }
    public void setEmail(String email) { this.email = email; }
    public char getGender() { return this.gender; }
    public String toString() { return getName() + " (" + getGender() + ") at " + getEmail(); }
}
