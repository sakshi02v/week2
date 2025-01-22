public class Person {
    String name;
    int age;
    //parameterized constructor
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    //copy constructor
    Person(Person other){
        this.name=other.name;
        this.age=other.age;
    }
    public void DisplayDetails(){
        System.out.println("Name of Person:"+name);
        System.out.println("Age of Person:"+age);
    }
    public static void main(String[] args) {
        Person original=new Person("Ram",28);
        original.DisplayDetails();
        Person cloned=new Person(original);
        cloned.DisplayDetails();
    }
    
}

