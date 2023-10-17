package Offer;

import common.TreeNode;

public class Offer68_2 {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || root.val == p.val || root.val == q.val) {
      return root;
    }
    TreeNode l = lowestCommonAncestor(root.left, p, q);
    TreeNode r = lowestCommonAncestor(root.right, p, q);
    if (l == null) {
      return r;
    }
    if (r == null) {
      return l;
    }
    return root;
  }

}
