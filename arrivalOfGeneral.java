import java.util.*;
public class arrivalOfGeneral {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int maxi=Integer.MIN_VALUE;
        int[] arr=new int[n];
        int mi=-1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(maxi<arr[i]){
                maxi=arr[i];
                mi=i;
            }
        }
         int count=0;
        while(mi-1>=0){
            int temp=arr[mi];
            arr[mi]=arr[mi-1];
            arr[mi-1]=temp;
            count++;
            mi--;
        }
        int mini=Integer.MAX_VALUE;
        int j=-1;
        for(int i=0;i<n;i++){
            if(mini>=arr[i]){
                mini=arr[i];
                j=i;
            }
        }
        while(j+1<n){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            count++;
            j++;
        }
        System.out.println(count);
   }

}
