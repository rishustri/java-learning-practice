class Student{
    String name;
    int age;

    void display(){
        System.out.println(name + " is " + age + " years old");
    }
}

public class main{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name="Rishu Badmash";
        s1.age=19;
        s1.display();
    }
}
