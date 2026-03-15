package Methods.Method_Array;

import java.util.Scanner;

public class Duplicate {
    public static void duplicate(int arr[]){
        for(int i=0; i<arr.length; i++){
            boolean dupli=false;
            for(int j=0; j<i; j++){
                if (arr[i]==arr[j]) {
                    dupli=true;
                    break;
                }
            }
            if (!dupli) {
                System.out.print(arr[i]+ " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        duplicate(arr);
        sc.close();
    }
}
