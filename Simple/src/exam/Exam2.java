package exam;

import java.util.Scanner;

public class Exam2 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String version1 = in.nextLine();
    String version2 = in.nextLine();
    int[] digits1 = getDigits(version1);
    int[] digits2 = getDigits(version2);
    int len = Math.min(digits1.length, digits2.length);
    for (int i = 0; i < len; i++) {
      if (digits1[i] > digits2[i]) {
        System.out.println(version1);
        return;
      }
      if (digits1[i] < digits2[i]) {
        System.out.println(version2);
        return;
      }
    }
    if (digits1.length > digits2.length) {
      System.out.println(version1);
      return;
    }
    if (digits2.length > digits1.length) {
      System.out.println(version2);
      return;
    }
    String resStr = compareStr(version1, version2);
    if (resStr != null) {
      System.out.println(resStr);
      return;
    }
    System.out.println(version1);
  }

  private static int[] getDigits(String version1) {
    int[] digits1;
    String[] digitStrs;
    if (version1.contains("-")) {
      digitStrs = version1.split("-")[0].split("\\.");
    } else {
      digitStrs = version1.split("\\.");
    }
    digits1 = new int[digitStrs.length];
    for (int i = 0; i < digitStrs.length; i++) {
      digits1[i] = Integer.parseInt(digitStrs[i]);
    }
    return digits1;
  }

  private static String getStr(String version) {
    return version.split("-")[1];
  }

  private static String compareStr(String version1, String version2) {
    String str1 = null;
    if (version1.contains("-")) {
      str1 = getStr(version1);
    }
    String str2 = null;
    if (version2.contains("-")) {
      str2 = getStr(version2);
    }
    if (str1 == null && str2 == null) {
      return version1;
    }
    if (str1 == null) {
      return version2;
    }
    if (str2 == null) {
      return version1;
    }
    if (str1.compareTo(str2) < 0) {
      if (str1.toLowerCase().equals(str2)) {
        return version2;
      }
      return version1;
    }
    if (str1.compareTo(str2) > 0) {
      if (str2.toLowerCase().equals(str1)) {
        return version1;
      }
      return version2;
    }
    return null;
  }

}
