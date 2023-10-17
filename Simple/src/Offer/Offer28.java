package Offer;

import common.TreeNode;

public class Offer28 {

  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return false;
    }
    return isMirrorTree(root.left, root.right);
  }

  public boolean isMirrorTree(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    }
    if (left == null || right == null) {
      return false;
    }
    if (left.val != right.val) {
      return false;
    }
    return isMirrorTree(left.left, right.right) && isMirrorTree(left.right, right.left);
  }

}
