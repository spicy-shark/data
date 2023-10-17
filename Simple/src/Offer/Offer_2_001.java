package Offer;

public class Offer_2_001 {

  public int divide(int a, int b) {
    if (a == Integer.MIN_VALUE && b == -1) {
      return Integer.MAX_VALUE;
    }
    if (a == 0) {
      return 0;
    }
    boolean negative = false;
    if (a < 0) {
      negative = true;
    } else {
      a = -a;
    }
    if (b < 0) {
      negative = !negative;
    } else {
      b = -b;
    }
    int res = 1;
    if (a != b) {
      res = divideBySub(a, b);
    }
    if (negative) {
      res = -res;
    }
    return res;
  }

  int divideBySub(int a, int b) {
    if (a > b || b > 0) {
      return 0;
    }
    int nb = b;
    int count = 0;
    int times = 1;
    while (a <= nb && nb < 0) {
      a -= nb;
      count += times;
      nb += nb;
      times += times;
    }
    return count + divideBySub(a, b);
  }

}
