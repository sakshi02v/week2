package assisted_problems.animal_hierarchy;

class Dog extends Animal{
    Dog(String name,int age){
        super(name,age);
    }
    void makeSound(){
        System.out.println("Dog barks");
    }

}