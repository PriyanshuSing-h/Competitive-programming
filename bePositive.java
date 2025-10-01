import java.util.Scanner;
public class bePositive {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int len=sc.nextInt();
            int[] arr=new int[len];
            for(int i=0;i<len;i++){
                arr[i]=sc.nextInt();
            }

            int zero=0;
            int neg=0;
            for(int ele:arr){
                if(ele==0){
                    zero++;
                }else if(ele==-1) neg++;
            }

            int ans=zero;
            if(neg%2!=0){
                ans+=2;
            }
            System.out.println(ans);
        }
    }
}
