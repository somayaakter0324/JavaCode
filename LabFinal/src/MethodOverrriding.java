class Employe1{
    void work(){
        System.out.println("Employee works");
    }
}
class Manager extends Employe1{
    @Override
    void work() {
        super.work();
        System.out.println("Manager manages team");
    }
}
class Developer extends Employe1{
    @Override
    void work() {
        super.work();
        System.out.println("Developers write codes");
    }
}

public class MethodOverrriding {
    static void main(String[] args) {
        Employe1 e= new Employe1();
        Manager m= new Manager();
        Developer d= new Developer();
        e.work();
        m.work();
        d.work();
    }
}
