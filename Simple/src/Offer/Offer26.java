package Offer;

import common.TreeNode;

public class Offer26 {

  public boolean isSubStructure(TreeNode A, TreeNode B) {
    if (B == null || A == null) {
      return false;
    }
    return isSubTree(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
  }

  public boolean isSubTree(TreeNode A, TreeNode B) {
    if (B == null) {
      return true;
    }
    if (A == null) {
      return false;
    }
    if (A.val != B.val) {
      return false;
    }
    return isSubTree(A.left, B.left) && isSubTree(A.right, B.right);
  }
}
