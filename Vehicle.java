class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    void run() {
        System.out.println("Car is running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running");
    }

    public static void main(String[] args) {
        Vehicle v;

        v = new Car();
        v.run();

        v = new Bike();
        v.run();
    }
}