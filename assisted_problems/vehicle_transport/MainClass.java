package assisted_problems.vehicle_transport;

public class MainClass{
    public static void main(String[] args) {

        Vehicle [] vehicletype=new Vehicle[3];

        vehicletype[0]=new Car(130,"Diesel",7);
        vehicletype[1]=new Truck(100,"Diesel","Mahindra");
        vehicletype[2]=new Motorcycle(90,"Petrol",100);

        for (Vehicle vehicle : vehicletype) {
            System.out.println("Vehicle Info:");
            vehicle.displayInfo();
            System.out.println();
        }
    }
}
