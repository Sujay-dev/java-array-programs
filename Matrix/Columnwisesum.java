 package Arrays;

import java.util.Scanner;

public class Columnwisesum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int arr[][] = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for(int j=0; j<size2; j++){
            arr[i][j]= sc.nextInt();
        }
    }
    for(int j=0; j<size2; j++){
         int sum=0;
        for(int i=0; i<size1; i++){
       sum= sum + arr[i][j];
        }
    System.out.print(sum );
    }
        sc.close();
}
}
