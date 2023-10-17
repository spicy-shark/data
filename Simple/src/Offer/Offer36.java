package Offer;

public class Offer36 {

  public static void main(String[] args) {
    Node root = new Node(4);
    Node left = new Node(2);
    Node right = new Node(5);
    Node lLeft = new Node(1);
    Node lRight = new Node(3);
    root.left = left;
    root.right = right;
    left.left = lLeft;
    left.right = lRight;
    Offer36 offer36 = new Offer36();
    offer36.treeToDoublyList(root);
  }

  public Node treeToDoublyList(Node root) {
    if (root == null) {
      return null;
    }
    Node head = getLeft(root);
    Node tail = getRight(root);
    Node left = root.left;
    Node right = root.right;
    if (left != null) {
      Node pre = getRight(left);
      treeToDoublyList(left);
      pre.right = root;
      root.left = pre;
    }
    if (right != null) {
      Node post = getLeft(right);
      treeToDoublyList(right);
      post.left = root;
      root.right = post;
    }
    head.left = tail;
    tail.right = head;
    return head;
  }

  Node getLeft(Node root) {
    while (root.left != null) {
      root = root.left;
    }
    return root;
  }

  Node getRight(Node root) {
    while (root.right != null) {
      root = root.right;
    }
    return root;
  }

}
class Node {
  public int val;
  public Node left;
  public Node right;

  public Node() {}

  public Node(int _val) {
    val = _val;
  }

  public Node(int _val,Node _left,Node _right) {
    val = _val;
    left = _left;
    right = _right;
  }
}

