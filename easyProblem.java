import java.util.*;
public class easyProblem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        boolean ans=false;
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        if(arr[i]==1) {
            ans=true;
            break;
        }
       }
       if(ans) System.out.println("HARD");
       else System.out.println("EASY");
    }
}
