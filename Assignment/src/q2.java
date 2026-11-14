interface Describable {
    default String describe() {
        return "I am a Describable object.";
    }
    String category();
}

class Vehicle implements Describable {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    public String describe() {
        return "Vehicle: " + brand;
    }

    public String category() {
        return "General";
    }

    public String info(String model) {
        return brand + " - " + model;
    }

    public String info(String model, int year) {
        return info(model) + " [" + year + "]";
    }

    public String info(int year, String model) {
        return "[" + year + "] " + brand + " - " + model;
    }
}

class Car extends Vehicle {
    int doors;

    Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    @Override
    public String describe() {
        return super.describe() + " | Doors: " + doors;
    }

    @Override
    public String category() {
        return "Car";
    }

    @Override
    public String info(String model, int year) {
        return "Car: " + super.info(model, year);
    }
}

class ElectricCar extends Car {
    int range;

    ElectricCar(String brand, int doors, int range) {
        super(brand, doors);
        this.range = range;
    }

    @Override
    public String describe() {
        return super.describe() + " | Range: " + range + "km";
    }

    public String info(String model, int year) {
        return "EV: " + model + " (" + year + ") by " + brand;
    }
}

public class q2 {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Toyota");
        Car c1    = new Car("Honda", 4);
        ElectricCar e1 = new ElectricCar("Tesla", 4, 500);

        // Block A 
        System.out.println(v1.info("Corolla"));
        System.out.println(v1.info("Corolla", 2020));
        System.out.println(v1.info(2020, "Corolla"));

        // Block B 
        Vehicle v2 = new Car("BMW", 2);
        Vehicle v3 = new ElectricCar("Rivian", 4, 450);
        System.out.println(v2.describe());
        System.out.println(v3.describe());
        System.out.println(v2.category());

        // Block C 
        System.out.println(v2.info("X5", 2022));
        System.out.println(v3.info("R1T", 2023));

        // Block D 
        Describable d1 = new Vehicle("Ford");
        Describable d2 = new ElectricCar("Lucid", 4, 520);
        System.out.println(d1.describe());
        System.out.println(d2.describe());
        System.out.println(d1.category());

        // Block E 
        Car c2 = (Car) v2;
        System.out.println(c2.describe());
        System.out.println(c2.doors);
    }
}