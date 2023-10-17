package tools;

import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueDemo {

  public static void main(String[] args) {
    PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
    for (int i = 0; i < 5; i++) {
      queue.offer(new Random().nextInt(100));
    }
    System.out.println(queue);
    while (!queue.isEmpty()) {
      System.out.println(queue.poll());
    }
  }

}
