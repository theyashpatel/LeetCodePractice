package easy;

import helper.ListNode;

import java.util.List;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = new ListNode();
        ListNode new_head = prev;
        while (head != null) {
            ListNode next = head.next;
            if (head.val != val) {
                prev.next = head;
                prev = prev.next;
            } else {
                prev.next = null;
            }
            head = next;
        }
        return (new_head.next == null) ? null : new_head.next;
    }
}
