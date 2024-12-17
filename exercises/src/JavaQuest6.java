/**
 * Expected output:
 * 0 1 1 2 3 5 8 13 21 ...
 * 
 */

public class JavaQuest6 {
  public static void main(String[] args) {
    int first = 0, second = 1;
    String output = first + " " + second;
    int rest;
    // for loop to print first 15 numbers in Fibonacci Sequence
    for (int i = 0; i < 15; i++) {
      rest = first + second;
      first = second;
      second = rest;
      output += " " + rest;
      // System.out.println(rest);
    }
    System.out.println(output);
  }
}