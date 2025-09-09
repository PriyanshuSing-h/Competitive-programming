import java.util.*;
public class beautifullMatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[5][5];
        int row=-1;
        int col=-1;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==1){
                    row=i;
                    col=j;
                }
            }
        }
        int count=0;
        while(row!=2){
             if(row>2){
                row--;
            }else if(row<2){
                row++;
            }
            count++;
        }
        while(col!=2){
             if(col>2){
                col--;
            }else if(col<2){
                col++;
            }
            count++;
        }

        System.out.println(count);

    }
}
