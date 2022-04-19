public class Main {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(3);
        ListNode l = new ListNode(7);
        l1.next = l;
        ListNode l2 = new ListNode(9);
        l = new ListNode(2);
        l2.next = l;

        AddTwoNumbers test = new AddTwoNumbers();
        test.addTwoNumbers(l1, l2);

    }

}
