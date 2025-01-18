class MobilePhone {
    private String brand;
    private String model;
    private double price;
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Price: $" + this.price);
    }

    public static void main(String[] args) {
	
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S22", 799.99);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 14", 999.99);

        System.out.println("Phone 1 Details:");
        phone1.displayDetails();

        System.out.println("\nPhone 2 Details:");
        phone2.displayDetails();
    }
}
