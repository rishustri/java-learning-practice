class Student2{
    String name;
    int rollno;

    Student2(){
        name="Vaiibhavi";
        rollno=1;
    }

    Student2(String n, int r){
        name=n;
        rollno=r;
    }

    public static void main(String[] args){
        Student2 s1=new Student2();
        Student2 s2=new Student2("John", 2);
        System.out.println("Student 1: Name: "+s1.name+", Roll No: "+s1.rollno);
        System.out.println("Student 2: Name: "+s2.name+", Roll No:  "+s2.rollno);
        
    }
}