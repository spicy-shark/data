package designPattern.factory;

public class FactoryBMW320 implements FactoryMethod {

  @Override
  public BMW320 createBMW() {
    return new BMW320();
  }

}
