package Offer;

public class Offer_2_010 {

  public int subarraySum(int[] nums, int k) {
    int left = 0;
    int right = 1;
    int sum = nums[0];
    int count = 0;
    while (left < nums.length) {
      if (left >= right) {
        sum = nums[left];
        right = left + 1;
      } else {
        if (sum < k) {
          sum += nums[right++];
        } else if (sum > k) {
          sum -= nums[left++];
        } else {
          count++;
          sum -= nums[left];
          left++;
          sum += nums[right];
          right++;
        }
      }
    }
    return sum == k ? count + 1 : count;
  }

}
