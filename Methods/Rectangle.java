package Methods.Method_Overloading;

import java.util.Scanner;

public class Rectangle {
    
public static int area(int n){
    return n*n;
}
public static int area(int l,int b){
    return l*b;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        int b=sc.nextInt();
       int a= area(n);
        int x= area(l,b);
        System.out.println(a);
        System.out.println(x);
        sc.close();
}
}

