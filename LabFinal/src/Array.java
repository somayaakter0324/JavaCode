import java.util.Scanner;
public class Array {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length : ");
        int x=sc.nextInt();
        int[] a1=new int[x];
        int[] a2=new int[] {1 ,2,3,4,5,6,7};
        //int[] a3=
        for(int i=0;i<a1.length;i++){
            a1[i]=sc.nextInt();
        }
        for(int i=0;i<a1.length;i++){
            System.out.print(" "+a1[i]);
        }
        System.out.println("  ");
        for(int i=0;i<a2.length;i++){
            System.out.print(" "+a2[i]);
        }
    }
}
