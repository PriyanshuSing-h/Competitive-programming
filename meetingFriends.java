import java.util.Scanner;
public class meetingFriends {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int maxi=Math.max(x,Math.max(y,z));
        int mini=Math.min(x,Math.min(y,z));

        System.out.println(maxi-mini);
        

    }
}
