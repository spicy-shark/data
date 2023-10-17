package Offer;

import common.TreeNode;

public class Offer68 {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root.val > p.val && root.val < q.val || root.val > q.val && root.val < p.val || root.val == p.val || root.val == q.val) {
      return root;
    }
    return root.val > p.val ? lowestCommonAncestor(root.left, p, q) : lowestCommonAncestor(root.right, p, q);
  }

}
