import java.util.Scanner;
public class erasingZeros {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            String s=sc.next();
            int i=0,j=s.length()-1;
            while(i<s.length() && s.charAt(i)!='1'){
                i++;
            }
             while(j>=0 && s.charAt(j)!='1'){   //010011
                j--;
            }
            int ans=0;
           while(i<s.length() && j>=0 &&i<=j){
            if(s.charAt(i)=='0') ans++;
            i++;
           }

           System.out.println(ans);
        }

    }
}
