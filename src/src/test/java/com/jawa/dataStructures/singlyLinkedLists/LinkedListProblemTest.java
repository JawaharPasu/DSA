package com.jawa.dataStructures.singlyLinkedLists;

import org.junit.jupiter.api.Test;

public class LinkedListProblemTest {

    @Test
    void testrotateright() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode resultNode = LinkedListProblems.rotateRight(node1, 2);
        ListNode node = resultNode;
        while (node != null) {
            System.out.println(node.val);
            node=node.next;
        }
    }
}
