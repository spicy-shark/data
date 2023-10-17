package Offer;

public class Offer53 {

  public int search(int[] nums, int target) {
    int start = 0;
    int end = nums.length;
    int mid = -1;
    while (start < end) {
      mid = start + (end - start) / 2;
      if (nums[mid] >= target) {
        end = mid - 1;
      } else {
        start = mid;
      }
    }
    int left = mid;
    start = 0;
    end = nums.length;
    while (start < end) {
      mid = start + (end - start) / 2;
      if (nums[mid] <= target) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }
    int right = mid;
    return right - left - 1;
  }

}
