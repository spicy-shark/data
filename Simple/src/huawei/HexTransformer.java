package huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HexTransformer {

  static Map<Character, Integer> charMap = new HashMap<Character, Integer>() {
    {
      put('A', 10);
      put('B', 11);
      put('C', 12);
      put('D', 13);
      put('E', 14);
      put('F', 15);
      put('a', 10);
      put('b', 11);
      put('c', 12);
      put('d', 13);
      put('e', 14);
      put('f', 15);
    }
  };
  public void hexTransformer() {
    Scanner in = new Scanner(System.in);
    // 注意 hasNext 和 hasNextLine 的区别
    String hexStr;
    while (in.hasNext()) { // 注意 while 处理多个 case
      hexStr = in.next();
      System.out.println(this.getNum(hexStr));
    }
  }

  public int getNum(String hexStr) {
    int pow = 1;
    int index = hexStr.length() - 1;
    int sum = 0;
    Integer num;
    while (hexStr.charAt(index) != 'x') {
      num = charMap.get(hexStr.charAt(index));
      if (num == null) {
        num = Integer.parseInt(hexStr.charAt(index) + "");
      }
      sum += num * pow;
      pow *= 16;
      index--;
    }
    return sum;
  }

}
