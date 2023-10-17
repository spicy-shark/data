package Offer;

import java.util.Stack;

public class Offer09 {

  Stack<Integer> stackIn = new Stack<>();
  Stack<Integer> stackOut = new Stack<>();

  public Offer09() {

  }

  public void appendTail(int value) {
    while (!stackOut.empty()) {
      Integer val = stackOut.pop();
      stackIn.push(val);
    }
    this.stackIn.push(value);
  }

  public int deleteHead() {
    while (!stackIn.empty()) {
      Integer val = stackIn.pop();
      stackOut.push(val);
    }
    if (stackOut.empty()) {
      return -1;
    }
    return stackOut.pop();
  }

}
