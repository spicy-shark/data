import Offer.*;

public class Main {

  public static void main(String[] args) {
    Offer_2_011 offer = new Offer_2_011();
    int res = offer.findMaxLength(new int[]{0, 0 ,1});
    System.out.println(res);
  }

  static void appendStr(StringBuilder str) {
    str.append("4");
  }

  static void append(String str) {
    str += "4";
  }

}
