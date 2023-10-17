package Offer;

public class Offer_2_002 {

  public String addBinary(String a, String b) {
    char[] res = new char[Math.max(a.length(), b.length())];
    int indexA = a.length() - 1;
    int indexB = b.length() - 1;
    char carry = '0';
    char bitA;
    char bitB;
    for (int i = res.length - 1; i >= 0; i--) {
      bitA = indexA < 0 ? '0' : a.charAt(indexA);
      bitB = indexB < 0 ? '0' : b.charAt(indexB);
      indexA--;
      indexB--;
      carry = fillRes(bitA, bitB, carry, res, i);
    }
    if (carry == '0') {
      return String.copyValueOf(res);
    }
    return carry + String.copyValueOf(res);
  }

  char fillRes(char bitA, char bitB, char carry, char[] res, int index) {
    if (bitA == bitB) {
      res[index] = carry;
      carry = '0';
      if (bitA == '1') {
        carry = '1';
      }
    } else {
      if (carry == '0') {
        res[index] = '1';
      } else {
        res[index] = '0';
        carry = '1';
      }
    }
    return carry;
  }
}
