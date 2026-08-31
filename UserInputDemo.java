import java.util.Scanner;  // Correct capitalization

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.println("=== Scanner Example ===");

        // Integer input
        System.out.print("Enter an integer: ");
        int age = sc.nextInt();

        // Decimal input
        System.out.print("Enter a decimal: ");
        double salary = sc.nextDouble();

        // Clear buffer before reading string
        sc.nextLine(); // consume leftover newline

        // String input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Character input
        System.out.print("Enter Gender (M/F): ");
        char gender = sc.next().charAt(0);

        // Output
        System.out.println("\n=== Scanner Output ===");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Gender : " + gender);

        sc.close(); // good practice
    }
}
