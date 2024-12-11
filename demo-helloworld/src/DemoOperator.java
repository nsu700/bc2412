public class DemoOperator {
  public static void main(String[] args) {
    // +1
    int x = 3;
    x = x + 1;
    x++;
    ++x;
    x += 1;
    System.out.println(x);

    // -1
    int y = 7;
    y = y - 1;
    y--;
    --y;
    y -= 1;
    System.out.println(y);

    System.out.println(y+++x);
    System.out.println(x);
    System.out.println(y);
    System.out.println(y+x++);
    System.out.println(x);
    System.out.println(y);

    // *=, /=
    int z = 5;
    z = z * 4;
    z *= 4;
    System.out.println(z);

    int a = 80;
    a = a / 4;
    a /= 4;
    System.out.println(a);

    int c = 00;
    System.out.println(c);


  }
}
