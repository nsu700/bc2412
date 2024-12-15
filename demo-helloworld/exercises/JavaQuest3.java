import java.util.Scanner;

public class JavaQuest3 {
  /**
   * Expected Output:
   * 
   * Example 1: Input a month number: 2 Input a year: 2016
   * 
   * February 2016 has 29 days
   * 
   * Example 2: Input a month number: 12 Input a year: 2014
   * 
   * December 2014 has 31 days
   */

  // Program the number of days that the month of a year has.

  public static void main(String[] strings) {

    Scanner input = new Scanner(System.in);

    int number_Of_DaysInMonth = 0;
    String monthOfName = "Unknown";

    System.out.print("Input a month number: ");
    int month = input.nextInt(); // assume 1 - 12
    input.nextLine();
    System.out.print("Input a year: ");
    int year = input.nextInt(); // > 0

    // The February has 29 days: (Every 4 years and the year cannot divded by
    // 100) or The year can divided by 400
    // otherwise the February should have 28 days only
    if (month > 0 && month < 13) {
      if (month % 2 != 0 || month == 8) {
        number_Of_DaysInMonth = 31;
      } else if (month == 2 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        number_Of_DaysInMonth = 29;
      }
      System.out.println(
        monthOfName + " " + year + " has " + number_Of_DaysInMonth + " days");
    } else {
      System.out.println("Invalid Input! Please enter a value between 1 and 12.");
    }
  }
}
