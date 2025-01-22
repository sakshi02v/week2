public class Book {
    //static variable
   public static String libraryname="Central Library of TIT";
   //instance
   String title;
   String author;
   //final variable
   private final long isbn;
  Book(String title,String author,long isbn){
    this.title=title;
    this.author=author;
    this.isbn=isbn;
  }
   
  public static String displayLibraryName(){
    return libraryname;
  }

  public void DisplayDetails(){
    System.out.println("Library Name :"+libraryname);
    System.out.println("Ttile of Book is:"+title);
    System.out.println("Author of Book:"+author);
    System.out.println("isbn number:"+isbn);
  }
public static void main(String[] args) {

    Book entry1=new Book("Malgudi Days","R K Narayan",1001);
    if(entry1 instanceof  Book){
        entry1.DisplayDetails();
    }else{
        System.out.println("Invalid object");
    }

System.out.println();
     
    Book entry2=new Book("Metamorphosis","Fyodor Dostoevsky",1002);
    if(entry2 instanceof Book){
        entry2.DisplayDetails();
    }else{
        System.out.println("Invalid Object");
    }
}
}
