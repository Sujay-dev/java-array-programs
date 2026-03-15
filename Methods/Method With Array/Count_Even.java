package Methods.Method_Array;

import java.util.Scanner;

public class Count_Even {
    public static int counteven(int arr[]){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]%2==0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        int res=counteven(arr);
        System.out.println(res);
        sc.close();
    }
}
