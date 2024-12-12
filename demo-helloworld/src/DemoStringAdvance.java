public class DemoStringAdvance {
  public static void main(String[] args) {
    String str = "Hello World";
    // 1. Check if 'd' exists in str

    // for (int i = 0; i < str.length(); i++) {
    //   if (str.charAt(i) == 'd') {
    //     System.out.println("Yes, the character is in the string, index: " + i);
    //   }
    // }

    // if (str.indexOf('d') >= 0) {
    //   System.out.println("Yes, the character is in the string");
    // }

    String subString = "lloq";
    String str2 = "hello";
    // boolean isExist = str2.contains(subString);
    // System.out.println(isExist);

    boolean found = false;
    for (int i = 0; i < str2.length(); i++) {
      for (int j=str2.length(); j>i; j--) {
        found = str2.substring(i, j).equals(subString);
        if (found) {
          System.out.println("Found at index: " + i + " until index: " + j);
          break;
        }
      }
    } 
  }
}
