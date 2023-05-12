public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    @Override
    public String toString() {
        return title + ", " + pages + " pages, " + year;
    }
    public String getTitleOnly() {
        return title;
    }

}
