public class MatrixAddition {
    public static int[][] addMatrices(int[][] A, int[][] B, int N) {
        int[][] sum = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        
        return sum;
    }
    
    public static void printMatrix(int[][] matrix, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] B = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        int N = 3;
        int[][] sum = addMatrices(A, B, N);
        
        System.out.println("Matrix A:");
        printMatrix(A, N);
        
        System.out.println("Matrix B:");
        printMatrix(B, N);
        
        System.out.println("Sum of Matrices:");
        printMatrix(sum, N);
    }
}
