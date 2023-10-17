package Offer;

/*
https://leetcode.cn/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/description/?favorite=xb9nqhhg
 */
public class Offer03 {

  public int findRepeatNumber(int[] nums) {
    int swap;
    for(int i = 0; i < nums.length; i++) {
      if (nums[i] != i) {
        if (nums[i] == nums[nums[i]]) {
          return nums[i];
        }
        swap = nums[i];
        nums[i] = nums[nums[i]];
        nums[swap] = swap;
      }
    }
    if (nums[nums.length - 1] != nums.length -1) {
      return nums[nums.length - 1];
    }
    return -1;
  }

}
