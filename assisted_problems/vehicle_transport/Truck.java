package assisted_problems.vehicle_transport;

class Truck extends Vehicle{
    String companyName;
    Truck(int maxSpeed,String fuelType,String companyName){
        super(maxSpeed, fuelType);
        this.companyName=companyName;
    }
    public void displayInfo(){
        System.out.println("Maximum speed: "+maxSpeed);
        System.out.println("Type of fuel: "+fuelType);
        System.out.println("Company name: "+companyName);
    }
}
