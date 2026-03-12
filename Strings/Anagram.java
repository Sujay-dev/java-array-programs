package Strings;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String s1=sc.next();
      String s2=sc.next();
      if (s1.length() != s2.length()) {
        System.out.println("Not anagram");
      }
      int freq[]=new int[26];
      for(int i=0; i<s1.length(); i++){
        freq[s1.charAt(i) - 'a']++;
        freq[s2.charAt(i) - 'a']--;
      }
      for(int i=0; i<26; i++){
        if (freq[i] != 0) {
            System.out.println("Not Anagram");
            return;
        }
      }
      System.out.println("Anagram");

     sc.close();
}
}

