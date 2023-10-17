package Offer;

import common.TreeNode;

public class Offer27 {

  public TreeNode mirrorTree(TreeNode root) {
    if (root == null) {
      return null;
    }
    if (root.left == null && root.right == null) {
      return root;
    }
    TreeNode mirrorLeft = null;
    TreeNode mirrorRight = null;
    if (root.left != null) {
      mirrorLeft = mirrorTree(root.left);
    }
    if (root.right != null) {
      mirrorRight = mirrorTree(root.right);
    }
    root.left = mirrorRight;
    root.right = mirrorLeft;
    return root;
  }

}
