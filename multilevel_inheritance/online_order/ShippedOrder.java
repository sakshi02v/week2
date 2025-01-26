package multilevel_inheritance.online_order;

class ShippedOrder extends Order{
    int trackingNumber;

    ShippedOrder(int orderID, String OrderDate,int trackingNumber) {
        super(orderID, OrderDate);
        this.trackingNumber = trackingNumber;
    }
    public void getOrderStatus(){
        System.out.println("Order ID:"+orderID);
        System.out.println("Date of order:"+OrderDate);
        System.out.println("Tracking number:"+trackingNumber);
    }
}
