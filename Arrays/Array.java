package Arrays;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array :");
        int si = sc.nextInt();
        int arr[] = new int[si];

        for(int i = 0; i<si; i++ ){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<si; i++){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}