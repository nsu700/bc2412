

public class testEx {
  public static void main(String[] args) {
    String s19 = "13289";
    int minIdx = 0;
    int maxIdx = 0;
    for (int i = 0; i < s19.length(); i++) {
      if (s19.charAt(minIdx) > s19.charAt(i)){ 
        minIdx = i;
      } 
      if (s19.charAt(maxIdx) < s19.charAt(i)) {
        maxIdx = i;
      }
    }
    System.out.println(s19.substring(0,minIdx).concat(""+s19.charAt(maxIdx)).concat(s19.substring(minIdx+1,maxIdx)).concat(""+s19.charAt(minIdx)).concat(s19.substring(maxIdx+1)));
  }
}
