package Offer;

public class Interview61 {
  public boolean isStraight(int[] nums) {
    int[] allNum = new int[nums.length];
    int min = 14;
    int count0 = 0;
    int count = 0;
    int max = 0;
    for (int num : nums) {
      if (num != 0) {
        if (allNum[num - 1] != 0) {
          return false;
        }
        allNum[num - 1] = num;
        min = Math.min(min, num);
        max = Math.max(max, num);
        count++;
      } else {
        count0++;
      }
    }
    if (max - min + 1 == 5) {
      return count + count0 == 5;
    }
    return max - min + 1 + count0 >= 5;
  }

}
