import java.util.Scanner;
public class kString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();

        int[] f=new int[26];
        for(int i=0;i<str.length();i++){
            f[str.charAt(i)-'a']++;
        }
        Boolean ans=false;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            if(f[i]>0 && f[i]%n!=0){
                System.out.println(-1);
                return;
            }
           
            for(int j=0;j<f[i]/n;j++){
                char c=(char)(i+'a');
                sb.append(c);
            }
                
            
        }
        
        
        
        System.out.println(sb.toString().repeat(n));
        
    }
    
}
