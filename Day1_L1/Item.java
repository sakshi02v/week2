class Item {
    private String itemCode;
    private String itemName;
    private double price;

    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode; 
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Code: " + this.itemCode);
        System.out.println("Name: " + this.itemName);
        System.out.println("Price: $" + this.price);
    }

    public double totalCost(int quantity) {
        return this.price * quantity; 
    }
	
    public static void main(String[] args) {
        Item item = new Item("C303", "Marker", 2.50);
        item.displayDetails();

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double total = item.totalCost(quantity);
        System.out.println("Total cost: $" + total);
    }
}
