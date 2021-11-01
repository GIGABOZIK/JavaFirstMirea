package ru.mirea.task12;

public class Student {
    protected static int idents = 0;
    protected int id;
    protected String name;
    protected int grade;
    protected double mark;
    public Student(String name, int grade, double mark) {
        //id = /*idents * 10000 + idents * 1 - */(++idents) * (int)(Math.random() * 100);
        id = idents++;
        this.name = name;
        this.grade = grade;
        this.mark = mark;
    }
    public  Student(int id, String name, int grade, double mark) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.mark = mark;
    }
    public void setMark(float mark) { this.mark = mark; }
    public String getName() { return name; }
    public int getGrade() { return grade; }
    public int getId() { return id; }
    public double getMark() { return mark; }
    public String toString() { return "Student { id: " + getId() + ", name: " + getName() + ", grade: " + getGrade() + ", mark: " + getMark() + " }"; }
}
