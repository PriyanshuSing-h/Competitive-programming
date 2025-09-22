import java.util.*;
public class assigningToClasses {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int len=sc.nextInt();
            int[] arr=new int[2*len];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }

            Arrays.sort(arr);
           
            int ans=Math.abs(arr[len-1]-arr[len]);
            System.out.println(ans);
        }
    }
}
