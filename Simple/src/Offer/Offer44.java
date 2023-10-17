package Offer;

public class Offer44 {

  public int findNthDigit(int n) {
    if (n < 10) {
      return n;
    }
    int pow = 0;
    long product = 1;
    long count = 0;
    while (n >= count) {
      pow++;
      product *= 10;
      count += pow * (product - (product / 10));
    }
    count = count - n + 1;
    long mod = count % pow;
    long digit = (product - 1 - count / pow);
    if (mod != 0) {
      product = 1;
      for (int i = 0; i < mod; i++) {
        product *= 10;
      }
    } else {
      digit++;
      return (int) (digit / (product / 10));
    }
    return (int) ((digit % product) / (product / 10));
  }

}
