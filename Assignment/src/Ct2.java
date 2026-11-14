class Vehicle6{
    int speed =60;
    Vehicle6 (String type){
        System.out.println("Vehicle constructor "+type);
    }
    void display(){
        System.out.println("vehicle speed: "+speed);
    }
}
class Bike extends Vehicle6{
    int speed =90;
    Bike(){
        super("two wheeler");
        System.out.println("Bike constructor");
    }
    @Override
    void display(){
        super.speed=super.speed+5;
        super.display();
        System.out.println("Bike speed: "+speed);
    }
}
public class Ct2 {
    static void main(String[] args) {
        Bike b= new Bike();
        b.display();
        b.display();

    }
}
