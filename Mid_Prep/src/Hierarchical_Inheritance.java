class Vehiclee{
    void start(){
        System.out.println("Vehicle starts");
    }
}
class Caar extends Vehiclee{
    void drive(){
        System.out.println("Car is driving.");
    }
}
class Bus extends Vehiclee{
    void carry_passenger(){
        System.out.println("Bus carry passengers.");
    }
}
public class Hierarchical_Inheritance {
    static void main(String[] args) {
        Caar c= new Caar();
        Bus b=new Bus();
        c.start();
        c.drive();
        b.start();
        b.carry_passenger();

    }
}
