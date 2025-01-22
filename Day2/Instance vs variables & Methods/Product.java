public class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0; // Class variable shared among all instances

    // Constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total products when a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + String.format("%.2f", price));
    }

    // Class method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Creating product instances
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 499.99);

        // Displaying product details
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();
        System.out.println();

        System.out.println("Product 2 Details:");
        product2.displayProductDetails();
        System.out.println();

        // Displaying total products created
        Product.displayTotalProducts();
    }
}
