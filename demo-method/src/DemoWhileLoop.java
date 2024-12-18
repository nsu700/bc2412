

public class DemoWhileLoop {
  public static void main(String[] args) {
    // for (int i = 0; i < 10; i++) {
    //   System.out.println(i);
    // }

    // int j = 0;
    // while (j<10) {
    //   System.out.println(j);
    //   j++;
    // }

    int index = 0;
    String s = "hello";
    char target = 'l';
    while (index < s.length()) {
      if (s.charAt(index) == target) {
        System.out.println("The index of the target is " + index);
        break;
      }
      index++;
    }
  }
}