package medium.addtwonumbers;

import java.util.ArrayList;

public class ListNode {
    int val;
    ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int[] values) {
        if (values.length < 1) return;
        ListNode dummy = new ListNode();
        ListNode head = dummy;
        for (int value : values) {
            ListNode cur = new ListNode();
            cur.val = value;
            dummy.next = cur;
            dummy = cur;
        }
        this.val = head.next.val;
        this.next = head.next.next;
    }

    @Override
    public String toString() {
        ArrayList<Integer> number = new ArrayList<>();
        ListNode dummy = this;
        while (dummy != null) {
            number.add(dummy.val);
            dummy = dummy.next;
        }
        return number.toString();
    }
}
