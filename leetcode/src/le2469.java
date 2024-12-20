
import java.math.BigDecimal;
import java.util.Arrays;

public class le2469 {
  public static double[] convertTemperature(double celsius) {
    double[] output = new double[2];
    BigDecimal cel = BigDecimal.valueOf(celsius);
    BigDecimal rate = BigDecimal.valueOf(1.80);
    BigDecimal plusF = BigDecimal.valueOf(32.00);
    BigDecimal plusK = BigDecimal.valueOf(273.15);
    output[1] = cel.multiply(rate).add(plusF).doubleValue();
    output[0] = cel.add(plusK).doubleValue();
    return output;
  }

  public static void main(String[] args) {
    float celsius = 36.50f;
    System.out.println(Arrays.toString(convertTemperature(celsius)));
  }
}
