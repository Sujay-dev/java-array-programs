package OOPS;

import java.util.Scanner;

 class Circle {
      int radius;

      double area(){
        return (3.14*(radius*radius));
      }
    double circumferance(){
        return ((double)2 * 3.14*(radius));
    }
}
public class Circle_Cal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle c1=new Circle();
        c1.radius=sc.nextInt();
        System.out.println(c1.area());
        System.out.println(c1.circumferance());

        sc.close();
    }
}
