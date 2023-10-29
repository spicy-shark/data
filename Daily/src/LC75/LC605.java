package LC75;

public class LC605 {

  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int count = 0;
    for (int i = 0; i < flowerbed.length; i++) {
      if (flowerbed[i] == 0 && !this.leftPlanted(flowerbed, i) && !this.rightPlanted(flowerbed, i)) {
        flowerbed[i] = 1;
        count++;
      }
    }
    return n <= count;
  }

  private boolean leftPlanted(int[] flowered, int i) {
    if (i == 0) {
      return false;
    }
    return flowered[i - 1] == 1;
  }

  private boolean rightPlanted(int[] flowered, int i) {
    if (i == flowered.length - 1) {
      return false;
    }
    return flowered[i + 1] == 1;
  }

}
