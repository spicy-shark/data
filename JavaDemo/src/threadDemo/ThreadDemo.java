package threadDemo;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadDemo {

  static AtomicInteger arrayIndex = new AtomicInteger(0);
  static final Object source = new Object();
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int len = in.nextInt() * 3;
    MyThread myThreadA = new MyThread("A", 0, len);
    MyThread myThreadB = new MyThread("B", 1, len);
    MyThread myThreadC = new MyThread("C", 2, len);
    myThreadA.start();
    myThreadB.start();
    myThreadC.start();
//    System.out.println();
  }

  static class MyThread extends Thread {

    String name;
    Integer index;
    Integer total;

    public MyThread(String name, Integer index, Integer total) {
      this.name = name;
      this.index = index;
      this.total = total;
    }

    @Override
    public void run() {
//      synchronized (arrayIndex) {
        while (arrayIndex.intValue() < total) {
          if (arrayIndex.intValue() % 3 == index) {
            System.out.print(this.name);
            arrayIndex.getAndIncrement(); //如果对自增变量加锁则必须使用AtomicInteger，否则会因为Integer类型对arrayIndex不是原子操作而报错
//            arrayIndex.notifyAll();
          } else {
//            try {
//              arrayIndex.wait();
//            } catch (InterruptedException e) {
//              throw new RuntimeException(e);
//            }
          }
        }
//      }
    }

    //也可以对source加锁
    public void run2() {
      synchronized (source) {
        while (arrayIndex.intValue() < total) {
          if (arrayIndex.intValue() % 3 == index) {
            System.out.print(this.name);
            arrayIndex.getAndIncrement(); //这里可以使用普通的Integer类型直接执行arrayIndex++
            source.notifyAll();  //执行自增结束后唤醒其他线程
          } else {
            try {
              source.wait();  //如果不到打印时机则阻塞同时释放锁
            } catch (InterruptedException e) {
              throw new RuntimeException(e);
            }
          }
        }
      }
    }

  }

}
