package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Caculator {

  List<String> operatorList = List.of(new String[]{"+", "-", "*", "/", "(", ")"});

  public int caculate(String equation) {
    Stack<Integer> valueStack = new Stack<>();
    Stack<String> operatorStack = new Stack<>();
    int res = 0;
    int i = 0;
    List<String> expression = this.getListEquation(equation); //这里可以优化一下不用先遍历一遍分割表达式
    while (i < expression.size()) {
      if (!operatorList.contains(expression.get(i))) {
        if (!operatorStack.empty() && (operatorStack.peek().equals("*") || operatorStack.peek().equals("/"))) {
          Integer value2 = Integer.parseInt(expression.get(i));
          Integer value1 = valueStack.pop();
          valueStack.push(this.operateValues(value1, value2, operatorStack.pop()));
        } else {
          valueStack.push(Integer.parseInt(expression.get(i)));
        }
      } else {
        String operator = expression.get(i);
        if (operator.equals(")")) {
          String op = operatorStack.pop();
          while (!op.equals("(")) {
            Integer value2 = valueStack.pop();
            Integer value1 = valueStack.pop();
            valueStack.push(this.operateValues(value1, value2, op));
            op = operatorStack.pop();
          }
          while (!operatorStack.empty() && (operatorStack.peek().equals("*") || operatorStack.peek().equals("/"))) {
            Integer value2 = valueStack.pop();
            Integer value1 = valueStack.pop();
            valueStack.push(this.operateValues(value1, value2, operatorStack.pop()));
          }
        } else {
          operatorStack.push(operator);
        }
      }
      i++;
    }
    while (!operatorStack.empty()) {
      Integer value2 = valueStack.pop();
      Integer value1 = valueStack.pop();
      String operator = operatorStack.pop();
      valueStack.push(this.operateValues(value1, value2, operator));
    }
    return valueStack.pop();
  }

  List<String> getListEquation(String equation) {
    List<String> expression = new ArrayList<>();
    int i = 0;
    StringBuilder value = new StringBuilder();
    while (i < equation.length()) {
      if (equation.charAt(i) < '0' || equation.charAt(i) > '9') {
        if (!value.toString().isEmpty()) {
          expression.add(value.toString());
          value = new StringBuilder();
        }
        expression.add(equation.charAt(i) + "");
      } else {
        value.append(equation.charAt(i));
      }
      i++;
    }
    if (!value.toString().isEmpty()) {
      expression.add(value.toString());
    }
    return expression;
  }

  int operateValues(Integer value1, Integer value2, String operator) {
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
        return 0;
    }
  }
}
