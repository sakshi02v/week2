package hierarchichal_inheritance.school_system;

public class MainClass {
    public static void main(String[] args) {
        Person teacher=new Teacher("Subhash Kumar",49,"Mathematics");
        teacher.displayRole();
        System.out.println("");

        Person student=new Student("Sakshi",22,'A');
        student.displayRole();
        System.out.println("");
        
        Person staff=new Staff("Ashish Singh",31,"Accounts");
        staff.displayRole();
    }

}

