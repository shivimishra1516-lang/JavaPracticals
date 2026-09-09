class Student {
    static String university = "ABC University";
    static int count = 0;

    int id;
    String name;
    String course;

    Student(String name, String course) {
        count++;
        id = count;
        this.name = name;
        this.course = course;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("University: " + university);
        System.out.println();
    }

    static void showCount() {
        System.out.println("Total Students: " + count);
    }
}

public class Practical05 {
    public static void main(String[] args) {

        Student s1 = new Student("Shivi", "B.Tech CSE");
        Student s2 = new Student("Rahul", "B.Tech IT");
        Student s3 = new Student("Priya", "B.Tech CSE");

        s1.display();
        s2.display();
        s3.display();

        Student.showCount();
    }
}