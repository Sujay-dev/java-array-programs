package OOPS;

import java.util.Scanner;

class Rectangle{
    int length;
    int width;

    int area(){
        return length*width;
    }

    int perimeter(){
        return (2*(length+width));
    }
}
public class Rect {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Rectangle r1=new Rectangle();
    r1.length=sc.nextInt();
    r1.width=sc.nextInt();
   System.out.println("Area: "+ r1.area());
    System.out.println("Perimeter: "+ r1.perimeter());
    sc.close();
}
}
