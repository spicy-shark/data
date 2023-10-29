package LC75;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.cn/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75
 */
public class LC345 {
  static Set<Character> charSet;
  static {
    charSet = new HashSet<>();
    charSet.add('a');
    charSet.add('e');
    charSet.add('i');
    charSet.add('o');
    charSet.add('u');
    charSet.add('A');
    charSet.add('E');
    charSet.add('I');
    charSet.add('O');
    charSet.add('U');
  }
  public String reverseVowels(String s) {
    char[] chars = s.toCharArray();
    int i = 0;
    int j = s.length() - 1;
    while (i < j){
      while (i < s.length() && !charSet.contains(s.charAt(i))) {
        i++;
      }
      while (j >= 0 && !charSet.contains(s.charAt(j))) {
        j--;
      }
      if (i < j) {
        chars[i] = s.charAt(j);
        chars[j] = s.charAt(i);
        i++;
        j--;
      }
    }
    return new String(chars);
  }
}
