

public class DemoMethod {
  public static int sum(int x, int y) {
    int result = x + y;
    return result;
  }

  public static int substruct(int x, int y) {
    int result = x - y;
    return Math.abs(result);
  }

  public static int multiply(int x, int y) {
    int result = x * y;
    return result;
  }

  public static int divide(int x, int y) {
    int result = x / y;
    return result;
  }

  public static int countCharacter(String source, char target) {
    int count = 0;
    for (int i = 0; i < source.length(); i++) {
      if (source.charAt(i) == target) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(sum(3,4));
    System.out.println(countCharacter("HelloWorld", 'l'));
  }
}
