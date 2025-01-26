import java.util.ArrayList;
import java.util.List;

// School class
class School {
    private String name;
    private String location;
    private List<Student> students;

    public School(String name, String location) {
        this.name = name;
        this.location = location;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void showStudents() {
        System.out.println("School: " + name + " - Students:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

// Student class
class Student {
    private String name;
    private String studentId;
    private List<Course> enrolledCourses;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this);
        }
    }

    public void viewCourses() {
        System.out.println("Student: " + name + " - Enrolled Courses:");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// Course class
class Course {
    private String courseName;
    private String courseCode;
    private List<Student> enrolledStudents;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    public void showEnrolledStudents() {
        System.out.println("Course: " + courseName + " - Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }
}

// Main class
public class SchoolAssociation {
    public static void main(String[] args) {
        // Create a School
        School school = new School("Greenwood High", "California");

        // Create Students
        Student alice = new Student("Alice", "S101");
        Student bob = new Student("Bob", "S102");

        // Create Courses
        Course math = new Course("Mathematics", "MATH101");
        Course science = new Course("Science", "SCI101");

        // Add students to the school
        school.addStudent(alice);
        school.addStudent(bob);

        // Enroll students in courses
        alice.enrollInCourse(math);
        alice.enrollInCourse(science);

        bob.enrollInCourse(math);

        // Display school information
        school.showStudents();

        // Display student courses
        alice.viewCourses();
        bob.viewCourses();

        // Display course enrolled students
        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}
