public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        
        for (int i = 0; i < n; i++) {
            sum += mat[i][i] + mat[i][n - 1 - i];
        }
        
        if (n % 2 == 1) {
            int middle = n / 2;
            sum -= mat[middle][middle];
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int diagonalSumResult = diagonalSum(matrix);
        System.out.println("Matrix Diagonal Sum: " + diagonalSumResult);
    }
}
