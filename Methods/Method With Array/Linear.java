package Methods.Method_Array;

import java.util.Scanner;

public class Linear {
    public static void linearsearch(int arr[],int key){
        boolean found=false;
       for(int i=0; i<arr.length; i++){
        if (arr[i]==key) {
            found=true;
            System.out.println("Element Found at index : "+ i);
        }
    }
        if (!found) {
            System.out.println("Element not found");
        }
       }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        linearsearch(arr, key);
        sc.close();
    }
}
