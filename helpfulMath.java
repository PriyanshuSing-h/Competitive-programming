import java.util.Scanner;
public class helpfulMath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] arr=new int[4];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='+'){
                arr[s.charAt(i)-48]++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=3;i++){
            while(arr[i]>0){
                sb.append(i);
                sb.append('+');
                arr[i]--;
            }
        }
        System.out.println(sb.toString().substring(0,sb.length()-1));
        

    }
}
