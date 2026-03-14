package Methods.Method_Overloading;

import java.util.Scanner;


public class Sumof {
public static int add(int a,int b){
    return a+b;
}
public static int add(int a,int b,int c){
    return a+b+c;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int x=add(a, b);
        int y=add(c, d, e);
        System.out.println(x);
        System.out.println(y);
        sc.close();
}
}

