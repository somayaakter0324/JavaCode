class Animall{
    private String sound;
    public void setSound(String s){
        sound=s;
    }
    public void showSound(){
        System.out.println("Sound: "+sound);
    }


}
public class Setter_getter1 {
    static void main(String[] args) {
       Animall a1=new Animall();
       a1.setSound("baw");
       a1.showSound();
    }
}
