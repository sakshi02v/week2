import java.util.ArrayList;
import java.util.List;

class Company {
    private String name;
    private String location;
    private List<Department> departments;

    public Company(String name, String location) {
        this.name = name;
        this.location = location;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void showDepartments() {
        System.out.println("Company: " + name + " - Departments:");
        for (Department department : departments) {
            System.out.println("- " + department.getName());
        }
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void showEmployees() {
        System.out.println("Department: " + name + " - Employees:");
        for (Employee employee : employees) {
            System.out.println("- " + employee.getDetails());
        }
    }
}

class Employee {
    private String name;
    private String employeeId;
    private String position;

    public Employee(String name, String employeeId, String position) {
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
    }

    public String getDetails() {
        return "Name: " + name + ", ID: " + employeeId + ", Position: " + position;
    }
}

public class BankEmployee {
    public static void main(String[] args) {
        // Create a Company
        Company company = new Company("TechCorp", "New York");

        // Create Departments
        Department engineering = new Department("Engineering");
        Department hr = new Department("Human Resources");

        // Add Employees to Departments
        engineering.addEmployee(new Employee("Alice", "E101", "Software Engineer"));
        engineering.addEmployee(new Employee("Bob", "E102", "DevOps Engineer"));

        hr.addEmployee(new Employee("Carol", "HR201", "Recruiter"));
        hr.addEmployee(new Employee("Dave", "HR202", "HR Manager"));

        // Add Departments to Company
        company.addDepartment(engineering);
        company.addDepartment(hr);

        // Display the Company Structure
        company.showDepartments();
        engineering.showEmployees();
        hr.showEmployees();

        // Clean up: Deleting the company
        System.out.println("\nDeleting the company...");
        company = null; // This implies all departments and employees are removed with the company in the composition model
    }
}
