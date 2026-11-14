class Rectangle{
    int length,width;
    Rectangle(){
        //length=3;
        //width=2;
    }
    Rectangle(int l,int w){
        length=l;
        width=w;
    }
    int area(){
        return length* width;
    }
    /*void display(){
        System.out.println();
    }*/
}
public class MethodOverloading {
    static void main(String[] args) {
     Rectangle r1=new Rectangle();
     Rectangle r2=new Rectangle(10,2);
        System.out.println("Area of r1: "+r1.area());
        System.out.println("Area of r2: "+r2.area());
    }
}
