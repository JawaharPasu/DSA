package com.jawa.dataStructures.BST;

import java.util.HashMap;
import java.util.Map;

public class Problems {

    static int preIndx = 0;
    static int inIndx = 0;
    public static int maxDepth(Node root) {
        if(root== null) return 0;
        return Math.max(1+maxDepth(root.left), 1+maxDepth(root.right));
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<inorder.length; i++) {
            map.put(inorder[i], i);
        }

        int [] index={0};
        return helper(preorder,inorder,0,preorder.length-1,map,index);
    }

    private static TreeNode helper(int[] preorder, int[] inorder, int left, int right, HashMap<Integer, Integer> map, int[] index) {
        if(left>right) return null;

        int curr = preorder[index[0]];
        index[0]++;

        TreeNode node = new TreeNode(curr);
        if (left==right) return node;

        int inOrderIndex = map.get(curr);
        node.left = helper(preorder, inorder, left, inOrderIndex-1, map, index);
        node.right = helper(preorder, inorder, inOrderIndex+1, right, map, index);

        return node;
    }

    public static TreeNode buildTreeOpti(int[] preorder, int[] inorder) {
        return dfs(preorder, inorder, Integer.MAX_VALUE);
    }

    static TreeNode dfs(int[] preorder, int[] inorder, int limit) {
        if(preIndx >= preorder.length) {
            return null;
        }
        if(limit == inorder[inIndx]) {
            inIndx++;
            return null;
            // dfs(preorder, inorder, inorder[++inIndx]);
        }
        TreeNode root = new TreeNode(preorder[preIndx++]);
        root.left = dfs(preorder, inorder, root.val);
        root.right = dfs(preorder, inorder, limit);
        return root;

    }
}
