//Create a Book class with title, author,
//  price. Add a constructor and display method.

class Book{
    String title;
    String author;
    double price;

    //Constructor
    Book(String t,String a, double p){
        title=t;
        author=a;
        price=p;
    }

    void display(){
        System.out.println("Auhtor's name= " + author);
        System.out.println("Title of Book: " + title);
        System.out.println("Price of book: " + price);
    }
}

public class Store{
    public static void main(String[] args){
        Book b=new Book("None if the above", "Ruskin Bond", 499.0);
        b.display();
    }
}
