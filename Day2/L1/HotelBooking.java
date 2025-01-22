public class HotelBooking{
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        this.guestName="Peter";
        this.roomType="Standard";
        this.nights=2;
        
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBooking(HotelBooking clone){
        this.guestName=clone.guestName;
        this.roomType=clone.roomType;
        this.nights=clone.nights;
    }
    public void DisplayDetails(){
        System.out.println("Name of guest:"+guestName);
        System.out.println("Type of room:"+roomType);
        System.out.println("No. of nights:"+nights);
    }
    public static void main(String[] args) {
        System.out.println("Default Constructor");
        HotelBooking defaultH = new HotelBooking();
        defaultH.DisplayDetails();
        System.out.println();

        System.out.println("Parameterized Constructor");
        HotelBooking customH = new HotelBooking("John","Deluxe",3);
        customH.DisplayDetails();
        System.out.println();

        System.out.println("Copy Constructor");
        HotelBooking clonedH = new HotelBooking(customH);
        clonedH.DisplayDetails();
    }

}