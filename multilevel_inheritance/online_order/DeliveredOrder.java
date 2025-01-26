package multilevel_inheritance.online_order;

class DeliveredOrder extends ShippedOrder{
    String deliveryDate;

    DeliveredOrder(int orderID, String OrderDate,int trackingNumber,String deliveryDate) {
        super(orderID, OrderDate,trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    public void getOrderStatus(){
        System.out.println("Order ID:"+orderID);
        System.out.println("Date of order:"+OrderDate);
        System.out.println("Tracking number:"+trackingNumber);
        System.out.println("Deliver Date:"+deliveryDate);
    }

}
