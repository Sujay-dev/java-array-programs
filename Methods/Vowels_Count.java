package Methods;

import java.util.Scanner;

public class Vowels_Count {
public static int  Vowels(String str){
    int count=0;
      for(int i=0; i<str.length(); i++){
        char ch=str.charAt(i);
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
            count++;
        }
      }
      return count;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int res=Vowels(str);
        System.out.println(res);
        sc.close();
}
}


