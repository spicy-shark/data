package designPattern.factory;

//简单工厂模式，不符合“开闭原则”，每次添加新产品就需要修改工厂类
public class SimpleFactory {
  public BMW createBMW(int type) {
    switch (type) {
      case 320:
        return new BMW320();
      case 523:
        return new BMW523();
      default:
        break;
    }
    return null;
  }
}