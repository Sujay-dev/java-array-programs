package Methods;

import java.util.Scanner;

public class Mult_Table {
    
public static void Table(int n){
    for(int i=1; i<=10; i++){
        System.out.println(n+ "X" + i+ ":"+ (i*n));
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Table(n);
        sc.close();
}
}



