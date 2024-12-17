

public class ArrayExercise {
  public static void main(String[] args) {
    // Print out the max occurency of char
    char[] arr12 = new char[] {'p', 'a', 'p', 'b', 'a', 'p'};

    int[] count = new int[26];

    for (int i = 0; i < arr12.length; i++) {
      count[arr12[i] - 'a']++;  //change the characters to ASCII and use it as index of the count array, so that if the same character reappear in the array, the value of that index increase by 1, so that an arry with character as index and number of occurancy as value is created
    }

    int max = count[0];
    int index = 0;
    for (int i = 0; i < count.length; i++) {
      if (count[i] > max) {
        index = i;  // Based on above count array, to find out which value is the largest, it means that index is the most frequent character in the array, however as we use the character as the index, hence get the index
      }
    }
    System.out.println(index);
    System.out.println((char) (index + 'a')); // As the index is just a name, hence would need to change it to char, so that we could get the character
    // System.out.println(maxNumChar);
  }
}
