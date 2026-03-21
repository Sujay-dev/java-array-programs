package OOPS;

import java.util.Scanner;

 class Interest {
         int p;
         float r;
         int t;

         double SI(){
            return (p*r*t)/100.0;
         }
}
public class Intrest_Cal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Interest i1=new Interest();
        i1.p=sc.nextInt();
        i1.r=sc.nextFloat();
        i1.t=sc.nextInt();

        System.out.println(i1.SI());
        sc.close();
    }
}
