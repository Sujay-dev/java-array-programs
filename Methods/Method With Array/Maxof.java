package Methods.Method_Array;

import java.util.Scanner;

public class Maxof {

public static int  maxof(int a[]){
    int max=a[0];
    for(int i=1; i<a.length; i++){
        if (a[i]>max) {
            max=a[i];
        }
    }
    return max;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int size=sc.nextInt();
       int n[]=new int[size];
       for(int i=0; i<size; i++){
        n[i]=sc.nextInt();
       }
       int res=maxof(n);
       System.out.println(res);
        sc.close();
}
}
