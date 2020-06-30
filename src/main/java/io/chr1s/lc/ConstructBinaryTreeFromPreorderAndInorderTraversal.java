package io.chr1s.lc;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    /**
     * Definition for a binary tree node.
     *
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    class Solution {

        private int preIdx = 0;

        public TreeNode buildTree(int[] preorder, int[] inorder) {

            if (preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0) {
                return null;
            }

            return buildTree(preorder, inorder, 0, inorder.length-1);

        }

        private TreeNode buildTree(int[] preorder, int[] inorder, int inStart, int inEnd) {
            if (inStart > inEnd) {
                return null;
            }
            if (inStart == inEnd) {
                return new TreeNode(inorder[inStart]);
            }
            TreeNode root = new TreeNode(preorder[preIdx++]);
            int inIdx = search(inorder, root.val, inStart, inEnd);
            root.left = buildTree(preorder, inorder, inStart, inIdx-1);
            root.right = buildTree(preorder, inorder, inIdx+1, inEnd);
            return root;
        }

        private int search(int[] inorder, int val, int start, int end) {
            for (int i = start; i <= end; i++) {
                if (inorder[i] == val) {
                    return i;
                }
            }
            return -1;
        }
    }
}
