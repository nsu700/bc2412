
import java.util.Arrays;

public class le1 {
  //TODO: this method is not good
  public static int[] twoSum(int[] nums, int target) {
    int[] index = new int[2];
    for(int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (j != i && nums[i] + nums[j] == target) {
          index[0] = j;
          index[1] = i;
        }
      }
    }
    return index;
  }

  public static void main(String[] args) {
      int[] nums = new int[] {-1, -2, -3, -4, -5};
      int target = -8;
      System.out.println(Arrays.toString(twoSum(nums, target)));
  }
}
