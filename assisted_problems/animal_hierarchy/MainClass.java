package assisted_problems.animal_hierarchy;

public class MainClass{
    public static void main(String[] args) {
        Animal dog=new Dog("GermanShephard",21);
        Animal cat=new Cat("Lara",10);
        Animal bird=new Bird("Sparrow",2);
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();

    }
}