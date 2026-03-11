package Arrays;

import java.util.Scanner;

public class Sumof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;

        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("The sum of all elements in array is :" + sum);
        sc.close();
    }
}
