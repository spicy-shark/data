package myShoppingCart;

import java.beans.IntrospectionException;
import java.util.Date;
import java.util.Scanner;

public class PayMethodFactory {

  public static PayMethod getPayMethodByType () {

    System.out.println("请输入支付方式（0-微信，1-支付宝，2-银行卡）:");
    Scanner in = new Scanner(System.in);
    int type = Integer.parseInt(in.nextLine());
    switch (type) {
      case 0:
        WeChat weChat = new WeChat();
        //微信支付必须知道用户的微信号，手机号码，验证码和支付金额；
        System.out.println("请输入微信号：");
        weChat.setWeChatNum(in.nextLine());
        System.out.println("请输入手机号码：");
        weChat.setPhoneNum(in.nextLine());
        System.out.println("请输入验证码：");
        weChat.setVerifyCode(in.nextLine());
        return weChat;
      case 1:
        //支付宝支付必须知道用户的电子邮箱，支付密码和支付金额；
        ZFB zfb = new ZFB();
        System.out.println("请输入电子邮箱：");
        zfb.setEmail(in.nextLine());
        System.out.println("请输入支付密码：");
        zfb.setPassword(in.nextLine());
        return zfb;
      case 2:
        //信用卡支付必须知道银行账号，密码，信用卡有效期和支付金额；
        BankCard bankCard = new BankCard();
        System.out.println("请输入银行账号：");
        bankCard.setAccountNum(in.nextLine());
        System.out.println("请输入密码：");
        bankCard.setPassword(in.nextLine());
        System.out.println("请输入有效期：");
        int year = Integer.parseInt(in.nextLine());
        int month = Integer.parseInt(in.nextLine());
        int day = Integer.parseInt(in.nextLine());
        bankCard.setDate(new Date(year, month, day));
        return bankCard;
      default:
        System.out.println("支付方式不可用！！！");
        return null;
    }
  }

}
