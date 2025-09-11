import java.util.*;
public class foxAndSnake {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
         boolean isLeft=false;
        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    System.out.print("#");
                }
                System.out.println();
            }else{
               if(!isLeft){
                for(int j=0;j<n-1;j++){
                    System.out.print(".");
                }
                System.out.print("#");
                 System.out.println();
                 isLeft=true;
               }else{
                 System.out.print("#");
                for(int j=n-2;j>=0;j--){
                    System.out.print(".");
                }
                System.out.println();
                isLeft=false;
            }
            }
        }
    }
}
