package Methods.Method_Twod_Array;

import java.util.Scanner;

public class Transpose {
    public static void transpose(int arr[][]){
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int size1=sc.nextInt();
        int arr[][]=new int[size][size1];
        for(int i=0; i<size; i++){
            for(int j=0; j<size1; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        transpose(arr);
        sc.close();
    }
}
