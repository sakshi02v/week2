public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 50.0; // Daily rental rate for cars

    // Constructor to initialize rental details
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }

    // Method to display rental details
    @Override
    public String toString() {
        return "Customer Name: " + customerName + "\n"
                + "Car Model: " + carModel + "\n"
                + "Rental Days: " + rentalDays + "\n"
                + "Total Cost: $" + String.format("%.2f", calculateTotalCost());
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Example rental
        CarRental rental = new CarRental("John Doe", "Toyota Corolla", 5);
        
        // Display rental details
        System.out.println(rental);
    }
}
