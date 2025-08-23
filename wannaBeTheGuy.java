/*In this problem we have tell that both children can reach the all level of the game 
which they are playing */
import java.util.*;
public class wannaBeTheGuy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String p=sc.nextLine();
        String q=sc.nextLine();
        String[] p1=p.split(" ");
         String[] q1=q.split(" ");
        Set<Integer> st=new HashSet<>();
         for(int i=1;i<p1.length;i++){
            int val=Integer.parseInt(p1[i]);
            st.add(val);
         }
         for(int j=1;j<q1.length;j++){
            int val=Integer.parseInt(q1[j]);
            st.add(val);
        }
        boolean isTrue=true;
        for(int i=1;i<=n;i++){
            if(!st.contains(i)) isTrue=false;
        }
        if(isTrue){
            System.out.println("I become the guy.");
        }else{
            System.out.println("Oh, my keyboard!");
        }



    }
}
