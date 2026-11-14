class Vehicle1{
    final String registerNumber;
    Vehicle1(String regnum){
      this.registerNumber=regnum;
    }
}
public class Final_Variable {
    static void main(String[] args) {
      Vehicle1 v1= new Vehicle1("DHK-1234");
        Vehicle1 v2= new Vehicle1("CTG-1234");
        System.out.println(v1.registerNumber);
        System.out.println(v2.registerNumber);
        //v1.registerNumber="new-0000";
        //Vehicle1 v3= new Vehicle1();

    }
}
