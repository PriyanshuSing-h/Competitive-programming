import java.util.Scanner;
public class boringApartment {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        while(n-->0){
            int num=sc.nextInt();
            int count=0;
            int val=num%10;
            while(num>0){
                num/=10;
                count++;
            }
            System.out.println((val-1)*10+(count*(count+1))/2);
        }
    }
}
