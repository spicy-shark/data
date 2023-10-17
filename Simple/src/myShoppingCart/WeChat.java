package myShoppingCart;

public class WeChat implements PayMethod {

  private String WeChatNum;

  private String phoneNum;

  private String verifyCode;


  @Override
  public void pay(Integer price) {
    System.out.println("WeChat NUM:" + this.WeChatNum + " paid RMB " + price);
  }

  public String getWeChatNum() {
    return WeChatNum;
  }

  public void setWeChatNum(String weChatNum) {
    WeChatNum = weChatNum;
  }

  public String getPhoneNum() {
    return phoneNum;
  }

  public void setPhoneNum(String phoneNum) {
    this.phoneNum = phoneNum;
  }

  public String getVerifyCode() {
    return verifyCode;
  }

  public void setVerifyCode(String verifyCode) {
    this.verifyCode = verifyCode;
  }
}
