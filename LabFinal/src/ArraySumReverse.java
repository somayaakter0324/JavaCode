import java.util.Scanner;
public class ArraySumReverse {
    static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array length: ");
    int x=sc.nextInt();
    int sum=0;
    int[] a=new int[x];
        System.out.println("Enter"+x+" array value: ");
    for(int i=0;i<x;i++){
        a[i]=sc.nextInt();
    }
    for(int i=0;i<x;i++){
        sum +=a[i];
    }
    System.out.println("sum of array: "+sum);
    for(int i=x-1;i>=0;i--){
            System.out.print(" "+a[i]);
        }
    }
}
