abstract class RideBox {

    abstract double calculateFare(double distance);
}

class RideOne extends RideBox {

    double calculateFare(double distance) {
        return distance * 10;
    }
}

class RideTwo extends RideBox {

    double calculateFare(double distance) {
        return distance * 20;
    }
}

class RideThree extends RideBox {

    double calculateFare(double distance) {
        return distance * 30;
    }
}

public class Practical12 {

    public static void main(String[] args) {

        RideBox r;

        r = new RideOne();
        System.out.println("Bike Fare: Rs. " + r.calculateFare(10));

        r = new RideTwo();
        System.out.println("Sedan Fare: Rs. " + r.calculateFare(10));

        r = new RideThree();
        System.out.println("SUV Fare: Rs. " + r.calculateFare(10));
    }
}