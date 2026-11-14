import java.util.Scanner;
public class CountEvenOdd_Search_Copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length: ");
        int x = sc.nextInt();
        int[] a = new int[x];
        int[] b = new int[x];
        System.out.println("Enter" + x + " array value: ");
        for (int i = 0; i < x; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < x; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < x; i++) {
            b[i] = a[i];
        }
        for (int i = 0; i < x; i++) {
            System.out.print(" " + b[i]);
        }
        /*int evenCount=0;
        int oddCount=0;
        for(int i=0;i<x;i++) {
            if(a[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Even count: "+evenCount);
        System.out.println("Odd count: "+oddCount);*/
        /*System.out.println("Enter the number to search: ");
        int s=sc.nextInt();
        boolean found=false;
        for(int i=0;i<x;i++) {
            if (a[i] == s) {
                found = true;
                break;
            }
        }
            if(found){
                System.out.println(s+" is found in array");
            }
            else
                System.out.println(s+"doesn't found in array.");*/


    }
}

