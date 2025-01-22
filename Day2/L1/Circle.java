public class Circle {
    int radius;
    Circle(){
        this.radius=12;
    }
    Circle(int radius){
        this.radius=radius;
    }
    public void DisplayDetails(){
        System.out.println("Radius of Circle:"+radius);
    }
    public static void main(String[] args) {
        Circle defaultR = new Circle();
        defaultR.DisplayDetails();
        Circle CustomR = new Circle(15);
        CustomR.DisplayDetails();
       
    }
}
