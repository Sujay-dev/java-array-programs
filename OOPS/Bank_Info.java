package OOPS;

import java.util.Scanner;

class Account{
     String name;
     int balance;

     void deposit(int amount){
        balance+=amount;
     }
     void withdrawl(int amount){
        if (amount<=balance) {
            balance-=amount;
        }
        else{
            System.out.println("Insufficient Balance");
        }
     }
     void displaybalance(){
        System.out.println("Balance: "+ balance);
     }
}
public class Bank_Info {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Account a1=new Account();
        a1.name=sc.next();
        a1.balance=sc.nextInt();
        a1.deposit(5000);
        a1.withdrawl(3000);

        a1.displaybalance();
        sc.close();
    }
}
