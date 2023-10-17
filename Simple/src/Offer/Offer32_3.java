package Offer;

import common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Offer32_3 {

  public List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null) {
      return new ArrayList<>();
    }
    Queue<TreeNode> queue = new ConcurrentLinkedQueue<>();
    queue.add(root);
    boolean leftOrder = true;
    List<List<Integer>> array = new ArrayList<>();
    while (!queue.isEmpty()) {
      List<Integer> level = new ArrayList<>();
      List<TreeNode> treeNodeList = new ArrayList<>();
      while (!queue.isEmpty()) {
        TreeNode treeNode = queue.poll();
        if (leftOrder) {
          level.add(treeNode.val);
        } else {
          level.add(0, treeNode.val);
        }
        treeNodeList.add(treeNode);
      }
      leftOrder = !leftOrder;
      if (treeNodeList.isEmpty()) {
        break;
      }
      array.add(level);
      for (TreeNode treeNode : treeNodeList) {
        if (treeNode.left != null) {
          queue.add(treeNode.left);
        }
        if (treeNode.right != null) {
          queue.add(treeNode.right);
        }
      }

    }
    return array;
  }

}
