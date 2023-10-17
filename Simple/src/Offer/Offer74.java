package Offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Offer74 {

  public int[][] merge(int[][] intervals) {
    if (intervals.length == 0) {
      return new int[0][2];
    }
    Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
    return intervals;
  }

}
