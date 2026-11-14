class Car6{
    private String brand;
    private final String vin;
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public String getVin(){
        return vin;
    }
    public Car6(String brand,String vin){
        this.brand=brand;
        this.vin=vin;
    }
}

public class ReadOnly {
    static void main(String[] args) {
       Car6 c1= new Car6("Nissan","ABC-123");
        System.out.println(c1.getBrand());
        System.out.println(c1.getVin());

    }
}
