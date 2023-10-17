package Offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Interview45 {

  public String minNumber(int[] nums) {
    PriorityQueue<Integer> queue = new PriorityQueue<>(((o1, o2) -> (o1 + "" + o2).compareTo((o2 + "" + o1))));
    for (int num : nums) {
      queue.offer(num);
    }
    StringBuilder res = new StringBuilder();
    while (!queue.isEmpty()) {
      res.append(queue.poll());
    }
    return res.toString();
  }

  void quickSort(int[] nums, int start, int end) {

  }
}
