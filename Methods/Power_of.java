package Methods.Method_Overloading;

import java.util.Scanner;

public class Power_of {
    public static int power(int a){
        return a*a;
    }
    public static int power(int a, int b){

        int result = 1;

        for(int i = 1; i <= b; i++){
            result = result * a;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int x=power(a);
        int y=power(b, c);
        System.out.print(x + " " + y);
        sc.close();
    }
}
