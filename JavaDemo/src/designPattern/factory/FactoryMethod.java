package designPattern.factory;

//工厂方法模式，
// 工厂方法模式将工厂抽象化，并定义一个创建对象的接口。
// 每增加新产品，只需增加该产品以及对应的具体实现工厂类，
// 由具体工厂类决定要实例化的产品是哪个，将对象的创建与实例化延迟到子类，
// 这样工厂的设计就符合“开闭原则”了，扩展时不必去修改原来的代码。
public interface FactoryMethod {

  BMW createBMW();
}

