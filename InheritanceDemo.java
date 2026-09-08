public class InheritanceDemo {

    public static void main(String[] args) {
        System.out.println("===== Single Inheritance =====");

        Dog dog = new Dog();

        dog.eat();     // Method from parent class
        dog.bark();    // Method from child class

        System.out.println("\n===== Multilevel Inheritance =====");

        Puppy puppy = new Puppy();

        puppy.eat();       // Animal method
        puppy.bark();      // Dog method
        puppy.weep();      // Puppy method

        System.out.println("\n===== Hierarchical Inheritance =====");

        Cat cat = new Cat();

        cat.eat();        // Parent method
        cat.meow();       // Cat method

        System.out.println("\n===== Multiple Inheritance using Interface =====");

        Phone phone = new Phone();

        phone.click();
        phone.playMusic();

        System.out.println("\n===== Hybrid Inheritance using Interface =====");

        Bat bat = new Bat();

        bat.walk();
        bat.fly();
    }
}


class nimal {

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends nimal {

    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {

    void weep() {
        System.out.println("Puppy cries");
    }
}

class Cat extends nimal {

    void meow() {
        System.out.println("Cat meows");
    }
}

interface Camera {

    void click();
}


interface MusicPlayer {

    void playMusic();
}


class Phone implements Camera, MusicPlayer {

    public void click() {
        System.out.println("Photo clicked");
    }


    public void playMusic() {
        System.out.println("Music playing");
    }
}

class Mammal {

    void walk() {
        System.out.println("Mammal walks");
    }
}


interface Flying {

    void fly();
}


class Bat extends Mammal implements Flying {

    public void fly() {
        System.out.println("Bat flies");
    }
}