class CarRunnable implements Runnable{
   private String carName;
   public CarRunnable(String carName){
       this.carName= carName;
   }
   @Override
    public void run(){
       for(int i=0;i<=3;i++){
           System.out.println(carName+ " -lap "+i);
       }
   }
}
public class ThreadWay2 {
    static void main(String[] args) {
      Thread c1=new Thread(new CarRunnable("Vut"));
        Thread c2=new Thread(new CarRunnable("Nissan"));
        c1.start();
        c2.start();




    }
}
