class Animal1{
    private String name;
    Animal1(){
        this("Unknown animal");
    }
   Animal1(String name){
        this.name=name;
   }
   void eat(){
       System.out.println(name+" is eating");
   }
   public String getName(){
        return name;
   }
}
class Dog extends Animal1{
    Dog(){
        super();
    }
    Dog(String name){
        super(name);
    }
    void bark(){
        System.out.println(getName()+" is barking");
    }
}
public class Encapsulation_constructor_channing {
    static void main(String[] args) {
       Dog d1= new Dog();
        Dog d2= new Dog("tiger");
        d1.eat();
        d1.bark();
        d2.eat();
        d2.bark();


    }
}
