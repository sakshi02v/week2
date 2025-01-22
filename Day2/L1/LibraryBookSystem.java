public class LibraryBookSystem {
    private String title;
    private String author;
    private double price;
    private boolean available;

    // Constructor
    public LibraryBookSystem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true; // Default is available
    }

    // Method to borrow the book
    public String borrow() {
        if (available) {
            available = false; // Mark as unavailable
            return "You have successfully borrowed '" + title + "' by " + author + ".";
        } else {
            return "Sorry, '" + title + "' is currently unavailable.";
        }
    }

    // Method to display book details
    //@Override
    public String toString() {
        String status = available ? "Available" : "Unavailable";
        return "'" + title + "' by " + author + " - $" + price + " (" + status + ")";
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        LibraryBookSystem book1 = new LibraryBookSystem("1984", "George Orwell", 15.99);

        System.out.println(book1); // Display book details
        System.out.println(book1.borrow()); // Borrow the book
        System.out.println(book1); // Display book details after borrowing
        System.out.println(book1.borrow()); // Try to borrow again
    }
}
