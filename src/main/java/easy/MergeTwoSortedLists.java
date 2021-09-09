package easy;
import helper.ListNode;

//Merge two sorted linked lists and return it as a sorted list.
//The list should be made by splicing together the nodes of the first two lists.
//Link: https://leetcode.com/problems/merge-two-sorted-lists/

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head = new ListNode();
        ListNode handler = head;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                handler.next = l1;
                l1 = l1.next;
            }
            else {
                handler.next = l2;
                l2 = l2.next;
            }
            handler = handler.next;
        }
        if (l1 != null) handler.next = l1;
        else if (l2 != null) handler.next = l2;

        return head.next;
    }
}
