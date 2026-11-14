import java.util.Scanner;
public class Loop {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer number: ");
        int x=sc.nextInt();
        /*for(int i=0;i<=x;i++){
            System.out.print( " " +i);
        }*/
        int i=0;
        while(i<=x){
            System.out.print( " "+i);
            i++;
        }
        System.out.println(" ");
        int j=2;
        do{
            System.out.print("   "+(j+2));
            j++;
        }
        while(j<=x+3);
    }
}
