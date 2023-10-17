package Offer;

import common.ListNode;

public class Offer52 {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode A = headA, B = headB;
    while (A != B) {
      A = A != null ? A.next : headB;
      B = B != null ? B.next : headA;
    }
    return A;
  }

//  作者：Krahets
//  链接：https://leetcode.cn/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/solutions/627084/jian-zhi-offer-52-liang-ge-lian-biao-de-gcruu/
//  来源：力扣（LeetCode）
//  著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
//  牛逼

}
