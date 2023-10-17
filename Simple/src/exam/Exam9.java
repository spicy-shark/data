package exam;

/*
[123,5,111,7,6,9]
JVM调优工具jvisualvm
线上阿尔萨斯
JPS
JMAP
 */
public class Exam9 {

  public static void main(String[] args) {
    int[] nums = new int[]{123, 5, 111, 7, 6, 9};
    int res = getMaxCreaseLen(nums);
    System.out.println(res);
  }

  static int getMaxCreaseLen(int[] nums) {
    if (nums.length <= 1) {
      return nums.length;
    }
    int[] dp = new int[nums.length];
    dp[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      int max = 0;
      for (int j = 0; j < i; j++) {
        max = Math.max(max, dp[j]);
        if (nums[i] > nums[j]) {
          dp[i] = Math.max(max + 1, dp[i]);
        }
      }
    }
    return dp[nums.length - 1];
  }

}
