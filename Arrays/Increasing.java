package Arrays;

import java.util.Scanner;

public class Increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
    }
    boolean increse=true;
    for(int i=0; i<arr.length; i++){
        if (arr[i]>=arr[i+1]) {
            increse=false;
            break;
        }
    }
    if (increse) {
        System.out.println("Incresing");
    }
    else{
        System.out.println("Not increasing");
    }
    sc.close();
    }
}
