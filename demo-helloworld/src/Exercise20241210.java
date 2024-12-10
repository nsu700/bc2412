public class Exercise20241210 {
  public static void main(String[] args) {
    double priceForApple = 7.3;
    double priceForOrange = 6.5;
    int quantityOfApple = 3;
    int quantityOfOrange = 4;

    double totalAmount = priceForApple * quantityOfApple + priceForOrange * quantityOfOrange;
    System.out.println(totalAmount);

    int a1 = 30;
    int b1 = 20;
    // Step 1: 30 is an integer, 20 is an interger
    // Step 2: int / int => int
    // Step 3: 30 / 20 => 1
    // Step 4: assign 1(int) to a double c1 => 1.0
    double c1 = a1 / b1;
    System.out.println(c1); //1.0

    double a2 = 30;
    int b2 = 20;
    double c2 = a2 / b2;
    System.out.println(c2); //1.5

    int a3 = 30;
    int b3 = 20;
    int c3 = a3 / b3;
    System.out.println(c3); //1

    int mathScore = 73;
    int englishScore = 60;
    int historyScore = 61;
    double averageScore = (mathScore + englishScore + historyScore) / 3.0;
    System.out.println(averageScore);

    long cl = 2147836428l;
    long ncl = cl + 1;
    System.out.println(ncl);

    // byte [-128, 127]
    // short [-32768, 32767]
    // int [-2147483648, 2147483647]
    // long [-2^63, 2^63-1]
    // byte -> short -> int -> long

    byte maxByte = 120;
    byte minByte = -128;
    byte miniByte = maxByte + 1;
    // Step1: byte value + int value => int value
    // Step2: cannot assign int value to a byte variable
    System.out.println(miniByte);
  }
}
