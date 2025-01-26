package assisted_problems.animal_hierarchy;

class Bird extends Animal{
    Bird(String name,int age){
        super(name,age);
    }
    void makeSound(){
        System.out.println("Bird flies");}
}