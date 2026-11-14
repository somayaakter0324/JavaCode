
class Student1 {
    private String name;
    private int id;
    private double cgpa;

    // 1. No-argument constructor
    Student1() {
        this("Unknown", 000, 0.0);
    }

    // 2. Constructor with name only
    Student1(String name) {
        this(name, 000, 0.0);
    }

    // 3. Full three-parameter constructor
    Student1(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
    }
    void hudai(){
        System.out.println(name+id+cgpa);
    }
}

public class En_Con_channing {
    public static void main(String[] args) {

        Student1 s1 = new Student1();
        Student1 s2 = new Student1("Somaya");
        Student1 s3 = new Student1("Rahim", 101, 3.75);

        s1.display();
        s2.display();
        s3.display();
        s1.hudai();
    }
}