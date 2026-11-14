class Counter{
    int value;
    Counter(int value){
        this.value=value;
    }
    Counter increment(){
        return new Counter(this.value+1);
    }
    void display(){
        System.out.println("counter: "+value);
    }
}
public class ReturningObject_From_Method {
    static void main(String[] args) {
      Counter c=new Counter(5);
      Counter c2=c.increment();
      c.display();
      c2.display();

    }
}
