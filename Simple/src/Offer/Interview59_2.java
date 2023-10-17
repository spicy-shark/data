package Offer;

import java.util.ArrayList;
import java.util.List;

public class Interview59_2 {

  public Interview59_2() {
    this.array = new ArrayList<>();
    this.maxList = new ArrayList<>();
  }

  List<Integer> array;
  List<Integer> maxList;


  public int max_value() {
    if (maxList.isEmpty()) {
      return -1;
    }
    return maxList.get(0);
  }

  public void push_back(int value) {
    array.add(value);
    while (!maxList.isEmpty() && value > maxList.get(maxList.size() - 1)) {
      maxList.remove(maxList.size() - 1);
    }
    maxList.add(value);
  }

  public int pop_front() {
    if (array.isEmpty()) {
      return -1;
    }
    int res = array.remove(0);
    if (maxList.get(0).equals(res)) {
      maxList.remove(0);
    }
    return res;
  }

}
