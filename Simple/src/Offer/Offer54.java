package Offer;

import common.TreeNode;

public class Offer54 {

  int res;
  int k;
  public int kthLargest(TreeNode root, int k) {
    this.k = k;
    printTree(root);
    return res;
  }

  void printTree(TreeNode root) {
    if (root == null) {
      return;
    }
    if (root.right != null) {
      printTree(root.right);
    }
    res = root.val;
    k--;
    if (k == 0) {
      return;
    }
    if (root.left != null) {
      printTree(root.left);
    }
  }

}
