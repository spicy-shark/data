package Offer;

import java.util.LinkedHashMap;
import java.util.Map;

public class Offer50 {

  public char firstUniqChar(String s) {
    Map<Character, Integer> charMap = new LinkedHashMap<>();
    for (int i = 0; i < s.length(); i++) {
      Integer value = charMap.get(s.charAt(i));
      if (value == null) {
        charMap.put(s.charAt(i), 1);
      } else {
        charMap.put(s.charAt(i), ++value);
      }
    }
    for (Character ch : charMap.keySet()) {
      if (charMap.get(ch) == 1) {
        return ch;
      }
    }
    return ' ';
  }

}
