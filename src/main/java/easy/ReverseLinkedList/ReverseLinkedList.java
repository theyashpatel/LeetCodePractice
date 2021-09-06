package easy.ReverseLinkedList;

//    Given the head of a singly linked list, reverse the list, and return the reversed list.
//    Link: https://leetcode.com/problems/reverse-linked-list/

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public String printList(ListNode head) {
        ArrayList<Integer> nums = new ArrayList<>();
        while (head != null) {
            nums.add(head.val);
        }
        return nums.toString();
    }
}
