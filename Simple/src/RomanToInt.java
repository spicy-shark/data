import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

  public int romanToInt(String s) {

    Map<Character, Integer> romanIntMap = new HashMap<>();
    romanIntMap.put('I', 1);
    romanIntMap.put('V', 5);
    romanIntMap.put('X', 10);
    romanIntMap.put('L', 50);
    romanIntMap.put('C', 100);
    romanIntMap.put('D', 500);
    romanIntMap.put('M', 1000);

    int res = romanIntMap.get(s.charAt(s.length() - 1));
    for (int i = s.length() - 1; i > 0; i--) {
      if (romanIntMap.get(s.charAt(i - 1)) >= romanIntMap.get(s.charAt(i))) {
        res += romanIntMap.get(s.charAt(i - 1));
      } else {
        res -= romanIntMap.get(s.charAt(i - 1));
      }
    }
    return res;
  }

  public int romanToIntMark(String s) {

    int res = this.getValue(s.charAt(s.length() - 1));
    for (int i = s.length() - 1; i > 0; i--) {
      if (this.getValue(s.charAt(i - 1)) >= this.getValue(s.charAt(i))) {
        res += this.getValue(s.charAt(i - 1));
      } else {
        res -= this.getValue(s.charAt(i - 1));
      }
    }
    return res;
  }

  private int getValue(char ch) {
    switch (ch) {
      case 'I':
        return 1;
      case 'V':
        return 5;
      case 'X':
        return 10;
      case 'L':
        return 50;
      case 'C':
        return 100;
      case 'D':
        return 500;
      case 'M':
        return 1000;
      default:
        return 0;
    }
  }


}
