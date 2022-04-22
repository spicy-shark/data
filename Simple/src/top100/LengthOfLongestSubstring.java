package top100;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {

  public int lengthOfLongestSubstring(String s) {
    if (s == null) {
      return 0;
    }
    if (s.length() <= 1) {
      return s.length();
    }

    //存储相应字符串最后一次出现的位置
    Map<Character, Integer> charMap = new HashMap<>();
    int len = 0;
    int start = 0;
    for (int end = 0; end < s.length(); end++) {
      if (charMap.containsKey(s.charAt(end))) {
        start = Math.max(start, charMap.get(s.charAt(end)) + 1);
      }
      len = Math.max(len, end - start + 1);
      charMap.put(s.charAt(end), end);
    }

    return len;
  }

}
