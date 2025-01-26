package assisted_problems.employee_management;

public class MainClass{
    public static void main(String[] args) {
        Manager manager=new Manager("Mr.Mahesh",49,150000,4);
        manager.displayDetails();
        Developer developer=new Developer("John",28,100000,"Java");
        developer.displayDetails();
        Intern intern=new Intern("Shaili",21,10000);
        intern.displayDetails();

    }
}
