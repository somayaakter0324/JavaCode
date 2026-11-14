class Shape {
    void area() {
        System.out.println("Area not defined.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
        System.out.println("Circle created: r=" + radius);
    }

    void area() {
        System.out.println("Circle area: " + (3.14 * radius * radius));
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
        System.out.println("Square created: s=" + side);
    }

    void area() {
        System.out.println("Square area: " + (side * side));
    }
}
public class MidQuestionOutput {
    public static void main(String[] args) {

        Circle c1 = new Circle(2);
        Square s1 = new Square(3);

        c1.area();
        s1.area();
    }
}
