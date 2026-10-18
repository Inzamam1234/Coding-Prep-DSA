package StringBasic.StringTraversal;

import java.util.*;

public class Main {

    public static int StringLength(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
        }
        return count;
    }

    public static int CharCount(String s, Character c) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //System.out.println(StringLength(s));
        //Character c = sc.nextLine().charAt(0);
        //System.out.println(CharCount(s, c));

        int vowels = 0;
        int consonants = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            ch = Character.toLowerCase(ch);
            if (Character.isLetter(ch)) {                       //Count Vowels and Consonants
                if (ch == 'a' || ch == 'e' || ch == 'i' || 
                    ch == 'o' || ch == 'u') {
            vowels++;
            } else {
            consonants++;
            }
        }
      }

      int digits = 0;
      int special = 0;

      for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        ch = Character.toLowerCase(ch);
                                                //Count Digits and Special Characters
        if(Character.isDigit(ch)){
            digits++;
        }
        else if(!Character.isLetter(ch)){
            special++;
        }
      }
      //System.out.println("Vowels: " + vowels);
      //System.out.println("Consonants: " + consonants);

      System.out.println(digits + " " + special);


    }
}
