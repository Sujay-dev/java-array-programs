package Methods.Method_Array;

import java.util.Scanner;

public class Average_Of {
    public static double average(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
         double avg=(double)sum/arr.length;
         return avg;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        double res=average(arr);
        System.out.println(res);
        sc.close();
    }
}
