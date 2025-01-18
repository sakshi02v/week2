//package L1;
public class book{
    String authorName; 
    String title; 
    int price;
    public book(String authorName,String title,int price){
        this.authorName=authorName;
        this.title=title;
        this.price=price;
    }
    public void display(){
        System.out.println("Title of book:"+title);
        System.out.println("Author of book:"+authorName);
        System.out.println("Price of book:"+price);
    }
    public static void main(String [] args){
        String authorName="R K Narayan";
       String title="Malgudi Days";
        int price=1290;
        book obj=new book(authorName,title,price);
        obj.display();
    }

}





