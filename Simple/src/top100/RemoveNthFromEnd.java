package top100;

import java.util.Stack;

/**
 * @program: leetCode
 * @description: https://leetcode.cn/problems/remove-nth-node-from-end-of-list/solution/shan-chu-lian-biao-de-dao-shu-di-nge-jie-dian-b-61/
 * @author: Pei Yansheng
 * @date: 2022-05-12 22:52
 **/
public class RemoveNthFromEnd {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode node = head;
    Stack<ListNode> nodeStack = new Stack<>();
    while (node != null) {
      nodeStack.push(node);
      node = node.next;
    }

    for (int i = 0; i < n; i++) {
      node = nodeStack.pop();
    }
    if (nodeStack.size() == 0) {
      return head.next;
    }
    ListNode tail = node.next;
    node = nodeStack.pop();
    node.next = tail;
    return head;
  }

}
