package com.maes.hughes.subject.linkedList;

import com.maes.hughes.api.model.ListNode;

/**
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 *
 * Given a linked list, swap every two adjacent nodes and return its head.
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 *
 * Example:
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 */

public class SwapNodes {

    public static void main(String[] args) {
        ListNode list = ListNode.getList();
        ListNode result = swap(list);
        ListNode.printList(result);
    }

    private static ListNode swap(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode curr = head;
        ListNode prev = null;
        while(curr != null && curr.next != null) {
            if(prev == null)
                head = curr.next;
            else
                prev.next = curr.next;

            ListNode tmp = curr.next.next;
            curr.next.next = curr;
            curr.next = tmp;

            prev = curr;
            curr = tmp;
        }

        return head;
    }



}
