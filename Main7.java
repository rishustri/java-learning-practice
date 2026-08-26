class Marks{
    int sub1, sub2 ,sub3;

    void calculate(){
        int total=sub1+sub2+sub3;
        double average=total/3;
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

public class Main7{
    public static void main(String[] args){
        Marks m=new Marks();
        m.sub1=78;
        m.sub2=89;
        m.sub3=95;
        m.calculate();
    }
}