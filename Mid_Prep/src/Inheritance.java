class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("dog is barking");
        }
    }

public class Inheritance {
    static void main(String[] args) {
        Dog a1=new Dog();
        a1.eat();
        a1.bark();

    }
}
