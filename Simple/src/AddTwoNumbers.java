public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int res = 0;
        int up = 0;
        ListNode l1Head = l1;
        ListNode l2Head = l2;
        ListNode lLast = null;
        while (l1Head != null && l2Head != null) {
            res = l1Head.val + l2Head.val + up;
            up = res / 10;
            res %= 10;
            l1Head.val = res;
            lLast = l1Head;
            l1Head = l1Head.next;
            l2Head.val = res;
            l2Head = l2Head.next;
        }

        ListNode lHead = null;
        lHead = l1Head;
        ListNode lres = l1;
        if ((l2Head != null)) {
            lHead = l2Head;
            lres = l2;
        }


        while (up != 0) {
            if (lHead == null) {
                lHead = new ListNode(0);
                lLast.next = lHead;
            } else {
                res = up + lHead.val;
                up = res /10;
                res %= 10;
                lHead.val = res;
                lLast = lHead;
                lHead = lHead.next;
            }
        }
        return lres;
    }

}

