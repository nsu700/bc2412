// Never use float/double to do any +_*/ operations
import java.math.BigDecimal;

public class DemoBigDecimal {
  public static void main(String[] args) {
      double d1 = 0.2;
      double d2 = 0.1;
      System.out.println(d1 + d2);

      BigDecimal bd1 = BigDecimal.valueOf(d1);
      BigDecimal bd2 = BigDecimal.valueOf(d2);
      System.out.println(bd1.add(bd2));
      System.out.println(bd1.subtract(bd2));
      System.out.println(bd1.multiply(bd2));
      System.out.println(bd1.divide(bd2));
  }
}
