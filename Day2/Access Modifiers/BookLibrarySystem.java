class Book {
    public String ISBN;          // Public member
    protected String title;      // Protected member
    private String author;       // Private member

    // Constructor to initialize Book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set the author's name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get the author's name
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass to demonstrate access to ISBN and title
class EBook extends Book {
    private double fileSizeMB; // File size in megabytes

    // Constructor for EBook
    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author); // Calling parent class constructor
        this.fileSizeMB = fileSizeMB;
    }

    // Method to display EBook details
    @Override
    public void displayDetails() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN); // Accessing public member
        System.out.println("Title: " + title); // Accessing protected member
        System.out.println("File Size: " + fileSizeMB + " MB");
    }
}

// Main class to demonstrate functionality
public class BookLibrarySystem {
    public static void main(String[] args) {
        // Create a Book object
        Book book1 = new Book("978-3-16-148410-0", "The Great Gatsby", "F. Scott Fitzgerald");

        System.out.println("Book Details:");
        book1.displayDetails();

        // Modify and display the author name
        book1.setAuthor("Fitzgerald");
        System.out.println("\nAfter Updating Author Name:");
        System.out.println("Author: " + book1.getAuthor());

        // Create an EBook object
        EBook ebook = new EBook("978-1-4028-9462-6", "1984", "George Orwell", 2.5);

        System.out.println("\nEBook Details:");
        ebook.displayDetails();
    }
}
