package two_d_arrays;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        int arr[][] = new int[size1][size2];
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
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
            System.out.println();
        }
        System.out.println("After Transpose matrix is : " );
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        
       
        sc.close();
    }
}