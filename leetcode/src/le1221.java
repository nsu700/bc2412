public class le1221 {
  public static int balancedStringSplit(String s) {
      int countR = 0;
      int countL = 0;
      int found = 0;
      for (int i = 0; i < s.length(); i++){
        if (s.charAt(i) == 'R') {
          countR++;
        } else if (s.charAt(i) == 'L') {
          countL++;
        }
        if (countL == countR && countL > 0) {
          found++;
          System.out.println("found = " + found);
        }
      }
      return found;
  }

  public static void main(String[] args) {
    String s = "RLRRLLRLRL";
    System.out.println(balancedStringSplit(s));
  }
}
