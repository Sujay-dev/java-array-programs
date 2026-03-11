package two_d_arrays;

import java.util.Scanner;

public class Nonsquaretranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        int arr[][] = new int[size1][size2];
        int arr2[][]= new int[size2][size1];
        for(int i=0; i<size1; i++){
            for(int j=0; j<size2; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix is : " );
        for(int i=0; i<size1; i++){
            for(int j=0; j<size2; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        for(int i=0; i<size1; i++){
            for(int j=0; j<size2; j++){
                arr2[j][i]=arr[i][j];
            }
        }
        System.out.println("After Transpose : ");
        for(int i=0; i<size2; i++){
            for(int j=0; j<size1; j++){
                System.out.print(arr2[i][j]+ " ");
            }
            System.out.println();
        }
       
        sc.close();
    }
}