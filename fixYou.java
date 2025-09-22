import java.util.*;
public class fixYou {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        while(t-->0){
            int m=sc.nextInt();
            int n=sc.nextInt();

            char[][] c=new char[m][n];
            for(int i=0;i<m;i++){
                String str=sc.next();
                c[i]=str.toCharArray();
               
            }

            int ans=0;
            for(int i=0;i<n;i++){
                if(c[m-1][i]=='D') ans++;
            }
            for(int i=0;i<m;i++){
                if(c[i][n-1]=='R') ans++;
            }
            l.add(ans);
        }
        for(int ele:l){
            System.out.println(ele);
        }
    }
}
