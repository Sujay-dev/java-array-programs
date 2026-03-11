package two_d_arrays;

import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();

        int arr[][] = new int[row][col];
        //int arr2[][]= new int[size2][size1];
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
        int right=col-1;
        int left=0;
        int bottom=row-1;
        int top=0;

        while (top<=bottom && left<=right) {
            for(int j=left; j<=right; j++)
                System.out.print(arr[top][j]+ " ");
            top++;
            for(int i=top; i<=bottom; i++)
                System.out.print(arr[i][right]+ " ");
            right--;
            if (top<=bottom) {
                for(int j=right; j>=left; j--)
                    System.out.print(arr[bottom][j]+ " ");
                bottom--;
            }
            if (left<=right) {
                for(int i=bottom; i>=top; i--)
                    System.out.print(arr[i][left]+ " ");
                left++;
            }
        }
        sc.close();
}
}

