package Arrays;

import java.util.Scanner;

public class Binary {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array size");
    int size = sc .nextInt();
    int arr[] = new int[size];
    System.out.println("Enter Array Elements");
    for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
    }
    int low = 0;
    int high  = arr.length-1;
    System.out.println("OK ! now enter Target element");
    int target = sc.nextInt();
     boolean found = false;
    while (low<=high) {
        int mid = (low+high) / 2;
        if (arr[mid]==target) {
            System.out.println("Targeted element Found at index " + mid);
            found = true;
            break;
        }
        else if (target>arr[mid]) {
            low = mid+1;
        }
        else{
            high = mid - 1;
        }
    }
   if (!found) {
    System.out.println("Targeted Element not found");
   }
   sc.close();;
    }

 } 
