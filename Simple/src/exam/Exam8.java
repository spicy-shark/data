package exam;

public class Exam8 {

//  public int solution(String S) {
//    // Implement your solution here
//    if (S.length() == 1) {
//      return 3;
//    }
//    int[] sums = new int[S.length()];
//    int sum = 0;
//    for (int i = 1; i < S.length(); i++) {
//      sum += Integer.parseInt(S.charAt(i - 1) + "");
//      sums[i] += sum;
//    }
//    sum = 0;
//    for (int i = S.length() - 2; i >= 0; i--) {
//      sum += Integer.parseInt(S.charAt(i + 1) + "");
//      sums[i] += sum;
//    }
//    int count = 0;
//    for (int i = 0; i < sums.length; i++) {
//      int intChar = Integer.parseInt(S.charAt(i) + "");
//      for (int j = 0; j < 10; j++) {
//        if ((j + sums[i]) % 3 == 0 && j != intChar) {
//          count++;
//        }
//      }
//    }
//    if (Integer.parseInt(S) % 3 == 0) {
//      count++;
//    }
//    return count;
//  }

    public int solution(int[] A) {
      // Implement your solution here
      if (A.length == 1) {
        return A.length;
      }

      int evenIndex = 3;
      int even = A[1];
      int oddIndex = 2;
      int odd = A[0];
      int res = 0;
      int count = 2;
      do {
        if (oddIndex < A.length) {
          if (A[oddIndex] == odd) {
            count++;
            res = Math.max(res, count);
          } else {
            count = 2;
          }
          oddIndex += 2;
          odd = A[oddIndex - 2];
        }
        if (evenIndex < A.length) {
          if (A[evenIndex] == even) {
            count++;
            res = Math.max(res, count);
          } else {
            count = 2;
          }
          evenIndex += 2;
          even = A[evenIndex - 2];
        }
      } while (oddIndex < A.length || evenIndex < A.length);

      return res;

    }

}
