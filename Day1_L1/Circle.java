public class Circle {
    int radius; 

public Circle(int radius){
    this.radius=radius;

}
public void display(){
    System.out.println("Area of circle:"+3.14*radius*radius);
    System.out.println("Circumference of circle:"+ 2*3.14*radius);
}
public static void main(String[] args) {
    int radius=6;
    Circle obj=new Circle(radius);
    obj.display();
}
}