abstract class PayBox {

    String name;

    PayBox(String name) {
        this.name = name;
    }

    abstract double getAmount();
}

interface TaxBox {

    double calculateTax();
}

class TypeOne extends PayBox implements TaxBox {

    TypeOne(String name) {
        super(name);
    }

    double getAmount() {
        return 50000;
    }

    public double calculateTax() {
        return getAmount() * 0.10;
    }
}

class TypeTwo extends PayBox implements TaxBox {

    TypeTwo(String name) {
        super(name);
    }

    double getAmount() {
        return 30000;
    }

    public double calculateTax() {
        return getAmount() * 0.05;
    }
}

class TypeThree extends PayBox {

    TypeThree(String name) {
        super(name);
    }

    double getAmount() {
        return 15000;
    }
}

public class Practical13 {

    public static void main(String[] args) {

        TypeOne a = new TypeOne("Rahul");
        TypeTwo b = new TypeTwo("Priya");
        TypeThree c = new TypeThree("Aman");

        System.out.println(a.name + " Amount: " + a.getAmount());
        System.out.println("Tax: " + a.calculateTax());

        System.out.println(b.name + " Amount: " + b.getAmount());
        System.out.println("Tax: " + b.calculateTax());

        System.out.println(c.name + " Amount: " + c.getAmount());
    }
}