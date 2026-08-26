class Studentmulti{
    String name;
    int age;

    void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    
    }

}

public class many{
    public static void main(String[] args){
        Studentmulti s1=new Studentmulti();
        s1.name="Vaiibhvai Singh";
        s1.age=19;

        Studentmulti s2= new Studentmulti();
        s2.name="Rohiot Singh";
        s2.age=20;
        s1.display();
        s2.display();
    }
}