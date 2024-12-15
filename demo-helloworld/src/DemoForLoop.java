

public class DemoForLoop {
  public static void main(String[] args) {
      // for (int i = 0; i < 10; i++) {
      //   i += 5;
      //   System.out.println(i);
      // }

      // // Loop first time
      // // Step 1: declare i is an integer with 0 as value
      // // Step 2: check if i < 10
      // // Step 3: if i < 10 is true, then execute the code block
      // // Step 4: increment i by 5
      // // Step 5: print out i
      // // Step 6: run i++ to increment i by 1
      // // Step 7: now i is 6(5+1)
      // // Loop second time, i is now 6
      // // Step 8: verify if i < 10 is true, which is true as 6 < 10
      // // Step 9: execute the code block
      // // Step 10: increment i by 5, i is now 11(6+5)
      // // Step 11: print out i, which is 11
      // // Step 12: run i++ to increment i by 1, i is now 12
      // // Step 13: now i is 12
      // // Loop third time, i is now 12
      // // Step 14: verify if i < 10 is true, which is false as 12 < 10 is false
      // // Step 15: exit the loop

      // for (int i = 0; i < 10; ++i) {
      //   i += 5;
      //   System.out.println(i);
      // }

      // // Print even numbers from 0 to 10
      // for (int i = 0; i < 10; i++) {
      //   if (i%2 == 0) {
      //     System.out.println(i);
      //   }
      // }

      // // Print numbers that can be divided by 3 and 4 between 0 and 100
      // for (int i = 0; i < 100; i++) {
      //   if (i % 3 == 0 && i % 4 == 0) {
      //     System.out.println(i);
      //   }
      // }

      // // Print sum of numbers from 0 to 20
      // int sum = 0;
      // for (int i = 0; i < 21; i++) {
      //   sum += i;
      //   System.out.println(sum);
      // }

      // for (int i = 0; i < 100; i++) {
      //   if (i % 3 != 0 && i % 2 != 0 && i % 5 != 0 && i % 7 != 0) {
      //     System.out.println(i);
      //   }
      // }

      // // Print sum of odd numbers from 0 to 10
      // sum = 0;
      // for (int i = 0; i <= 10; i++) {
      //   if (i % 2 != 0) {
      //     sum += i;
      //     System.out.println(i);
      //   }
      // }
      // System.out.println(sum);

      // // Count the number of input character appearing in a string
      // Scanner scanner = new Scanner(System.in);
      // String s = "hello";
      // int count = 0;
      // System.out.println("Enter a character: ");
      // char c = scanner.next().charAt(0);
      // for (int i = 0; i < s.length(); i++) {
      //   if (s.charAt(i) == c) {
      //     count++;
      //   }
      // }
      // System.out.println("There is " + count + " characters appearing in the string.");

      // count = 0;
      // for (int i = 0; i < s.length(); i++) {
      //   if (s.charAt(i) != c) {
      //     continue; // skip `count++`, directly go to i++ and then start next iteration
      //   }
      //   count++;
      // }
      // System.out.println("There is " + count + " characters appearing in the string.");

      for (int i=0; i<=100; i++) {
        if (i % 3 != 0 || i % 4 != 0) {
          continue;
        }
        System.out.println(i);
      }

      for (int i = 0; i <= 100; i++) {
        if (i % 3 == 0 && i % 4 == 0) {
          System.out.println(i);
        }
      }
      int r1 = 0 % 3;
      System.out.println(r1);
      int r2 = 1 % 3;
      System.out.println(r2);

      
  }
}
