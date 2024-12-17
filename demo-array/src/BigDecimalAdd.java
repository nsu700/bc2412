import java.math.BigDecimal;

public class BigDecimalAdd {
  public static void main(String[] args) {
    BigDecimal newSum = BigDecimal.ZERO;
    double[] prices = new double[] {7.5, 4.6, 8.3};
    int[] quantities = new int[] {3, 4, 5};
    if (prices.length == quantities.length) {
      for (int i = 0; i < prices.length; i++) {
        BigDecimal quantity = BigDecimal.valueOf(quantities[i]);
        BigDecimal price = BigDecimal.valueOf(prices[i]);
        newSum = newSum.add(quantity.multiply(price));
      }
      System.out.println(newSum.toString());
    }
  }
}
