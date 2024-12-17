// https://medium.com/@cortizftw/java-exercises-loops-e9a2214b6dd2
// Write a program that will take in numbers from the user and sum them up. If the value entered by the user is 0 the program loop ends and the average of all the values entered is shown.
// Sample Output
// Enter an integer value, (0 to end and get average): 10
// Add another integer value, (0 to end and get average): 20
// Add another integer value, (0 to end and get average): 0
// The average is: 15

import java.util.Scanner;

public class exercise2 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int c, sum = 0;
      int nc = 0;
      for (int i = 0; i != -1; i++) { // The termination here may have issue, as the range of integer may flow
        System.out.println("Please input a number, 0 to exist");
        c = scanner.nextInt();
        if (c == 0) {
          System.out.println("You have input " + nc + " numbers, and the sum is " + sum + ", and the avg is " + sum/nc);
          break;
        }
        sum += c;
        nc++;
      }
  }
}
