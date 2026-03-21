package OOPS;

import java.util.Scanner;

 class Car {
       String brand;
       int price;

       void showdetails(){
        System.out.println(this.brand);
        System.out.println(this.price);
       }
}
public class Car_Info {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Car c1=new Car();
        Car c2=new Car();
        c1.brand=sc.next();
        c1.price=sc.nextInt();
        c2.brand=sc.next();
        c2.price=sc.nextInt();

        c1.showdetails();
        c2.showdetails();

        sc.close();
    }
}
