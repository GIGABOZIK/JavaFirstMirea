package ru.mirea.task3.opt3;

public class Book {
    // Fields:
    protected String author;
    protected String title;
    protected String genre;
    protected int pubDate;
    protected int pageNum;
    // Constructors:
    public Book() {
        author = "unknown";
        title = "noTitle";
        genre = "others";
        pubDate = 0;
        pageNum = 0;
    }
    public Book(String author, String title, String genre, int pubDate, int pageNum) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.pubDate = pubDate;
        this.pageNum = pageNum;
    }
    // Methods:
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
    public int getPubDate() { return pubDate; }
    public void setPubDate(int pubDate) { this.pubDate = pubDate; }
    public int getPageNum() { return pageNum; }
    public void setPageNum(int pageNum) { this.pageNum = pageNum; }
    public String toString() {
        return "Book {\r\n"
                + " Author => " + getAuthor() + "\r\n"
                + " Title => " + getTitle() + "\r\n"
                + " Genre => " + getGenre() + "\r\n"
                + " PubDate => " + getPubDate() + "\r\n"
                + " PageNum => " + getPageNum() + "\r\n"
                + "}";
    }
}
