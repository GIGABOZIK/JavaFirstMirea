package ru.mirea.task2.opt3;

public class Book {
    // Fields:
    private String authorName;
    private String title;
    private int pubYear;
    // Constructors:
    public Book(String authorName, String title, int pubYear){
        this.authorName = authorName;
        this.title = title;
        this.pubYear = pubYear;
    }
    // Methods:
    public String getAuthorName() { return authorName; }
    public void setAuthorName(String authorName) { this.authorName = authorName; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public int getPubYear() { return pubYear; }
    public void setPubYear(int pubYear) { this.pubYear = pubYear; }
    public String toString() {
        return this.authorName + ", title: " + this.title + ", publication-year: " + this.pubYear;
    }
}