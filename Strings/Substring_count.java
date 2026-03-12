package Strings;

import java.util.Scanner;

public class Substring_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String str="ababab";
       String sub="ab";
       int count=0;
       for(int i=0; i<=str.length()-sub.length(); i++){

        if (str.substring(i, i+sub.length()).equals(sub)) {
          count++;
        }
       }
       System.out.println(count);
     sc.close();
}
}

