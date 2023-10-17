package Offer;

import java.util.Stack;

//MinStack
public class Offer30 {

  Stack<Integer> minStack;
  Stack<Integer> stack;

  /** initialize your data structure here. */
  public Offer30() {
    this.minStack = new Stack<>();
    this.stack = new Stack<>();
  }

  public void push(int x) {
    stack.push(x);
    if (!minStack.empty() && x > minStack.peek()) {
      return;
    }
    minStack.push(x);
  }

  public void pop() {
    int popVal = stack.pop();
    if (popVal == minStack.peek()) {
      minStack.pop();
    }
  }

  public int top() {
    return stack.peek();
  }

  public int min() {
    return minStack.peek();
  }

}
