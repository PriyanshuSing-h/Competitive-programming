import java.util.Scanner;
public class stringTask {
    public static boolean isVowel(char c){
        return "aeiouy".indexOf(c)!=-1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(!isVowel(str.charAt(i))){
                sb.append(".");
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());

    }
}
