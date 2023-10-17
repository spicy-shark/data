package Offer;

import common.ListNode;

public class Offer24 {

  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    return revers(head, head.next);
  }

  public ListNode revers(ListNode pre, ListNode cur) {
    if (cur.next == null) {
      cur.next = pre;
      pre.next = null;
      return cur;
    }
    pre = pre.next;
    cur = cur.next;
    return revers(pre, cur);
  }

}
