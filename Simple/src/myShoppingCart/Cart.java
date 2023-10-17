package myShoppingCart;


import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

/*
1.	购物车
a.	实现一个商品类，包括商品的名称和价格。
b.	实现一个购物车ShoppingCart，其中主要包含商品类的集合，以及添加商品、计算总价、支付等方法；要求购物车实例全局唯一。
c.	支持不同的支付方式，包括支付宝、微信、信用卡。其中
1）	支付宝支付必须知道用户的电子邮箱，支付密码和支付金额；
2）	微信支付必须知道用户的微信号，手机号码，验证码和支付金额；
3）	信用卡支付必须知道银行账号，密码，信用卡有效期和支付金额；
4）	需要在不同的支付方式中打印不同内容；
如：“Wechat Number ABC123 paid RMB 100.”
 */
public class Cart {

  LinkedHashSet<Item> items;

  Integer totalPrice;

  private static Cart CART = null;

  public static Cart getInstance() {
    if (CART == null) {
      CART = new Cart();
    }
    return CART;
  }

  private Cart() {
    this.items = new LinkedHashSet<>();
    this.totalPrice = 0;
  }
  public void addItem(Item item) {
    items.add(item);
    totalPrice += item.getPrice();
  }

  public void payForItems() {
    PayMethod payMethod = null;
    while (payMethod == null) {
      payMethod = PayMethodFactory.getPayMethodByType();
    }
    payMethod.pay(this.totalPrice);
    payMethod = null;
    this.totalPrice = 0;
    this.items = new LinkedHashSet<>();
  }

  public LinkedHashSet<Item> getItems() {
    return items;
  }

  public void setItems(LinkedHashSet<Item> items) {
    this.items = items;
  }

  public Integer getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Integer totalPrice) {
    this.totalPrice = totalPrice;
  }



}
