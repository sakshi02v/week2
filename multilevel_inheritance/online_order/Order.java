package multilevel_inheritance.online_order;

class Order{
    int orderID;
    String OrderDate;

    Order(int orderID,String OrderDate){
        this.orderID=orderID;
        this.OrderDate=OrderDate;
    }
    public void getOrderStatus(){
        System.out.println("Order ID:"+orderID);
        System.out.println("Date of order:"+OrderDate);
    }
}