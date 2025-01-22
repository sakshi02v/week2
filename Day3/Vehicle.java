public class Vehicle {
    // Static variable
    private static double registrationFee;

    // Final variable
    private final String registrationNumber;

    // Instance variables
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method to display vehicle details
    public void displayDetails() {
        // Using instanceof to check if the object is of Vehicle type
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("The object is not an instance of Vehicle.");
        }
    }

    // Getter for registration fee
    public static double getRegistrationFee() {
        return registrationFee;
    }

    public static void main(String[] args) {
        // Update the static registration fee
        Vehicle.updateRegistrationFee(150.0);

        // Create instances of Vehicle
        Vehicle vehicle1 = new Vehicle("Alice", "Car", "REG123");
        Vehicle vehicle2 = new Vehicle("Bob", "Motorcycle", "REG456");

        // Display details
        vehicle1.displayDetails();
        System.out.println();
        vehicle2.displayDetails();
    }
}
