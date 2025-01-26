package assisted_problems.employee_management;

class Intern extends Employee{
    Intern(String name,int age,double salary){
        super(name,age,salary);
    }
    public void displayDetails(){
        System.out.println("Name :"+name+"Age: "+age+"Salary: "+salary);
    }
}
