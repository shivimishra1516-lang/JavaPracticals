class Employee {
    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}

class Developer extends Employee {

    Developer(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    @Override
    void displayDetails() {
        System.out.println("\n--- Developer ---");
        super.displayDetails();
    }
}

class Manager extends Employee {

    Manager(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    @Override
    void displayDetails() {
        System.out.println("\n--- Manager ---");
        super.displayDetails();
    }
}

class Tester extends Employee {

    Tester(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    @Override
    void displayDetails() {
        System.out.println("\n--- Tester ---");
        super.displayDetails();
    }
}

public class Practical01 {

    public static void main(String[] args) {

        Developer d = new Developer("Shivi", 101, 60000);
        Manager m = new Manager("Rahul", 102, 80000);
        Tester t = new Tester("Priya", 103, 50000);

        d.displayDetails();
        m.displayDetails();
        t.displayDetails();
    }
}