package Arrays;

import java.util.Scanner;

public class Resultmanage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Students ");
         int size=sc.nextInt();
         String arr[]=new String[size];
         System.out.println("Enter names of Students");
         for(int i=0; i<arr.length; i++){
            arr[i]=sc.next();
         }
        // for(int i=0; i<arr.length; i++){
          //  System.out.println(arr[i]);
         //}
         System.out.println("Enter Number of subjects");
        int size1=sc.nextInt();
         int arr2[][]=new int[size][size1];
         System.out.println("Enter Marks of students");
         for(int i=0; i<size; i++){
            for(int j=0; j<size1; j++){
                 arr2[i][j]=sc.nextInt();
            }
         }
        // for(int i=0; i<size; i++){
        // for(int j=0; j<size1; j++){
          //  System.out.print(arr2[i][j]+ " ");
        // }
        // System.out.println();
        //}
          System.out.println("Name\tTotal Marks\tPercentage\tMax Marks\tMin Marks");
               double max=size1*100;
        for(int i=0; i<size; i++){
             int total=0;
               int Max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int j=0; j<size1; j++){
                total+=arr2[i][j];
                if (arr2[i][j]>Max) {
                    Max=arr2[i][j];
                }
                if (arr2[i][j]<min) {
                    min=arr2[i][j];
                }
            }
            double percentage=(total/max)*100;
            //System.out.println(arr[i]);
            //System.out.println(  "Total is : "+ total );
            //System.out.println("Percentage is : "+ percentage);
            //System.out.println("Max marks : "+ Max);
            //System.out.println("Minimum marks : "+ min);
           System.out.printf("%-10s %-12d %-12.2f %-10d %-10d\n", arr[i], total, percentage, Max, min);
        }

     sc.close();
}
}
