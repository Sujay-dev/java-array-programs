package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String str=sc.next();
         boolean palin=false;
       for(int i=0; i<str.length()/2; i++){
        if (str.charAt(i)== str.charAt(str.length()-1-i)) {
            palin=true;
        }
       }
       if (palin) {
        System.out.println("Yes");
       }
       else{
        System.out.println("Not Palindrome");
       }
     sc.close();
}
}

