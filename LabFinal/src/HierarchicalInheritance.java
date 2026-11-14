class Shape{
    void draw(){
        System.out.println("Shape dawing");
    }
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Circle drawing");
    }
}
class Rectanglee extends Shape{
    @Override
    void draw() {
        System.out.println("Rectangle drawing");
    }
}
class Triangle extends Shape{
    @Override
    void draw() {
        System.out.println("Tringle drawing");
    }
}
public class HierarchicalInheritance {
    static void main(String[] args) {
     Circle c= new Circle();
     Rectanglee r= new Rectanglee();
     Triangle t= new Triangle();
     c.draw();
     r.draw();
     t.draw();
    }
}
