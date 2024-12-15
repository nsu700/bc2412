public class DemoDataType {
  public static void main(String[] args) {
    char c1 = 'a';
    char c2 = 'A';
    char c3 = 0;

    int i1 = c1;
    int i2 = c2;
    int i3 = c3;
  
    System.out.println(i1);
    System.out.println(i2);
    System.out.println(i3);

    char c4 = 10000;
    int i4 = c4;
    System.out.println(c4);

    // byte => short => int => long => float => double
    // char => int => long => float => double
  } 
}
