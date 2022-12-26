package top100;

public class IsSymmetric {

  public boolean isSymmetric(TreeNode root) {
    return check(root.left, root.right);
  }

  boolean check(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    }
    if (left == null || right == null) {
      return false;
    }
    return left.val == right.val && check(left.left, right.right) && check(left.right, right.left);
  }

}
