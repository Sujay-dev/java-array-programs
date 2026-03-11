package Arrays;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        boolean found = false;
        int count=0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Target found at index " + i);
                found = true;
                count++;
            }
        }
        if(found){
             System.out.println("Tottal occurances are : " + count);
        }
        else{
            System.out.println("Target not found");
        }

        sc.close();
    }
}
