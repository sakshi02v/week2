class Student {
    public int rollNumber;         // Public member
    protected String name;         // Protected member
    private double CGPA;           // Private member

    // Constructor to initialize Student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get the CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set the CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) { // Validating CGPA range
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Please enter a value between 0.0 and 10.0.");
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + String.format("%.2f", CGPA));
    }
}

// Subclass to demonstrate the use of protected members
class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor for PostgraduateStudent
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA); // Calling the parent class constructor
        this.specialization = specialization;
    }

    // Method to display Postgraduate student details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call parent class method
        System.out.println("Specialization: " + specialization);
    }
}

// Main class to demonstrate functionality
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student(101, "Alice Johnson", 8.5);

        System.out.println("Student Details:");
        student1.displayDetails();

        // Modify CGPA
        student1.setCGPA(9.2);
        System.out.println("\nAfter Updating CGPA:");
        student1.displayDetails();

        // Create a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob Smith", 9.0, "Data Science");

        System.out.println("\nPostgraduate Student Details:");
        pgStudent.displayDetails();
    }
}
