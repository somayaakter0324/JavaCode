class Vehicle{
    void start(){
        System.out.println("Vehicle starts.");
    }
}
class Four_wheelers extends Vehicle{
    void wheel(){
        System.out.println("Vehicle has 4 wheels.");
    }
}
class Carr extends Four_wheelers{
    void drive(){
        System.out.println("Car is driving.");
    }
}
public class MultilevelInheritance {
    static void main(String[] args) {
        Carr c1= new Carr();
        c1.start();
        c1.wheel();
        c1.drive();


    }
}
