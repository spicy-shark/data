package lc;

public class LC_34 {

  public int[] searchRange(int[] nums, int target) {
    if (nums.length == 0 || target < nums[0] || target > nums[nums.length - 1]) {
      return new int[]{-1, -1};
    }
    return new int[]{findIndex(nums, target, true) + 1, findIndex(nums, target, false) - 1};
  }

  private int findIndex(int[] nums, int target, boolean isLeft) {
    int left = 0;
    int right = nums[nums.length - 1];
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (isLeft) {
        if (nums[mid] >= target) {
          right = mid - 1;
        } else {
          left = mid;
        }
      } else {
        if (nums[mid] <= target) {
          left = mid + 1;
        } else {
          right = mid;
        }
      }
    }
    return isLeft ? right : left;
  }
}
