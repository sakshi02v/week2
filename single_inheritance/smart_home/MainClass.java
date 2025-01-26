package single_inheritance.smart_home;

public class MainClass{
    public static void main(String[] args) {
        Thermostat device1=new Thermostat(101,"Working",26.2);
        device1.displayStatus();
    }
}
