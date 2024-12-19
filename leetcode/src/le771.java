public class le771 {
  public static int numJewelsInStones(String jewels, String stones) {
    int output = 0;
    for (int i = 0; i < stones.length(); i++) {
      System.out.println(stones.charAt(i));
      int count = 0;
      for (int j = 0; j < jewels.length(); j++) {
          if (stones.charAt(i) != jewels.charAt(j)) {
            System.out.println("Stone:" + stones.charAt(i));
            System.out.println("Jewel:" + jewels.charAt(j));
            count++;
          } else {
            break;
          }
      }
      System.out.println(count);
      if(count == jewels.length()) {
          output++;
      }
    }
    return stones.length() - output;
  }

  public static void main(String[] args) {
      String jewels = "aA";
      String stones = "aAAbbbb";
      System.out.println(numJewelsInStones(jewels, stones));
  }
}
