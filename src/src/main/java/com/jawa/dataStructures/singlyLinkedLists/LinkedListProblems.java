package com.jawa.dataStructures.singlyLinkedLists;

public class LinkedListProblems {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head ==null || head.next == null || k ==0) return head;
        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        //creating circular loop
        temp.next=head;

        // if K > length of list, then the result gives the position where the last node will be
        k = k % length;
        // we need to calculate the number from the current head to the last element in the length
        k=length-k;

        // traverse the list until the last (as K reduces we reach the last element)
        while(k-- > 0) {
            temp = temp.next;
        }
        //now we have reached the last element
        head = temp.next;
        //st the next of the last element to break the loop
        temp.next = null;

        return head;
    }
}
