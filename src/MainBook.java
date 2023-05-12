import java.util.ArrayList;
import java.util.Scanner;

public class MainBook {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Book book1 = new Book("Green Eggs and Ham", 72, 1960);
        Book book2 = new Book("The Cat in the Hat", 61, 1957);
        Book book3 = new Book("The Lorax", 72, 1971);

        //adds books to BookList ArrayList
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        while (true) {
            System.out.println("Enter a book title:");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Enter page numbers:");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter publication year:");
            int year = Integer.parseInt(scanner.nextLine());

            Book book = new Book(title, pages, year);
            bookList.add(book);

        }
        System.out.println("What information will be printed?");
        System.out.println("Input 'everything' for all book information or 'name' for just the title");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("everything")) {
            for (Book book : bookList) {
            System.out.println(book);
            }
        } else if (choice.equalsIgnoreCase("name")) {
            for (Book book: bookList) {
                System.out.println(book.getTitleOnly());
            }
        }
    }
}
