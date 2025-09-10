import java.util.*;
public class sumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int val=sc.nextInt();
            List<Integer> l=new ArrayList<>();
            int mul=1;
            while(val!=0){
                int x=val%10;
                if(x!=0){
                    l.add(x*mul);
                }
                mul*=10;
                val=val/10;
            }
            System.out.println(l.size());
            for(int ele:l){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
