class Employee {
    String name;
    static int totalEmployees = 0; // Shared among all objects
    Employee(String name) {
        this.name = name;
        totalEmployees++;
    }
    void show() {
        System.out.println(name + " (Employee #" + totalEmployees + ")");
    }
    static void showTotal() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahim");
        e1.show();
        Employee e2 = new Employee("Karim");
        Employee e3 = new Employee("Fahim");
        e1.show();
        e2.show();
        e3.show();
        Employee.showTotal();
    }
}
