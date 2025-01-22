public class Student {
    static String universityName="RGPV University";
    final int rollNumber;
    String name;
    char Grade;
    static int totalStudents=0;
    public Student(int rollNumber,String name,char Grade){
        this.rollNumber=rollNumber;
        this.name=name;
        this.Grade=Grade;
        
        totalStudents++;

    }
    public static int displayTotalStudents(){
        return totalStudents;
    }
    public void DisplayDetails(){
        System.out.println("Roll number of Student: "+rollNumber);
        System.out.println("Name of Student: "+name);
        System.out.println("Grade (in A/B/C/D): "+Grade);
    }
    public static void main(String[] args) {
        Student student1=new Student(001, "Jacob", 'A') ;
        if(student1 instanceof  Student){
        student1.DisplayDetails();
    }
    else{
        System.out.println("Invalid Object");
    }
    System.out.println("Total Students:"+Student.displayTotalStudents());
}
}