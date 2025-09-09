import java.util.Scanner;
public class softDrink {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int stu=sc.nextInt();
        int bottle=sc.nextInt();
        int litre=sc.nextInt();
        int lime=sc.nextInt();
        int slice=sc.nextInt();
        int salt=sc.nextInt();
        int oneToast=sc.nextInt();
        int neededSalt=sc.nextInt();


        int totaldrink=bottle*litre/oneToast;
        int slices=lime*slice;
        int totalSalt=salt/neededSalt;
        int ans=Math.min(totaldrink,Math.min(slices,totalSalt))/stu;
        System.out.println(ans);
       
    }
}
