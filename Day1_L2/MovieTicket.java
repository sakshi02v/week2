class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;
    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    public void displayDetails() {
        System.out.println("Movie Name: " + this.movieName);
        System.out.println("Seat Number: " + this.seatNumber);
        System.out.println("Ticket Price: $" + this.price);
    }

    public static void main(String[] args) {
       
        MovieTicket ticket = new MovieTicket("Not Booked", 0, 0.0);

        System.out.println("Initial Ticket Details:");
        ticket.displayDetails();

       
        System.out.println("\nBooking a ticket...");
        ticket.bookTicket("Avatar: The Way of Water", 25, 15.50);

        System.out.println("\nUpdated Ticket Details:");
        ticket.displayDetails();
    }
}
