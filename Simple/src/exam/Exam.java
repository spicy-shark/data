package exam;

import java.util.Scanner;

public class Exam {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] locations = new int[in.nextInt()];
    for (int i = 0; i < locations.length; i++) {
      locations[i] = in.nextInt();
    }
    quickSort(locations, 0, locations.length - 1);
    int index = locations.length / 2;
    if (locations.length % 2 == 0) {
      index--;
    }
    int school = locations[index];
    System.out.println(school);
  }

  private static void quickSort(int[] locations, int start, int end) {
    int midVal = locations[start];
    if (start == end) {
      return;
    }
    int i = start;
    int j = end;
    while (i < j) {
      while (locations[j] > midVal) {
        j--;
      }
      while (locations[i] < midVal) {
        i++;
      }
      swap(locations, i, j);
    }
//    swap(locations, i, start);
    if (i > start) {
      quickSort(locations, start, i - 1);
    }
    if (i < end) {
      quickSort(locations, i + 1, end);
    }
  }

  private static void swap(int[] locations, int i, int j) {
    int temp = locations[i];
    locations[i] = locations[j];
    locations[j] = temp;
  }

}
