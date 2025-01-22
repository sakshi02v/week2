class Employee {
    public int employeeID;          // Public member
    protected String department;    // Protected member
    private double salary;          // Private member

    // Constructor to initialize Employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void modifySalary(double newSalary) {
        if (newSalary >= 0) {
            this.salary = newSalary;
        } else {
            System.out.println("Invalid salary. Salary cannot be negative.");
        }
    }

    // Public method to get the salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + String.format("%.2f", salary));
    }
}

// Subclass to demonstrate access to employeeID and department
class Manager extends Employee {
    private String managedTeam; // Specific to managers

    // Constructor for Manager
    public Manager(int employeeID, String department, double salary, String managedTeam) {
        super(employeeID, department, salary); // Call the parent class constructor
        this.managedTeam = managedTeam;
    }

    // Method to display manager details
    @Override
    public void displayDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID); // Accessing public member
        System.out.println("Department: " + department); // Accessing protected member
        System.out.println("Managed Team: " + managedTeam);
    }

    // Method to get the managed team
    public String getManagedTeam() {
        return managedTeam;
    }
}

// Main class to demonstrate functionality
public class EmployeeRecords {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee1 = new Employee(101, "Sales", 50000.0);

        System.out.println("Employee Details:");
        employee1.displayDetails();

        // Modify the salary
        employee1.modifySalary(55000.0);
        System.out.println("\nAfter Updating Salary:");
        System.out.println("Salary: $" + employee1.getSalary());

        // Create a Manager object
        Manager manager1 = new Manager(201, "Engineering", 90000.0, "Software Development");

        System.out.println("\nManager Details:");
        manager1.displayDetails();
    }
}
