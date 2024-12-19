
import java.util.Arrays;

public class LoopExercise {
  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop
    for (int i = 0; i < 6; i++){
      System.out.println("hello");
    }

    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    String s2 = "";
    for (int i = 0; i < 5; i++){
      if ( i == 0) {
        s2 = "0";
        continue;
      }
      s2 += "," + i;
      System.out.println(s2);
    }

    // 3. Print even numbers between 2 and 20
    // Use: for loop + if
    for (int i = 0; i <= 20; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    // 4. Print the numbers, which can be divided by 3 or 5
    // Use: for loop + if
    for (int i = 0; i <= 20; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        System.out.println(i);
      }
    }

    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    int sum5 = 0;
    for (int i = 0; i <= 15; i++) {
      sum5 += i;
    }
    System.out.println(sum5);

    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    // Find the product of evenSum and oddSum
    // Use: for loop + if
    int sum6odd = 0;
    int sum6even = 0;
    for (int i = 0; i <= 10; i++) {
      if (i % 2 == 0) {
        sum6even += i;
      } else {
        sum6odd += i;
      }
    }
    System.out.println(sum6even * sum6odd);

    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    String str7 = "ijkabcpodi";
    boolean found = false;
    for (int i = 0; i < str7.length(); i++) {
      if (str7.charAt(i) == 'd') {
        found = true;
      }
    }
    if (found) {
      System.out.println("d is found");
    } else {
      System.out.println("d is not found");
    }

    // 8. Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    String s8a = "abcba";
    String s8b = "cba";
    boolean found8 = false;
    for (int i = 0; i < s8a.length() - s8b.length() + 1; i++) {
      if (s8b.equals(s8a.substring(i, i+s8b.length()))) {
        found8 = true;
      }
    }
    if (found8) {
      System.out.println("s8b is a substring");
    } else {
      System.out.println("s8b is not a substring");
    }

    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    String s9 = "pampers";
    char c9 = 'p';
    int count9 = 0;
    for (int i = 0; i < s9.length(); i++) {
      if (s9.charAt(i) == c9) {
        count9++;
      }
    }
    System.out.println("Count = " + count9);

    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
    for (int i = 0; i < arr10.length; i++) {
      arr10[i] = arr10[i].replace('x', 'k');
    }
    System.out.println(Arrays.toString(arr10));

    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    String s11 = "kLKloOOu";
    int count11 = 0;
    for (int i = 0; i < s11.length(); i++) {
      if (s11.charAt(i) > 64 && s11.charAt(i) < 91) {
        count11++;
      }
    }
    System.out.println("count uppercase =" + count11);

    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score
    String s13 = "lrlaudbucp";
    int score13 = 0;
    for (int i = 0; i < s13.length(); i++) {
      switch (s13.charAt(i)) {
        case 'l':
          score13 += 1;
          break;
        case 'r':
          score13 += 3;
          break;
        case 'd':
          score13 += 2;
          break;
        case 'u':
          score13 += 4;
          break;
        default:
          score13 -= 1;
      }
    }
    System.out.println("The score is " + score13);
    
    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    long[] arr14 = new long[] {1l, 4l, 9l, -4l};

    // 15. Find the max value and min value in arr14
    // Use One Loop + if
    long max = arr14[0];
    long min = arr14[0];
    for (int i = 0; i < arr14.length; i++) {
      if (max < arr14[i]) {
        max = arr14[i];
      }
      if (min > arr14[i]) {
        min = arr14[i];
      }
    }
    System.out.println("The max number is " + max);
    System.out.println("The min number is " + min);
    
    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.5
    float[] arr16 = new float[] {0.2f, 0.3f, 0.5f};

    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.6]
    for(int i = 0; i < arr16.length; i++) {
      arr16[i] = arr16[i] + 0.1f;
    }
    System.out.println(Arrays.toString(arr16));

    // 18. Count the number of target strings in the String[]
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    int count18 = 0;
    // Print "count name=2"
    for (int i = 0; i < arr18.length; i++) {
      if (target.equals(arr18[i])) {
        count18++;
      }
    }
    System.out.println("count name="+count18);

    // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    String s19 = "40289";
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
    
    // 20. Find the longest String in the String array
    // Print "longest=programming"
    String[] arr20 = new String[] {"python", "array", "programming", "java", "bootcamp"};
    int longest = 0;
    int index = 0;
    for (int i = 0; i < arr20.length; i++) {
      if (longest < arr20[i].length()) {
        longest = arr20[i].length();
        index = i;
      }
    }
    System.out.println("longest = " + arr20[index]);
  }
}