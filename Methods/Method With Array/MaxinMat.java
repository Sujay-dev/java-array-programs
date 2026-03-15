package Methods.Method_Twod_Array;

import java.util.Scanner;

public class MaxinMat {
    public static int maxin(int arr[][]){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if (arr[i][j]>max) {
                    max=arr[i][j];
                }
            }
        }
        return max;
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
        int res=maxin(arr);
        System.out.println(res);
        sc.close();
    }
}
