import java.util.ArrayList;
import java.util.List;

// University Class
class University {
    private String name;
    private String location;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String name, String location) {
        this.name = name;
        this.location = location;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Methods to manage departments
    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    public void showDepartments() {
        System.out.println("University: " + name + " - Departments:");
        for (Department department : departments) {
            System.out.println("- " + department.getName());
        }
    }

    // Methods to manage faculties
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showFaculties() {
        System.out.println("University: " + name + " - Faculty Members:");
        for (Faculty faculty : faculties) {
            System.out.println("- " + faculty.getName());
        }
    }

    // Deleting the University
    public void deleteUniversity() {
        System.out.println("Deleting University: " + name);
        departments.clear(); // Deletes all departments (Composition relationship)
        faculties.clear(); // Clears faculty list, but faculty can exist independently
    }
}

// Department Class (Composition relationship with University)
class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Faculty Class (Aggregation relationship with University)
class Faculty {
    private String name;
    private String facultyId;

    public Faculty(String name, String facultyId) {
        this.name = name;
        this.facultyId = facultyId;
    }

    public String getName() {
        return name;
    }

    public String getFacultyId() {
        return facultyId;
    }
}

// Main Class
public class UniversityComposition {
    public static void main(String[] args) {
        // Create a University
        University university = new University("Global University", "New York");

        // Create Departments
        Department csDepartment = new Department("Computer Science");
        Department eeDepartment = new Department("Electrical Engineering");

        // Create Faculties
        Faculty drSmith = new Faculty("Dr. Smith", "F101");
        Faculty drJohnson = new Faculty("Dr. Johnson", "F102");

        // Add Departments to University
        university.addDepartment(csDepartment);
        university.addDepartment(eeDepartment);

        // Add Faculties to University
        university.addFaculty(drSmith);
        university.addFaculty(drJohnson);

        // Show University Details
        university.showDepartments();
        university.showFaculties();

        // Delete University (along with its Departments)
        System.out.println("\nDeleting the university...");
        university.deleteUniversity();

        // Note: Faculty still exists outside the University context
        System.out.println("\nFaculty Members after University Deletion:");
        System.out.println("- " + drSmith.getName() + " (ID: " + drSmith.getFacultyId() + ")");
        System.out.println("- " + drJohnson.getName() + " (ID: " + drJohnson.getFacultyId() + ")");
    }
}
