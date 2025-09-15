import java.util.Scanner;
public class bearAndBigbrother {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bear=sc.nextInt();
        int bob=sc.nextInt();
        int ans=0;
        while(bear<=bob){
            bear*=3;
            bob*=2  ;
            ans++;
        }
        System.out.println(ans);
    }
}
