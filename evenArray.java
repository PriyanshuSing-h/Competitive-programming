import java.util.Scanner;
public class evenArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>=0){
            int len=sc.nextInt();
            int[] arr=new int[len];
           for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
           }
           if(len==1 && arr[0]%2!=0) System.out.println(-1);
           int count=0;
          for(int i=0;i<len;i++){
            if((i%2==0 && arr[i]%2!=0) || (i%2!=0 && arr[i]%2==0)){
                count++;
            }
          }
          if(count%2!=0) System.out.println(-1);
          else System.out.println(count/2);
          n--;
        }
    }
}
