
import java.util.Arrays;

public class le1929 {
  public static int[] getConcatenation(int[] nums) {
    int[] output = new int[nums.length*2];
    for (int i = 0; i < nums.length; i++) {
      output[i] = nums[i];
      output[nums.length + i] = nums[i];
    }
    return output;
  }

  public static void main(String[] args) {
    int[] nums = new int[] {1,3,2,1};
    System.out.println(Arrays.toString(getConcatenation(nums)));
  }
}