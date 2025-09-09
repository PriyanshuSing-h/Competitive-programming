import java.util.*;
public class chewbaccaAndNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long ans=0;
        long mul=1;
        while(n>0){
            long k=n%10;
            long val=Math.min(k,9-k);
            if(val==0 && n/10==0) val=k;
             ans+=val*mul;
            n/=10;
            mul*=10;
        }
        System.out.println(ans);
    }
}
