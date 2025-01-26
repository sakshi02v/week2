package assisted_problems.vehicle_transport;

class Vehicle {
    int maxSpeed;
    String fuelType;
    Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    public void displayInfo(){
        System.out.println("Maximum speed: "+maxSpeed);
        System.out.println("Type of fuel: "+fuelType);
    }
}
