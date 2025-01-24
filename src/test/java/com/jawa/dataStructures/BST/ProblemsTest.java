package com.jawa.dataStructures.BST;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    @Test
    void testbuildTree() {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode out = Problems.buildTree(preorder, inorder);
        System.out.println(traverseTree(out));
    }

    @Test
    void testbuildTreeOpti() {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode out = Problems.buildTreeOpti(preorder, inorder);
        System.out.println(traverseTree(out));
    }

    private List<Integer> traverseTree(TreeNode node) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.offer(node);
        while (queue.size()>0) {
            TreeNode localnode = queue.remove();
            list.add(localnode.val);
            if (localnode.left != null) queue.offer(localnode.left);
            if (localnode.right != null) queue.offer(localnode.right);
        }
        return list;
    }
}
