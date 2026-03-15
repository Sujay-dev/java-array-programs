package Methods.Method_Twod_Array;

import java.util.Scanner;

public class Spiral {
    public static void spiral(int arr[][],int row,int col){
        int top=0;
        int bottom=row-1;
        int left=0;
        int right=col-1;
        while(top<=bottom && left<=right){
            for(int j=left; j<=right; j++)
                System.out.print(arr[top][j]+" ");
            top++;
           for(int i=top; i<=bottom; i++)
            System.out.print(arr[i][right]+" ");
        right--;
        for(int j=right; j>=left; j--)
           System.out.print(arr[bottom][j]+" ");
        bottom--;
        for(int i=bottom; i>=top; i--)
            System.out.print(arr[i][left]+" ");
        left++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int size2=sc.nextInt();
        int arr[][]=new int[size][size2];
        for(int i=0; i<size; i++){
            for(int j=0; j<size2; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        spiral(arr, size, size2);
        sc.close();
    }
}
