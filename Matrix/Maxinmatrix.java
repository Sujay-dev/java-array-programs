package Arrays;

import java.util.Scanner;

public class Maxinmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int arr[][] = new int[size1][size2];
        for(int i=0; i<size1; i++){
            for(int j=0; j<size2; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<size1; i++){
            for(int j=0; j<size2; j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}
