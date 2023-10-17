package Offer;

public class Offer_2_005 {
  public int maxProduct(String[] words) {
    int[] mask = new int[words.length];
    for (int i = 0; i < words.length; i++) {
      for (int j = 0; j < words[i].length(); j++) {
        mask[i] |= 0x1 << (words[i].charAt(j) - 'a');
      }
    }
    int max = 0;
    for (int i = 0; i < words.length; i++) {
      for (int j = i + 1; j < words.length; j++) {
        if ((mask[i] & mask[j]) == 0x0) {
          max = Math.max(max, words[i].length() * words[j].length());
        }
      }
    }
    return max;
  }
}
