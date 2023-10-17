package myShoppingCart;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Cart cart = Cart.getInstance();

    System.out.println("向购物车添加商品：");
    boolean finish = false;
    Scanner in = new Scanner(System.in);
    while (!finish) {
      Item item = new Item();
      System.out.println("商品名：");
      item.setName(in.nextLine());
      System.out.println("商品价格：");
      item.setPrice(Integer.parseInt(in.nextLine()));
      cart.addItem(item);
      System.out.println("是否结束添加（0-继续添加，1-结束）:");
      finish = Integer.parseInt(in.nextLine()) == 1;
    }
    System.out.println("结算购物车");
    cart.payForItems();

  }

}
