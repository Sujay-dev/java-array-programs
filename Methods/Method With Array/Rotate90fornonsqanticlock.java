package Methods.Method_Twod_Array;

import java.util.Scanner;

public class Rotate90fornonsqanticlock {
public static void Rotate90(int arr[][]){
   int row=arr.length;
   int col=arr[0].length;
   int res[][]=new int[col][row];
   for(int i=0; i<row; i++){
    for(int j=0; j<col; j++){
        res[col-1-j][i]=arr[i][j];
    }
   }
   for(int i=0; i<col; i++){
    for(int j=0; j<row; j++){
        System.out.print(res[i][j]+" ");
    }
    System.out.println();
   }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int size=sc.nextInt();
       int size1=sc.nextInt();
       int arr[][]=new int[size][size1];
       for(int i=0; i<size; i++){
        for(int j=0; j<size1; j++){
            arr[i][j]=sc.nextInt();
        }
       }
       Rotate90(arr);
        sc.close();
}
}


