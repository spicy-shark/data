package LC75;

/**
 * 交替合并字符串
 * https://leetcode.cn/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
 * 使用数组会大大提升效率
 */
public class Lc1768 {

  public String mergeAlternately(String word1, String word2) {
    if (null == word1 || "".equals(word1)) {
      return word2;
    }
    if (null == word2 || "".equals(word2)) {
      return word1;
    }

    StringBuilder sb = new StringBuilder();
    int i = 0;
    while (i < word1.length() && i < word2.length()) {
      sb.append(word1.charAt(i));
      sb.append(word2.charAt(i));
      i++;
    }
    if (i == word1.length()) {
      sb.append(word2.substring(i));
    } else {
      sb.append(word1.substring(i));
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Lc1768 n = new Lc1768();
    System.out.println(n.mergeAlternately("word1", "word2"));
    System.out.println(n.mergeAlternately("", "word2"));
    System.out.println(n.mergeAlternately("word1", ""));
    System.out.println(n.mergeAlternately("", ""));
    System.out.println(n.mergeAlternately("", "word2"));
    System.out.println(n.mergeAlternately(null, "word2"));
    System.out.println(n.mergeAlternately("", null));
    System.out.println(n.mergeAlternately(null, null));
    System.out.println(n.mergeAlternately("word1", "word2null"));

  }

}
