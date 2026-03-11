package Arrays;

import java.util.Scanner;

public class Missingno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int arr[] =new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        int actual=0;
        for(int i=0; i<size; i++)
        {
            actual+=arr[i];
        }
        int n = size+1;
        int expected=n*(n+1)/2;
        int missing=expected-actual;
        System.out.println("Missing no is : "+ missing);
        sc.close();
    }
}
