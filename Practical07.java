class Alpha {

    double value;

    Alpha(double value) {
        this.value = value;
    }

    final double calculate() {
        return value * 12;
    }
}

class Beta extends Alpha {

    Beta(double value) {
        super(value);
    }
}

class Gamma extends Alpha {

    Gamma(double value) {
        super(value);
    }
}

class Delta extends Alpha {

    Delta(double value) {
        super(value);
    }
}

public class Practical07 {

    public static void main(String[] args) {

        Beta b = new Beta(60000);
        Gamma g = new Gamma(80000);
        Delta d = new Delta(50000);

        System.out.println("Beta: " + b.calculate());
        System.out.println("Gamma: " + g.calculate());
        System.out.println("Delta: " + d.calculate());
    }
}