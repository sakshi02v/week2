package assisted_problems.vehicle_transport;

class Car extends Vehicle{
    int seatCapacity;
    Car(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity=seatCapacity;
    }
    public void displayInfo(){
        System.out.println("Maximum speed: "+maxSpeed);
        System.out.println("Type of fuel: "+fuelType);
        System.out.println("Number of seat: "+seatCapacity);
    }
}