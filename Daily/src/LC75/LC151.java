package LC75;

/**
 * https://leetcode.cn/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=leetcode-75
 */
public class LC151 {
  public String reverseWords(String s) {
    String[] words = s.split(" ");
    StringBuilder sb = new StringBuilder();
    for (int i = words.length - 1; i >=0; i--) {
      if (null != words[i] && words[i].length() > 0) {
        sb.append(words[i]);
        if (i > 0) {
          sb.append(" ");
        }
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    LC151 lc151 = new LC151();
    String test = "  hello world  ";
    String res = lc151.reverseWords(test);
    System.out.println(res);
  }
}
