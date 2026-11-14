class Caarr{
    private String brand;
    public void setBrand(String b){
        brand=b;
    }
    public void showBrand(){
        System.out.println("Brand: "+brand);
    }
}
public class Setter_getter {
    static void main(String[] args) {
        Caarr c1=new Caarr();
        c1.setBrand("tata");
        c1.showBrand();
    }
}
