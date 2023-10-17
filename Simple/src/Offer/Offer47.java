package Offer;

public class Offer47 {

  public int maxValue(int[][] grid) {
    int[][] sum = new int[grid.length][grid[0].length];
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (i == 0) {
          if (j == 0) {
            sum[i][j] = grid[i][j];
          } else {
            sum[i][j] = sum[i][j - 1] + grid[i][j];
          }
        } else if (j == 0){
          sum[i][j] = sum[i - 1][j] + grid[i][j];
        } else {
          sum[i][j] = Math.max(sum[i - 1][j], sum[i][j - 1]) + sum[i][j];
        }
      }
    }
    return sum[grid.length - 1][grid[0].length - 1];
  }

}
