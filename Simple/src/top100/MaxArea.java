package top100;

/**
 * @program: leetCode
 * @description: https://leetcode.cn/problems/container-with-most-water/
 * @author: Pei Yansheng
 * @date: 2022-05-07 21:40
 **/
public class MaxArea {
  public int maxArea(int[] height) {
    int max = 0;
    int cur = 0;
    int minHeight = 0;
    int i = 0;
    int j = height.length - 1;
    while (i < j) {
      minHeight = Math.min(height[i], height[j]);
      cur = (j - i) * minHeight;
      if (cur >= max) {
        max = cur;
      }
      if (height[i] < height[j]) {
        i++;
      } else {
        j--;
      }
    }
    return max;
  }
}
