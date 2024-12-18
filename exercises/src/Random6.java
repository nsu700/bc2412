import java.util.Arrays;
import java.util.Random;

public class Random6 {
  public static void main(String[] args) {
    int marksix;
    int[] marksixArr = new int[6];
    int count = 0;
    
    while(count < 6) {
      marksix = new Random().nextInt(49) + 1;
      System.out.println("marksix = " + marksix);
      for(int i = 0; i < marksixArr.length; i++) {
        if (marksix == marksixArr[i]) {
          break;
        } else {
          marksixArr[count] = marksix;
          count++;
        }
        System.out.println(marksix);
        System.out.println(Arrays.toString(marksixArr));
      }
    }
    System.out.println(Arrays.toString(marksixArr));
  }
}
