package two_d_arrays;

import java.util.Scanner;

public class Matrixaddition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int arr[][] = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for(int j=0; j<size2; j++){
            arr[i][j]= sc.nextInt();
        }
    }
      int sum=0;
    for(int i=0; i<size1; i++){
        for(int j=0; j<size2; j++){
       sum= sum + arr[i][j];
        }
    }
    System.out.print("Sum of all elements in array is :" + sum );
        sc.close();
}
}
