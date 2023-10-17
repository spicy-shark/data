package huawei;

import java.util.Scanner;

public class MingMingRandom {

  public void mingMingRandom() {
    Scanner in = new Scanner(System.in);
    in.nextInt();
    int[] array = new int[501];
    // 注意 hasNext 和 hasNextLine 的区别
    while (in.hasNextInt()) { // 注意 while 处理多个 case
      array[in.nextInt()] = 1;
    }
    for (int i = 1; i < 501; i++) {
      if (array[i] == 1) {
        System.out.println(i);
      }
    }
  }

}
