//Class+constructor+method
class Student8{
    String name;
    int age;

    Student8(String name, int age){
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println("Name: " + name + "\n Age : " + age);
    }

    public static void main(String[] args){
        Student8 s=new Student8("Rishu",19);
        s.display();
    }

}