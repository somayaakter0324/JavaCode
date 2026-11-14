class Student{
    String name;
    int id;
    Student(){
        name="unknown";
        id=0;
    }
    Student(String name,int id){
        this.name=name;
        this.id=id;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }
}
public class Constructor1 {
    static void main(String[] args) {
      Student s1=new Student();
      s1.display();
      Student s2= new Student("somaya",324);
      s2.display();
    }
}
