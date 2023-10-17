package lc;

public class LC_17_14 {
  public static void main(String[] args) {
    LC_17_14 lc = new LC_17_14();
    lc.smallestK(new int[]{3,3,3,3,3,3}, 3);
  }
  public int[] smallestK(int[] arr, int k) {
    if (arr.length == 0) {
      return arr;
    }
    partSort(arr, 0, arr.length - 1, k);
    int[] res = new int[k];
    for (int i = 0; i < k; i++) {
      res[i] = arr[i];
    }
    return res;
  }

  int partSort(int[] arr, int left, int right, int k) {
    int val = arr[left];
    int i = left;
    int j = right;
    while (i < j) {
      while (i < j && arr[j] >= val) {
        j--;
      }
      while (i < j && arr[i] <= val) {
        i++;
      }
      swap(arr, i, j);
    }
    swap(arr, i, left);
    if (i > k) {
      return partSort(arr, left, i - 1, k);
    } else if (i < k) {
      return partSort(arr, i + 1, right, k);
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
