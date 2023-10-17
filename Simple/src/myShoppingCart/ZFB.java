package myShoppingCart;

public class ZFB implements PayMethod {

  private String email;

  private String password;


  @Override
  public void pay(Integer price) {
    System.out.println("ZFB account:" + this.email + " paid RMB " + price);
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
