package lc;

public class LC_215 {

  public static void main(String[] args) {
    LC_215 lc = new LC_215();
    lc.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 2);
  }

  public int findKthLargest(int[] nums, int k) {
    return findKth(nums, 0, nums.length - 1, k);
  }

  int findKth(int[] nums, int left, int right, int k) {
    int val = nums[left];
    int i = left;
    int j = right;
    while (i < j) {
      while (nums[j] > val) {
        j--;
      }
      while (nums[i] <= val) {
        i++;
      }
      if (i < j) {
        swap(nums, i, j);
      }
    }
    if (i > k) {
      return findKth(nums, left, i - 1, k);
    } else if (i < k) {
      return findKth(nums, i + 1, right, k);
    } else {
      return i;
    }
  }

  void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

}
