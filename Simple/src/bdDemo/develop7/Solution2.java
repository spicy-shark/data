package bdDemo.develop7;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution2 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = Integer.parseInt(in.nextLine());
    if (n < 3) {
      System.out.println(0);
      return;
    }
    BigInteger[] factorial = new BigInteger[n + 1];
    factorial[0] = BigInteger.ONE;
    for (int k = 1; k <= n; k++) {
      factorial[k] = factorial[k - 1].multiply(BigInteger.valueOf(k));
    }
    int[] location = new int[n];
    int i = 0;
    int j = 3;
    int d = Integer.parseInt(in.nextLine());
    for (int k = 0; k < n; k++) {
      location[k] = in.nextInt();
    }
    while (j < n) {
      if (location[j] - location[i] < d) {
        j++;
      }
    }
  }

}
