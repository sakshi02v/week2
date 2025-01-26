package single_inheritance.library;

class Book{
    String title;
    int publicationYear;
    Book(String title,int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }
    public void displayInfo(){
        System.out.println("Title of Book:"+title);
        System.out.println("Year of publication:"+publicationYear);
    }
}
