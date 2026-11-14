package pack1;
 public class Animal{
   private String name;
    String sound;
    public int age;
    protected String color;
    public void showInfo(){
        System.out.println(name+" sounds like "+sound);
        System.out.println("its "+age+" years old");
        System.out.println("Its "+color+"color");
    }
}
/*public class Animal{
    static void main(String[] args) {
        Animal a1=new Animal();
        //a1.name="dog";//private a just class access korte pare
        a1.sound="Baw";
        a1.age=3;
        a1.color="Orange";
        a1.showInfo();

    }
}
*/