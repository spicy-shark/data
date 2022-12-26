package top100;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: leetCode
 * @description: https://leetcode.cn/problems/generate-parentheses/solution/gua-hao-sheng-cheng-by-leetcode-solution/
 * @author: Pei Yansheng
 * @date: 2022-05-15 23:26
 **/
public class GenerateParenthesis {
  public List<String> generateParenthesis(int n) {
    if (n == 1) {
      return List.of("()");
    }
    Set<String> preRes = new HashSet<>(this.generateParenthesis(n - 1));
    Set<String> res = new HashSet<>();
    for (String str : preRes) {
      String newStr = "()" + str;
      res.add(newStr);
      for (int i = 1; i < str.length(); i++) {
        newStr = str.substring(0, i) + "()" + str.substring(i);
        res.add(newStr);
      }
      newStr = str + "()";
      res.add(newStr);
    }
    return new ArrayList<>(res);
  }
}
