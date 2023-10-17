package Offer;

public class Offer29 {

  public int[] spiralOrder(int[][] matrix) {

    boolean[][] visited = new boolean[matrix.length][matrix[0].length];
    int i = 0;
    int j = 0;
    char direction = 'r';
    int[] res = new int[matrix.length * matrix[0].length];
    int k = 0;
    while (k < res.length) {
      int[] coordinate = getCoordinateByDirection(direction, i, j, true);
      if (isVisited(visited, coordinate[0], coordinate[1])) {
        direction = getDirection(direction);
        coordinate = getCoordinateByDirection(direction, i, j, true);
      }
      res[k] = matrix[i][j];
      visited[i][j] = true;
      k++;
      i = coordinate[0];
      j = coordinate[1];
    }
    return res;
  }

  public boolean isVisited(boolean[][] visited, int i, int j) {
    if (i < 0 || i >= visited.length || j < 0 || j >= visited[0].length) {
      return true;
    }
    return visited[i][j];
  }

  public char getDirection(char direction) {
    switch (direction) {
      case 'r':
        return 'd';
      case 'd':
        return 'l';
      case 'l':
        return 'u';
      case 'u':
        return 'r';
    }
    return 'x';
  }
  public int[] getCoordinateByDirection(char direction, int i, int j, boolean forward) {
    if (forward) {
      switch (direction) {
        case 'r':
          return new int[]{i, j + 1};
        case 'd':
          return new int[]{i + 1, j};
        case 'l':
          return new int[]{i, j - 1};
        case 'u':
          return new int[]{i - 1, j};
      }
    } else {
      switch (direction) {
        case 'r':
          return new int[]{i, j - 1};
        case 'd':
          return new int[]{i - 1, j};
        case 'l':
          return new int[]{i, j + 1};
        case 'u':
          return new int[]{i + 1, j};
      }
    }
    return new int[]{};
  }

}
