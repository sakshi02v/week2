package hierarchichal_inheritance.school_system;

class Student extends Person{
    char Grade;
    Student(String name,int age,char Grade){
        super(name,age);
        this.Grade=Grade;
    }
    public void displayRole(){
        System.out.println("Role:Student");
    }
}
