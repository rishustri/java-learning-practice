public class LargestOfThree{
    public static void main(String[] args){
        int a=2, b=-8, c=2;

        if(a>=b && a>=c){
            System.out.println("Largest is: "+a);
        }
        else if(b>=a && b>=c){
            System.out.println("Largest is: "+b);
        }
        else{
            System.out.println("Largest of 3 numbers is: "+c);

        }
    }
}
    