/*In this question we have to calculate the total volume of orange juice in a cocktail in percentage. */
import java.util.Scanner;
public class Drinks{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int[] arr=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       double ans=0.0;
       for(int i=0;i<n;i++){
        ans+=arr[i];
       }
       System.out.println(ans/(double)n);
    }
}