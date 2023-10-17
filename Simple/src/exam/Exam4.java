package exam;

import java.time.temporal.JulianFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Exam4 {

  public int evalRPN(String[] tokens) {
    List<String> operatorList = List.of(new String[]{"+", "-", "*", "/"});
    Stack<Integer> valueStack = new Stack<>();
    for (int i = 0; i < tokens.length; i++) {
      if (!operatorList.contains(tokens[i])) {
        valueStack.push(Integer.parseInt(tokens[i]));
      } else {
        Integer value2 = valueStack.pop();
        Integer value1 = valueStack.pop();
        valueStack.push(this.getRes(value1, value2, tokens[i]));
      }
    }
    return valueStack.pop();
  }

  int getRes(Integer value1, Integer value2, String operator) {
    switch (operator) {
      case "+":
        return value1 + value2;
      case "-":
        return value1 - value2;
      case "*":
        return value1 * value2;
      case "/":
        return value1 / value2;
      default:
        return -1;
    }
  }

}
