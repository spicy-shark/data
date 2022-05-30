package top100;

/**
 * @program: leetCode
 * @description: TODO
 * @author: Pei Yansheng
 * @date: 2022-05-30 20:59
 **/
public class NextPermutation {
  public void nextPermutation(int[] nums) {
    int i = nums.length - 1;
    while (i > 0) {
      if (nums[i] > nums[i - 1]) {
        break;
      }
      i--;
    }
    i--;
    int j = nums.length - 1;
    if (i >= 0) {
      while (i < j) {
        if (nums[j] > nums[i]) {
          break;
        }
        j--;
      }
      this.swap(nums, i, j);
      i++;
    } else {
      i = 0;
    }

    j = nums.length - 1;
    while (i < j) {
      this.swap(nums, i, j);
      i++;
      j--;
    }

  }

  void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
