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
  }
}
