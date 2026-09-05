import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int[] marks = new int[3];
    double attendance;

    void display() {
        int total = 0;
        for (int i = 0; i < 3; i++) {
            total += marks[i];
        }

        double average = total / 3.0;

        String result = (average >= 50) ? "Pass" : "Fail";
        String scholarship = (average >= 75 && attendance >= 80) ? "Eligible" : "Not Eligible";
        String performance = (average >= 85) ? "Excellent" : "Good";

        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Result: " + result);
        System.out.println("Scholarship: " + scholarship);
        System.out.println("Performance: " + performance);
        System.out.println();
    }

    double getAverage() {
        int total = 0;
        for (int i = 0; i < 3; i++) {
            total += marks[i];
        }
        return total / 3.0;
    }
}

public class StudentPerformance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            students[i] = new Student();

            System.out.println("Enter details of Student " + (i + 1));

            System.out.print("Roll Number: ");
            students[i].rollNo = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            System.out.print("Name: ");
            students[i].name = sc.nextLine(); // allows full names

            for (int j = 0; j < 3; j++) {
                System.out.print("Marks in Subject " + (j + 1) + ": ");
                students[i].marks[j] = sc.nextInt();
            }
        }}
    }
