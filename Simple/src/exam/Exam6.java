package exam;

import java.util.Arrays;

public class Exam6 {

  /*
  给你一个长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
示例:

输入: [1,2,3,4]
输出: [24,12,8,6]
   */
  public static void main(String[] args) {
    int[] nums = new int[]{1, 2, 3, 4};
    int[] res = new int[nums.length];
    int multi = 1;
    for (int num : nums) {
      multi *= num;
    }
    for (int i = 0; i < nums.length; i++) {
      res[i] = multi / nums[i];
    }
    System.out.println(Arrays.toString(res));
  }
}
