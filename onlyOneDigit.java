import java.util.Scanner;
public class onlyOneDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int x=sc.nextInt();
            int mini=x;
            while(x>0){
                int y=x%10;
                x/=10;
                mini=Math.min(mini,y);
            }
            System.out.println(mini);
            n--;
        }
    }
}
