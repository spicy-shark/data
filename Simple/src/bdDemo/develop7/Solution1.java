package bdDemo.develop7;

import java.util.Scanner;

public class Solution1 {

  static int i = 0;
  static int j = 1;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // 注意 hasNext 和 hasNextLine 的区别
    int n = Integer.parseInt(in.nextLine());

    String input = null;
    StringBuilder output = new StringBuilder();
    Status preStatus = Status.INIT;
    while (n > 0) { // 注意 while 处理多个 case
      input = in.nextLine();
      if (input.length() <= 2) {
        System.out.println(input);
        continue;
      }
      output.append(input.charAt(i));
      while (j < input.length()) {
        preStatus = getStatus(preStatus, input);
        if (preStatus.equals(Status.INIT)) {
          preStatus = getStatus(preStatus, input);
        }
        if (!preStatus.equals(Status.AAA) && !preStatus.equals(Status.AABB)) {
          output.append(input.charAt(j));
        }
        j++;
      }
      i = 0;
      j = 1;
      n--;
      System.out.println(output);
      output = new StringBuilder();
    }
  }

  static Status getStatus(Status status, String input) {
    switch (status) {
      case INIT:
        if (input.charAt(i) == input.charAt(j)) {
          return Status.AA;
        }
        return Status.AB;
      case AB:
        i = j - 1;
        return Status.INIT;
      case AA:
      case AAA:
        if (input.charAt(j) == input.charAt(j - 1)) {
          return Status.AAA;
        }
        return Status.AAB;
      case AAB:
      case AABB:
        if (input.charAt(j) == input.charAt(j - 1)) {
          return Status.AABB;
        }
        i = j - 1;
        return Status.AB;
      default:
        return Status.INIT;
    }
  }

  enum Status {

    INIT,
    AB,
    AA,
    AABB,
    AAA,
    AAB
  }
}
