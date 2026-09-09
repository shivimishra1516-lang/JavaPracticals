class CompanyPolicy {

    final int RETIREMENT_AGE = 60;

    void checkRetirementAge(int age) {

        if (age >= RETIREMENT_AGE) {
            System.out.println("Eligible for retirement");
        } else {
            System.out.println("Not eligible for retirement");
        }
    }
}

public class Practical06 {

    public static void main(String[] args) {

        CompanyPolicy person = new CompanyPolicy();

        person.checkRetirementAge(65);
        person.checkRetirementAge(45);
    }
}