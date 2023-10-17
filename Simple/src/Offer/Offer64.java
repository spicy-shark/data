package Offer;

public class Offer64 {

  public int sumNums(int n) {
    int res = 0;
    boolean b = n <= 1 || ((n += sumNums(n - 1)) == 0);
    return res;
  }

}
