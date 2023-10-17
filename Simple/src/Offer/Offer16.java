package Offer;

public class Offer16 {

  public double myPow(double x, int n) {
    long ln = n;
    if (x == 1 || x == 0) {
      return x;
    }
    if (ln == 0) {
      return 1;
    }
    if (ln < 0) {
      x = 1 / x;
      ln *= -1;
    }
    double res = 1.0;
    while (ln > 0) {
      if ((ln & 0x1) == 1) {
        res *= x;
      }
      x *= x;
      ln >>>= 1;
    }
    return res;
  }

}
