
import java.math.BigDecimal;
import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
      int[] arr5 = new int[] {9, -8, -99, 98};
      int min = arr5[0];
      for (int i = 0; i < arr5.length; i++) {
        if (min > arr5[i]) {
          min = arr5[i];
        }
      }
      System.out.println(min);
// array - sum all elements
      int[] arr6 = new int[] {9, -8, -99, 98};
      int sum = 0;
      for (int i = 0; i < arr6.length; i++) {
        sum += arr6[i];
      }
      System.out.println(sum);
// swap
      int left = 7;
      int right = 9;
      int tmp;
      tmp = left;
      left = right;
      right = tmp;
      System.out.println(left);
      System.out.println(right);
// array swap
      int[] arr7 = new int[] {9, -8, 109, 99, 98};
      for (int i = 0; i< arr7.length - 1; i++) {
        if (arr7[i] > arr7[i+1]) {
          tmp = arr7[i];
          arr7[i] = arr7[i+1];
          arr7[i+1] = tmp;
        }
      }
      System.out.println(Arrays.toString(arr7));

      Integer[] arr8 = new Integer[] {1, 2, 3, 4, 5};
      // Products for all numbers
      int pro = 1;
      for (int i = 0; i < arr8.length; i++) {
        pro *= arr8[i];
      }
      System.out.println(pro);

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



      // String c = "abc";
      // System.out.println(c);
      // char c2 = 'a';
      // System.out.println(c2);
      // double d2 = 1.1;
      // System.out.println(d2);
      
      char[] chArr = "hello world".toCharArray();
      // System.out.println(chArr);

      // char[] chArr2 = new char[] {'h', 'e', 'l', 'l', 'o'};
      // System.out.println(chArr2);

      // double[] prices2 = new double[] {7.5, 4.6, 8.3};
      // System.out.println(prices2.toString());

      // int[] quantities2 = new int[] {3, 4, 5};
      // System.out.println(Arrays.toString(quantities2));

      // String[] strings = new String[] {"abc", "def"};
      // System.out.println(Arrays.toString(strings));

      // String output = "";
      // for(int i = chArr.length-1; i >= 0; i--) {
      //   output += chArr[i];
      // }
      // System.out.println(output);

      // System.out.println(chArr);
      char temp;
      for(int i = 0; i < chArr.length/2; i++) {
        temp = chArr[i];
        chArr[i] = chArr[chArr.length-i-1];
        chArr[chArr.length-i-1] = temp;
      }
      System.out.println(chArr.toString());
      System.out.println(chArr);
      System.out.println("hello world");
      System.out.println(String.valueOf(chArr));


      // Not clear on this, need futher check check
      // h -> i, e -> f, l -> m, o -> p
      char[] newCh = "hello".toCharArray();
      for(int i = 0; i < newCh.length; i++) {
        int ch = newCh[i] + 1;
        newCh[i] = (char) ch;
        System.out.println(newCh[i]);
      }
      System.out.println(newCh);
  }
}
