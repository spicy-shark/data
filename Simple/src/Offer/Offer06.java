package Offer;

import common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Offer06 {

  List<Integer> array = new ArrayList<>();
  public int[] reversePrint(ListNode head) {
    recur(head);
    int[] res = new int[array.size()];
    for (int i = 0; i < array.size(); i++) {
      res[i] = array.get(i);
    }
    return res;
  }

  public void recur(ListNode head) {
    if (head == null) {
      return;
    }
    recur(head.next);
    array.add(head.val);
  }

}
