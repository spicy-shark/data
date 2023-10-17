package Offer;

public class Offer33 {

  public boolean verifyPostorder(int[] postorder) {
    return isPostOrder(postorder, 0, postorder.length - 1);
  }

  int getIndex(int[] postorder, int start, int end) {
    int target = postorder[end];
    for (int i = start; i < end; i++) {
      if (postorder[i] > target) {
        return i;
      }
    }
    return end;
  }

  boolean hasLt(int[] postorder, int start, int end) {
    int target = postorder[end];
    for (int i = start; i < end; i++) {
      if (postorder[i] < target) {
        return true;
      }
    }
    return false;
  }

  boolean isPostOrder(int[] postorder, int start, int end) {
    if (start >= end) {
      return true;
    }
    int index = getIndex(postorder, start, end);
    if (hasLt(postorder, index, end)) {
      return false;
    }
    if (index == end || index == start) {
      return isPostOrder(postorder, start, end - 1);
    }
    return isPostOrder(postorder, start, index - 1) && isPostOrder(postorder, index, end - 1);
  }
}
