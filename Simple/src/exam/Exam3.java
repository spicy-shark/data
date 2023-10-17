package exam;

import java.util.Scanner;

public class Exam3 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int row = in.nextInt();
    int col = in.nextInt();
    int[][] array = new int[row][col];
    int signalI = 0;
    int signalJ = 0;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        array[i][j] = in.nextInt();
        if (array[i][j] > 0) {
          signalI = i;
          signalJ = j;
        }
      }
    }
    int targetI = in.nextInt();
    int targetJ = in.nextInt();
    broadcast(array, signalI, signalJ);
    System.out.println(array[targetI][targetJ]);
  }

  private static void broadcast(int[][] array, int i, int j) {
    int copyI = i + 1;
    int copyJ = j;
    int signal = array[i][j];
    while (copyI < array.length && signal > 0) {
      if (signal <= array[copyI][copyJ]) {
        break;
      }
      if (array[copyI][copyJ] == -1) {
        break;
      }
      signal--;
      array[copyI][copyJ] = signal;
      broadcast(array, copyI,copyJ);
      copyI++;
    }

    copyI = i - 1;
    signal = array[i][j];
    while (copyI >= 0 && signal > 0) {
      if (signal <= array[copyI][copyJ]) {
        break;
      }
      if (array[copyI][copyJ] == -1) {
        break;
      }
      signal--;
      array[copyI][copyJ] = signal;
      broadcast(array, copyI,copyJ);
      copyI--;
    }

    copyI = i;
    copyJ = j + 1;
    signal = array[i][j];
    while (copyJ < array[0].length && signal > 0) {
      if (signal <= array[copyI][copyJ]) {
        break;
      }
      if (array[copyI][copyJ] == -1) {
        break;
      }
      signal--;
      array[copyI][copyJ] = signal;
      broadcast(array, copyI,copyJ);
      copyJ++;
    }

    copyJ = j - 1;
    signal = array[i][j];
    while (copyJ >= 0 && signal > 0) {
      if (signal <= array[copyI][copyJ]) {
        break;
      }
      if (array[copyI][copyJ] == -1) {
        break;
      }
      signal--;
      array[copyI][copyJ] = signal;
      broadcast(array, copyI,copyJ);
      copyJ--;
    }
  }

}

/*
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int row = in.nextInt();
    int col = in.nextInt();
    int[][] array = new int[row][col];
    int signalI = 0;
    int signalJ = 0;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        array[i][j] = in.nextInt();
        if (array[i][j] > 0) {
          signalI = i;
          signalJ = j;
        }
      }
    }
    int targetI = in.nextInt();
    int targetJ = in.nextInt();
    broadcast(array, signalI, signalJ);
    System.out.println(array[targetI][targetJ]);
  }

  private static void broadcast(int[][] array, int i, int j) {
    int copyI = i + 1;
    int copyJ = j;
    int signal = array[i][j];
    while (copyI < array.length && signal > 0 && signal > array[copyI][copyJ]) {
      if (array[copyI][copyJ] == -1) {
        break;
      }
      signal--;
      array[copyI][copyJ] = signal;
      broadcast(array, copyI,copyJ);
      copyI++;
    }

    copyI = i - 1;
//     signal = array[i][j];
    while (copyI >= 0 && signal > 0 && signal > array[copyI][copyJ]) {
      if (array[copyI][copyJ] == -1) {
        break;
      }
      signal--;
      array[copyI][copyJ] = signal;
      broadcast(array, copyI,copyJ);
      copyI--;
    }

    copyJ = j + 1;
//     signal = array[i][j];
    while (copyJ < array[0].length && signal > 0 && signal > array[copyI][copyJ]) {
      if (array[copyI][copyJ] == -1) {
        break;
      }
      signal--;
      array[copyI][copyJ] = signal;
      broadcast(array, copyI,copyJ);
      copyJ++;
    }

    copyJ = j - 1;
//     signal = array[i][j];
    while (copyJ >= 0 && signal > 0 && signal > array[copyI][copyJ]) {
      if (array[copyI][copyJ] == -1) {
        break;
      }
      signal--;
      array[copyI][copyJ] = signal;
      broadcast(array, copyI,copyJ);
      copyJ--;
    }
  }

}

 */
