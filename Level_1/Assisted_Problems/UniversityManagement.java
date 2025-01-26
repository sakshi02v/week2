import java.util.ArrayList;
import java.util.List;

// Course Class
class Course {
    private String courseName;
    private Professor professor; // Association: Each course is taught by one professor
    private List<Student> enrolledStudents; // Aggregation: A course has multiple students

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getName() + " has been assigned to the course: " + courseName);
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println("Student " + student.getName() + " has enrolled in the course: " + courseName);
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}

// Professor Class
class Professor {
    private String name;
    private String department;

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}

// Student Class
class Student {
    private String name;
    private String studentId;
    private List<Course> enrolledCourses; // Aggregation: A student can enroll in multiple courses

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.enrollStudent(this);
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }
}

// Main Class
public class UniversityManagement {
    public static void main(String[] args) {
        // Create Professors
        Professor professor1 = new Professor("Dr. Smith", "Computer Science");
        Professor professor2 = new Professor("Dr. Brown", "Mathematics");

        // Create Courses
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Calculus");

        // Assign Professors to Courses
        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);

        // Create Students
        Student student1 = new Student("Alice", "S101");
        Student student2 = new Student("Bob", "S102");

        // Students Enroll in Courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student1.enrollCourse(course2);

        // Display Enrollments
        System.out.println("\nEnrolled Students in " + course1.getCourseName() + ":");
        for (Student s : course1.getEnrolledStudents()) {
            System.out.println("- " + s.getName());
        }

        System.out.println("\nEnrolled Students in " + course2.getCourseName() + ":");
        for (Student s : course2.getEnrolledStudents()) {
            System.out.println("- " + s.getName());
        }
    }
}
