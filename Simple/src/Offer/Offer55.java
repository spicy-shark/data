package Offer;

import common.TreeNode;

public class Offer55 {

  public int maxDepth(TreeNode root) {
    return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
  }

}
