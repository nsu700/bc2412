public class le2011 {
  public static int finalValueAfterOperations(String[] operations) {
    int start = 0;
    for(int i = 0; i < operations.length; i++) {
      if(operations[i].contains("+")) {
        start++;
      } else {
        start--;
      }
    }
    return start;
  }

  public static void main(String[] args) {
    String[] input = new String[] {"++X","++X","X++"};
    System.out.println(finalValueAfterOperations(input));
  }
}
