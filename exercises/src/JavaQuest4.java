/**
 * Exercise: Print 10 numbers: they must be even and > 0, and divisible by 3
 * and divisible by 2 (Search it from 1)
 * 
 * Expected Output: 6 12 18 24 30 36 42 48 54 60
 */
// Print first ten numbers, which fulfill the followings criteria:
// 1. Even numbers
// 2. Divisible by 3
// 3. > 0

public class JavaQuest4 {
  public static void main(String[] args) {
    String output = "";
    int count = 0;
    for (int i = 0; i < 100; i++) {
      if (i % 2 == 0 && i % 3 == 0 && i > 0) {
        output += " " + i;
        count++;
      }
      if (count == 10) {
        break;
      }
    }
    System.out.println(output);    
  }
}
