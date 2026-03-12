package Strings;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String str=sc.next();
        for (int i=0; i<str.length(); i++) {
            int count=1;
            boolean visit=false;
            for(int j=0; j<i; j++){
              if (str.charAt(i) == str.charAt(j)) {
                visit=true;
                break;
              }
            }
              if (visit){ 
                continue;
              }
            for(int a=i+1; a<str.length(); a++){
                if (str.charAt(i) == str.charAt(a)) {
                    count++;
                }
            }
            System.out.println(str.charAt(i) + ":" + count);
        }
     sc.close();
}
}
