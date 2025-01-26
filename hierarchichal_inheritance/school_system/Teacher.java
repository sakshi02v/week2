package hierarchichal_inheritance.school_system;

class Teacher extends Person{
    String subject;
    Teacher(String name,int age,String subject){
        super(name,age);
        this.subject=subject;
    }
    public void displayRole(){
        System.out.println("Role:Teacher");
    }
}
