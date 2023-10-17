package Offer;

import java.util.HashSet;

public class Offer38 {
  HashSet<String>[] strSet;
  public String[] permutation(String s) {
    if (s.length() == 0) {
      return new String[]{};
    }
    strSet = new HashSet[s.length()];
    for (int i = 0; i < s.length(); i++) {
      getDp(s, i);
    }
    String[] res = new String[strSet[s.length() - 1].size()];
    return strSet[s.length() - 1].toArray(res);
  }

  void getDp(String s, int i) {
    if (i == 0) {
      HashSet<String> arrayList = new HashSet<>();
      arrayList.add(s.charAt(0) + "");
      strSet[i] = arrayList;
      return ;
    }
    HashSet<String> strListBeforeI = strSet[i - 1];
    HashSet<String> strList = new HashSet<>();
    for (String str : strListBeforeI) {
      for (int j = 0; j <= str.length(); j++) {
        strList.add(str.substring(0, j) + s.charAt(i) + str.substring(j));
      }
    }
    strSet[i] = strList;
  }

}
