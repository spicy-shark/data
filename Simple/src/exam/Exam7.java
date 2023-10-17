package exam;

public class Exam7 {

  public int solution(int N) {
    // Implement your solution here
    int res = 0;
    while ((N & 0x1) == 0) {
      N = N >> 1;
    }
    int cellRes = 0;
    while (N != 0) {
      if ((N & 0x1) == 1) {
        res = Math.max(res, cellRes);
        cellRes = 0;
      } else {
        cellRes++;
      }
      N = N >> 1;
    }
    return res;
  }

}
