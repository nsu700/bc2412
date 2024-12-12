
public class DemoIf {
  public static void main(String[] args) {
      // String s = "HelloWorld";
      // if (s.length() < 3) {
      //   System.out.println("String has more than 3 characters");
      // } else {
      //   System.out.println("String has less than 3 characters");
      // }

      // // equals(), charAt()
      // if (s.charAt(0)!='H') {
      //   System.out.println(true);
      // } else if("Hello".equals(s)) {
      //   System.out.println("The input string is Hello");
      // } else {
      //   System.out.println(s);
      // }

      // int x = 9;
      // // Check if variable is an even number
      // if (x % 2 == 0 && x > 10) {
      //   System.out.println(x + " is an even number");
      // } else if (x % 2 == 0) {
      //   System.out.println(x + " is an even number but less than 10");
      // } else {
      //   System.out.println(x + " is not even an even number");
      // }

      // int age = 19;
      // boolean isAdult = age > 18;
      // if (isAdult) {
      //   System.out.println("Yes, is audlt");
      // } else {
      //   System.out.println("No, not an adult");
      // }

      int score = 86;
      char gender = 'M';
      char grade;
      if (score > 90) {
        grade = 'A';
      } else if (score > 87 && gender == 'M') {
        grade = 'T';
      } else if (score > 85 && gender != 'M') {
        grade = 'T';
      } else if (score > 80) {
        grade = 'B';
      } else if (score > 70) {
        grade = 'C';
      } else {
        grade = 'D';
      }
      System.out.println("The grade is " + grade);

      // Test plan
      // 1. Boy with score higher than 90
      // 2. Boy with score higher than 88 and lower than 90
      // 3. Boy with score higher than 80 and lower than 87
      // 4. Boy with score higher than 70 and lower than 80
      // 5. Boy with score lower than 70
      // 6. Girl with score higher than 90
      // 7. Girl with score higher than 86 and lower than 90
      // 8. 
  }
}
