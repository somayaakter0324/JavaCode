class Book {
    String title;
    String author;
    Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    void display(){
        System.out.println(title+" authored by "+author);
    }
}
public class Array_Of_Objects {
   public static void main(String[] args) {
     Book[] library=new Book[3];
        library[0]=new Book("java programming","James Gosling");
        library[1]=new Book("Clean Code","Robert Martin");
        library[2]=new Book("Design Patterns","Gang of four");
        System.out.println("Library Catalog: ");
        for(Book b: library){
            b.display();
        }
    }
}
