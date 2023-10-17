package Offer;

public class Offer46 {

  public int translateNum(int num) {
    String numStr = num + "";
    return getCount(0, numStr);
  }

  int getCount(int start, String numStr) {
    int end = numStr.length();
    if (end - start < 2) {
      return end - start;
    }
    int digit = Integer.parseInt(numStr.substring(start, start + 2));
    if (digit < 26 && digit > 9) {
      if (end - start == 2) {
        return 2;
      }
      return getCount(start + 1, numStr) + getCount(start + 2, numStr);
    }
    if (end - start == 2) {
      return 1;
    }
    return getCount(start + 1, numStr);
  }

}
