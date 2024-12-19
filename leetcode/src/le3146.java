public class le3146 {
  public static int findPermutationDifference(String s, String t) {
    int result = 0;
    int idx = 0;
    for (int i = 0; i < s.length(); i++) {
      idx = t.indexOf(s.charAt(i));
      result += Math.abs(idx - i);
      System.out.println(result);
    }
    return result;
  }

  public static void main(String[] args) {
    String s = "rwohu";
    String t = "rwuoh";
    System.out.println(findPermutationDifference(s, t));
  }
}
