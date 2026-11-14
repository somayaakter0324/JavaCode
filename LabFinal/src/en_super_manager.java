class Employee2 {
    private String name;
    private double salary;
    Employee2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    void display() {
        System.out.println("Name: "+ name + ", Salary: $" + salary);
    }
}
class Manager2 extends Employee2 {

    private double bonus;
    Manager2(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
   @Override
    void display() {
        System.out.println("Manager: "+ getName() +
                "| Total Pay: $" + (getSalary() + bonus));

    }
}
public class en_super_manager {
    public static void main(String[] args) {
        Manager2 m = new Manager2("Safwan", 60000, 20000);
        m.display();
    }
}
