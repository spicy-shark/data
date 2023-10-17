package lc;

import common.ListNode;

import java.util.List;
import java.util.Stack;

public class LC_25 {

  public static void main(String[] args) {
    LC_25 lc25 = new LC_25();
    ListNode head = new ListNode(0);
    ListNode pre = head;
    for (int i = 0; i < 5; i++) {
      pre.next = new ListNode(i + 1);
      pre = pre.next;
    }
    lc25.reverseKGroup2(head.next, 2);
  }

  public ListNode reverseKGroup(ListNode head, int k) {
    Stack<ListNode> stack = new Stack<>();
    ListNode headNode = new ListNode(-1);
    ListNode l = headNode;
    while (head != null) {
      while (head != null && stack.size() < k) {
        stack.push(head);
        head = head.next;
      }
      if (stack.size() == k) {
        while (!stack.empty()) {
          l.next = stack.pop();
          l = l.next;
        }
        l.next = head;
      }
    }
    return headNode.next;
  }

  public ListNode reverseKGroup2(ListNode head, int k) {
    ListNode headNode = new ListNode(-1);
    ListNode l = headNode;
    headNode.next = head;
    int i = 0;
    while (l.next != null) {
      if (i % k == 0) {
        l.next = reverse(l, k);
      }
      i++;
      l = l.next;
    }
    return headNode.next;
  }

  private ListNode reverse(ListNode pre, int k) {
    int i = 1;
    ListNode l = pre.next;
    ListNode head = pre.next;
    if (l.next != null) {
      l = l.next;
    } else {
      return l;
    }
    ListNode lNext = null;
    while (l != null && i < k) {
      lNext = l.next;
      l.next = pre.next;
      pre.next = l;
      l = lNext;
      i++;
    }
    head.next = lNext;
    if (i < k) {
      reverse(pre, i);
    }
    return pre.next;
  }

}
