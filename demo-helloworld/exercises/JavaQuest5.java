public class JavaQuest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic

    // if not found, print "Not Found."
    // code here ...

    // method 1
    for (int i = str.length()-1; i >= 0; i--) {
      if (str.charAt(i) == target) {
        System.out.println("The index of the last character of c is " + i);
        break;
      } else if (i==0) {
        System.out.println("The character not found in the string.");
      } 
    }

    // method 2
    int index = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        index = i;
      }
    }
    if (index == 0) {
      System.out.println("The character not found in the string.");
    } else { 
      System.out.println("The index of the last character of c is " + index);
    }
  }
}