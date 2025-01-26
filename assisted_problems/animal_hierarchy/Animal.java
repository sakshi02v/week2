package assisted_problems.animal_hierarchy;

class Animal{
    String name;
    int age;
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Name of animal is:"+name+" and age of animal is:"+age);
    }
    void makeSound(){
        System.out.println("Animals make sound");
    }
}