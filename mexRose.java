import java.util.*;

public class mexRose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                
            }
            int[] freq=new int[n+1];
            for(int ele:a){
                freq[ele]++;
            }
          
            int missing=0;
            for(int i=0;i<k;i++){

                if(freq[i]==0) missing++;
            }

           System.out.println(Math.max(missing, freq[k]));
        }

        
    }
}