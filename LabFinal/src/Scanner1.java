import java.util.Scanner;
public class Scanner1 {
    static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println(" Enter a integer number: ");
        int x=sc.nextInt();
        System.out.println("the number is :"+x);
        String s= sc.next();
        System.out.println("string1: "+s);
        String s1= sc.nextLine();//string er space er porer value rakhbe na
        String s2=sc.nextLine();
        System.out.println("string2: "+s2);
        //check the number id even or odd
        /*if(x%2==0){
            System.out.println("the number is even.5");
        }
        else
            System.out.println("the number is odd.");*/
        /*if(x>18){
            System.out.println("you are an adult.");
        }
        else if(x<=17)
            System.out.println("you are under 18");
        else if(x<5)
            System.out.println("you are an child");
        else if(x<=0)
            System.out.println("invalid age");*/

    }
}
