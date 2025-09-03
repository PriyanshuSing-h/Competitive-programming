import java.util.Scanner;
public class vasyaString {
    public static int maxLength(String str,int k,char target){
        int n=str.length();
        int i=0;
        int j=0;
        int ans=-1,m=0;
        while(j<n){
            if(str.charAt(j)!=target){
                m++;
            }
            while(m>k){
                if(str.charAt(i)!=target){
                    m--;
                }
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        System.out.println(Math.max(maxLength(str,k,'a'),maxLength(str,k,'b')));
    }
}
