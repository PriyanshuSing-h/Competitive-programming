import java.util.Scanner;
public class cardGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=sc.nextLine().split(" ");
        String ans="NO";
        for(int i=0;i<s.length;i++){
            char c1=s[i].charAt(0);
            char c2=s[i].charAt(1);
            if(str.charAt(0)==c1){
                ans="YES";
                break;
            }else if(str.charAt(1)==c2){
                ans="YES";
                break;
            }
        }
        System.out.println(ans);
    }
}
