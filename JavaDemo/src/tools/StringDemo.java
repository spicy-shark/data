package tools;

import java.util.List;

public class StringDemo {

  static String helloword = "helloword";
  static String hello = "hello";
  static String word = "word";
  public static void main(String[] args) {
    String str1 = "hello" + "word";
    String str2 = "hello";
    String str3 = "word";
    System.out.println(str1 == helloword);
    String s = "hello" + "word";
    str2 += str3;
    System.out.println(str2 == str1);
  }

  static void change(List<Integer> list) {

  }

}
