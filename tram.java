import java.util.Scanner;
public class tram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int val=0;
        while(n>0){

            int out=sc.nextInt();
            int in=sc.nextInt();
            val+=in-out;
            ans=Math.max(val,ans);
            n--;
        }
        System.out.println(ans);
    }
}
