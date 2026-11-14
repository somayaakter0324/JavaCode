import java.util.Scanner;
public class PracticeTask3 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        //float avg=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum +=a[i];
        }
        System.out.println(" the sum of array : "+sum);
        float avg=sum/n;
        System.out.println("the average of arry: "+avg);
    }
}
