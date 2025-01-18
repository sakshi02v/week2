public class employees{
    String name; 
    int id; 
    int salary;
    public employees(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Name of employee:"+name);
        System.out.println("ID of employee:"+id);
        System.out.println("Salary of employee"+salary);
    }
    public static void main(String [] args){
        String name="Sakshi";
        int id=101;
        int salary=800000;
        employees obj=new employees(name,id,salary);
        obj.display();
    }

}





