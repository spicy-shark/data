package Offer;

import common.TreeNode;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Offer32 {
  public int[] levelOrder(TreeNode root) {
    if (root == null) {
      return new int[]{};
    }
    Queue<TreeNode> queue = new ConcurrentLinkedQueue<>();
    queue.add(root);
    List<Integer> array = new ArrayList<>();
    while (!queue.isEmpty()) {
      TreeNode treeNode = queue.poll();
      array.add(treeNode.val);
      if (treeNode.left != null) {
        queue.add(treeNode.left);
      }
      if (treeNode.right != null) {
        queue.add(treeNode.right);
      }
    }
    return array.stream().mapToInt(Integer::intValue).toArray();
  }
}
