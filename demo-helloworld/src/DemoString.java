

public class DemoString {
  public static void main(String[] args) {
    char x = 'a';
    System.out.println(x);

    String password = "abcd1234";
    String email = "abc@def.com";
    System.out.println(password + "email is: " + email +x);
    System.out.println(x+password);

    // Java method
    char value = password.charAt(02);
    System.out.println(value);

    int c = 01;
    System.out.println(c);

    // euqals()
    String s1 = "000";
    String s2 = "0";
    boolean res = s1.equals(s2);
    System.out.println(res);

    int i2 = 000;
    System.out.println(s1.equals(i2));

    int i3 = 0;
    System.out.println(i2-i3);

    // length()
    String s3 = "asbdcdeasddsfd";
    int s3len = s3.length();
    System.out.println(s3len);

    String password2 = "helloworld";
    char lastChar = password2.charAt(password2.length()-1);
    System.out.println(lastChar);

    String emptyString = "";
    System.out.println(emptyString.length());

    boolean isStringEmpty = emptyString.length() == 0;
    // boolean isStringEmpty = "".equals(emptyString);
    // Never write in below format
    // boolean isStringEmpty = emptyString.equals("");
    System.out.println(isStringEmpty);

    // String newstring;
    // System.out.println("".equals(newstring));
    // System.out.println(newstring.equals(""));
  }
}
