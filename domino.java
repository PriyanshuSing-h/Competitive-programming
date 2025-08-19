import java.util.Scanner;
public class domino {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.println((row*col)/2);
        sc.close();
    }
}
