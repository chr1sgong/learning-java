package io.chr1s.lc;

public class Solution106 {

    private int postIdx;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIdx = inorder.length-1;
        return null;
    }

    private TreeNode buildTree(int[] inorder, int[] postorder, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postIdx--]);
        int inIdx = search(inorder, inStart, inEnd, root.val);
        root.left = buildTree(inorder, postorder, inStart, inIdx-1);
        root.right = buildTree(inorder, postorder, inIdx+1, inEnd);
        return root;
    }

    private int search(int[] inorder, int inStart, int inEnd, int val) {
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
