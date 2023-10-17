package Offer;


import common.Node;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Offer35 {
  public Node copyRandomList(Node head) {
    if (head == null) {
      return null;
    }
    if (head.next == null) {
      Node copy = new Node(head.val);
      if (head.random != null) {
        copy.random = copy;
      }
      return copy;
    }
    Map<Node, Node> nodeMap = new HashMap<>();
    Node copyHead;
    Node l = head;
    Node copyl = new Node(0);
    while (head != null) {
      copyHead = new Node(head.val);
      if (copyl.next == null) {
        copyl.next = copyHead;
      }
      nodeMap.put(head, copyHead);
      head = head.next;
    }

    Node copyNode;
    for (Node node : nodeMap.keySet()) {
      copyNode = nodeMap.get(node);
      copyNode.next = nodeMap.get(node.next);
      copyNode.random = nodeMap.get(node.random);
    }
    return copyl.next;
  }
}
