public class SpiralMatrix {
  public static void main(String[] args) {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int rowBegin = 0;
    int rowEnd = matrix.length - 1;
    int colBegin = 0;
    int colEnd = matrix[0].length - 1;

    while (rowBegin <= rowEnd && colBegin <= colEnd) {
      for (int j = colBegin; j <= colEnd; j++) {
        System.out.print(matrix[rowBegin][j] + " ");
      }
      rowBegin++;

      for (int i = rowBegin; i <= rowEnd; i++) {
        System.out.print(matrix[i][colEnd] + " ");
      }
      colEnd--;

      if (rowBegin <= rowEnd) {
        for (int j = colEnd; j >= colBegin; j--) {
          System.out.print(matrix[rowEnd][j] + " ");
        }
        rowEnd--;
      }

      if (colBegin <= colEnd) {
        for (int i = rowEnd; i >= rowBegin; i--) {
          System.out.print(matrix[i][colBegin] + " ");
        }
        colBegin++;
      }
    }
  }
}
