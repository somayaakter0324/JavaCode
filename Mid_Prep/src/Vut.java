class Car{
    String brand;
    String color;
    int speed;
    int r_y;
    Car(){
        this("unknown","unknown",0,0); //calling parameterized constructor
       // brand="Unknown";
        //color="Unknown";
        //speed=0;
        //r_y=0;
    }
    void initialization(String b,String c,int s,int ry){
        brand=b;
        color=c;
        speed=s;
        r_y=ry;
    }
    Car(String b,String c,int s,int ry){
        brand=b;
        color=c;
        speed=s;
        r_y=ry;
    }
    Car(String c,int ry,String b,int s){
        color=c;
        brand=b;
        r_y=ry;
        speed=s;
    }
    Car(String c,String b,int s){
        color=c;
        brand=b;
        speed=s;
    }


    void showInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("color: "+color);
        System.out.println("Speed: "+speed);
        System.out.println("Release_year: "+r_y);
    }
}
public class Vut {
    static void main(String[] args) {
        //By reference variable
        Car c1=new Car();
        c1.brand="BMW";
        c1.color="Black";
        c1.speed= 120;
        c1.r_y=2022;
        c1.showInfo();
        // by method
        Car c2=new Car();
        c2.initialization("Tata","Gray",100,2012);
        c2.showInfo();
        //by constructor
        Car c3= new Car("Toyota","White",135,2017);
        c3.showInfo();
        Car c4=new Car("Blue","Ferarry",2020,150);
        c4.showInfo();
        Car c5=new Car("Red","Roles royes",145);
        c5.showInfo();
    }
}



