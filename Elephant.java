/*  In this we have given the distance between elephant and his friend's house and we have to tackle.
in how many minimum steps takes to reach elephant to his friends house.*/


import java.util.Scanner;
public class Elephant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        while(n>0){
            if(n>=5){
                n-=5;
                ans++;
            }else if(n==4){
                n-=4;
                ans++;
            }else if(n==3){
                n-=3;
                ans++;
            }else if(n==2){
                n-=2;
                ans++;
            }else if(n==1){
                n-=1;
                ans++;
            }
        }
        System.out.println(ans);
    }
}
