package Methods.Method_Twod_Array;

import java.util.Scanner;

public class Twomatsum {
    public static void sumis(int arr[][],int arr2[][]){
       for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[0].length; j++){
            int sum=arr[i][j]+arr2[i][j];
        System.out.print(sum+" ");
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
        int size2=sc.nextInt();
        int size3=sc.nextInt();
        int arr2[][]=new int[size2][size3];
        for(int i=0; i<size2; i++){
            for(int j=0; j<size3; j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        sumis(arr, arr2);
        sc.close();
    }
}
