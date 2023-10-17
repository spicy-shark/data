package Offer;

import java.util.Stack;

public class Offer31 {

  public boolean validateStackSequences(int[] pushed, int[] popped) {
    if (pushed.length == 0) {
      return true;
    }
    Stack<Integer> stack = new Stack<>();
    int i = 0;
    int j = 0;
    while (i < popped.length) {
      stack.push(pushed[i]);
      i++;
      while (!stack.empty() && stack.peek().equals(popped[j])) {
        stack.pop();
        j++;
      }
    }
    return i == j;
  }

}
