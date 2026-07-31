//Create a Book class with title, author,
//  price. Add a constructor and display method.

claass Book{
    double price;
    String title;
    String auhtor;

    //Constructor
    Book(String a;String t; double p){
        title=t;
        price=p;
        author=a;
    }
}

void display(){
    System.out.println("Author is " + author);
    System.out.println("Title is : " + title);
    System.out.println("Price is: " + price);

}

public class Dress{
    public static void main(String[] args){
        Dress d=new Dress(a:"Rabindranath Tagore", t:"Geetanjali", p=1200.0);
        d.display();
    }
}