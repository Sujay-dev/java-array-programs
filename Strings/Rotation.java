package Strings;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String s1=sc.next();
       String s2=sc.next();
       if (s1.length() != s2.length()) {
        System.out.println("Not rotating");
        sc.close();
        return;
       }

       String temp=s1+s1;
       if (temp.contains(s2)) {
        System.out.println("Rotating");
       }
       else{
        System.out.println("Not rotating");
       }
     sc.close();
}
}

