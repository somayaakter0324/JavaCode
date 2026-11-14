interface Flyable {
    default String action() {
        return "Flying generically";
    }
    String describe();
}
class Animal {
    String name;
    Animal(String name) { this.name = name; }
    public String sound() {
        return name + " makes a sound.";
    }
}

class Bird extends Animal implements Flyable {
    int wingspan;

    Bird(String name, int wingspan) {
        super(name);
        this.wingspan = wingspan;
    }

    @Override
    public String sound() {
        return name + " chirps.";
    }

    @Override
    public String action() {
        return name + " flaps wings.";
    }

    @Override
    public String describe() {
        return "Bird [wingspan=" + wingspan + "]";
    }
}

class Dog extends Animal {
    Dog(String name) { super(name); }

    @Override
    public String sound() {
        return name + " barks.";
    }
}
public class Upcasting_downcasting {
    public static void main(String[] args) {

        // Block A — Upcasting
        Animal a1 = new Bird("Sparrow", 30);   // Line 1
        Animal a2 = new Dog("Bruno");          // Line 2
        System.out.println(a1.sound());        // Line 3
        System.out.println(a2.sound());        // Line 4

        // Block B — Downcasting
        Bird b1 = (Bird) a1;                   // Line 5
        System.out.println(b1.describe());     // Line 6
        System.out.println(b1.wingspan);       // Line 7

        // Block C — ClassCastException
        Bird b2 = (Bird) a2;                   // Line 8
        System.out.println(b2.sound());        // Line 9

        // Block D — Safe Downcasting
        if (a2 instanceof Bird) {              // Line 10
            Bird b3 = (Bird) a2;
            System.out.println(b3.describe());
        } else {
            System.out.println("Not a Bird");  // Line 11
        }

        // Block E — Interface Reference
        Flyable f1 = new Bird("Eagle", 120);  // Line 12
        System.out.println(f1.action());       // Line 13
        System.out.println(f1.describe());     // Line 14
    }
}
