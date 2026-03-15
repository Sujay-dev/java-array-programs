package Methods.Method_Array;

import java.util.Scanner;

public class Frequency {
    public static void frequencyof(int arr[]){
        for(int i=0; i<arr.length; i++){
            boolean visited=false;
            for(int j=0; j<i; j++){
                if (arr[i]==arr[j]) {
                    visited=true;
                    break;
                }
            }
             if (visited) {
                    continue;
                }
                int count=1;
                for(int k=i+1; k<arr.length; k++){
                    if (arr[i]==arr[k]) {
                        count++;
                    }
                }
                System.out.println(arr[i]+ ":" + count);
            }
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int size=sc.nextInt();
            int arr[]=new int[size];
            for(int i=0; i<size; i++){
                arr[i]=sc.nextInt();
            }
            frequencyof(arr);
            sc.close();
        }
    }

