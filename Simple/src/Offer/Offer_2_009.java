package Offer;

public class Offer_2_009 {

  public int numSubarrayProductLessThanK(int[] nums, int k) {
    int res = 0;
    int left = 0;
    int right = 0;
    int cur = 1;
    if (k > 0) {
      while (right < nums.length) {
        cur *= nums[right];
        while (cur >= k) {
          cur /= nums[left];
          left++;
        }
        res += right - left + 1;
        right++;
      }
    }
    return res;
  }

}
