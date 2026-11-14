class Student{
    String name;
    String dep;
    int id;
    Student(){
        /*name="unknown";
        dep="unknown";
        id=0;*/
        this("unknown","unknown",0);
        System.out.println("print hoise!");
    }
    Student(String n,String d,int i){
        name=n;
        dep=d;
        id=i;
        System.out.println("hoise re bhai !");

    }
    Student(String n,String d){
        name=n;
        dep=d;
        System.out.println("hoise re !");
    }
    void showInfo(){
        System.out.println("our student name is "+name);
        System.out.println("she is "+dep+" student");
        System.out.println("her id is: "+id);
    }
}
public class Practice {
    static void main(String[] args) {
        Student s=new Student();
        s.showInfo();
        s.name="somaya";
        s.dep="CSE";
        s.id=324;
        s.showInfo();
        Student s1=new Student("shova","eee",523);
        s1.showInfo();

    }
}
