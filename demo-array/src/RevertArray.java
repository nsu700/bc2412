public class RevertArray {
  public static void main(String[] args) {
    char[] chArr = "hello world".toCharArray();
    char temp;
    for(int i = 0; i < chArr.length/2; i++) {
      temp = chArr[i];
      chArr[i] = chArr[chArr.length-i-1];
      chArr[chArr.length-i-1] = temp;
    }
    System.out.println(chArr.toString());
    // System.out.println(chArr);
    // System.out.println("hello world");
    // System.out.println(String.valueOf(chArr));
  }
}
