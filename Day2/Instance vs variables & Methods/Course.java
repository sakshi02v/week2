public class Course {
    private String courseName;
    private int duration; // Duration in weeks
    private double fee;
    private static String instituteName = "Global Academy"; // Shared by all courses

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + String.format("%.2f", fee));
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
        System.out.println("Institute name updated to: " + instituteName);
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Creating course instances
        Course course1 = new Course("Java Programming", 8, 500.0);
        Course course2 = new Course("Web Development", 12, 700.0);

        // Displaying course details
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();
        System.out.println();

        System.out.println("Course 2 Details:");
        course2.displayCourseDetails();
        System.out.println();

        // Updating the institute name
        Course.updateInstituteName("Tech Institute");

        // Displaying course details again to reflect updated institute name
        System.out.println("\nAfter Updating Institute Name:");
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();
        System.out.println();

        System.out.println("Course 2 Details:");
        course2.displayCourseDetails();
    }
}

