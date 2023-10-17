package myShoppingCart;

import java.util.Date;

public class BankCard implements PayMethod {

  private String accountNum;

  private String password;

  private Date date;


  @Override
  public void pay(Integer price) {
    System.out.println("Bank account:" + this.accountNum + " paid RMB " + price);
  }

  public String getAccountNum() {
    return accountNum;
  }

  public void setAccountNum(String accountNum) {
    this.accountNum = accountNum;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
