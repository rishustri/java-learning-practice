class Students{
    private int id;
    private String name;
    private String address;

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }
}

public class EncapIt{
    public static void main(String[] aregs){
        Students s1=new Students();
        s1.setId(769);
        s1.setName("Vaiibhavi");
        s1.setAddress("Garacharma");

        System.out.println("ID: " + s1.getId());
        System.out.println("Name: " + s1.getName());
        System.out.println("Address: " + s1.getAddress());
    }
}