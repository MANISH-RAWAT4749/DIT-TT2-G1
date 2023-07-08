import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroCols = new HashSet<>();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }
        
        for (int row : zeroRows) {
            for (int j = 0; j < cols; j++) {
                matrix[row][j] = 0;
            }
        }
        
        for (int col : zeroCols) {
            for (int i = 0; i < rows; i++) {
                matrix[i][col] = 0;
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        setZeroes(matrix);
        
        System.out.println("Matrix after Setting Zeroes:");
        printMatrix(matrix);
    }
    
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
