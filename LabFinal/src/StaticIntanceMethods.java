class MathUtils{
    void greet(){
        System.out.println("Hello from instance method");
    }
    static void info(){
        System.out.println("Love from core of my heart");
    }
}
public class StaticIntanceMethods {
    static void main(String[] args) {
      MathUtils m=new MathUtils();
      m.greet();
      MathUtils.info();
    }
}
