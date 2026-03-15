package Methods.Method_Array;

import java.util.Scanner;

public class Reverse {
    public static void reverse(int arr[]){
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        sc.close();
    }
}
