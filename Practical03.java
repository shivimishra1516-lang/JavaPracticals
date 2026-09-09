interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class PayPalPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal");
    }
}

public class Practical03 {
    public static void main(String[] args) {

        Payment p;

        p = new CreditCardPayment();
        p.pay(5000);

        p = new UPIPayment();
        p.pay(2500);

        p = new PayPalPayment();
        p.pay(3000);
    }
}