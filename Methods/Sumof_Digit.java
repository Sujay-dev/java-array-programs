package Methods;

import java.util.Scanner;

public class Sumof_Digit {
public static int  sumofdigits(int n){
       int sum=0;
       while (n>0) {
        int d=n%10;
        sum+=d;
        n/=10;
       }
       return sum;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int res=sumofdigits(n);
        System.out.println(res);
        sc.close();
}
}


