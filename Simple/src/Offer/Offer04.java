package Offer;

/*
https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/?favorite=xb9nqhhg
 */
public class Offer04 {

  public boolean findNumberIn2DArray(int[][] matrix, int target) {
    int n = matrix.length;
    if (n == 0) {
      return false;
    }
    int m = matrix[0].length;
    if (m == 0) {
      return false;
    }
    int index;
    for (int i = 0; i < n; i++) {
      index = findMidIndex(0, m, matrix[i], target);
      if (target == matrix[i][index]) {
        return true;
      }
    }
    return false;
  }

  public int findMidIndex(int start, int end, int[] array, int target) {
    if (start == end || (end - 1) == start) {
      return start;
    }
    int index = (start + end) / 2;
    if (array[index] > target) {
      end = index;
    } else if (array[index] < target) {
      start = index;
    } else {
      return index;
    }
    return findMidIndex(start, end, array, target);
  }

  /*

   */
  public boolean findNumberIn2DArray2(int[][] matrix, int target) {
    return true;
  }

}
