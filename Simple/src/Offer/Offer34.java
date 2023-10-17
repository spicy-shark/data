package Offer;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Offer34 {

  public List<List<Integer>> pathSum(TreeNode root, int target) {
    List<List<Integer>> res = new ArrayList<>();
    if (root == null) {
      return res;
    }
    if (root.left == null && root.right == null && root.val == target) {
      List<Integer> cellPathSum = new ArrayList<>();
      cellPathSum.add(root.val);
      res.add(cellPathSum);
      return res;
    }
    if (root.left != null) {
      List<List<Integer>> leftRes = pathSum(root.left, target - root.val);
      if (!leftRes.isEmpty()) {
        for (List<Integer> cell : leftRes) {
          cell.add(0, root.val);
        }
        res.addAll(leftRes);
      }
    }
    if (root.right != null) {
      List<List<Integer>> rightRes = pathSum(root.right, target - root.val);
      if (!rightRes.isEmpty()) {
        for (List<Integer> cell : rightRes) {
          cell.add(0, root.val);
        }
        res.addAll(rightRes);
      }
    }
    return res;
  }

}
