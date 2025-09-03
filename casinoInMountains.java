import java.util.Scanner;
public class casinoInMountains {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();   
        while(n-->0){
            int x=sc.nextInt();
            int k=sc.nextInt();

            int[] arr=new int[x];
            for(int i=0;i<x;i++){
                arr[i]=sc.nextInt();
            }

            int ans=0;
            int i=0;
            int j=0;
            while(j<x){
               if(arr[j]==1){
                i=j+1;
               }
                if(j-i+1==k){
                    j++;
                    i=j+1;
                    ans++;
                }
                j++;
            }
            System.out.println(ans);
        }
    }
}
