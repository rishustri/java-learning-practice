import java.util.ArrayList;
import java.util.List;

// Abstract Base Class for Vehicle
abstract class Vehicle {
    private String id;
    private String model;
    private boolean isAvailable;//abailable for rent or in use 

    public Vehicle(String id, String model) {
        this.id = id;
        this.model = model;
        this.isAvailable = true;//for first time it will be avialable a should have a ststic value for true
    }

    public String getId() { //encapsulation is used
        return id; 
    }
    public String getModel() { 
        return model; 
    }
    public boolean isAvailable() { 
        return isAvailable; 
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    // Abstract method to enforce pricing logic in specific vehicle categories
    public abstract double calculateRentalCharge(int days);
}

// Concrete Vehicle Subclasses
class Sedan extends Vehicle {
    private double dailyRate = 50.0;

    public Sedan(String id, String model) {//final should not be reinitialized static is only for 1 object that is class
        super(id, model);//super constructor , acess with parent class
    }

    @Override
    public double calculateRentalCharge(int days) {
        return days * dailyRate;
    }
}

class SUV extends Vehicle {
    private double dailyRate = 80.0;

    public SUV(String id, String model) {
        super(id, model);
    }

    @Override
    public double calculateRentalCharge(int days) {
        return days * dailyRate;
    }
}

class Truck extends Vehicle {
    private double dailyRate = 100.0;

    public Truck(String id, String model) {
        super(id, model);
    }

    @Override
    public double calculateRentalCharge(int days) {
        return days * dailyRate;//a moun t will be different for each sub class
    }
}

// Customer Class
class Customer {
    private String customerId;
    private String name;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerId() { return customerId; }
    public String getName() { return name; }
}

// Rental Class tracking active rentals
class Rental {
    private String rentalId;
    private Vehicle vehicle;
    private Customer customer;
    private int days;
//vehicle datatype , user defined datatype vehicle, customer,days
    public Rental(String rentalId, Vehicle vehicle, Customer customer, int days) {
        this.rentalId = rentalId;
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
    }

    public Vehicle getVehicle() { return vehicle; }
    public Customer getCustomer() { return customer; }

    public double getTotalCharge() {
        return vehicle.calculateRentalCharge(days);
    }
}

// Rental System Manager
class RentalSystem {
    private List<Vehicle> vehicles = new ArrayList<>();// array list is a predefined data,
    private List<Rental> activeRentals = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public Rental rentVehicle(String rentalId, Vehicle vehicle, Customer customer, int days) {
        if (!vehicle.isAvailable()) {
            System.out.println(vehicle.getModel() + " is currently unavailable.");
            return null;
        }

        vehicle.setAvailable(false);
        Rental rental = new Rental(rentalId, vehicle, customer, days);
        activeRentals.add(rental);

        System.out.println(vehicle.getModel() + " rented successfully by " + customer.getName() + 
                           ". Rental charge: $" + (int) rental.getTotalCharge() + ".");
        return rental;
    }

    public void returnVehicle(Rental rental) {
        if (rental != null && activeRentals.contains(rental)) {
            rental.getVehicle().setAvailable(true);
            activeRentals.remove(rental);
            System.out.println(rental.getVehicle().getModel() + " returned by " + rental.getCustomer().getName() + ".");
        }
    }
}

// Main Execution matching the sample workflow
public class Transport {
    public static void main(String[] args) {
        RentalSystem system = new RentalSystem();

        Vehicle sedanA = new Sedan("V001", "Sedan A");//creating vehilcle type and then refering to the child clas of parent
        Vehicle suvB = new SUV("V002", "SUV B");

        system.addVehicle(sedanA);
        system.addVehicle(suvB);

        Customer customer1 = new Customer("C001", "Customer 1");
        Customer customer2 = new Customer("C002", "Customer 2");
        Customer customer3 = new Customer("C003", "Customer 3");

        // Workflow Execution
        Rental rental1 = system.rentVehicle("R001", sedanA, customer1, 3);
        system.rentVehicle("R002", sedanA, customer2, 2);
        system.returnVehicle(rental1);
        system.rentVehicle("R003", suvB, customer3, 5);
    }
}
// using add becaus eof the parent interface to be added
