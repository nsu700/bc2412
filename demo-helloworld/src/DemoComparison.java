public class DemoComparison {
  public static void main(String[] args) {
      // >, <, >=, <=, !=, ==
      char gender = 'M';
      boolean isMale = gender == "M".charAt(0);
      System.out.println(isMale);

      char age = '3';
      boolean isTrue = age == 3;
      System.out.println(isTrue);

      float price = 10.2f;
      System.out.println(price == 10.2);
      // Why the above returns false? Suspose 10.2 is double and 
      double newPrice = 10.2;
      System.out.println(newPrice == 10.2f);
      float price2 = 10.2f;
      System.out.println(price2 != 10.2);
      System.out.println(price2 != 10.2f);

      System.out.println("Test and or operators");
      // && (true, true)=> true (true, false)=> false (false, false)=> false
      int a1 = 50;
      System.out.println(a1 < 100 && a1 > 0);
      System.out.println(a1 < 100 && a1 > 50);
      System.out.println(a1 > 50 && a1 < 40);

      // || (true, true)=> true (true, false)=> true (false, false)=> false
      int a2 = 30;
      System.out.println(a2 < 50 || a2 > 20);
      System.out.println(a2 > 10 || a2 < 20);
      System.out.println(a2 > 30 || a2 < 20);

      // AND OR (true AND (false OR true)) => true
      int a3 =20;
      System.out.println(a3>10 && (a3 < 15 || a3 > 18));
  }
}
