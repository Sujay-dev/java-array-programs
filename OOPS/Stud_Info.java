package OOPS;

import java.util.Scanner;

class Student {
  String name;
  int marks;
  void display(){
    System.out.println(this.name);
    System.out.println(this.marks);
  }
}
public class Stud_Info {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
     Student s1=new Student();
     Student s2=new Student();
     s1.name=sc.next();
     s1.marks=sc.nextInt();
     s2.name=sc.next();
     s2.marks=sc.nextInt();
     s1.display();
     s2.display();
        sc.close();
}
}

