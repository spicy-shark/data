package Offer;

public class Offer53_2 {

  public int missingNumber(int[] nums) {
    return findIndex(nums, 0, nums.length - 1);
  }

  int findIndex(int[] nums, int i, int j) {
    int mid = i + (j - i) / 2;
    while (i < j) {
      if (nums[mid] > mid) {
        j = mid;
      } else {
        i = mid + 1;
      }
    }
    return i;
  }

}
