public class DemoForLoop2 {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // Step 1: i = 0, j = 0, print *
    // Step 2: i = 0, j = 1, print *
    // Step 3: i = 0, j = 2, print *
    // Step 4: i = 1, j = 0, print *
    // Step 5: i = 1, j = 1, print *
    // Step 6: i = 1, j = 2, print *
    // Step 7: i = 2, j = 0, print *
    // Step 8: i = 2, j = 1, print *
    // Step 9: i = 2, j = 2, print *

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 0; i < 3; i++) { // print i lines
      for (int j = i; j >= 0; j--) { // print i stars
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
