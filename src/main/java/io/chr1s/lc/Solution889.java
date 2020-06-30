package io.chr1s.lc;

public class Solution889 {
//    pre = [1,2,4,5,3,6,7], post = [4,5,2,6,7,3,1]
//        1
//    2       3
//  4  5    6   7

//0 6 0 6
//        1 3 0 2
//        2 2 0 0
//        3 3 1 1
//        4 2 1 -1
//        3 3 0 0
//        4 6 3 5
//        5 5 3 3
//        6 2 3 -1
//        3 5 0 2
//        6 6 4 4



    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        if (pre == null || pre.length == 0 || post == null || post.length == 0) {
            return null;
        }

        return constructFromPrePost(pre, 0, pre.length-1, post, 0, post.length-1);
    }

    private TreeNode constructFromPrePost(int[] pre, int preStart, int preEnd, int[] post, int postStart, int postEnd) {
        System.out.println(preStart + " " + preEnd + " " + postStart + " " + postEnd);
        if (preStart > preEnd ||  postStart > postEnd) {
            return null;
        }

        TreeNode root = new TreeNode(pre[preStart]);
        if (preStart == pre.length-1) {
            return root;
        }
        int nextVal = pre[preStart+1];
        int postIdx = search(post, postStart, postEnd, nextVal);
        int len = postIdx - postStart;
        if (postIdx == -1) {
            return root;
        }
        if (postIdx != postEnd-1) {
            root.left = constructFromPrePost(pre, preStart+1, preStart+1+len, post, postStart, postIdx);
            root.right = constructFromPrePost(pre, preStart+1+len+1, preEnd, post, postIdx+1, postEnd-1);
        } else {
            root.left = constructFromPrePost(pre, preStart+1, preEnd, post, postStart, postEnd-1);
        }

        return root;
    }

    private int search(int[] post, int postStart, int postEnd, int val) {
        for (int i = postStart; i <= postEnd; i++) {
            if (post[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
