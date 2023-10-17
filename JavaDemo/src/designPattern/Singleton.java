package designPattern;

public class Singleton {

//  private String singleton;

  private Singleton() {

  }

  private static Singleton singleton = null;

  //静态工厂方法，线程不安全
  public static Singleton getInstance1() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }

  //加上synchroized
  public static synchronized Singleton getInstance2() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }

  //双重检查锁定
  public static Singleton getInstance3() {
    if (singleton == null) {
      synchronized (Singleton.class) {
        singleton = new Singleton();
      }
    }
    return singleton;
  }

  //静态内部类
  private static class LazyHolder {
    private static final Singleton SINGLETON = new Singleton();
  }
  public static Singleton getInstance4() {
    return LazyHolder.SINGLETON;
  }

}
