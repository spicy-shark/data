package bdDemo;

import java.util.Scanner;

/*
https://www.nowcoder.com/exam/test/65619439/detail?pid=16516564&examPageSource=Company&testCallback=https%3A%2F%2Fwww.nowcoder.com%2Fexam%2Fcompany%3FcurrentTab%3Drecommand%26jobId%3D100%26selectStatus%3D0%26tagIds%3D665&testclass=%E8%BD%AF%E4%BB%B6%E5%BC%80%E5%8F%91
 */
public class Kls {

  public void func() {
    Scanner in = new Scanner(System.in);
    // 注意 hasNext 和 hasNextLine 的区别
    String[] nAbdD = in.nextLine().split(" ");
    int n = Integer.parseInt(nAbdD[0]);
    int d = Integer.parseInt(nAbdD[1]);
    String[] location = in.nextLine().split(" ");
    int[] locationNum = new int[n];
    for (int i = 0; i < n; i++) {
      locationNum[i] = Integer.parseInt(location[i]);
    }
    int start = 0;
    int end;
    int res = 0;
    if (n >= 3) {
      while ((start + 2 < n) && (locationNum[n - 1] - locationNum[start] >= d)) {
        end = start + 2;
        while (locationNum[end] - locationNum[start] < d) {
          end++;
          if (end >= n) {
            break;
          }
        }
        if (locationNum[end] - locationNum[start] < d && end - start + 1 >= 3) {
          res += C(3, end - start + 1);
        }
        start++;
      }
    }
    System.out.println(res);
  }

  public int C(int n, int m) {
    if (m == n) {
      return 1;
    }
    return N(m) / N(m - n) / N(n);
  }

  public int N(int n) {
    if (n == 0 || n ==1) {
      return 1;
    }
    return n * N(n - 1);
  }

}
