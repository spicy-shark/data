package huawei;

import java.util.Scanner;

public class SodaBottle {

  public void sodaBottle() {
    Scanner in = new Scanner(System.in);
    // 注意 hasNext 和 hasNextLine 的区别
    int bottleNum = 0;
    while (in.hasNextInt()) { // 注意 while 处理多个 case
      bottleNum = in.nextInt();
      if (bottleNum == 0) {
        continue;
      }
      System.out.println(getBottles(bottleNum));
    }
  }

  public int getBottles(int bottleNum) {
    int bottles = 0;
    while (bottleNum >= 3) {
      bottles += bottleNum / 3;
      bottleNum = bottleNum / 3 + bottleNum % 3;
    }
    if (bottleNum == 2) {
      bottles++;
    }
    return bottles;
  }

}
