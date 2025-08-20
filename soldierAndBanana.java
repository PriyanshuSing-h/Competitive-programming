import java.util.Scanner;
public class soldierAndBanana {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int track=0;
        for(int i=1;i<=w;i++){
            track+=i*k;
        }   
        int ans=track-n;
        if(ans<0) ans=0;
        System.out.println(ans);
    }
}
