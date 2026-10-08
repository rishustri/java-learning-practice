
import java.util.*;
public class Solution{
    //Declare static variable 
    static int H;
    static int B;
    static boolean flag = true;

    //Static initilaization block
    static{
        Scanner sc=new Scanner(System.in);
        H=sc.nextInt();
        B=sc.nextInt();
        sc.close();

        if(B<=0 || H<=0){
            flag =false;
            System.out.println("java.lang.Exception.Breadth and height must be positive");

        }
    }
    public static void main(String[] args){
        if(flag){
            int area=H*B;
            System.out.println(area);
        }
    }

}