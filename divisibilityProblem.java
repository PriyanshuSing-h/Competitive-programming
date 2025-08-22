/*In this question we have given two numbers a and b you have make a that a is divisible by b.
 * you can only add 1 to a (a+1) return the  number of steps it take a to be divisible by b.
 */
import java.util.Scanner;
public class divisibilityProblem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int count=0;
            int val=a%b==0?0:b-a%b;
            System.out.println(count+val);
            n--;
        }
    }
}