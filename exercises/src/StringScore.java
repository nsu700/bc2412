public class StringScore {
  public static int scoreOfString(String s) {
    int[] number = new int[s.length()];
    for(int i = 0; i < s.length(); i++) {
      number[i] = (int) (s.charAt(i) - 'a');
    }
    int sum = 0;
    for (int i = 0; i < number.length-1; i++) {
      sum += Math.abs(number[i] - number[i+1]);
    }
    return sum;
  }

  public static void main(String[] args) {
      String s = "zaz";
      System.out.println(scoreOfString(s));
  }
}
