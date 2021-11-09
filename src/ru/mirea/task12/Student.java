package ru.mirea.task12;

public class Student {
    protected static int idents = 0;
    protected int id;
    protected String name;
    protected int grade;
    protected double GPA;
    public Student(String name, int grade, double GPA) {
        //id = /*idents * 10000 + idents * 1 - */(++idents) * (int)(Math.random() * 100);
        id = idents++;
        this.name = name;
        this.grade = grade;
        this.GPA = GPA;
    }
    public  Student(int id, String name, int grade, double GPA) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.GPA = GPA;
    }
    public void setGPA(float GPA) { this.GPA = GPA; }
    public String getName() { return name; }
    public int getGrade() { return grade; }
    public int getId() { return id; }
    public double getGPA() { return GPA; }
    public String toString() { return "Student { id: " + getId() + ", name: " + getName() + ", grade: " + getGrade() + ", GPA: " + getGPA() + " }"; }
}
