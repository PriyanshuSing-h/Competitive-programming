import java.util.Scanner;
public class stonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        int count=0;
        int i=0,j=1;
        while(j<str.length()){
            if(str.charAt(i)==str.charAt(j)){
                count++;
            }
            j++;
            i++;
        }   
        System.out.println(count);
        sc.close();
    }
}
