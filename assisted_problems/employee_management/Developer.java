package assisted_problems.employee_management;

class Developer extends Employee{
    String programmingLang;

    Developer(String name,int age,double salary,String programmingLang){
        super(name,age,salary);
        this.programmingLang=programmingLang;
    }
    public void displayDetails(){
        System.out.println("Name :"+name+",Age: "+age+",Salary: "+salary);
        System.out.println("Programming Language:"+programmingLang);
    }
}
