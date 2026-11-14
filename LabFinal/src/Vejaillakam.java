class Person {
    String name;
    int age;
    // Constructor 1: No-arg
    Person() {
        this("Unknown", 0); // chaining inside same class
        System.out.println("Person() called");
    }
    // Constructor 2: One-arg
    Person(String name) {
        this(name, 0); // again chaining
        System.out.println("Person(String) called");
    }
    // Constructor 3: Full (main one)
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person(String, int) called");
    }
}
class Student3 extends Person {
    int roll;
    Student3() {
        super(); // calls Person() which chains down
        System.out.println("Student() called");
    }
    Student3(String name, int age, int roll) {
        super(name, age); // directly call full parent constructor
        this.roll = roll;
        System.out.println("Student(full) called");
    }
}
public class Vejaillakam {
    public static void main(String[] args) {
        System.out.println("--- Creating Student() ---");
        Student3 s1 = new Student3();
        System.out.println("\n--- Creating Student(full) ---");
        Student3 s2 = new Student3("Safwan", 20, 101);
    }
}
