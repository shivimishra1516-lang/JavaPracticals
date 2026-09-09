interface ServiceBox {

    void deliver(String order);
}

class BoxOne implements ServiceBox {

    public void deliver(String order) {
        System.out.println("Bike delivery: " + order);
    }
}

class BoxTwo implements ServiceBox {

    public void deliver(String order) {
        System.out.println("Car delivery: " + order);
    }
}

class BoxThree implements ServiceBox {

    public void deliver(String order) {
        System.out.println("Drone delivery: " + order);
    }
}

public class Practical09 {

    public static void main(String[] args) {

        ServiceBox s;

        s = new BoxOne();
        s.deliver("Pizza");

        s = new BoxTwo();
        s.deliver("Burger");

        s = new BoxThree();
        s.deliver("Cake");
    }
}