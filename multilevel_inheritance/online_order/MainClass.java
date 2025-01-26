package multilevel_inheritance.online_order;

public class MainClass{
    public static void main(String[] args) {
        Order order=new DeliveredOrder(10020023,"21 jan 2025",12345678, "25 jan 2025");
        order.getOrderStatus();

    }
}
