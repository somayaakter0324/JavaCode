class Vehicle8 {
    int speed = 60;

    Vehicle8() {
        System.out.println("Vehicle constructor");
    }

    void show() {
        System.out.println("Vehicle speed: " + speed);
    }
    void fuel(){
        System.out.println("refueling vehicle.");
    }
}

class Car8 extends Vehicle8 {
    int speed = 120;

    Car8() {
        super();
        System.out.println("Car constructor");
    }

    @Override
    void show() {
        System.out.println("Car speed: " + speed);
    }

    void turbo() {
        System.out.println("Turbo boost activated");
    }
}

public class Finalq3 {
    public static void main(String[] args) {

        Car8 c1 = new Car8();
        System.out.println(c1.speed);
        c1.show();
        c1.turbo();
        Vehicle8 v1 = new Car8();
        System.out.println(v1.speed);
        v1.fuel();
        v1.show();
        Car8 c3 = (Car8) v1;
        System.out.println(c3.speed);
        c3.show();
        c3.turbo();

        // Corrected version of the erroneous statement:
        // Car c2 = new Vehicle();  // Compile-time error
        Vehicle8 c2 = new Vehicle8();
        c2.show();
    }
}
