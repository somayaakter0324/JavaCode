package pack2;

import pack1.Animal;

public class fao extends Animal {

    public void test() {
        // name = "dog";   // ❌ private
        // sound = "Baw";  // ❌ default

        age = 3;           // ✅ public
        color = "Orange";  // ✅ protected
    }

    public static void main(String[] args) {

        fao f = new fao();

        f.test();

        System.out.println(f.age);
        System.out.println(f.color);
    }
}
