class Student{
    String name;
    int age;

    Student(String n; int a){
        name=n;
        age=a;
    }

    void DisplayInfo(){
        System.out.println(name +"is" + age +" years old.");
    }
}

public class Main{
    public static void main(Steing[] args){
        Student s1=new Student("Vaiibhavi", 20);
        s1.displyInfo();
    }
}