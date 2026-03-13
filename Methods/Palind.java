package Methods;

import java.util.Scanner;

public class Palind {

public static void Palindrome(String str){
    boolean palin=true;
    for(int i=0; i<str.length()/2; i++){
        if (str.charAt(i) != str.charAt(str.length()-1-i)) {
            palin=false;
            break;
        }
    }
    if (palin) {
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not palindrome");
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        Palindrome(str);
        sc.close();
}
}



