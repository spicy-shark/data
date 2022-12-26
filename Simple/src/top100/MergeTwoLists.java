package top100;

/**
 * @program: leetCode
 * @description: https://leetcode.cn/problems/merge-two-sorted-lists/
 * @author: Pei Yansheng
 * @date: 2022-05-15 23:06
 **/
public class MergeTwoLists {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null) {
      return list2;
    }
    if (list2 == null) {
      return list1;
    }
    ListNode head = new ListNode(-1);
    ListNode res = head;
    ListNode next = null;
    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        next = list1;
        list1 = list1.next;
        head.next = next;
        next = list2;
      } else {
        next = list2;
        list2 = list2.next;
        head.next = next;
        next = list1;
      }
      head = head.next;
    }
    head.next = next;

    return res.next;
  }
}
