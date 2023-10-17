package threadDemo;

public class RunnableDemo {

  static final Object lock = new Object();
  static Integer arrayIndex = 0;

  public static void main(String[] args) {
    MyRunnable A = new MyRunnable("A", 0, 30);
    MyRunnable B = new MyRunnable("B", 1, 30);
    MyRunnable C = new MyRunnable("C", 2, 30);
    new Thread(A).start();
    new Thread(B).start();
    new Thread(C).start();
  }

  static class MyRunnable implements Runnable {

    String name;
    Integer index;
    Integer total;

    public MyRunnable(String name, Integer index, Integer total) {
      this.name = name;
      this.index = index;
      this.total = total;
    }

    @Override
    public void run() {
      while (arrayIndex < this.total) {
        synchronized (lock) {
          if (arrayIndex % 3 == this.index) {
            System.out.print(this.name);
            arrayIndex++;
            lock.notifyAll();
          } else {
            try {
              lock.wait();
            } catch (InterruptedException e) {
              throw new RuntimeException(e);
            }
          }
        }
      }
    }
  }

}
