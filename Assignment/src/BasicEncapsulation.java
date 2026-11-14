class Car5{
    private String brand;
    private String vin;
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setVin(String vin){
        this.vin=vin;
    }
    public String getBrand(){
        return brand;
    }
    public String getVin(){
        return vin;
    }


}
public class BasicEncapsulation {
    public static void main(String[] args) {
      Car5 c1= new Car5();
      c1.setBrand("tata");
        System.out.println( c1.getBrand());
      c1.setBrand("bmw");
        System.out.println( c1.getBrand());
    }
}
