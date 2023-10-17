package threadDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableDemo {

  static final Object lock = new Object();
  static Integer arrayIndex = 0;
  public static void main(String[] args) throws InterruptedException {
    MyCallable A = new MyCallable("A", 10);
    MyCallable B = new MyCallable("B", 20);
    MyCallable C = new MyCallable("C", 30);

    Thread threadA = new Thread(new FutureTask<>(A));
    Thread threadB = new Thread(new FutureTask<>(B));
    Thread threadC = new Thread(new FutureTask<>(C));
    threadA.start();
    threadA.join();
    System.out.println();
    threadB.start();
    threadB.join();
    System.out.println();
    threadC.start();
    threadC.join();
    System.out.println();
    System.out.println("全部结束");
  }

  static class MyCallable implements Callable<String> {

    String name;
    Integer index;

    public MyCallable(String name, Integer index) {
      this.name = name;
      this.index = index;
    }
    @Override
    public String call() throws Exception {
//      synchronized (lock) {
        while (arrayIndex < this.index) {
            System.out.print(this.name);
            arrayIndex++;
        }
//      }
      return this.name;
    }
  }

}
