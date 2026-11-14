class Book1{
    String title;
        String author;
        float price;
    void initialized(String title,String author,float price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display(){
        System.out.println("The title of the book: "+title);
        System.out.println("The author of the book: "+author);
        System.out.println("The price of the book: "+price);

    }
}
public class PraticeTask6 {
    static void main(String[] args) {
        Book1 b=new Book1();
        b.initialized("Java","Vut",1500);
        b.display();

    }
}
