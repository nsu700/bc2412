// Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
// firstHalf("WooHoo") → "Woo"
// firstHalf("HelloThere") → "Hello"
// firstHalf("abcdef") → "abc"

import java.util.Scanner;

public class FirstHalf {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please input the string:");
      String str = scanner.nextLine();

      System.out.println(firstHalf(str));
  }

  public static String firstHalf(String str) {
    String newStr = "";
    for (int i = 0; i < str.length()/2; i++) {
      newStr += str.charAt(i);
    }
    return newStr;
  }
  
}