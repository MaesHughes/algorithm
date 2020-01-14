package com.maes.hughes.subject.linkedList;

import com.maes.hughes.api.model.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 *
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 */
public class ReversLinkedList {

    /**
     * first way
     * @param head
     * @return
     */
//    public static ListNode reverseList(ListNode head) {
//        ListNode preNode = null;
//        ListNode currNode = head;
//        while(currNode != null){
//            ListNode nextNode = currNode.next;
//            currNode.next = preNode;
//            preNode = currNode;
//            currNode = nextNode;
//        }
//        return preNode;
//    }

    /**
     * second way
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public static void main(String[] args) {
        ListNode list = ListNode.getList();
        ListNode listNode = reverseList(list);
        ListNode.printList(listNode);
    }

}
