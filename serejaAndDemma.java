import java.util.Scanner;
public class serejaAndDemma {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int score1=0;
        int score2=0;
        int i=0;
        boolean turn=true;
        int j=arr.length-1;
        while(i<=j){
            int max=0;
            if(arr[i]<arr[j]){
               max=Math.max(max,arr[j]);
               j--;
            }else{
                max=Math.max(max,arr[i]);
                i++;

            }
            if(turn){
                score1+=max;
                turn=false;
            }else{
                score2+=max;
                turn =true;
            }
        }
        System.out.println(score1+" "+score2);
    }
}
