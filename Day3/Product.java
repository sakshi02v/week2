public class Product {
    static double discount=10;
    String productName;
    static int price;
    static int quantity;
    final int productID;
    

    public Product(int productID,String productName,int price,int quantity) {
        this.productID = 101;
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
    }
    public static double updateDiscount() {
        double discount=40;
        double finalPrice=(price * 40/100)*quantity;
        return finalPrice;
    }
    public  void DisplayDetails() {
        System.out.println("Name of Product:"+productName);
        System.out.println("Price of Product before discount:"+price);
        System.out.println("Quantity of product:"+quantity);
        System.out.println("Price of product after discount:"+ Product.updateDiscount());
    }
    public static void main(String[] args) {
        Product product1=new Product(101,"Bottle",999,2);
        product1.DisplayDetails();
    }
    
}
