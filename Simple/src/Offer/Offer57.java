package Offer;

public class Offer57 {

  public int[] twoSum(int[] nums, int target) {
    int i = 0;
    int j = nums.length - 1;
    while (nums[j] >= target) {
      j--;
    }
    while (nums[i] + nums[j] != target) {
      if (nums[i] + nums[j] > target) {
        j--;
      } else if (nums[i] + nums[j] < target){
        i++;
      }
    }
    return new int[]{nums[i], nums[j]};
  }

}
