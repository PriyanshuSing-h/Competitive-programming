import java.util.Scanner;
public class repeatingCipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int count=1;
        StringBuilder sb=new StringBuilder();    //baabbb
        int i=0,j=0;
        while(j<n){
            if(j-i+1==count){
                sb.append(s.charAt(i));
                i=j+1;
                count++;
            }
            j++;

        }
        System.out.println(sb.toString());
    }
}
