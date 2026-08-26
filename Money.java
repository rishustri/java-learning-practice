class Employee{
    String name;
    int id;
    String department;

    void display(){
        System.out.println("Name: " + name + ", \n ID: " + id + ", \n Department: " + department);

    }
}

public class Money{
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.name="John";
        e1.id=101;
        e1.department="HR";

        Employee e2=new Employee();
        e2.name="Badmsah";
        e2.id=102;
        e2.department="IT";
        e1.display();
        e2.display();
    }
}