interface FeatureOne {

    void discount();
}

interface FeatureTwo {

    void shipping();
}

interface FeatureThree {

    void returns();
}

class ItemOne implements FeatureOne, FeatureTwo, FeatureThree {

    public void discount() {
        System.out.println("Discount available");
    }

    public void shipping() {
        System.out.println("Shipping available");
    }

    public void returns() {
        System.out.println("Return available");
    }
}

class ItemTwo implements FeatureOne {

    public void discount() {
        System.out.println("Digital product discount");
    }
}

public class Practical10 {

    public static void main(String[] args) {

        ItemOne a = new ItemOne();

        a.discount();
        a.shipping();
        a.returns();

        ItemTwo b = new ItemTwo();

        b.discount();
    }
}