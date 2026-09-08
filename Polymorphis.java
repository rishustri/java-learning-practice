class Animal{
    void sound(){
        System.out.println("Animal makes sound.");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog says: Woof Woof");
    }
}

class Cat extends Animal{
      @Override
      void sound(){
        System.out.println("Cat says: Meow Meow");
      }
}

public class Polymorphis{
    public static void main(String[] args){
        Animal a1=new Dog();
        a1.sound();

        Animal a2=new Cat();
        a2.sound();
    }
}