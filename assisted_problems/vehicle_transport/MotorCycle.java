package assisted_problems.vehicle_transport;

class Motorcycle extends Vehicle{
    int mileage;
    Motorcycle(int maxSpeed,String fuelType,int mileage){
        super(maxSpeed, fuelType);
        this.mileage=mileage;
    }
    public void displayInfo(){
        System.out.println("Maximum speed: "+maxSpeed);
        System.out.println("Type of fuel: "+fuelType);
        System.out.println("mileage given: "+mileage);
    }
}
