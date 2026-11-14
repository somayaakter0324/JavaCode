class Animal{
    void eat(){
        System.out.println("Animal eat food");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Bird can fly");
    }
}
public class SingleInheritanceTask {
    static void main(String[] args) {
        Bird b = new Bird();
        b.eat();
        b.fly();
        Animal b1= new Bird();
        b1.eat();
        //b1.fly();
    }
}
