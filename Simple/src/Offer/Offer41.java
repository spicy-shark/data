package Offer;

import java.util.ArrayList;
import java.util.List;

public class Offer41 {

  List<Double> stream;

  /** initialize your data structure here. */
  public Offer41() {
    this.stream = new ArrayList<>();
  }

  public void addNum(int num) {
    int i;
    for (i = 0; i < stream.size(); i++) {
      if (stream.get(i) >= num) {
        break;
      }
    }
    stream.add(i, (double) num);
  }

  public double findMedian() {
    int minIndex = (stream.size() - 1) / 2;
    if (stream.size() % 2 == 0) {
      return (stream.get(minIndex) + stream.get(minIndex + 1)) / 2.0;
    }
    return stream.get(minIndex);
  }

}
