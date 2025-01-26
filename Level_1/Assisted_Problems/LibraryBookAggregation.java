import java.util.ArrayList;
import java.util.List;

// Book Class
class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [Title: " + title + ", Author: " + author + "]";
    }
}

// Library Class
class Library {
    private String name;
    private List<Book> books;

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Method to Add a Book to the Library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to Display Books in the Library
    public void displayBooks() {
        System.out.println("Books in " + name + ":");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

// Main Class
public class LibraryBookAggregation {
    public static void main(String[] args) {
        // Create Book Objects
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Create Library Objects
        Library library1 = new Library("City Library");
        Library library2 = new Library("Community Library");

        // Add Books to Libraries
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book3);

        // Display Books in Each Library
        library1.displayBooks();
        library2.displayBooks();
    }
}
