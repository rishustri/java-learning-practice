class Calculator{
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
         return a+b;
    }
    }
//Abstraction takes place here, where it will have same method or intance but different parameters or funvtions
// it is of teo tyoes that is run time aand  compile time where
 //compile time polymorphism is also calkled method overloading
 //runtime time polymorphism is also called  method overriding
 public class Poly{
    public static void main(String[] args){
        Calculator c =new Calculator();
        System.out.println("Addition of 2 integers: " + c.add(10,20));
        System.out.println("Addition of 3 integers= " + c.add(10,20,30));
        System.out.println("Addition of 2 double integers = " + c.add(10.33,20.33));
    }

 }