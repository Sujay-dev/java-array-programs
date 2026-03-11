package Arrays;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int positive=0;
        int negative=0;
        int zero=0;

        for(int i=0; i<arr.length; i++){
            if (arr[i]>0) {
                positive++;
            }
            else if (arr[i]<0) {
                negative++;
            }
            else{
                zero++;
            }
        }
        System.out.println("The positive numbers in array are : " + positive);
        System.out.println("The negative numbers in array are : " + negative);
        System.out.println("The zeros in array is : " + zero);
        sc.close();

    }
}
