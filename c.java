import java.util.Scanner;
public class c {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
       

        while(k-->0){
             int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int count=0;
            while(Math.max(a,b)<=n){
                if(a>b){
                    b+=a;
                }else{
                    a+=b;
                }
                count++;
            }
            System.out.println(count);
        }

    }
}
