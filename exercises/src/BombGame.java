import java.util.Random;
import java.util.Scanner;

public class BombGame {
  public static void main(String[] args) {
    int bomb = new Random().nextInt(100) + 1;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input a number between 0 and 100");
    int numOfPick = -1;
    int upper = 100;
    int lower = 0;
    int times = 0;
    while (numOfPick != bomb) {
      System.out.println("You have " + (4 - times) + " times to try, Please input a number between " + lower + " and " + upper);
      numOfPick = scanner.nextInt();
      if (numOfPick < lower || numOfPick > upper) {
        System.out.println("Please follow the rule");
        continue;
      } else {
        if (times > 3) {
          System.out.println("Congratulations, you survive in the game");
          break;
        }
        if (numOfPick > bomb) {
          upper = numOfPick - 1;
        } else {
          lower = numOfPick + 1;
        }
        System.out.println(upper + "::" + lower + "::" + bomb);
        times++;
      }
      System.out.println("You hit the bomb");
    }
  }
}
