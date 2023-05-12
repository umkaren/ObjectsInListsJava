public class Book {
    private String title;
    private int pages;
    private int year;
    //constructors
    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
        this.year = 2000;
    }
    public Book(String title) {
        this.title = title;
        this.pages = 10;
        this.year = 2000;
    }
    public Book() {
        this.title = "Who Knows";
        this.pages = 1;
        this.year = 2023;
    }

    public String toString() {
        return title + ", " + pages + " pages, " + year;
    }
    public String getTitleOnly() {
        return title;
    }
}
