package Methods.Method_Array;

import java.util.Scanner;

public class Second_Large {
    public static int secondlarge(int arr[]){
        int max=arr[0];
        int sec=Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++){
            if (arr[i]>max) {
                sec=max;
                 max=arr[i];
            }
            else if (arr[i]>sec && arr[i]!=max) {
                sec=arr[i];
            }
        }
        return sec;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        int res=secondlarge(arr);
        System.out.println(res);
        sc.close();
    }
}
