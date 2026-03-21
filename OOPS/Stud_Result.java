package OOPS;

import java.util.Scanner;

class Student{
      String name;
      int marks;

      boolean ispass(){
        if (marks>=40) {
          return true;
        }
        else{
          return false;
        }
      }
     void display(){
    System.out.println(name);
    boolean result=ispass();
    if(result){
        System.out.println("Pass");
    } else {
        System.out.println("Fail");
    }
}
}
public class Stud_Result {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Student s1=new Student();
    s1.name=sc.next();
    s1.marks=sc.nextInt();

    s1.display();
    sc.close();
}
}

