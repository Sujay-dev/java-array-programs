package Strings;

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String str=sc.next();
       for(int i=0; i<str.length(); i++){
         char ch=str.charAt(i);
         if (ch>='A' && ch<='Z') {
          ch+=32;
        }
       else if (ch>='a' && ch<='z') {
          ch-=32;
        }
        System.out.print(ch+ " ");
      }
     sc.close();
}
}

