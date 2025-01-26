import java.util.ArrayList;
import java.util.List;

// Product Class
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

// Order Class
class Order {
    private int orderId;
    private List<Product> products; // Aggregation: Order aggregates multiple Products
    private Customer customer;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Customer: " + customer.getName() + ", Products: " + products;
    }
}

// Customer Class
class Customer {
    private String name;
    private List<Order> orders; // Association: A Customer can place multiple Orders

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }
}

// Main Class
public class Ecommerce {
    public static void main(String[] args) {
        // Create Products
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Smartphone", 800.00);
        Product product3 = new Product("Headphones", 150.00);

        // Create a Customer
        Customer customer = new Customer("Alice");

        // Create an Order and associate it with the Customer
        Order order1 = new Order(101, customer);
        order1.addProduct(product1);
        order1.addProduct(product2);

        // Customer places the order
        customer.placeOrder(order1);

        // Create another Order
        Order order2 = new Order(102, customer);
        order2.addProduct(product3);

        // Customer places the second order
        customer.placeOrder(order2);

        // Display Customer Orders
        System.out.println("Customer: " + customer.getName());
        for (Order order : customer.getOrders()) {
            System.out.println(order);
            System.out.println("Total: $" + order.calculateTotal());
        }
    }
}
