class SRM{
    String name = "Vaiibhavi";
    void JavaSRM()
    {
        System.out.println("Lunch");
    }
}
class TP1 extends SRM{
    void AM1()
    {
        System.out.println("JAVA Class");
    }
    public static void main(String[] args)
    {
        TP1 t = new TP1();
        t.JavaSRM();
        t.AM1();
        System.out.println("Name = " + t.name);
    }
}