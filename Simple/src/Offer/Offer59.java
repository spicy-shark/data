package Offer;

import java.util.PriorityQueue;

public class Offer59 {

  public int[] maxSlidingWindow(int[] nums, int k) {
    int[] max = new int[nums.length - k + 1];
    PriorityQueue<Integer> queue = new PriorityQueue<>(((o1, o2) -> o2 - o1));
    for (int i = 0; i < k; i++) {
      queue.offer(nums[i]);
    }
    max[0] = queue.peek();
    for (int i = k; i < nums.length; i++) {
      if (queue.peek().equals(nums[i - k])) {
        queue.poll();
      } else {
        queue.remove(nums[i - k]);
      }
      queue.offer(nums[i]);
      max[i - k + 1] = queue.peek();
    }
    return max;
  }

}
