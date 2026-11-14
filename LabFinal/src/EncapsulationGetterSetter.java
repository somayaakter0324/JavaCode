class Studentt{
    private String name;
    private int id;
    /*public Studentt(String name,int id){
        this.name=name;
        this.id=id;
    }*/
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
        System.out.println(name);
    }
    public void setId(int id){
        this.id=id;
        System.out.println(id);
    }
}
public class EncapsulationGetterSetter {
    static void main(String[] args) {
      Studentt s= new Studentt();
      s.setName("somaya");
      s.setId(324);
    }
}
