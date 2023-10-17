package Offer;

public class Offer15 {

  public int hammingWeight(int n) {
    int hanming = 0;
    while (n != 0) {
      hanming += n & 0x1;
      n = n >>> 1;
    }
    return hanming;
  }

}
