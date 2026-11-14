class Vehicle{
    void start(){
        System.out.println("Vehicle start");
    }
    void stop(){
        System.out.println("Vehicle stop");
    }
}
class Car extends Vehicle{
    void accelerate(){
        System.out.println("Car accelerate");
    }

}
class SportsCar extends Car{
    void nitroBoost(){
        System.out.println("Sportscar nitroboost");
    }

}
public class MultilevelInheritance {
    static void main(String[] args) {
        SportsCar s= new SportsCar();
        s.start();
        s.stop();
        s.accelerate();
        s.nitroBoost();
    }
}
