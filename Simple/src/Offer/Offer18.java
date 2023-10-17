package Offer;

import common.ListNode;

public class Offer18 {
  public ListNode deleteNode(ListNode head, int val) {
    if (head == null) {
      return null;
    }
    if (head.val == val) {
      return head.next;
    }
    ListNode pre = head;
    ListNode next = head.next;
    while (next != null) {
      if (next.val == val) {
        pre.next = next.next;
        next = null;
      } else {
        pre = next;
        next = next.next;
      }
    }
    return head;
  }

  /*
  递归实现
   */
  public ListNode deleteNode2(ListNode head, int val) {
    if (head == null) {
      return null;
    }
    if (head.val == val) {
      return head.next;
    } else {
      head.next = deleteNode(head.next, val);
    }
    return head;
  }

}
