import java.util.Scanner;
public class AttendenceCheck{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[] attendence = new int[7];
        int presentDays=0;

        System.out.println("Enter the attendence for 7 days (1 for present, 0 for absent):");
        for(int i=0; i<7; i++){
            attendence[i] = sc.nextInt();
            if(attendence[i] == 1){
                presentDays++;
            }
        }
        double percentage = (presentDays / 7.0) * 100;
        System.out.println("Attendance percentage: " + percentage + "%");

        if(percentage >= 75){
            System.out.println("Eligible for the exam.");
        } else {
            System.out.println("Not eligible for the exam.");
        }
    }

}