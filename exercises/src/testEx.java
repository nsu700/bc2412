import java.math.BigDecimal;
import java.util.Arrays;

public class testEx {
  public static void main(String[] args) {
    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.5
    float[] arr16 = new float[] {0.2f, 0.3f, 0.5f};

    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.6]

    for (int i = 0; i < arr16.length; i++) {
      BigDecimal num = BigDecimal.valueOf(arr16[i]);
      arr16[i] = num.add(BigDecimal.valueOf(0.1)).setScale(2).floatValue();
    }
    System.out.println(Arrays.toString(arr16));
  }
}
