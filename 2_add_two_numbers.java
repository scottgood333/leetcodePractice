/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return nodeSum(l1, l2, 0);
    }

    public ListNode nodeSum(ListNode l1, ListNode l2, int carry) {
        ListNode t = new ListNode();

        if (l1 == null && l2 == null) {
            if (carry == 0)
                return null;
            return new ListNode(1);
        }
        if (l1 == null)
            l1 = new ListNode(0);
        if (l2 == null)
            l2 = new ListNode(0);
        t.val = (l1.val + l2.val + carry) % 10;
        t.next = nodeSum(l1.next, l2.next, (l1.val + l2.val + carry) / 10);
        return t;
    }
}