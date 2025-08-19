/*Here we have given a string and we have to capitalize its first word: */

import java.util.Scanner;
public class wordCapitalization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ans=Character.toUpperCase(str.charAt(0))+str.substring(1);
        System.out.println(ans);

    }
}
