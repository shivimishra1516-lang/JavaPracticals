class PersonBox {

    String name;
    int age;

    PersonBox(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayRole() {
        System.out.println("Person");
    }
}

class DoctorBox extends PersonBox {

    DoctorBox(String name, int age) {
        super(name, age);
    }

    void displayRole() {
        System.out.println("Doctor: " + name + ", Age: " + age);
    }
}

class NurseBox extends PersonBox {

    NurseBox(String name, int age) {
        super(name, age);
    }

    void displayRole() {
        System.out.println("Nurse: " + name + ", Age: " + age);
    }
}

class PatientBox extends PersonBox {

    PatientBox(String name, int age) {
        super(name, age);
    }

    void displayRole() {
        System.out.println("Patient: " + name + ", Age: " + age);
    }
}

public class Practical11 {

    public static void main(String[] args) {

        DoctorBox d = new DoctorBox("Rahul", 35);
        NurseBox n = new NurseBox("Priya", 28);
        PatientBox p = new PatientBox("Aman", 20);

        d.displayRole();
        n.displayRole();
        p.displayRole();
    }
}