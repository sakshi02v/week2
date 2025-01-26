package single_inheritance.library;

class Author extends Book {
    String name;
    String bio;
    Author(String title,int publicationYear,String name,String bio){
        super(title, publicationYear);
        this.name=name;
        this.bio=bio;
    }
    public void displayInfo(){
        System.out.println("Title of Book:"+title);
        System.out.println("Year of publication:"+publicationYear);
        System.out.println("Name of author:"+name);
        System.out.println("Bio of book:"+bio);
    }
}
