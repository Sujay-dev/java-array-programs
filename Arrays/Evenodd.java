package Arrays;

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int even = 0;
        int odd = 0;

        for(int i=0; i<arr.length; i++){
            if (arr[i]%2==0) {
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("The Even numbers in array are :" + even);
        System.out.println("The odd numbers in array are :" + odd);
        sc.close();
        
    }
}
