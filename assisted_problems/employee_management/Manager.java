package assisted_problems.employee_management;

class Manager extends Employee{
    int teamSize;
    Manager(String name,int age,double salary,int teamSize){
        super(name,age,salary);
        this.teamSize=teamSize;
    }
    public void displayDetails(){
        System.out.println("Name :"+name+",Age: "+age+",Salary: "+salary);
        System.out.println("Team size:"+teamSize);
    }

}
