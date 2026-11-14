class CarThread extends Thread{
    private String carName;
    CarThread(String carName){
        this.carName=carName;
    }
    @Override
     public void run(){
        for(int i=0;i<=3;i++){
        System.out.println(carName+" -lap "+i);
        }
    }
}
public class ThreadWay1 {
    static void main(String[] args) {
        CarThread car1= new CarThread("Toyota");
        CarThread car2= new CarThread("BMW");
        car1.start();
        car2.start();




    }
}
