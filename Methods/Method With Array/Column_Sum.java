package Methods.Method_Twod_Array;

import java.util.Scanner;

public class Column_Sum {
    public static void colsum(int arr[][]){
        for(int j=0; j<arr.length; j++){
            int sum=0;
            for(int i=0; i<arr.length; i++){
                sum+=arr[i][j];
            }
            System.out.println(sum);
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
        colsum(arr);
        sc.close();
    }
}
