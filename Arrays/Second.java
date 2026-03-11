package Arrays;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int sec = Integer.MIN_VALUE;

        for(int i=0; i<5; i++){
            if (arr[i]>max) {
                sec=max;
                max=arr[i];
            }
            else if (arr[i]>sec && arr[i]!=max) {
                sec=arr[i];
            }
        }
        System.out.println("Second Maximum Number is :" + sec);
        sc.close();
    }
}
