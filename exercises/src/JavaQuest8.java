

/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  public static int[] sorting(int[] array) {
    int temp;
    for (int j = 0;j < 100; j++) {
      int count = 0;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] < array[i+1]) {
          temp = array[i+1];
          array[i+1] = array[i];
          array[i] = temp;
          count++;
        }
      }
      if (count == 0) {
        break;
      }
    }
    return array;
  }
  public static void main(String[] args) {
    int[] nums1 = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Print the second max
    System.out.println(sorting(nums1)[1]);
    System.out.println(sorting(nums2)[1]);
    System.out.println(sorting(nums3)[1]);
    System.out.println(sorting(nums4)[1]);
  }
}


