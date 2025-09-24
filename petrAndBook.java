import java.util.Scanner;
public class petrAndBook {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[7];
        for(int i=0;i<7;i++){
            arr[i]=sc.nextInt();
        }
        int ans=0;
        while(n>0){
            for(int i=0;i<7;i++){
                n-=arr[i];
                if(n<=0){
                    ans=i+1;
                    break;
                }
             }
        }
        System.out.println(ans);
    }
}
