package Offer;

public class Offer21 {

  public int[] exchange(int[] nums) {
    int i = 0;
    int j = nums.length - 1;
    while (i < j) {
      while (nums[i] % 2 == 1) {
        i++;
        if (i >= nums.length) {
          break;
        }
      }
      while (nums[j] % 2 == 0) {
        j--;
        if (j < 0) {
          break;
        }
      }
      if (j < i) {
        break;
      }
      int swap = nums[i];
      nums[i] = nums[j];
      nums[j] = swap;
    }
    return nums;
  }

}
