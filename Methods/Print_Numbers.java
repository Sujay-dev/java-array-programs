package Methods;
    
import java.util.Scanner;

public class Print_Numbers  {
    public static void print(int n){
   for(int i=1; i<=n; i++){
    System.out.print(i+ " ");
   }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int x=sc.nextInt();
       print(x);

        sc.close();
}
}

