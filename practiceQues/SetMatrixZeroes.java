package practiceQues;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {
    //Bruete for approach(Made a separate matrix)
       public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        Set<Integer> rowsToZero = new HashSet<>();
        Set<Integer> colsToZero = new HashSet<>();

        // Step 1: Find all 0 positions
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    rowsToZero.add(i);
                    colsToZero.add(j);
                }
            }
        }

        // Step 2: Set rows to 0
        for (int i : rowsToZero) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = 0;
            }
        }

        // Step 3: Set columns to 0
        for (int j : colsToZero) {
            for (int i = 0; i < rows; i++) {
                matrix[i][j] = 0;
            }
        }
    
    }
}
