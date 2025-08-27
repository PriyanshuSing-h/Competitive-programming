/*Here We have given the n value and we have to tell how much denominations it takes to complete whole n
 * Problem name is-HitTheLottery
 */
import java.util.Scanner;
public class hitTheLottery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] denomination={1,5,10,20,100};
        int count=0;
        while(n>=1){
            if(n>=denomination[4]){
                n-=denomination[4];
                count++;
            }else if(n>=denomination[3]){
                n-=denomination[3];
                count++;
            }else if(n>=denomination[2]){
                n-=denomination[2];
                count++;
            }else if(n>=denomination[1]){
                n-=denomination[1];
                count++;
            }else{
                n-=denomination[0];
                count++;
            }
        }
        System.out.println(count);
    }
}
