package com.jawa.dataStructures.BST;

public class Problems {

    public static int maxDepth(Node root) {
        if(root== null) return 0;
        return Math.max(1+maxDepth(root.left), 1+maxDepth(root.right));
    }
}
