class TollBooth{
    void claculateToll(String vehicleType){
        final int base_toll=50;
        final int extraCharge;
        if(vehicleType.equals("Truck")){
            extraCharge=100;
        }
        else{
            extraCharge=60;
        }
        int total=base_toll+extraCharge;
        System.out.println(vehicleType+"Toll: BDT "+total);
    }
}
public class Final_Local_Variable {
    static void main(String[] args) {
     TollBooth booth=new TollBooth();
     booth.claculateToll("Truck");
        booth.claculateToll("Car");
    }
}
