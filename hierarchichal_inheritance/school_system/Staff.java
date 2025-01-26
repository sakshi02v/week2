package hierarchichal_inheritance.school_system;

class Staff extends Person{
    String department;
    Staff(String name,int age,String department){
        super(name,age);
        this.department=department;
    }
    public void displayRole(){
        System.out.println("Role:Staff");
    }
}
