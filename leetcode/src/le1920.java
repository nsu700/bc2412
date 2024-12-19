
import java.util.Arrays;

public class le1920 {
  public static int[] buildArray(int[] nums) {
    int[] output = new int[nums.length];
    int value;
    for(int i = 0; i < nums.length; i++) {
      value = nums[i];
      output[i] = nums[value];
    }
    return output;
  }

  public static void main(String[] args) {
      int[] nums = new int[] {5,0,1,2,3,4};
      System.out.println(Arrays.toString(buildArray(nums)));
  }
}
