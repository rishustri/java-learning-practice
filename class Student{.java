class Student{
    String name;//instance variable
    int age;//instance variable

    //Constructor
    Student(String n , int a){//parameterized constructor
        name=n;//assigning value to instance variable
        age=a;//assigning value to instance variable
    }

    void display(){//method to display values of instance variables
        System.out.println(name + " is " + age + " years old");//displaying values of instance variables
    }
}

public class Main{//main class
    public static void main(String[] args){//main method
        Student s1=new Student("Vaiibhavi Singh", 19);//creating object of Student class and passing values to constructor
        s1.display();//calling display method to display values of instance variables
    }
}