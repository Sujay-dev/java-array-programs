package two_d_arrays;

import java.util.Scanner;

public class Prefixsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();

        int arr[][] = new int[row][col];
           int prefix[][]= new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();  
            }
        }
        System.out.println("Original Matrix : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
       
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                prefix[i][j]=arr[i][j];
                if (i>0) {
                    prefix[i][j]+=prefix[i-1][j];
                }
                if (j>0) {
                    prefix[i][j]+=prefix[i][j-1];
                }
                if (i>0 && j>0) {
                    prefix[i][j]-=prefix[i-1][j-1];
                }
            }
        }
          System.out.println("prefix sum");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(prefix[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total sum");
                System.out.print(prefix[row-1][col-1]+ " ");
        sc.close();
}
}

