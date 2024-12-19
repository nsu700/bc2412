public class le1684 {
  public static int countConsistentStrings(String allowed, String[] words) {
    int finalCount = 0;
    for (int i = 0; i < words.length; i++) {
      int count = 0;
      System.out.println(words[i]);
      for (int j = 0; j < words[i].length(); j++) {
        System.out.println(words[i].charAt(j));
        for (int z = 0; z < allowed.length(); z++) {
          System.out.println(allowed.charAt(z));
          if (words[i].charAt(j) != allowed.charAt(z)) {
            count++;
          }
        }
      }
      if (count > 0) {
        finalCount++;
      }
    }
    return finalCount;
  }

  public static void main(String[] args) {
    String allowed = "ab";
    String[] words = new String[] {"ad","bd","aaab","baa","badab","ab"};
    System.out.println(countConsistentStrings(allowed, words));
  }
}
