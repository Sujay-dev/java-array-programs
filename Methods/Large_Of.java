package Methods.Method_Overloading;

import java.util.Scanner;

public class Large_Of {
    public static int max(int a,int b){
        if (a>b) {
            return a;
        }
        else{
            return b;
        }
    }
    public static int max(int a,int b,int c){
        if (a>b && a>c) {
            return a;
        }
        else if (b>a && b>c) {
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int x=max(a, b);
        int y=max(c, d, e);
        System.out.println(x);
        System.out.println(y);
    sc.close();
    }
}
