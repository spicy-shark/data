package Offer;

public class Offer17 {

  public int[] printNumbers(int n) {
    int max = (int) Math.pow(10.0, n) - 1;
    int[] res = new int[max];
    for (int i = 0; i < max; i++) {
      res[i] = i + 1;
    }
    return res;
  }

}
