class Vehicle2{
    static final int max_speed_limit=200;
    static final String country="Bangladesh";
    String brand;
    Vehicle2(String brand){
        this.brand=brand;
    }
}
public class Static_Final_variable {
    static void main(String[] args) {
       Vehicle2 v1=new Vehicle2("Toyota");
        Vehicle2 v2=new Vehicle2("Volvo" +
                "");

    }
}
