abstract class Vehicle {
    String brand;
    double price;

    Vehicle(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle {
    Car(String brand, double price) {
        super(brand, price);
    }

    double calculateRentalCost(int days) {
        return price * days;
    }
}

class Bike extends Vehicle {
    Bike(String brand, double price) {
        super(brand, price);
    }

    double calculateRentalCost(int days) {
        return price * days;
    }
}

class Truck extends Vehicle {
    Truck(String brand, double price) {
        super(brand, price);
    }

    double calculateRentalCost(int days) {
        return price * days;
    }
}

public class Practical04 {
    public static void main(String[] args) {

        Vehicle v;

        v = new Car("Toyota", 2000);
        System.out.println("Car: " + v.calculateRentalCost(3));

        v = new Bike("Honda", 800);
        System.out.println("Bike: " + v.calculateRentalCost(3));

        v = new Truck("Tata", 3000);
        System.out.println("Truck: " + v.calculateRentalCost(3));
    }
}