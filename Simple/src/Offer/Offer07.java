package Offer;

import common.TreeNode;

/*
https://leetcode.cn/problems/zhong-jian-er-cha-shu-lcof/submissions/403026468/?favorite=xb9nqhhg
 */
public class Offer07 {

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    if (preorder == null || preorder.length == 0) {
      return null;
    }
    return buildChild(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);

  }

  public TreeNode buildChild(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
    TreeNode head = new TreeNode(preorder[preStart]);
    if (preStart == preEnd) {
      return head;
    }
    int i = getRootIndex(inorder, head.val);
    if (i > inStart) {
      head.left = buildChild(preorder, inorder,
              preStart + 1, preStart + i - inStart,
              inStart, i - 1);
    }
    if (i < inEnd) {
      head.right = buildChild(preorder, inorder,
              preStart + 1 + i - inStart, preEnd,
              i + 1, inEnd);
    }
    return head;
  }

  public int getRootIndex(int[] inorder, int rootVal) {
    for (int i = 0; i < inorder.length; i++) {
      if (inorder[i] == rootVal) {
        return i;
      }
    }
    return -1;
  }



}
