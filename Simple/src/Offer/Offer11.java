package Offer;

public class Offer11 {

  public int minArray(int[] numbers) {
    int left = 0;
    int right = numbers.length - 1;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (numbers[right] > numbers[mid]) {
        right = mid;
      } else if (numbers[right] < numbers[mid]) {
        left = mid + 1;
      } else {
        right--;
      }
    }
    return numbers[left];
  }

}
