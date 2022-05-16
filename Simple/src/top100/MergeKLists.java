package top100;

import java.util.PriorityQueue;

/**
 * @program: leetCode
 * @description: https://leetcode.cn/problems/merge-k-sorted-lists/solution/he-bing-kge-pai-xu-lian-biao-by-leetcode-solutio-2/
 * @author: Pei Yansheng
 * @date: 2022-05-16 21:53
 **/
public class MergeKLists {

  static class Status implements Comparable<Status> {
    int val;
    ListNode ptr;

    Status(int val, ListNode ptr) {
      this.val = val;
      this.ptr = ptr;
    }

    @Override
    public int compareTo(Status status2) {
      return this.val - status2.val;
    }
  }

  PriorityQueue<Status> queue = new PriorityQueue<Status>();

  public ListNode mergeKLists(ListNode[] lists) {
    for (ListNode node: lists) {
      if (node != null) {
        queue.offer(new Status(node.val, node));
      }
    }
    ListNode head = new ListNode(0);
    ListNode tail = head;
    while (!queue.isEmpty()) {
      Status f = queue.poll();
      tail.next = f.ptr;
      tail = tail.next;
      if (f.ptr.next != null) {
        queue.offer(new Status(f.ptr.next.val, f.ptr.next));
      }
    }
    return head.next;
  }


}
