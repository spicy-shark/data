package designPattern.factory;

public class FactoryBMW523 implements FactoryMethod {
  @Override
  public BMW523 createBMW() {
    return new BMW523();
  }
}
