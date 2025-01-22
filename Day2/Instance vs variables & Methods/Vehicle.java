public class Vehicle {
    private String ownerName;
    private String vehicleType; // e.g., "Car", "Motorcycle", "Truck"
    private static double registrationFee = 100.0; // Fixed fee for all vehicles

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + String.format("%.2f", registrationFee));
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + String.format("%.2f", registrationFee));
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Creating vehicle instances
        Vehicle vehicle1 = new Vehicle("Alice Johnson", "Car");
        Vehicle vehicle2 = new Vehicle("Bob Smith", "Motorcycle");

        // Displaying vehicle details
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();
        System.out.println();

        System.out.println("Vehicle 2 Details:");
        vehicle2.displayVehicleDetails();
        System.out.println();

        // Updating the registration fee
        Vehicle.updateRegistrationFee(150.0);

        // Displaying vehicle details again to reflect updated registration fee
        System.out.println("\nAfter Updating Registration Fee:");
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();
        System.out.println();

        System.out.println("Vehicle 2 Details:");
        vehicle2.displayVehicleDetails();
    }
}
