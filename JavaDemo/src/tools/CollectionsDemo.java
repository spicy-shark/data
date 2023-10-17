package tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsDemo {

  public static void main(String[] args) {
    Integer[] a = new Integer[]{1, 2, 3, 4};
    ArrayList<Integer> arrayList = new ArrayList<>();
    Collections.addAll(arrayList, a);
    arrayList.add(5);
    Integer[] b = new Integer[5];
    b[0] = 0;
    b[1] = 1;
    Integer[] c = Arrays.copyOf(b, b.length + (b.length >> 1));
  }

}
