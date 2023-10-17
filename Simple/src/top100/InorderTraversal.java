package top100;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    printTree(list, root);
    return list;
  }

  public void printTree(List<Integer> list, TreeNode root) {
    if (root == null) {
      return;
    }
    if (root.left != null) {
      printTree(list, root.left);
    }
    list.add(root.val);
    if (root.right != null) {
      printTree(list, root.right);
    }
  }

}
