package Methods;

    import java.util.Scanner;

public class Factorial {
public static int factof(int a){
int fact=1;
 for(int i=1; i<=a; i++){
   fact=fact*i;
}
return fact;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int x=sc.nextInt();
      int a=  factof(x);
     System.out.println(a);
        sc.close();
}
}



