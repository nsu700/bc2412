import java.util.Scanner;

public class exercise1 {
  // Write a program that will take in a start number and an end number from a user. Then, using a while loop show all the values from the start to the end number
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input the starting number:");
    int starter = scanner.nextInt();

    System.out.println("Please input the ending number:");
    int end = scanner.nextInt();

    int num;
    if (starter == end) {
      System.out.println("The number is equal");
    } else if (starter > end) {
      System.out.println("The starter is larger than the end");
    } else {
      for (int i = starter;i <= end; i++) {
        num = i + 1;
        if ( num == end ) {
          break;
        }
        System.out.println(num);
      }
    }
  }
}
