package Arrays;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        boolean palin=true;
        for(int i=0; i<size/2; i++){
            if (arr[i]!=arr[size-1-i]) {
                palin=false;
                break;
            }
        }
        if (palin) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}
