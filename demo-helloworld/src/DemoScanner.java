
import java.util.Scanner;


public class DemoScanner {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a number");
      int days = scanner.nextInt();
      int hours = 0;
      for (int i = 0; i < days; i++) {
        hours += 24;
      }
      System.out.println("Hours: " + hours);  
      
      int minutes = 0;
      for (int i = 0; i < days; i++) {
        for (int j = 0; j < 24; j++) {
          minutes += 60;
        }
      }
      System.out.println("Minutes: " + minutes);
  }
}