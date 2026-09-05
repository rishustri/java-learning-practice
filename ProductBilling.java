import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    void display() {
        double totalPrice = price * quantity;
        double discount;

        if (totalPrice >= 5000)
            discount = totalPrice * 0.10;
        else
            discount = totalPrice * 0.05;

        double finalPrice = totalPrice - discount;

        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + productName);
        System.out.println("Total Price: Rs." + totalPrice);
        System.out.println("Discount: Rs." + discount);
        System.out.println("Final Price: Rs." + finalPrice);
        System.out.println();
    }
}

public class ProductBilling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] products = new Product[5];

        for (int i = 0; i < 5; i++) {
            products[i] = new Product();

            System.out.println("Enter details of Product " + (i + 1));

            System.out.print("Product ID: ");
            products[i].productId = sc.nextInt();

            System.out.print("Product Name: ");
            products[i].productName = sc.next();

            System.out.print("Price: ");
            products[i].price = sc.nextDouble();

            System.out.print("Quantity: ");
            products[i].quantity = sc.nextInt();

            System.out.println();
        }

        System.out.println("----- PRODUCT BILL -----");

        for (int i = 0; i < 5; i++) {
            products[i].display();
        }

        sc.close();
    }
}