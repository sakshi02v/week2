package hybrid_inheritance.restaurant;

public class MainClass {
    public static void main(String[] args) {
        Chef chef = new Chef("Tim", 101);
        Waiter waiter = new Waiter("uri", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}
