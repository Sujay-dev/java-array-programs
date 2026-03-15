package Methods.Method_Array;

import java.util.Scanner;

public class Sorted {
    public static void sorted(int arr[]){
        boolean sort=true;
        for(int i=0; i<arr.length-1; i++){
            if (arr[i+1]<arr[i]) {
                sort=false;
                break;
            }
        }
        if (sort) {
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        sorted(arr);
        sc.close();
    }
}
