class Vehicle4{
    int x=5;
    void describe(){
        System.out.println("vehicles describe called");
    }
    final void startEngine(){
        System.out.println("engine started");
    }
}
class Car4 extends Vehicle4{
    int x=10;
    @Override
    void describe(){
        System.out.println("Cars describe called");
    }
    void startCar(){
        System.out.println("car start");
    }
}
class Truck extends Vehicle4{
    int x=15;
    @Override
    void describe(){
        System.out.println("Trucks describe called");
    }
}
public class Upcasting {
    static void main(String[] args) {
       Vehicle4 v1= new Car4();
        System.out.println(v1.x);
        Vehicle4 v2= new Truck();
        System.out.println(v2.x);
        v1.describe();
        //v1.startCar(); parent class a method na thakle call kora jay na
        v2.describe();
        v1.startEngine();
        v2.startEngine();
        Car4 c=(Car4)v1;
        System.out.println(c.x);
        c.describe();
        /*Car4 c2=(Car4)v2;
        System.out.println(c2.x); ClassCastException hoy cause v2 truck er object
        c2.describe();*/
        Truck t= (Truck)v2;
        System.out.println(t.x);
        v2.describe();
        if(v2 instanceof Truck){
            System.out.println("truck called");
        }
        if(v1 instanceof Car4){
            System.out.println("Vut");
        }
    }
}
