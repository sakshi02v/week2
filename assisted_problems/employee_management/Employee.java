package assisted_problems.employee_management;

class Employee {
    String name;
    int age;
    double salary;
    public Employee(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("Name :"+name+"Age: "+age+"Salary: "+salary);
    }
}
