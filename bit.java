/*In this qustion we have given a statement according to that we have to icrement the bit */
import java.util.Scanner;
public class bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int count=0;
        while(n>0){
            String st=sc.nextLine();
            if(st.equals("X++")||st.equals("++X")){
                count++;
            }else {
                count--;
            }
            n--;
        }
        System.out.println(count);
    }
}
