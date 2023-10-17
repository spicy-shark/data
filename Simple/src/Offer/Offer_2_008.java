package Offer;

public class Offer_2_008 {

  public int minSubArrayLen(int target, int[] nums) {
    int left = 0;
    int right = 0;
    int sum = nums[0];
    int min = nums.length + 1;
    while (left < nums.length && right < nums.length) {
      if (sum >= target) {
        min = Math.min(min, right - left + 1);
        sum -= nums[left];
        left++;
        if (left > right) {
          right++;
        }
      } else {
        right++;
        if (right < nums.length) {
          sum += nums[right];
        }
      }
    }
    return min == nums.length + 1 ? 0 : min;
  }

  public int minSubArrayLen2(int target, int[] nums) {
    int[] sums = new int[nums.length];
    int res = nums.length + 1;
    for (int i = 0; i < nums.length; i++) {
      if (i == 0) {
        sums[0] = nums[0];
      } else {
        sums[i] = sums[i - 1] + nums[i];
      }
      if (sums[i] >= target) {
        res = Math.min(i + 1, res);
      }
    }
    for (int i = 0; i < sums.length; i++) {
      int d = sums[i] - target;
      int left = 0;
      int right = i;
      while (left < right) {
        int mid = left + (right - left) / 2;
        if (sums[mid] < d) {
          left = mid + 1;
        } else if (sums[mid] > d){
          right = mid - 1;
        } else {
          left = mid;
          right = mid;
        }
      }
      if (sums[left] <= d) {
        res = Math.min(res, i - left);
      }
    }
    return res == nums.length + 1 ? 0 : res;
  }

}
