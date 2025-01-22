public class Employee {
    //static variables
    static String companyName="Capgemini";
    static int totalEmployees=0;

    //instance variables
    String name;
    String designation;

    final int id; //final variable

    Employee(int id,String name,String designation){
        this.name=name;
        this.id=id;
        this.designation=designation;

        totalEmployees++;
    }
    public static int displayTotalEmployees(){
        return totalEmployees;
    }
    public void DisplayDetails(){
        System.out.println("ID of Employee: "+id);
        System.out.println("Name of Employee "+name);
        System.out.println("Designation of Employee:"+designation);
    }
public static void main(String[] args) {
    Employee employee1=new Employee(101,"Peter","Project Lead");
    if(employee1 instanceof  Employee){
        employee1.DisplayDetails();
    }
    else{
        System.out.println("Invalid Object");
    }
    System.out.print("Total no. of employees:"+totalEmployees);
}

}
