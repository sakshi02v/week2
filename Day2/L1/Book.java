public class Book{
    String title;
    String author;
    int price;

    Book(){
        this.title="Malgudi Days";
        this.author="R K Narayan";
        this.price=1299;
    }
    
    Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

   public void DisplayDetails(){
    System.out.println("Title :"+title);
    System.out.println("AUthor: "+author);
    System.out.println("Price :"+price);
   }
public static void main(String[] args) {
    Book defaultC = new Book();
    defaultC.DisplayDetails();

    Book CustomC = new Book("Pride and Prejudice","F.Scott Fitzgerald",1249);
    CustomC.DisplayDetails();
}

}