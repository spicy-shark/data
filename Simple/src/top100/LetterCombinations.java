package top100;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetCode
 * @description: https://leetcode.cn/problems/letter-combinations-of-a-phone-number/
 * @author: Pei Yansheng
 * @date: 2022-05-09 22:53
 **/
public class LetterCombinations {

  public List<String> letterCombinations(String digits) {
    List<String> res = new ArrayList<>();
    if ("".equals(digits)) {
      return res;
    }
    String str = this.getChars(digits, digits.length() - 1);
    List<String> preFixs = this.letterCombinations(digits.substring(0, digits.length() - 1));
    for (int i = 0; i < str.length(); i++) {
      if (preFixs.size() == 0) {
        res.add("" + str.charAt(i));
      }
      for (String preFix : preFixs) {
        res.add(preFix + str.charAt(i));
      }
    }
    return res;
  }

  String getChars(String digits, int index) {
    if (digits.length() == 0) {
      return "";
    }
    char digit = digits.charAt(index);
    switch (digit) {
      case '2':
        return "abc";
      case '3':
        return "def";
      case '4':
        return "ghi";
      case '5':
        return "jkl";
      case '6':
        return "mno";
      case '7':
        return "pqrs";
      case '8':
        return "tuv";
      case '9':
        return "wxyz";
      default:
        return "";
    }
  }

}
