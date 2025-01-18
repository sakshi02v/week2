import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}
public class ShoppingCart {
    private ArrayList<CartItem> cartItems = new ArrayList<>();

    public void addItem(String itemName, double price, int quantity) {
        CartItem item = new CartItem(itemName, price, quantity);
        cartItems.add(item);
        System.out.println(itemName + " added to the cart.");
    }

    public void removeItem(String itemName) {
        for (CartItem item : cartItems) {
            if (item.itemName.equalsIgnoreCase(itemName)) {
                cartItems.remove(item);
                System.out.println(itemName + " removed from the cart.");
                return;
            }
        }
        System.out.println("Item not found in the cart.");
    }
	
    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : cartItems) {
            totalCost += item.getTotalPrice();
        }
        System.out.println("Total Cost: $" + totalCost);
    }

    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            for (CartItem item : cartItems) {
                System.out.println(item.itemName + " - $" + item.price + " x " + item.quantity + " = $" + item.getTotalPrice());
            }
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart");
            System.out.println("4. Display Total Cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter item name: ");
                String itemName = scanner.nextLine();
                System.out.print("Enter item price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                cart.addItem(itemName, price, quantity);
            } else if (choice == 2) {
                System.out.print("Enter item name to remove: ");
                String itemName = scanner.nextLine();
                cart.removeItem(itemName);
            } else if (choice == 3) {
                cart.displayCart();
            } else if (choice == 4) {
                cart.displayTotalCost();
            } else if (choice == 5) {
                System.out.println("Thank you for shopping. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}
