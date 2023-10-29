package LC75;

/**
 * 字符串的最大公因子
 * https://leetcode.cn/problems/greatest-common-divisor-of-strings/?envType=study-plan-v2&envId=leetcode-75
 */
public class LC1071 {
  public String gcdOfStrings(String str1, String str2) {
    String patten = str1.substring(0, this.gcd(str1.length(), str2.length()));
    return this.check(patten, str1) && this.check(patten, str2) ? patten : "";
  }

  private int gcd(int len1, int len2) {
    if (0 == len2) {
      return len1;
    }
    return gcd(len2, len1 % len2);
  }

  private boolean check(String patten, String str) {
    int times = str.length() / patten.length();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < times; i++) {
      sb.append(patten);
    }
    return sb.toString().equals(str);
  }

  public String gcdOfStringsPro(String str1, String str2) {
    if (!(str1 + str2).equals(str2 + str1)) {
      return "";
    }
    return (str1.substring(0, this.gcd(str1.length(), str2.length())));
  }

}
