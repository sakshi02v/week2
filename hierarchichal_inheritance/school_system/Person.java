package hierarchichal_inheritance.school_system;

class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
    public void displayRole()
    {
        System.out.println("displays role");
    }
}
