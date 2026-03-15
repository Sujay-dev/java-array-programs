package Methods.Method_Twod_Array;

import java.util.Scanner;

public class Diagonalsum {
    public static int diagonalsum(int arr[][]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int size1=sc.nextInt();
        int arr[][]=new int[size][size1];
        for(int i=0; i<size; i++){
            for(int j=0; j<size1; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int res=diagonalsum(arr);
        System.out.println(res);
        sc.close();
    }
}
