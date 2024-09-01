package com.jawa.dataStructures.BST;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemsTest {

    @Test
    void testmaxDepth() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        //Node<Integer> root = new Node<>(10);
        /**
         *              10
         *            7    11
         *          6         13
         *                  12
         * max depth =4
         */
        bst.insert(10);
        bst.insert(7);
        bst.insert(11);
        bst.insert(13);
        bst.insert(6);
        bst.insert(12);
        assertEquals(4, Problems.maxDepth(bst.root));
    }
}
