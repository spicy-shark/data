package Offer;

public class Offer12 {

  public boolean exist(char[][] board, String word) {
    boolean[][] visited = new boolean[board.length][board[0].length];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        boolean res = check(board, i, j, visited, word, 0);
        if (res) {
          return true;
        }
      }
    }
    return false;
  }

  public boolean check(char[][] board, int i, int j, boolean[][] visited, String word, int k) {

    if (board[i][j] != word.charAt(k)) {
      return false;
    } else if (k == word.length() - 1) {
      return true;
    }
    visited[i][j] = true;
    int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    boolean flag = false;
    for (int[] direction : directions) {
      int newI = i + direction[0];
      int newJ = j + direction[1];
      if (newI >= 0 && newI < board.length && newJ >= 0 && newJ < board[0].length) {
        if (!visited[newI][newJ]) {
          flag = check(board, newI, newJ, visited, word, k + 1);
          if (flag) {
            return true;
          }
        }
      }
    }
    visited[i][j] = false;
    return false;
  }

}
