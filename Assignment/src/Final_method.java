class Vehicle3{
    String brand;
    final void startEngine(){
        System.out.println("Engine starts");
    }
    void describe(){
        System.out.println("From  vehicle");
    }
}
class Car3 extends Vehicle3{
    @Override
    //void startEngine(){}   final method override kora jay na
    void describe(){
        System.out.println("From car");
    }
}
public class Final_method {
    static void main(String[] args) {
        Car3 c1=new Car3();
        c1.describe();
        c1.startEngine();

    }
}
